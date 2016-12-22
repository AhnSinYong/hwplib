package kr.dogfoot.hwplib.object.docinfo.style;

/**
 * ��Ÿ�� ����
 * 
 * @author neolord
 */
public enum StyleSort {
	/**
	 * ���� ��Ÿ��
	 */
	ParaStyle((byte) 0),
	/**
	 * ���� ��Ÿ��
	 */
	CharStyle((byte) 1);

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
	private StyleSort(byte value) {
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
	public static StyleSort valueOf(byte value) {
		for (StyleSort ss : values()) {
			if (ss.value == value) {
				return ss;
			}
		}
		return ParaStyle;
	}
}
