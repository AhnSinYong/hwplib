package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ������Ʈ�� ��/�� ��� �ʿ� ���� ��ġ���� �����ϴ� �ɼ�
 * 
 * @author neolord
 */
public enum TextHorzArrange {
	/**
	 * ����
	 */
	BothSides((byte) 0),
	/**
	 * ����
	 */
	LeftOnly((byte) 1),
	/**
	 * ������
	 */
	RightOnly((byte) 2),
	/**
	 * ū ��
	 */
	LargestOnly((byte) 3);

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
	private TextHorzArrange(byte value) {
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
	public static TextHorzArrange valueOf(byte value) {
		for (TextHorzArrange tha : values()) {
			if (tha.value == value) {
				return tha;
			}
		}
		return BothSides;
	}
}
