package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.shadowinfo;

/**
 * �׸��� ����
 * 
 * @author neolord
 */
public enum ShadowType {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * ���� ��
	 */
	LeftTop((byte) 1),
	/**
	 * ������ ��
	 */
	RightTop((byte) 2),
	/**
	 * ���� �Ʒ�
	 */
	LeftBottom((byte) 3),
	/**
	 * ������ �Ʒ�
	 */
	RightBottom((byte) 4),
	/**
	 * ���� ��
	 */
	LeftBack((byte) 5),
	/**
	 * ������ ��
	 */
	RightBack((byte) 6),
	/**
	 * ���� ��
	 */
	LeftFront((byte) 7),
	/**
	 * ������ ��
	 */
	RightFront((byte) 8),
	/**
	 * �۰�
	 */
	Small((byte) 13),
	/**
	 * ũ��
	 */
	Large((byte) 14);

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
	private ShadowType(byte value) {
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
	public static ShadowType valueOf(byte value) {
		for (ShadowType st : values()) {
			if (st.value == value) {
				return st;
			}
		}
		return None;
	}
}
