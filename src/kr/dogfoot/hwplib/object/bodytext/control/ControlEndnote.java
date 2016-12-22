package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderEndnote;
import kr.dogfoot.hwplib.object.bodytext.control.footnoteendnote.ListHeaderForFootnodeEndnote;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ����(endnote) ��Ʈ��
 * 
 * @author neolord
 */
public class ControlEndnote extends Control {
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
	public ControlEndnote() {
		super(new CtrlHeaderEndnote());

		listHeader = new ListHeaderForFootnodeEndnote();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���� ��Ʈ�ѿ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��Ʈ�ѿ� ��Ʈ�� ���
	 */
	public CtrlHeaderEndnote getHeader() {
		return (CtrlHeaderEndnote) header;
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
