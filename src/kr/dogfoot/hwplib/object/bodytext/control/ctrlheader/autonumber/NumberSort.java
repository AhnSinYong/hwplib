package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.autonumber;

/**
 * ��ȣ ����
 * 
 * @author neolord
 */
public enum NumberSort {
	/**
	 * �� ��ȣ
	 */
	Page((byte) 0),
	/**
	 * ���� ��ȣ
	 */
	FootNote((byte) 1),
	/**
	 * ���� ��ȣ
	 */
	EndNote((byte) 2),
	/**
	 * �׸� ��ȣ
	 */
	Picture((byte) 3),
	/**
	 * ǥ ��ȣ
	 */
	Table((byte) 4),
	/**
	 * ���� ��ȣ
	 */
	Equation((byte) 5);

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
	private NumberSort(byte value) {
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
	public static NumberSort valueOf(byte value) {
		for (NumberSort ns : values()) {
			if (ns.value == value) {
				return ns;
			}
		}
		return Page;
	}
}
