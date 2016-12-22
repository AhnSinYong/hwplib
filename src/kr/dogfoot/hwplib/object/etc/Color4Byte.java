package kr.dogfoot.hwplib.object.etc;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * 4byte ���� ��ü. windows API�� COLORREF�� �����ϴ� ��ü
 * 
 * @author neolord
 */
public class Color4Byte {
	/**
	 * unsigned 4 byte color ���� ����
	 */
	private long color;

	public Color4Byte() {
	}

	/**
	 * unsigned 4 byte color ���� ��ȯ�Ѵ�.
	 * 
	 * @return unsigned 4 byte color ��
	 */
	public long getColor() {
		return color;
	}

	/**
	 * unsigned 4 byte color ���� �����Ѵ�.
	 * 
	 * @param color
	 *            unsigned 4 byte color ��, windows API���� COLORREF�� ��
	 */
	public void setColor(long color) {
		this.color = color;
	}

	/**
	 * ������ red ���� ��ȯ�Ѵ�.
	 * 
	 * @return red ��(0~255)
	 */
	public short getR() {
		return (short) BitFlag.get(color, 0, 7);
	}

	/**
	 * ������ red ���� �����Ѵ�.
	 * 
	 * @param r
	 *            red ��(0~255)
	 */
	public void setR(short r) {
		BitFlag.set(color, 0, 7, r);
	}

	/**
	 * ������ green ���� ��ȯ�Ѵ�.
	 * 
	 * @return green ��(0~255)
	 */
	public short getG() {
		return (short) BitFlag.get(color, 8, 15);
	}

	/**
	 * ������ green ���� �����Ѵ�.
	 * 
	 * @param g
	 *            green ��(0~255)
	 */
	public void setG(short g) {
		BitFlag.set(color, 8, 15, g);
	}

	/**
	 * ������ blue ���� ��ȯ�Ѵ�.
	 * 
	 * @return blue ��(0~255)
	 */
	public short getB() {
		return (short) BitFlag.get(color, 16, 23);
	}

	/**
	 * ������ blue ���� �����Ѵ�.
	 * 
	 * @param b
	 *            blue ��(0~255)
	 */
	public void setB(short b) {
		BitFlag.set(color, 16, 23, b);
	}

	/**
	 * ������ alpha ���� ��ȯ�Ѵ�.
	 * 
	 * @return alpha ��(0~255)
	 */
	public short getA() {
		return (short) BitFlag.get(color, 24, 31);
	}

	/**
	 * ������ alpha ���� �����Ѵ�.
	 * 
	 * @param a
	 *            alpha ��(0~255)
	 */
	public void setA(short a) {
		BitFlag.set(color, 24, 31, a);
	}
}
