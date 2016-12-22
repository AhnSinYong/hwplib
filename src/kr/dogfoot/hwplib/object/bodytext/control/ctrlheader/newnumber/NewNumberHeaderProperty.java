package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.newnumber;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.autonumber.NumberSort;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� ��ȣ ���� ��Ʈ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class NewNumberHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public NewNumberHeaderProperty() {
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
}
