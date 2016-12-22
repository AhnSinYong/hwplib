package kr.dogfoot.hwplib.object.bodytext.control.gso.textbox;

/**
 * �ؽ�Ʈ ���� ���� ���
 * 
 * @author neolord
 */
public enum TextVerticalAlignment {
	/**
	 * ����
	 */
	Top((byte) 0),
	/**
	 * ���
	 */
	Center((byte) 1),
	/**
	 * �Ʒ���
	 */
	Bottom((byte) 2);

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
	private TextVerticalAlignment(byte value) {
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
	public static TextVerticalAlignment valueOf(byte value) {
		for (TextVerticalAlignment tva : values()) {
			if (tva.value == value) {
				return tva;
			}
		}
		return Top;
	}
}
