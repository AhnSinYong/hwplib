package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * �׸� ȿ��
 * 
 * @author neolord
 */
public enum PictureEffect {
	/**
	 * �����̹���(REAL_PIC)
	 */
	RealPicture((byte) 0),
	/**
	 * ȸ���� (GRAY_SCALE)
	 */
	GrayScale((byte) 1),
	/**
	 * ��� (BLACK_WHITE)
	 */
	BlackWhite((byte) 2),
	/**
	 * PATTERN8x8
	 */
	Pattern8x8((byte) 3);

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
	private PictureEffect(byte value) {
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
	public static PictureEffect valueOf(byte value) {
		for (PictureEffect pe : values()) {
			if (pe.value == value) {
				return pe;
			}
		}
		return RealPicture;
	}
}
