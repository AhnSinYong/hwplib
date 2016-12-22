package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ellipse;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * Ÿ�� ��ü�� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ShapeComponentEllipseProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ShapeComponentEllipseProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public long getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * ȣ(ARC)�� �ٲ���� �� interval�� �ٽ� ����ؾ� �� �ʿ䰡 �ִ��� ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ȣ(ARC)�� �ٲ���� �� interval�� �ٽ� ����ؾ� �� �ʿ䰡 �ִ��� ����
	 */
	public boolean isRecalculateIntervalWhenChangingArc() {
		return BitFlag.get(value, 0);
	}

	/**
	 * ȣ(ARC)�� �ٲ���� �� interval�� �ٽ� ����ؾ� �� �ʿ䰡 �ִ��� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param recalculateIntervalWhenChanging
	 *            ȣ(ARC)�� �ٲ���� �� interval�� �ٽ� ����ؾ� �� �ʿ䰡 �ִ��� ����
	 */
	public void setRecalculateIntervalWhenChangingArc(
			boolean recalculateIntervalWhenChanging) {
		value = BitFlag.set(value, 0, recalculateIntervalWhenChanging);
	}

	/**
	 * ȣ(ARC)�� �ٲ������ ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return ȣ(ARC)�� �ٲ������ ����
	 */
	public boolean isChangeArc() {
		return BitFlag.get(value, 1);
	}

	/**
	 * ȣ(ARC)�� �ٲ������ ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param changeArc
	 *            ȣ(ARC)�� �ٲ������ ����
	 */
	public void setChangeArc(boolean changeArc) {
		value = BitFlag.set(value, 1, changeArc);
	}

	/**
	 * ȣ(ARC)�� ������ ��ȯ�Ѵ�.(���� ����) (2~9 bit)
	 * 
	 * @return ȣ(ARC)�� ����
	 */
	public short getArcSort() {
		return (short) BitFlag.get(value, 2, 9);
	}

	/**
	 * ȣ(ARC)�� ������ �����Ѵ�. (���� ����) (2~9 bit)
	 * 
	 * @param arcSort
	 *            ȣ(ARC)�� ����
	 */
	public void setArcSort(short arcSort) {
		value = BitFlag.set(value, 2, 9, arcSort);
	}
}
