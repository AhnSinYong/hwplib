package kr.dogfoot.hwplib.object.bodytext.control.hiddencomment;

import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.ListHeaderProperty;

/**
 * ���� ������ ���� ���� ����Ʈ ���
 * 
 * @author neolord
 */
public class ListHeaderForHiddenComment {
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
	public ListHeaderForHiddenComment() {
		property = new ListHeaderProperty();
	}
	
	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * @return ���� ����
	 */
	public int getParaCount() {
		return paraCount;
	}
	
	/**
	 * ���� ������ �����Ѵ�.
	 * @param paraCount ���� ����
	 */
	public void setParaCount(int paraCount) {
		this.paraCount = paraCount;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * @return �Ӽ� ��ü
 	 */
	public ListHeaderProperty getProperty() {
		return property;
	}
}
