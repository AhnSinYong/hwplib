package kr.dogfoot.hwplib.object.bodytext.control.table;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ǥ�� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class TableProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public TableProperty() {
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
	 * �� ��迡�� ���� ����� ��ȯ�Ѵ�. (0~1 bit)
	 * 
	 * @return �� ��迡�� ���� ���
	 */
	public DivideAtPageBoundary getDivideAtPageBoundary() {
		return DivideAtPageBoundary.valueOf((byte) BitFlag.get(value, 0, 1));
	}

	/**
	 * �� ��迡�� ���� ����� �����Ѵ�. (0~1 bit)
	 * 
	 * @param divideAtPageBoundary
	 *            �� ��迡�� ���� ���
	 */
	public void setDivideAtPageBoundary(
			DivideAtPageBoundary divideAtPageBoundary) {
		value = BitFlag.set(value, 0, 1, divideAtPageBoundary.getValue());
	}

	/**
	 * ���� �� �ڵ� �ݺ� ������ ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ���� �� �ڵ� �ݺ� ����
	 */
	public boolean isAutoRepeatTitleRow() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ���� �� �ڵ� �ݺ� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param autoRepeatTitleRow
	 *            ���� �� �ڵ� �ݺ� ����
	 */
	public void setAutoRepeatTitleRow(boolean autoRepeatTitleRow) {
		value = BitFlag.set(value, 2, autoRepeatTitleRow);
	}
}
