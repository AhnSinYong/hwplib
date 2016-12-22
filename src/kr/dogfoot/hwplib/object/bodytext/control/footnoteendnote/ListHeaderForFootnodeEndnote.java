package kr.dogfoot.hwplib.object.bodytext.control.footnoteendnote;

import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.ListHeaderProperty;

/**
 * ����/������ ���� ���� ����Ʈ ��� ���ڵ�
 * 
 * @author neolord
 */
public class ListHeaderForFootnodeEndnote {
	/**
	 * ���� ����
	 */
	private int paraCount;
	/**
	 * �Ӽ�
	 */
	private ListHeaderProperty property;

	/**
	 * ������
	 */
	public ListHeaderForFootnodeEndnote() {
		property = new ListHeaderProperty();
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getParaCount() {
		return paraCount;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param paraCount
	 *            ���� ����
	 */
	public void setParaCount(int paraCount) {
		this.paraCount = paraCount;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public ListHeaderProperty getProperty() {
		return property;
	}
}
