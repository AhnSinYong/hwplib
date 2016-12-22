package kr.dogfoot.hwplib.object.bodytext.control.gso.caption;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ĸ�� ������ �Ӽ��� ���³��� ��ü
 * 
 * @author neolord
 */
public class ListHeaderCaptionProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ListHeaderCaptionProperty() {
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
	 * ĸ�� ������ ��ȯ�Ѵ�. (0~1 bit)
	 * 
	 * @return ĸ�� ����
	 */
	public CaptionDirection getDirection() {
		return CaptionDirection.valueOf((byte) BitFlag.get(value, 0, 1));
	}

	/**
	 * ĸ�� ������ �����Ѵ�. (0~1 bit)
	 * 
	 * @param direction
	 *            ĸ�� ����
	 */
	public void setDirection(CaptionDirection direction) {
		value = BitFlag.set(value, 0, 1, direction.getValue());
	}

	/**
	 * ĸ�� ���� ������ ������ ������ ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ĸ�� ���� ������ ������ ������ ����
	 */
	public boolean isIncludeMargin() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ĸ�� ���� ������ ������ ������ ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param includeMargin
	 *            ĸ�� ���� ������ ������ ������ ����
	 */
	public void setIncludeMargin(boolean includeMargin) {
		value = BitFlag.set(value, 2, includeMargin);
	}
}
