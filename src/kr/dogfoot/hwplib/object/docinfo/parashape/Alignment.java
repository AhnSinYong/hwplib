package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * ���� ���
 * 
 * @author neolord
 */
public enum Alignment {
	/**
	 * ���� ����
	 */
	Justify((byte) 0),
	/**
	 * ���� ����
	 */
	Left((byte) 1),
	/**
	 * ������ ����
	 */
	Right((byte) 2),
	/**
	 * ��� ����
	 */
	Center((byte) 3),
	/**
	 * ��� ����
	 */
	Distribute((byte) 4),
	/**
	 * ���� ����
	 */
	Divide((byte) 5);

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
	private Alignment(byte value) {
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
	public static Alignment valueOf(byte value) {
		for (Alignment a : values()) {
			if (a.value == value) {
				return a;
			}
		}
		return Justify;
	}
}
