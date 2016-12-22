package kr.dogfoot.hwplib.object.docinfo.tabdef;

/**
 * ���� ����
 * 
 * @author neolord
 */
public enum TabSort {
	/**
	 * ����
	 */
	Left((byte) 0),
	/**
	 * ������
	 */
	Right((byte) 1),
	/**
	 * ���
	 */
	Center((byte) 2),
	/**
	 * �Ҽ���
	 */
	DecimalPoint((byte) 3);

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
	private TabSort(byte value) {
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
	public static TabSort valueOf(byte value) {
		for (TabSort ts : values()) {
			if (ts.value == value) {
				return ts;
			}
		}
		return Left;
	}
}
