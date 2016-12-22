package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ���� ����
 * 
 * @author neolord
 */
public enum PaperDirection {
	/**
	 * ����
	 */
	Potrait((byte) 0),
	/**
	 * �а�
	 */
	Landscape((byte) 1);

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
	private PaperDirection(byte value) {
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
	public static PaperDirection valueOf(byte value) {
		for (PaperDirection pd : values()) {
			if (pd.value == value) {
				return pd;
			}
		}
		return Potrait;
	}
}
