package kr.dogfoot.hwplib.object.bodytext.control.gso.caption;

import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.ListHeaderProperty;

/**
 * ĸ���� ���� ���� ����Ʈ ��� ���ڵ�
 * 
 * @author neolord
 */
public class ListHeaderForCaption {
	/**
	 * ���� ����
	 */
	private int paraCount;
	/**
	 * �Ӽ�
	 */
	private ListHeaderProperty property;
	/**
	 * caption �Ӽ�
	 */
	private ListHeaderCaptionProperty captionProperty;
	/**
	 * ĸ�� ��(���� ������ ���� ���)
	 */
	private long captionWidth;
	/**
	 * ĸ�ǰ� Ʋ ���� ����
	 */
	private int spaceBetweenCaptionAndFrame;
	/**
	 * �ؽ�Ʈ�� �ִ� ����(=��ü ��)
	 */
	private long textWidth;

	/**
	 * ������
	 */
	public ListHeaderForCaption() {
		property = new ListHeaderProperty();
		captionProperty = new ListHeaderCaptionProperty();
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
	 * caption �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return caption �Ӽ� ��ü
	 */
	public ListHeaderCaptionProperty getCaptionProperty() {
		return captionProperty;
	}

	/**
	 * ĸ�� ���� ��ȯ�Ѵ�. (���� ������ ���� ���)
	 * 
	 * @return ĸ�� ��
	 */
	public long getCaptionWidth() {
		return captionWidth;
	}

	/**
	 * ĸ�� ���� �����Ѵ�.
	 * 
	 * @param captionWidth
	 *            ĸ�� ��
	 */
	public void setCaptionWidth(long captionWidth) {
		this.captionWidth = captionWidth;
	}

	/**
	 * ĸ�ǰ� Ʋ ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ĸ�ǰ� Ʋ ���� ������ ũ��
	 */
	public int getSpaceBetweenCaptionAndFrame() {
		return spaceBetweenCaptionAndFrame;
	}

	/**
	 * ĸ�ǰ� Ʋ ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param spaceBetweenCaptionAndFrame
	 *            ĸ�ǰ� Ʋ ���� ������ ũ��
	 */
	public void setSpaceBetweenCaptionAndFrame(int spaceBetweenCaptionAndFrame) {
		this.spaceBetweenCaptionAndFrame = spaceBetweenCaptionAndFrame;
	}

	/**
	 * �ؽ�Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ�� ��
	 */
	public long getTextWidth() {
		return textWidth;
	}

	/**
	 * �ؽ�Ʈ�� ���� �����Ѵ�.
	 * 
	 * @param textWidth
	 *            �ؽ�Ʈ�� ��
	 */
	public void setTextWidth(long textWidth) {
		this.textWidth = textWidth;
	}
}
