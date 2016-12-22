package kr.dogfoot.hwplib.object.docinfo.bindata;

/**
 * ���̳ʸ� �������� ���� ���
 * 
 * @author neolord
 */
public enum BinDataCompress {
	/**
	 * ���丮���� ����Ʈ ��� ����
	 */
	ByStroageDefault((byte) 0),
	/**
	 * ������ ����
	 */
	Compress((byte) 1),
	/**
	 * ������ �������� ����
	 */
	NoCompress((byte) 2);

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
	private BinDataCompress(byte value) {
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
	public static BinDataCompress valueOf(byte value) {
		for (BinDataCompress bdc : values()) {
			if (bdc.value == value) {
				return bdc;
			}
		}
		return ByStroageDefault;
	}
}
