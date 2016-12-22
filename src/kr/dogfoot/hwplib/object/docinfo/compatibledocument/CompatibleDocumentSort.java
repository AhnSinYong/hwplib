package kr.dogfoot.hwplib.object.docinfo.compatibledocument;

/**
 * ��� ���α׷��� ����
 * 
 * @author neolord
 */
public enum CompatibleDocumentSort {
	/**
	 * �ѱ� ����(���� ����)
	 */
	HWPCurrent((byte) 0),
	/**
	 * �ѱ� 2007 ȣȯ ����
	 */
	HWP2007((byte) 1),
	/**
	 * MS ���� ȣȯ ����
	 */
	MSWord((byte) 2);

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
	private CompatibleDocumentSort(byte value) {
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
	public static CompatibleDocumentSort valueOf(byte value) {
		for (CompatibleDocumentSort cds : values()) {
			if (cds.value == value) {
				return cds;
			}
		}
		return HWPCurrent;
	}
}
