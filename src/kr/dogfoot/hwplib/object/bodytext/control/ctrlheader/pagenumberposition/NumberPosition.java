package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagenumberposition;

/**
 * ��ȣ�� ǥ�� ��ġ
 * 
 * @author neolord
 */
public enum NumberPosition {
	/**
	 * �� ��ȣ ����
	 */
	None((byte) 0),
	/**
	 * ���� ��
	 */
	LeftTop((byte) 1),
	/**
	 * ��� ��
	 */
	CenterTop((byte) 2),
	/**
	 * ������ ��
	 */
	RightTop((byte) 3),
	/**
	 * ���� �Ʒ�
	 */
	LeftBottom((byte) 4),
	/**
	 * ��� �Ʒ�
	 */
	CenterBottom((byte) 5),
	/**
	 * ������ �Ʒ�
	 */
	RightBottom((byte) 6),
	/**
	 * �ٱ��� ��
	 */
	OutsideTop((byte) 7),
	/**
	 * �ٱ��� �Ʒ�
	 */
	OutsideBottom((byte) 8),
	/**
	 * ���� ��
	 */
	InsideTop((byte) 9),
	/**
	 * ���� �Ʒ�
	 */
	InsideBottom((byte) 10);

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
	private NumberPosition(byte value) {
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
	public static NumberPosition valueOf(byte value) {
		for (NumberPosition np : values()) {
			if (np.value == value) {
				return np;
			}
		}
		return None;
	}
}
