package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

/**
 * �� ���� ȭ��ǥ ���
 * 
 * @author neolord
 */
public enum LineArrowShape {
	/**
	 * ��� ����
	 */
	None((byte) 0),
	/**
	 * ȭ��ǥ
	 */
	Arrow((byte) 1),
	/**
	 * ������ ȭ��ǥ
	 */
	ConcaveArrow((byte) 2),
	/**
	 * ���� �� ���̾Ƹ�� ���
	 */
	EmptyDiamond((byte) 3),
	/**
	 * ���� �� �� ���
	 */
	EmptyCircle((byte) 4),
	/**
	 * ���� �� �簢�� ���
	 */
	EmptyRectangle((byte) 5),
	/**
	 * ���� ä���� ���̾Ƹ�� ���
	 */
	Diamond((byte) 6),
	/**
	 * ���� ä���� �� ���
	 */
	Circle((byte) 7),
	/**
	 * ���� ä���� �簢�� ���
	 */
	Rectangle((byte) 8);

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
	private LineArrowShape(byte value) {
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
	public static LineArrowShape valueOf(byte value) {
		for (LineArrowShape las : values()) {
			if (las.value == value) {
				return las;
			}
		}
		return None;
	}
}
