package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ������ �Ӽ��� ���� ��ü
 * 
 * @author neolord
 */
public class PageDefProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public PageDefProperty() {
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
	 * ���� ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ���� ����
	 */
	public PaperDirection getPaperDirection() {
		if (BitFlag.get(value, 0) == false) {
			return PaperDirection.Potrait;
		} else {
			return PaperDirection.Landscape;
		}
	}

	/**
	 * ���� ������ �����Ѵ�. (0 bit)
	 * 
	 * @param paperDirection
	 *            ���� ����
	 */
	public void setPaperDirection(PaperDirection paperDirection) {
		if (paperDirection == PaperDirection.Potrait) {
			value = BitFlag.set(value, 0, false);
		} else {
			value = BitFlag.set(value, 0, true);
		}
	}

	/**
	 * ��å ����� ��ȯ�Ѵ�. (1~2 bit)
	 * 
	 * @return ��å ���
	 */
	public MakingBookMethod getMakingBookMethod() {
		return MakingBookMethod.valueOf((byte) BitFlag.get(value, 1, 2));
	}

	/**
	 * ��å ����� �����Ѵ�. (1~2 bit)
	 * 
	 * @param makingBookMethod
	 */
	public void setMakingBookMethod(MakingBookMethod makingBookMethod) {
		value = BitFlag.set(value, 1, 2, makingBookMethod.getValue());
	}
}
