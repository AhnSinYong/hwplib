package kr.dogfoot.hwplib.object.docinfo.facename;

/**
 * ��ü �۲� ����
 * 
 * @author neolord
 */
public enum FontType {
	/**
	 * ���� ������ �� �� ���� ��
	 */
	Unknown((byte) 0),
	/**
	 * Ʈ��Ÿ�� �۲�(TTF)
	 */
	TTF((byte) 1),
	/**
	 * �ѱ� ���� �۲�(HFT)
	 */
	HFT((byte) 2);

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
	private FontType(byte value) {
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
	public static FontType valueOf(byte value) {
		for (FontType ft : values()) {
			if (ft.value == value) {
				return ft;
			}
		}
		return Unknown;
	}
}
