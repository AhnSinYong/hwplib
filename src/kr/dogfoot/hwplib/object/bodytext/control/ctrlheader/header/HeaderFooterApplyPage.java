package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.header;

/**
 * �Ӹ���/������ ���� ������ ����
 * 
 * @author neolord
 */
public enum HeaderFooterApplyPage {
	/**
	 * �� ��
	 */
	BothPage((byte) 0),
	/**
	 * ¦�� �ʸ�
	 */
	EvenPage((byte) 1),
	/**
	 * Ȧ�� ����
	 */
	OddPage((byte) 2);

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
	private HeaderFooterApplyPage(byte value) {
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
	public static HeaderFooterApplyPage valueOf(byte value) {
		for (HeaderFooterApplyPage ap : values()) {
			if (ap.value == value) {
				return ap;
			}
		}
		return BothPage;
	}
}
