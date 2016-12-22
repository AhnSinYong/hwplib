package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;

/**
 * ���� ������ ������ ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class BatangPageInfo {
	/**
	 * ���� ����Ʈ ���
	 */
	private ListHeaderForBatangPage listHeader;
	/**
	 * ���� ����Ʈ
	 */
	private ParagraphList paragraphList;

	/**
	 * ������
	 */
	public BatangPageInfo() {
		listHeader = new ListHeaderForBatangPage();
		paragraphList = new ParagraphList();
	}

	/**
	 * ���� ����Ʈ ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ ���
	 */
	public ListHeaderForBatangPage getListHeader() {
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
