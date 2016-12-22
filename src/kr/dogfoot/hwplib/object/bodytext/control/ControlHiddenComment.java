package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeader;
import kr.dogfoot.hwplib.object.bodytext.control.hiddencomment.ListHeaderForHiddenComment;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ���� ���� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlHiddenComment extends Control {
	/**
	 * ���� ���� �� ����Ʈ ���
	 */
	private ListHeaderForHiddenComment listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public ControlHiddenComment() {
		super(new CtrlHeader(ControlType.HiddenComment.getCtrlId()));

		listHeader = new ListHeaderForHiddenComment();
		paragraphList = new ParagraphList();
	}

	/**
	 * ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ���
	 */
	public CtrlHeader getHeader() {
		return header;
	}

	/**
	 * ���� ���� �� ����Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� �� ����Ʈ ���
	 */
	public ListHeaderForHiddenComment getListHeader() {
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
