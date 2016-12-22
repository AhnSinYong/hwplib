package kr.dogfoot.hwplib.object.docinfo.borderfill;

/**
 * �׵θ����� �β�
 * 
 * @author neolord
 */
public enum BorderThickness {
	/**
	 * // 0.1 mm
	 */
	MM0_1((byte) 0),
	/**
	 * 0.12 mm
	 */
	MM0_12((byte) 1),
	/**
	 * // 0.15 mm
	 */
	MM0_15((byte) 2),
	/**
	 * 0.2 mm
	 */
	MM0_2((byte) 3),
	/**
	 * 0.25 mm
	 */
	MM0_25((byte) 4),
	/**
	 * 0.3 mm
	 */
	MM0_3((byte) 5),
	/**
	 * 0.4 mm
	 */
	MM0_4((byte) 6),
	/**
	 * 0.5 mm
	 */
	MM0_5((byte) 7),
	/**
	 * 0.6 mm
	 */
	MM0_6((byte) 8),
	/**
	 * 0.7 mm
	 */
	MM0_7((byte) 9),
	/**
	 * 1.0 mm
	 */
	MM1_0((byte) 10),
	/**
	 * 1.5 mm
	 */
	MM1_5((byte) 11),
	/**
	 * 2.0 mm
	 */
	MM2_0((byte) 12),
	/**
	 * 3.0 mm
	 */
	MM3_0((byte) 13),
	/**
	 * 4.0 mm
	 */
	MM4_0((byte) 14),
	/**
	 * 5.0 mm
	 */
	MM5_0((byte) 15);

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
	private BorderThickness(byte value) {
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
	public static BorderThickness valueOf(byte value) {
		for (BorderThickness bt : values()) {
			if (bt.value == value) {
				return bt;
			}
		}
		return MM0_1;
	}
}
