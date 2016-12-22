package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine;

/**
 * �� ����
 * 
 * @author neolord
 */
public enum ColumnDirection {
	/**
	 * ���ʺ���
	 */
	FromLeft((byte) 0),
	/**
	 * �����ʺ���
	 */
	FromRight((byte) 1),
	/**
	 * ����
	 */
	Both((byte) 2);

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
	private ColumnDirection(byte value) {
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
	public static ColumnDirection valueOf(byte value) {
		for (ColumnDirection cd : values()) {
			if (cd.value == value) {
				return cd;
			}
		}
		return FromLeft;
	}
}
