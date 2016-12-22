package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ole;

/**
 * OLE ��ü ����
 * 
 * @author neolord
 */
public enum ObjectSort {
	/**
	 * Unknown
	 */
	Unknown((byte) 0),
	/**
	 * Embedded
	 */
	Embedded((byte) 1),
	/**
	 * Link
	 */
	Link((byte) 2),
	/**
	 * Static
	 */
	Static((byte) 3),
	/**
	 * Equation
	 */
	Equation((byte) 4);

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
	private ObjectSort(byte value) {
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
	public static ObjectSort valueOf(byte value) {
		for (ObjectSort os : values()) {
			if (os.value == value) {
				return os;
			}
		}
		return Unknown;
	}
}
