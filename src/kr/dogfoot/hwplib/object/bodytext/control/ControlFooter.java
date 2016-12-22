package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderFooter;
import kr.dogfoot.hwplib.object.bodytext.control.headerfooter.ListHeaderForHeaderFooter;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ������ ��Ʈ��
 * 
 * @author neolord
 */
public class ControlFooter extends Control {
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
	public ControlFooter() {
		super(new CtrlHeaderFooter());

		listHeader = new ListHeaderForHeaderFooter();
		paragraphList = new ParagraphList();
	}

	/**
	 * �������� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �������� ��Ʈ�� ���
	 */
	public CtrlHeaderFooter getHeader() {
		return (CtrlHeaderFooter) header;
	}

	/**
	 * �Ӹ���/�������� ����Ʈ ����� ��ȯ�Ѵ�.
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
