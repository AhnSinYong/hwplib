package kr.dogfoot.hwplib.object.bodytext.control.gso.caption;

/**
 * ĸ�� ����
 * 
 * @author neolord
 */
public enum CaptionDirection {
	/**
	 * ����
	 */
	Left((byte) 0),
	/**
	 * ������
	 */
	Right((byte) 1),
	/**
	 * ����
	 */
	Top((byte) 2),
	/**
	 * �Ʒ���
	 */
	Bottom((byte) 3);

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
	private CaptionDirection(byte value) {
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
	public static CaptionDirection valueOf(byte value) {
		for (CaptionDirection cd : values()) {
			if (cd.value == value) {
				return cd;
			}
		}
		return Left;
	}
}
