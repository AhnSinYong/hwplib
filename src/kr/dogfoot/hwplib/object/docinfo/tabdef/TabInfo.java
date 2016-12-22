package kr.dogfoot.hwplib.object.docinfo.tabdef;

import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;

/**
 * �� ������ ���� ��ü
 * 
 * @author neolord
 */
public class TabInfo {
	/**
	 * ���� ��ġ
	 */
	private long position;
	/**
	 * ���� ����
	 */
	private TabSort tabSort;
	/**
	 * ä�� ����
	 */
	private BorderType fillSort;

	/**
	 * ������
	 */
	public TabInfo() {
	}

	/**
	 * ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ġ
	 */
	public long getPosition() {
		return position;
	}

	/**
	 * ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param position
	 *            ���� ��ġ
	 */
	public void setPosition(long position) {
		this.position = position;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public TabSort getTabSort() {
		return tabSort;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param tabSort
	 *            ���� ����
	 */
	public void setTabSort(TabSort tabSort) {
		this.tabSort = tabSort;
	}

	/**
	 * ä�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ä�� ����
	 */
	public BorderType getFillSort() {
		return fillSort;
	}

	/**
	 * ä�� ������ �����Ѵ�.
	 * 
	 * @param fillSort
	 *            ä�� ����
	 */
	public void setFillSort(BorderType fillSort) {
		this.fillSort = fillSort;
	}
}
