package kr.dogfoot.hwplib.object.docinfo.borderfill;

/**
 * �׵θ��� ����
 * 
 * @author neolord
 */
public enum BorderType {
	/**
	 * �Ǽ�
	 */
	Solid((byte) 0),
	/**
	 * �� ���� (�⼱)
	 */
	Dash((byte) 1),
	/**
	 * ����
	 */
	Dot((byte) 2),
	/**
	 * -.-.-.-.(���� �⼱)
	 */
	DashDot((byte) 3),
	/**
	 * -..-..-..(���� �⼱)
	 */
	DashDotDot((byte) 4),
	/**
	 * Dash���� �� ������ �ݺ�
	 */
	LongDash((byte) 5),
	/**
	 * Dot���� ū ���׶���� �ݺ�
	 */
	CircleDot((byte) 6),
	/**
	 * 2�߼�
	 */
	Double((byte) 7),
	/**
	 * ���¼� + ������ 2�߼�
	 */
	ThinThick((byte) 8),
	/**
	 * ������ + ���¼� 2�߼�
	 */
	ThickThin((byte) 9),
	/**
	 * ���¼� + ������ + ���¼� 3�߼�
	 */
	ThinThickThn((byte) 10),
	/**
	 * ����
	 */
	Wave((byte) 11),
	/**
	 * ���� 2�߼�
	 */
	DoubleWave((byte) 12),
	/**
	 * �β��� 3D
	 */
	Thick3D((byte) 13),
	/**
	 * �β��� 3D(���� �ݴ�)
	 */
	Thick3DReverseLighting((byte) 13),
	/**
	 * 3D �ܼ�
	 */
	Solid3D((byte) 15),
	/**
	 * 3D �ܼ�(���� �ݴ�)
	 */
	Solid3DReverseLighting((byte) 16);

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
	private BorderType(byte value) {
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
	public static BorderType valueOf(byte value) {
		for (BorderType bt : values()) {
			if (bt.value == value) {
				return bt;
			}
		}
		return Solid;
	}
}
