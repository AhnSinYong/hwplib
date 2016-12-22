package kr.dogfoot.hwplib.object.bodytext.control.gso.textbox;

import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * �ۻ����� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class TextBox {
	/**
	 * ���� ����Ʈ ���
	 */
	private ListHeaderForTextBox listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public TextBox() {
		listHeader = new ListHeaderForTextBox();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���� ����Ʈ ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ ��� ��ü
	 */
	public ListHeaderForTextBox getListHeader() {
		return listHeader;
	}

	/**
	 * ���� ����Ʈ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ ��ü
	 */
	public ParagraphList getParagraphList() {
		return paragraphList;
	}
}
