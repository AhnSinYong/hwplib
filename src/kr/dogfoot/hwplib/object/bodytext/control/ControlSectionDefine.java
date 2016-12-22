package kr.dogfoot.hwplib.object.bodytext.control;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderSectionDefine;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.BatangPageInfo;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.FootEndNoteShape;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.PageBorderFill;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.PageDef;

/**
 * ���� ���� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlSectionDefine extends Control {
	/**
	 * �������� ����
	 */
	private PageDef pageDef;
	/**
	 * ���� ��� ����
	 */
	private FootEndNoteShape footNoteShape;
	/**
	 * ���� ��� ����
	 */
	private FootEndNoteShape endNoteShape;
	/**
	 * �� �׵θ�/��� ���� - �� ��
	 */
	private PageBorderFill bothPageBorderFill;
	/**
	 * �� �׵θ�/��� ���� - ¦�� ��
	 */
	private PageBorderFill evenPageBorderFill;
	/**
	 * �� �׵θ�/��� ���� - Ȧ�� ��
	 */
	private PageBorderFill oddPageBorderFill;
	/**
	 * ������ ����(�� ��, ¦�� ��, Ȧ�� ��) ����Ʈ
	 */
	private ArrayList<BatangPageInfo> batangPageInfoList;

	/**
	 * ������
	 */
	public ControlSectionDefine() {
		super(new CtrlHeaderSectionDefine());

		pageDef = new PageDef();
		footNoteShape = new FootEndNoteShape();
		endNoteShape = new FootEndNoteShape();
		bothPageBorderFill = new PageBorderFill();
		evenPageBorderFill = new PageBorderFill();
		oddPageBorderFill = new PageBorderFill();
		batangPageInfoList = new ArrayList<BatangPageInfo>();
	}

	/**
	 * ���� ���� ��Ʈ�� �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��Ʈ�� �� ��Ʈ�� ���
	 */
	public CtrlHeaderSectionDefine getHeader() {
		return (CtrlHeaderSectionDefine) header;
	}

	/**
	 * �������� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �������� ����
	 */
	public PageDef getPageDef() {
		return pageDef;
	}

	/**
	 * ���� ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ����
	 */
	public FootEndNoteShape getFootNoteShape() {
		return footNoteShape;
	}

	/**
	 * ���� ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ����
	 */
	public FootEndNoteShape getEndNoteShape() {
		return endNoteShape;
	}

	/**
	 * �� �׵θ�/��� ����(�� ��)�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �׵θ�/��� ����(�� ��)
	 */
	public PageBorderFill getBothPageBorderFill() {
		return bothPageBorderFill;
	}

	/**
	 * �� �׵θ�/��� ����(¦�� ��)�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �׵θ�/��� ����(¦�� ��)
	 */
	public PageBorderFill getEvenPageBorderFill() {
		return evenPageBorderFill;
	}

	/**
	 * �� �׵θ�/��� ����(Ȧ�� ��)�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �׵θ�/��� ����(Ȧ�� ��)
	 */
	public PageBorderFill getOddPageBorderFill() {
		return oddPageBorderFill;
	}

	/**
	 * ���ο� ���� �� ���� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� �� ���� ��ü
	 */
	public BatangPageInfo addNewBatangPageInfo() {
		BatangPageInfo bpi = new BatangPageInfo();
		batangPageInfoList.add(bpi);
		return bpi;
	}

	/**
	 * ������ ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ����Ʈ
	 */
	public ArrayList<BatangPageInfo> getBatangPageInfoList() {
		return batangPageInfoList;
	}
}
