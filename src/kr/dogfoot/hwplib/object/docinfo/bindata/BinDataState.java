package kr.dogfoot.hwplib.object.docinfo.bindata;

/**
 * ���̳ʸ� �������� ����
 * 
 * @author neolord
 */
public enum BinDataState {
	/**
	 * ���� access �� ���� ���� ����
	 */
	NotAcceess((byte) 0),
	/**
	 * access�� �����Ͽ� ������ ã�� ����
	 */
	SuccessAccess((byte) 1),
	/**
	 * access�� ������ ���� ����
	 */
	FailAccess((byte) 2),
	/**
	 * ��ũ access�� ���������� ���õ� ����
	 */
	FailAccessButIgnore((byte) 3);

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
	private BinDataState(byte value) {
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
	public static BinDataState valueOf(byte value) {
		for (BinDataState bds : values()) {
			if (bds.value == value) {
				return bds;
			}
		}
		return NotAcceess;
	}
}
