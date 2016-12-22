package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.curve;

/**
 * ��� Segment Type
 * 
 * @author neolord
 */
public enum CurveSegmentType {
	/**
	 * line
	 */
	Line((byte) 0),
	/**
	 * curve
	 */
	Curve((byte) 1);

	/**
	 * ���Ͽ� ����Ǵ� ������
	 */
	private byte value;

	/**
	 * ������
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	private CurveSegmentType(byte value) {
		this.value = value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public byte getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �ش�Ǵ� enum ���� ��ȯ�Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 * @return enum ��
	 */
	public static CurveSegmentType valueOf(byte value) {
		for (CurveSegmentType cst : values()) {
			if (cst.value == value) {
				return cst;
			}
		}
		return Line;
	}
}
