package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.autonumber;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.NumberShape;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �ڵ���ȣ ��Ʈ���� �Ӽ� ��ü
 * 
 * @author neolord
 */
public class AutoNumberHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public AutoNumberHeaderProperty() {
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
	 * ��ȣ ������ ��ȯ�Ѵ�. (0~3 bit)
	 * 
	 * @return ��ȣ ����
	 */
	public NumberSort getNumberSort() {
		return NumberSort.valueOf((byte) BitFlag.get(value, 0, 3));
	}

	/**
	 * ��ȣ ������ �����Ѵ�. (0~3 bit)
	 * 
	 * @param numberSort
	 *            ��ȣ ����
	 */
	public void setNumberSort(NumberSort numberSort) {
		value = BitFlag.set(value, 0, 3, numberSort.getValue());
	}

	/**
	 * ��ȣ ����� ��ȯ�Ѵ�. (4~11 bit)
	 * 
	 * @return ��ȣ ���
	 */
	public NumberShape getNumberShape() {
		return NumberShape.valueOf((short) BitFlag.get(value, 4, 11));
	}

	/**
	 * ��ȣ ����� �����Ѵ�. (4~11 bit)
	 * 
	 * @param numberShape
	 *            ��ȣ ���
	 */
	public void setNumberShape(NumberShape numberShape) {
		value = BitFlag.set(value, 4, 11, numberShape.getValue());
	}

	/**
	 * ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ������ ��ȯ�Ѵ�. (12 bit)
	 * 
	 * @return ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ����
	 */
	public boolean isSuperScript() {
		return BitFlag.get(value, 12);
	}

	/**
	 * ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ���θ� �����Ѵ�. (12 bit)
	 * 
	 * @param superScript
	 *            ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ����
	 */
	public void setSuperScript(boolean superScript) {
		value = BitFlag.set(value, 12, superScript);
	}
}
