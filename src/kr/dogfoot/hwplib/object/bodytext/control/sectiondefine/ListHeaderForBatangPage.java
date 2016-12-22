package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.ListHeaderProperty;

/**
 * �������� ���� ���� ����Ʈ ��� ���ڵ�
 * 
 * @author neolord
 */
public class ListHeaderForBatangPage {
	/**
	 * ���� ����
	 */
	private int paraCount;
	/**
	 * �Ӽ�
	 */
	private ListHeaderProperty property;
	/**
	 * �ؽ�Ʈ ������ ��
	 */
	private long textWidth;
	/**
	 * �ؽ�Ʈ ������ ����
	 */
	private long textHeight;

	/**
	 * ������
	 */
	public ListHeaderForBatangPage() {
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

	/**
	 * �ؽ�Ʈ ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ ������ ��
	 */
	public long getTextWidth() {
		return textWidth;
	}

	/**
	 * �ؽ�Ʈ ������ ���� �����Ѵ�.
	 * 
	 * @param textWidth
	 *            �ؽ�Ʈ ������ ��
	 */
	public void setTextWidth(long textWidth) {
		this.textWidth = textWidth;
	}

	/**
	 * �ؽ�Ʈ ������ ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ ������ ����
	 */
	public long getTextHeight() {
		return textHeight;
	}

	/**
	 * �ؽ�Ʈ ������ ���̸� �����Ѵ�.
	 * 
	 * @param textHeight
	 *            �ؽ�Ʈ ������ ����
	 */
	public void setTextHeight(long textHeight) {
		this.textHeight = textHeight;
	}

}
