package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagenumberposition;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.NumberShape;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� ��ȣ ��ġ ��Ʈ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class PageNumberPositionHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public PageNumberPositionHeaderProperty() {
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
	 * ��ȣ ����� ��ȯ�Ѵ�. (0~7 bit)
	 * 
	 * @return ��ȣ ���
	 */
	public NumberShape getNumberShape() {
		return NumberShape.valueOf((short) BitFlag.get(value, 0, 7));
	}

	/**
	 * ��ȣ ����� �����Ѵ�. (0~7 bit)
	 * 
	 * @param numberShape
	 *            ��ȣ ���
	 */
	public void setNumberShape(NumberShape numberShape) {
		value = BitFlag.set(value, 0, 7, numberShape.getValue());
	}

	/**
	 * ��ȣ�� ǥ�� ��ġ�� ��ȯ�Ѵ�. (8~11 bit)
	 * 
	 * @return ��ȣ�� ǥ�� ��ġ
	 */
	public NumberPosition getNumberPosition() {
		return NumberPosition.valueOf((byte) BitFlag.get(value, 8, 11));
	}

	/**
	 * ��ȣ�� ǥ�� ��ġ�� �����Ѵ�. (8~11 bit)
	 * 
	 * @param numberPosition
	 *            ��ȣ�� ǥ�� ��ġ
	 */
	public void setNumberPosition(NumberPosition numberPosition) {
		value = BitFlag.set(value, 8, 11, numberPosition.getValue());
	}
}
