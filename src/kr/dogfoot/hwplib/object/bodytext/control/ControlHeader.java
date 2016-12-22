package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderHeader;
import kr.dogfoot.hwplib.object.bodytext.control.headerfooter.ListHeaderForHeaderFooter;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * �Ӹ��� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlHeader extends Control {
	/**
	 * �Ӹ���/�������� ����Ʈ ���
	 */
	private ListHeaderForHeaderFooter listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public ControlHeader() {
		super(new CtrlHeaderHeader());

		listHeader = new ListHeaderForHeaderFooter();
		paragraphList = new ParagraphList();
	}

	/**
	 * �Ӹ����� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӹ����� ��Ʈ�� ���
	 */
	public CtrlHeaderHeader getHeader() {
		return (CtrlHeaderHeader) header;
	}

	/**
	 * �Ӹ���/�������븮��Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӹ���/�������� ����Ʈ ���
	 */
	public ListHeaderForHeaderFooter getListHeader() {
		return listHeader;
	}

	/**
	 * ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ
	 */
	public ParagraphList getParagraphList() {
		return paragraphList;
	}
}
