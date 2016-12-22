package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.arc;

/**
 * ȣ �׵θ�
 * 
 * @author neolord
 */
public enum ArcBorder {
	/**
	 * ȣ
	 */
	Arc((byte) 0),
	/**
	 * ��ä��
	 */
	CircularSector((byte) 1),
	/**
	 * Ȱ
	 */
	Bow((byte) 2);

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
	private ArcBorder(byte value) {
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
	public static ArcBorder valueOf(byte value) {
		for (ArcBorder ab : values()) {
			if (ab.value == value) {
				return ab;
			}
		}
		return Arc;
	}
}
