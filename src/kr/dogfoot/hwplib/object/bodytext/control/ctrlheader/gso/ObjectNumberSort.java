package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ��ü�� ���ϴ� ��ȣ ����
 * 
 * @author neolord
 */
public enum ObjectNumberSort {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * �׸�
	 */
	Figure((byte) 1),
	/**
	 * ǥ
	 */
	Table((byte) 2),
	/**
	 * ����
	 */
	Equation((byte) 3);

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
	private ObjectNumberSort(byte value) {
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
	public static ObjectNumberSort valueOf(byte value) {
		for (ObjectNumberSort ons : values()) {
			if (ons.value == value) {
				return ons;
			}
		}
		return None;
	}
}
