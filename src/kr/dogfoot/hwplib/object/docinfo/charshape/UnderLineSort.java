package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * ���� ����
 * 
 * @author neolord
 */
public enum UnderLineSort {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * ���� �Ʒ�
	 */
	Bottom((byte) 1),
	/**
	 * ���� ��
	 */
	Top((byte) 3);

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
	private UnderLineSort(byte value) {
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
	public static UnderLineSort valueOf(byte value) {
		for (UnderLineSort uls : values()) {
			if (uls.value == value) {
				return uls;
			}
		}
		return None;
	}
}
