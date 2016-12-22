package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� ���� ��Ʈ���� �Ӽ� ��ü
 * 
 * @author neolord
 */
public class ColumnDefineHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 2 byte)
	 */
	private int value;

	/**
	 * ������
	 */
	public ColumnDefineHeaderProperty() {
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
	 * �� ������ ��ȯ�Ѵ�. (0~1 bit)
	 * 
	 * @return �� ����
	 */
	public ColumnSort getColumnSort() {
		return ColumnSort.valueOf((byte) BitFlag.get(value, 0, 1));
	}

	/**
	 * �� ������ �����Ѵ�. (0~1 bit)
	 * 
	 * @param columnSort
	 *            �� ����
	 */
	public void setColumnSort(ColumnSort columnSort) {
		value = BitFlag.set(value, 0, 1, columnSort.getValue());
	}

	/**
	 * �� ������ ��ȯ�Ѵ�. (2~9 bit)
	 * 
	 * @return �� ����
	 */
	public short getColumnCount() {
		return (short) BitFlag.get(value, 2, 9);
	}

	/**
	 * �� ������ �����Ѵ�. (2~9 bit)
	 * 
	 * @param columnCount
	 *            �� ����
	 */
	public void setColumnCount(short columnCount) {
		value = BitFlag.set(value, 2, 9, columnCount);
	}

	/**
	 * �� ������ ��ȯ�Ѵ�. (10~11 bit)
	 * 
	 * @return �� ����
	 */
	public ColumnDirection getColumnDirection() {
		return ColumnDirection.valueOf((byte) BitFlag.get(value, 10, 11));
	}

	/**
	 * �� ������ �����Ѵ�. (10~11 bit)
	 * 
	 * @param columnDirection
	 *            �� ����
	 */
	public void setColumnDirection(ColumnDirection columnDirection) {
		value = BitFlag.set(value, 10, 11, columnDirection.getValue());
	}

	/**
	 * �� �ʺ� �����ϰ� ���θ� ��ȯ�Ѵ�. (12 bit)
	 * 
	 * @return �� �ʺ� �����ϰ� ����
	 */
	public boolean isSameWidth() {
		return BitFlag.get(value, 12);
	}

	/**
	 * �� �ʺ� �����ϰ� ���θ� �����Ѵ�. (12 bit)
	 * 
	 * @param sameWidth
	 *            �� �ʺ� �����ϰ� ����
	 */
	public void setSameWidth(boolean sameWidth) {
		value = BitFlag.set(value, 12, sameWidth);
	}
}
