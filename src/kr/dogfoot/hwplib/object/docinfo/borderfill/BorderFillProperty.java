package kr.dogfoot.hwplib.object.docinfo.borderfill;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �׵θ�/��� ��ü�� �Ӽ�
 * 
 * @author neolord
 */
public class BorderFillProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 2 byte)
	 */
	private int value;

	/**
	 * ������
	 */
	public BorderFillProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public int getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 3D ȿ���� ������ �����Ѵ�.(0 bit)
	 * 
	 * @return 3D ȿ���� ������
	 */
	public boolean is3DEffect() {
		return BitFlag.get(value, 0);
	}

	/**
	 * 3D ȿ���� ������ �����Ѵ�.(0 bit)
	 * 
	 * @param _3DEffect
	 *            3D ȿ���� ����
	 */
	public void set3DEffect(boolean _3DEffect) {
		value = BitFlag.set(value, 0, _3DEffect);
	}

	/**
	 * �׸��� ȿ���� ������ ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �׸��� ȿ���� ����
	 */
	public boolean isShadowEffect() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �׸��� ȿ���� ������ �����Ѵ�. (1 bit)
	 * 
	 * @param shadowEffect
	 */
	public void setShadowEffect(boolean shadowEffect) {
		value = BitFlag.set(value, 1, shadowEffect);
	}

	/**
	 * Slash �밢�� ����� ��ȯ�Ѵ�.(2~4 BitFlag)
	 * 
	 * @return Slash �밢�� ���
	 */
	public SlashDiagonaShape getSlashDiagonalShape() {
		return SlashDiagonaShape.valueOf((byte) BitFlag.get(value, 2, 4));
	}

	/**
	 * Slash �밢�� ��縦 �����Ѵ�. (2~4 BitFlag)
	 * 
	 * @param diagonaShape
	 *            Slash �밢�� ���
	 */
	public void setSlashDiagonalShape(SlashDiagonaShape diagonaShape) {
		value = BitFlag.set(value, 2, 4, diagonaShape.getValue());
	}

	/**
	 * BackSlash �밢�� ����� ��ȯ�Ѵ�. (5~7 BitFlag)
	 * 
	 * @return BackSlash �밢�� ���
	 */
	public BackSlashDiagonaShape getBackSlashDiagonalShape() {
		return BackSlashDiagonaShape.valueOf((byte) BitFlag.get(value, 5, 7));
	}

	/**
	 * BackSlash �밢�� ��縦 �����Ѵ�. (5~7 BitFlag)
	 * 
	 * @param diagonaShape
	 *            BackSlash �밢�� ���
	 */
	public void setBackSlashDiagonalShape(BackSlashDiagonaShape diagonaShape) {
		value = BitFlag.set(value, 5, 7, diagonaShape.getValue());
	}

	/**
	 * Slash �밢���� ���������� �ƴ��� ���θ� ��ȯ�Ѵ�. (8~9 BitFlag)
	 * 
	 * @return Slash �밢���� ���������� �ƴ��� ����
	 */
	public boolean isBrokenSlashDiagonal() {
		return BitFlag.get(value, 8) || BitFlag.get(value, 9);
	}

	/**
	 * Slash �밢���� ���������� �ƴ��� ���θ� �����Ѵ�. (8~9 BitFlag)
	 * 
	 * @param brokenSlashDiagonal
	 *            Slash �밢���� ���������� �ƴ��� ����
	 */
	public void setBrokenSlashDiagonal(boolean brokenSlashDiagonal) {
		value = BitFlag.set(value, 8, brokenSlashDiagonal);
		value = BitFlag.set(value, 9, brokenSlashDiagonal);
	}

	/**
	 * BackSlash �밢���� ���������� �ƴ��� ���θ� ��ȯ�Ѵ�. (10 bit)
	 * 
	 * @return BackSlash �밢���� ���������� �ƴ��� ����
	 */
	public boolean isBrokenBackSlashDiagonal() {
		return BitFlag.get(value, 10);
	}

	/**
	 * BackSlash �밢���� ���������� �ƴ��� ���θ� �����Ѵ�. (10 bit)
	 * 
	 * @param brokenBackSlashDiagonal
	 *            BackSlash �밢���� ���������� �ƴ��� ����
	 */
	public void setBrokenBackSlashDiagonal(boolean brokenBackSlashDiagonal) {
		value = BitFlag.set(value, 10, brokenBackSlashDiagonal);
	}

	/**
	 * Slash �밢���� 180�� ȸ�� ���θ� ��ȯ�Ѵ�. (11 bit)
	 * 
	 * @return Slash �밢���� 180�� ȸ�� ����
	 */
	public boolean isRotateSlashDiagonal180() {
		return BitFlag.get(value, 11);
	}

	/**
	 * Slash �밢���� 180�� ȸ�� ���θ� �����Ѵ� (11 bit)
	 * 
	 * @param rotateSlashDiagonal180
	 *            Slash �밢���� 180�� ȸ�� ����
	 */
	public void setRotateSlashDiagonal180(boolean rotateSlashDiagonal180) {
		value = BitFlag.set(value, 11, rotateSlashDiagonal180);
	}

	/**
	 * BackSlash �밢���� 180�� ȸ�� ���θ� ��ȯ�Ѵ�. (12 bit)
	 * 
	 * @return BackSlash �밢���� 180�� ȸ�� ����
	 */
	public boolean isRotateBackSlashDiagonal180() {
		return BitFlag.get(value, 12);
	}

	/**
	 * BackSlash �밢���� 180�� ȸ�� ���θ� �����Ѵ�. (12 bit)
	 * 
	 * @param rotateBackSlashDiagonal180
	 *            BackSlash �밢���� 180�� ȸ�� ����
	 */
	public void setRotateBackSlashDiagonal180(boolean rotateBackSlashDiagonal180) {
		value = BitFlag.set(value, 12, rotateBackSlashDiagonal180);
	}

	/**
	 * �߽ɼ��� �������� ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return �߽ɼ��� �������� ����
	 */
	public boolean hasCenterLine() {
		return BitFlag.get(value, 13);
	}

	/**
	 * �߽ɼ��� �������� ���θ� �����Ѵ�. (13 bit)
	 * 
	 * @param hasCenterLine
	 *            �߽ɼ��� �������� ���θ�
	 */
	public void setHasCenterLine(boolean hasCenterLine) {
		value = BitFlag.set(value, 13, hasCenterLine);
	}
}
