package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �׵θ� �� ������ �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class LineInfoProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public LineInfoProperty() {
	}

	/**
	 * �����ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return ������
	 */
	public long getValue() {
		return value;
	}

	/**
	 * �����ڸ� �����Ѵ�.
	 * 
	 * @param value
	 *            ������
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * �� ������ ��ȯ�Ѵ�. (0~5 bit)
	 * 
	 * @return �� ����
	 */
	public LineType getLineType() {
		return LineType.valueOf((byte) BitFlag.get(value, 0, 5));
	}

	/**
	 * �� ������ �����Ѵ�. (0~5 bit)
	 * 
	 * @param lineType
	 *            �� ����
	 */
	public void setLineType(LineType lineType) {
		value = BitFlag.set(value, 0, 5, lineType.getValue());
	}

	/**
	 * �� �� ����� ��ȯ�Ѵ�. (6~9 bit)
	 * 
	 * @return �� �� ���
	 */
	public LineEndShape getLineEndShape() {
		return LineEndShape.valueOf((byte) BitFlag.get(value, 6, 9));
	}

	/**
	 * �� �� ����� �����Ѵ�. (6~9 bit)
	 * 
	 * @param lineEndShape
	 *            �� �� ���
	 */
	public void setLineEndShape(LineEndShape lineEndShape) {
		value = BitFlag.set(value, 6, 9, lineEndShape.getValue());
	}

	/**
	 * ȭ��ǥ ���� ����� ��ȯ�Ѵ�. (10~15 bit)
	 * 
	 * @return ȭ��ǥ ���� ���
	 */
	public LineArrowShape getStartArrowShape() {
		return LineArrowShape.valueOf((byte) BitFlag.get(value, 10, 15));
	}

	/**
	 * ȭ��ǥ ���� ����� �����Ѵ�. (10~15 bit)
	 * 
	 * @param startArrowShape
	 *            ȭ��ǥ ���� ���
	 */
	public void setStartArrowShape(LineArrowShape startArrowShape) {
		value = BitFlag.set(value, 10, 15, startArrowShape.getValue());
	}

	/**
	 * ȭ��ǥ �� ����� ��ȯ�Ѵ�. (16~21 bit)
	 * 
	 * @return ȭ��ǥ �� ���
	 */
	public LineArrowShape getEndArrowShape() {
		return LineArrowShape.valueOf((byte) BitFlag.get(value, 16, 21));
	}

	/**
	 * ȭ��ǥ �� ����� �����Ѵ�. (16~21 bit)
	 * 
	 * @param endArrowShape
	 *            ȭ��ǥ �� ���
	 */
	public void setEndArrowShape(LineArrowShape endArrowShape) {
		value = BitFlag.set(value, 16, 21, endArrowShape.getValue());
	}

	/**
	 * ȭ��ǥ ���� ũ�⸦ ��ȯ�Ѵ�. (22~25 bit)
	 * 
	 * @return ȭ��ǥ ���� ũ��
	 */
	public LineArrowSize getStartArrowSize() {
		return LineArrowSize.valueOf((byte) BitFlag.get(value, 22, 25));
	}

	/**
	 * ȭ��ǥ ���� ũ�⸦ �����Ѵ�. (22~25 bit)
	 * 
	 * @param startArrowSize
	 *            ȭ��ǥ ���� ũ��
	 */
	public void setStartArrowSize(LineArrowSize startArrowSize) {
		value = BitFlag.set(value, 22, 25, startArrowSize.getValue());
	}

	/**
	 * ȭ��ǥ �� ũ�⸦ ��ȯ�Ѵ�. (26~29 bit)
	 * 
	 * @return ȭ��ǥ �� ũ��
	 */
	public LineArrowSize getEndArrowSize() {
		return LineArrowSize.valueOf((byte) BitFlag.get(value, 26, 29));
	}

	/**
	 * ȭ��ǥ �� ũ�⸦ �����Ѵ�. (26~29 bit)
	 * 
	 * @param endArrowSize
	 *            ȭ��ǥ �� ũ��
	 */
	public void setEndArrowSize(LineArrowSize endArrowSize) {
		value = BitFlag.set(value, 26, 29, endArrowSize.getValue());
	}

	/**
	 * ���ۺκ� ȭ��ǥ ä�� ���θ� ��ȯ�Ѵ�. (30 bit)
	 * 
	 * @return ���ۺκ� ȭ��ǥ ä�� ����
	 */
	public boolean isFillStartArrow() {
		return BitFlag.get(value, 30);
	}

	/**
	 * ���ۺκ� ȭ��ǥ ä�� ���θ� �E���Ѵ�. (30 bit)
	 * 
	 * @param fillStartArrow
	 *            ���ۺκ� ȭ��ǥ ä�� ����
	 */
	public void setFillStartArrow(boolean fillStartArrow) {
		value = BitFlag.set(value, 30, fillStartArrow);
	}

	/**
	 * ���κ� ȭ��ǥ ä�� ���θ� ��ȯ�Ѵ�. (31 bit)
	 * 
	 * @return ���κ� ȭ��ǥ ä�� ����
	 */
	public boolean isFillEndArrow() {
		return BitFlag.get(value, 31);
	}

	/**
	 * ���κ� ȭ��ǥ ä�� ���θ� �����Ѵ�. (31 bit)
	 * 
	 * @param fillEndArrow
	 *            ���κ� ȭ��ǥ ä�� ����
	 */
	public void setFillEndArrow(boolean fillEndArrow) {
		value = BitFlag.set(value, 31, fillEndArrow);
	}
}
