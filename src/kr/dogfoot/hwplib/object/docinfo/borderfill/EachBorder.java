package kr.dogfoot.hwplib.object.docinfo.borderfill;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׵θ�/��� ��ü���� 4������ ������ ���� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class EachBorder {
	/**
	 * �� ����
	 */
	private BorderType type;
	/**
	 * �β�
	 */
	private BorderThickness thickness;
	/**
	 * ����
	 */
	private Color4Byte color;

	/**
	 * ������
	 */
	public EachBorder() {
		color = new Color4Byte();
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public BorderType getType() {
		return type;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param type
	 *            ���� ����
	 */
	public void setType(BorderType type) {
		this.type = type;
	}

	/**
	 * ���� �β��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �β�
	 */
	public BorderThickness getThickness() {
		return thickness;
	}

	/**
	 * ���� �β��� �����Ѵ�.
	 * 
	 * @param thickness
	 *            ���� �β�
	 */
	public void setThickness(BorderThickness thickness) {
		this.thickness = thickness;
	}

	/**
	 * ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ü
	 */
	public Color4Byte getColor() {
		return color;
	}
}
