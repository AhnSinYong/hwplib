package kr.dogfoot.hwplib.object.docinfo.borderfill;

/**
 * BackSlash�� �밢�� ���
 * 
 * @author neolord
 */
public enum BackSlashDiagonaShape {
	/**
	 * none
	 */
	None((byte) 0),
	/**
	 * back slash
	 */
	BackSlash((byte) 2),
	/**
	 * RightTop --> Bottom Edge
	 */
	RightTopToBottomEdge((byte) 3),
	/**
	 * RightTop --> Left Edge
	 */
	RightTopToLeftEdge((byte) 6),
	/**
	 * RightTop --> Bottom & Left Edge
	 */
	RightTopToBottomLeftEdge((byte) 7);

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
	private BackSlashDiagonaShape(byte value) {
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
	public static BackSlashDiagonaShape valueOf(byte value) {
		for (BackSlashDiagonaShape bsds : values()) {
			if (bsds.value == value) {
				return bsds;
			}
		}
		return None;
	}
}
