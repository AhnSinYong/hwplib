package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

/**
 * ȭ��ǥ ũ�� (����ũ��-����ũ��)
 * 
 * @author neolord
 */
public enum LineArrowSize {
	/**
	 * ����-����
	 */
	SmallSmall((byte) 0),
	/**
	 * ����-�߰�
	 */
	SmallMiddle((byte) 1),
	/**
	 * ����-ū
	 */
	SmallBig((byte) 2),
	/**
	 * �߰�-����
	 */
	MiddleSmall((byte) 3),
	/**
	 * �߰�-�߰�
	 */
	MiddleMiddle((byte) 4),
	/**
	 * �߰�-ū
	 */
	MiddleBig((byte) 5),
	/**
	 * ū-����
	 */
	BigSmall((byte) 6),
	/**
	 * ū-�߰�
	 */
	BigMiddle((byte) 7),
	/**
	 * ū-ū
	 */
	BigBig((byte) 8);

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
	private LineArrowSize(byte value) {
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
	public static LineArrowSize valueOf(byte value) {
		for (LineArrowSize las : values()) {
			if (las.value == value) {
				return las;
			}
		}
		return SmallSmall;
	}
}
