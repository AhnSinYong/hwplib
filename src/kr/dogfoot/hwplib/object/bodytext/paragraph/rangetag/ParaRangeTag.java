package kr.dogfoot.hwplib.object.bodytext.paragraph.rangetag;

import java.util.ArrayList;

/**
 * ������ ���� �±׿� ���� ���ڵ�
 * 
 * @author neolord
 */
public class ParaRangeTag {
	/**
	 * ���� �±� ������ ���� ��ü�� ����Ʈ
	 */
	private ArrayList<RangeTagItem> rangeTagItemList;

	/**
	 * ������
	 */
	public ParaRangeTag() {
		rangeTagItemList = new ArrayList<RangeTagItem>();
	}

	/**
	 * ���ο� ���� �±� ������ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� �±� ������ ���� ��ü
	 */
	public RangeTagItem addNewRangeTagItem() {
		RangeTagItem rt = new RangeTagItem();
		rangeTagItemList.add(rt);
		return rt;
	}

	/**
	 * ���� �±� ������ ���� ��ü�� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �±� ������ ���� ��ü�� ����Ʈ
	 */
	public ArrayList<RangeTagItem> getRangeTagItemList() {
		return rangeTagItemList;
	}
}
