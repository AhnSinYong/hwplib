package kr.dogfoot.hwplib.object.docinfo.borderfill;

/**
 * �밢�� ����
 * 
 * @author neolord
 */
public enum DiagonalSort {
	/**
	 * Slash
	 */
	Slash((byte) 0),
	/**
	 * BackSlash
	 */
	BackSlash((byte) 1),
	/**
	 * CrookedSlash
	 */
	CrookedSlash((byte) 2);

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
	private DiagonalSort(byte value) {
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
	public static DiagonalSort valueOf(byte value) {
		for (DiagonalSort ds : values()) {
			if (ds.value == value) {
				return ds;
			}
		}
		return Slash;
	}
}
