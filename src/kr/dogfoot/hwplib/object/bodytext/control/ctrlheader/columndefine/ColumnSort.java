package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine;

/**
 * �� ����
 * 
 * @author neolord
 */
public enum ColumnSort {
	/**
	 * �Ϲ� �ٴ�
	 */
	Normal((byte) 0),
	/**
	 * ��� �ٴ�
	 */
	Distribution((byte) 1),
	/**
	 * ���� �ٴ�
	 */
	Parallel((byte) 1);

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
	private ColumnSort(byte value) {
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
	public static ColumnSort valueOf(byte value) {
		for (ColumnSort cs : values()) {
			if (cs.value == value) {
				return cs;
			}
		}
		return Normal;
	}
}
