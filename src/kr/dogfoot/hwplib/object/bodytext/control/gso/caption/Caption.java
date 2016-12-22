package kr.dogfoot.hwplib.object.bodytext.control.gso.caption;

import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ĸ�� ������ ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class Caption {
	/**
	 * ���� ����Ʈ ���
	 */
	private ListHeaderForCaption listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public Caption() {
		listHeader = new ListHeaderForCaption();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���� ����Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ ���
	 */
	public ListHeaderForCaption getListHeader() {
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
