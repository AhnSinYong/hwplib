package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderFootnote;
import kr.dogfoot.hwplib.object.bodytext.control.footnoteendnote.ListHeaderForFootnodeEndnote;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ����(FootNote) ��Ʈ��
 * 
 * @author neolord
 */
public class ControlFootnote extends Control {
	/**
	 * ����/���ֿ� ����Ʈ ���
	 */
	private ListHeaderForFootnodeEndnote listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public ControlFootnote() {
		super(new CtrlHeaderFootnote());

		listHeader = new ListHeaderForFootnodeEndnote();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���ֿ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���ֿ� ��Ʈ�� ���
	 */
	public CtrlHeaderFootnote getHeader() {
		return (CtrlHeaderFootnote) header;
	}

	/**
	 * ����/���ֿ� ����Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return ����/���ֿ� ����Ʈ ���
	 */
	public ListHeaderForFootnodeEndnote getListHeader() {
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
