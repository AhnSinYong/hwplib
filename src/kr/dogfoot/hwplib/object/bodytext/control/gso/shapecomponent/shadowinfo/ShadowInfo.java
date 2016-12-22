package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.shadowinfo;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׸��� ����
 * 
 * @author neolord
 */
public class ShadowInfo {
	/**
	 * �׸��� ����
	 */
	private ShadowType type;
	/**
	 * �׸��� ��
	 */
	private Color4Byte color;
	/**
	 * ���� ���� �̵� �Ÿ�
	 */
	private int offsetX;
	/**
	 * ���� ���� �̵� �Ÿ�
	 */
	private int offsetY;
	/**
	 * ����
	 */
	private short transparnet;

	/**
	 * ������
	 */
	public ShadowInfo() {
		color = new Color4Byte();
	}

	/**
	 * �׸��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ����
	 */
	public ShadowType getType() {
		return type;
	}

	/**
	 * �׸��� ������ �E���Ѵ�.
	 * 
	 * @param type
	 *            �׸��� ����
	 */
	public void setType(ShadowType type) {
		this.type = type;
	}

	/**
	 * �׸��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ���� ��ü
	 */
	public Color4Byte getColor() {
		return color;
	}

	/**
	 * ���� ���� �̵� �Ÿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� �̵� �Ÿ�
	 */
	public int getOffsetX() {
		return offsetX;
	}

	/**
	 * ���� ���� �̵� �Ÿ��� �����Ѵ�.
	 * 
	 * @param offsetX
	 *            ���� ���� �̵� �Ÿ�
	 */
	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}

	/**
	 * ���� ���� �̵� �Ÿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� �̵� �Ÿ�
	 */
	public int getOffsetY() {
		return offsetY;
	}

	/**
	 * ���� ���� �̵� �Ÿ��� �����Ѵ�.
	 * 
	 * @param offsetY
	 *            ���� ���� �̵� �Ÿ�
	 */
	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}

	/**
	 * ������ ��ȯ�Ѵ�.
	 * 
	 * @return ����
	 */
	public short getTransparnet() {
		return transparnet;
	}

	/**
	 * ������ �����Ѵ�.
	 * 
	 * @param transparnet
	 *            ����
	 */
	public void setTransparnet(short transparnet) {
		this.transparnet = transparnet;
	}
}
