package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ��ȣ�ű� ���
 * 
 * @author neolord
 */
public enum NumberingMethod {
	/**
	 * �� ������ �̾
	 */
	Continue((byte) 0),
	/**
	 * ���� �������� ���� ����
	 */
	Restart((byte) 1),
	/**
	 * �ʸ��� ���� ����(���� ����)
	 */
	RestartAtEachPage((byte) 2);

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
	private NumberingMethod(byte value) {
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
	public static NumberingMethod valueOf(byte value) {
		for (NumberingMethod nm : values()) {
			if (nm.value == value) {
				return nm;
			}
		}
		return Continue;
	}
}
