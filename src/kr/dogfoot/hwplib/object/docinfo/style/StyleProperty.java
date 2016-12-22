package kr.dogfoot.hwplib.object.docinfo.style;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ��Ÿ���� �Ӽ� ��ü
 * 
 * @author neolord
 */
public class StyleProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 1 byte)
	 */
	private short value;

	/**
	 * ������
	 */
	public StyleProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public short getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(short value) {
		this.value = value;
	}

	/**
	 * ��Ÿ�� ������ ��ȯ�Ѵ�. (0~2 bit)
	 * 
	 * @return ��Ÿ�� ����
	 */
	public StyleSort getStyleSort() {
		return StyleSort.valueOf((byte) BitFlag.get(value, 0, 2));
	}

	/**
	 * ��Ÿ�� ������ �����Ѵ�. (0~2 bit)
	 * 
	 * @param styleSort
	 *            ��Ÿ�� ����
	 */
	public void setStyleSort(StyleSort styleSort) {
		value = BitFlag.set(value, 0, 2, styleSort.getValue());
	}
}
