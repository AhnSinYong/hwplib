package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.sectiondefine;

/**
 * �ؽ�Ʈ �������
 * 
 * @author neolord
 */
public enum TextDirection {
	/**
	 * ����
	 */
	Horizontal((byte) 0),
	/**
	 * ����(���� ����)
	 */
	VerticalWithEnglishLayDown((byte) 1),
	/**
	 * ����(���� ����)
	 */
	VerticalWithEnglishStanding((byte) 2);

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
	private TextDirection(byte value) {
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
	public static TextDirection valueOf(byte value) {
		for (TextDirection td : values()) {
			if (td.value == value) {
				return td;
			}
		}
		return Horizontal;
	}
}
