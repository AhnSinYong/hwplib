package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �׸��� ����
 * 
 * @author neolord
 */
public enum ShadowSort {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * �񿬼�
	 */
	Discontinuous((byte) 1),
	/**
	 * ����
	 */
	Continuous((byte) 2);

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
	private ShadowSort(byte value) {
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
	public static ShadowSort valueOf(byte value) {
		for (ShadowSort ss : values()) {
			if (ss.value == value) {
				return ss;
			}
		}
		return None;
	}
}
