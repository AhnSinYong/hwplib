package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.additionaltext;

/**
 * ������ ��ġ
 * 
 * @author neolord
 */
public enum AdditionalTextPosition {
	/**
	 * ��
	 */
	Top((byte) 0),
	/**
	 * �Ʒ�
	 */
	Bottom((byte) 1),
	/**
	 * ���
	 */
	Center((byte) 2);

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
	private AdditionalTextPosition(byte value) {
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
	public static AdditionalTextPosition valueOf(byte value) {
		for (AdditionalTextPosition atp : values()) {
			if (atp.value == value) {
				return atp;
			}
		}
		return Top;
	}
}