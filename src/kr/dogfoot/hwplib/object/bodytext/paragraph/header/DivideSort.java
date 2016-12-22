package kr.dogfoot.hwplib.object.bodytext.paragraph.header;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� �������� ������ ���� ��ü
 * 
 * @author neolord
 */
public class DivideSort {
	/**
	 * ���Ͽ� ����Ǵ� �� (unsigned 1 byte)
	 */
	private short value;

	/**
	 * ������
	 */
	public DivideSort() {
	}

	/**
	 * ���Ͽ� ����Ǵ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ��
	 */
	public short getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� ���� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ��
	 */
	public void setValue(short value) {
		this.value = value;
	}

	/**
	 * ���� �����Ⱑ ����Ǿ����� ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ���� �����Ⱑ ����Ǿ����� ����
	 */
	public boolean isDivideSection() {
		return BitFlag.get(value, 0);
	}

	/**
	 * ���� �����Ⱑ ����Ǿ����� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param divideSection
	 */
	public void setDivideSection(boolean divideSection) {
		value = BitFlag.set(value, 0, divideSection);
	}

	/**
	 * �ٴ� �����Ⱑ �����Ǿ����� ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �ٴ� �����Ⱑ �����Ǿ����� ����
	 */
	public boolean isDivideMultiColumn() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �ٴ� �����Ⱑ �����Ǿ����� ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param divideMultiColumn
	 *            �ٴ� �����Ⱑ �����Ǿ����� ����
	 */
	public void setDivideMultiColumn(boolean divideMultiColumn) {
		value = BitFlag.set(value, 1, divideMultiColumn);
	}

	/**
	 * �� �����Ⱑ �����Ǿ����� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return �� �����Ⱑ �����Ǿ����� ����
	 */
	public boolean isDividePage() {
		return BitFlag.get(value, 2);
	}

	/**
	 * �� �����Ⱑ �����Ǿ����� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param dividePage
	 *            �� �����Ⱑ �����Ǿ����� ����
	 */
	public void setDividePage(boolean dividePage) {
		value = BitFlag.set(value, 2, dividePage);
	}

	/**
	 * �� �����Ⱑ �����Ǿ����� ���θ� ��ȯ�Ѵ�. (3 bit)
	 * 
	 * @return �� �����Ⱑ �����Ǿ����� ����
	 */
	public boolean isDivideColumn() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �� �����Ⱑ �����Ǿ����� ���θ� �����Ѵ�. (3 bit)
	 * 
	 * @param divideColumn
	 *            �� �����Ⱑ �����Ǿ����� ����
	 */
	public void setDivideColumn(boolean divideColumn) {
		value = BitFlag.set(value, 3, divideColumn);
	}
}
