package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ���� ��ġ�� ����
 * 
 * @author neolord
 */
public enum VertRelTo {
	/**
	 * ����
	 */
	Paper((byte) 0),
	/**
	 * ��
	 */
	Page((byte) 1),
	/**
	 * ����
	 */
	Para((byte) 2);

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
	private VertRelTo(byte value) {
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
	public static VertRelTo valueOf(byte value) {
		for (VertRelTo vrt : values()) {
			if (vrt.value == value) {
				return vrt;
			}
		}
		return Paper;
	}
}
