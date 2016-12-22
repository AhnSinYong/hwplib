package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ���� ��ġ�� ����
 * 
 * @author neolord
 */
public enum HorzRelTo {
	/**
	 * ����
	 */
	Paper((byte) 0),
	/**
	 * ��
	 */
	Page((byte) 1),
	/**
	 * ��
	 */
	Column((byte) 2),
	/**
	 * ����
	 */
	Para((byte) 3);

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
	private HorzRelTo(byte value) {
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
	public static HorzRelTo valueOf(byte value) {
		for (HorzRelTo hrt : values()) {
			if (hrt.value == value) {
				return hrt;
			}
		}
		return Paper;
	}
}
