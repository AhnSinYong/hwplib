package kr.dogfoot.hwplib.object.bodytext.control.table;

import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ǥ�� ���� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class Cell {
	/**
	 * ���� ����Ʈ ���
	 */
	private ListHeaderForCell listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public Cell() {
		listHeader = new ListHeaderForCell();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���� ����Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ ���
	 */
	public ListHeaderForCell getListHeader() {
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
