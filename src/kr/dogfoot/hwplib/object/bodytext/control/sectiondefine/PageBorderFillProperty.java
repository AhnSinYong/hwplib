package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� �׵θ�/��� ������ �Ӽ��� ���� ��ü
 * 
 * @author neolord
 */
public class PageBorderFillProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public PageBorderFillProperty() {
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
	 * ��ġ ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ��ġ ����
	 */
	public PositionCriterion getPositionCriterion() {
		if (BitFlag.get(value, 0) == true) {
			return PositionCriterion.Paper;
		} else {
			return PositionCriterion.MainText;
		}
	}

	/**
	 * ��ġ ������ �����Ѵ�. (0 bit)
	 * 
	 * @param positionCriterion
	 */
	public void setPositionCriterion(PositionCriterion positionCriterion) {
		if (positionCriterion == PositionCriterion.MainText) {
			value = BitFlag.set(value, 0, false);
		} else if (positionCriterion == PositionCriterion.Paper) {
			value = BitFlag.set(value, 0, true);
		}
	}

	/**
	 * �Ӹ��� ���c ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �Ӹ��� ���c ����
	 */
	public boolean isIncludeHeader() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �Ӹ��� ���c ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param includeHeader
	 *            �Ӹ��� ���c ����
	 */
	public void setIncludeHeader(boolean includeHeader) {
		value = BitFlag.set(value, 1, includeHeader);
	}

	/**
	 * ������ ���� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ������ ���� ����
	 */
	public boolean isIncludeFooter() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ������ ���� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param includeFooter
	 *            ������ ���� ����
	 */
	public void setIncludeFooter(boolean includeFooter) {
		value = BitFlag.set(value, 2, includeFooter);
	}

	/**
	 * ä���� ������ ������ ��ȯ�Ѵ�. (3~4 bit)
	 * 
	 * @return ä���� ������ ����
	 */
	public FillArea getFillArea() {
		return FillArea.valueOf((byte) BitFlag.get(value, 3, 4));
	}

	/**
	 * ä���� ������ ������ �����Ѵ�. (3~4 bit)
	 * 
	 * @param fillArea
	 *            ä���� ������ ����
	 */
	public void setFillArea(FillArea fillArea) {
		value = BitFlag.set(value, 3, 4, fillArea.getValue());
	}
}
