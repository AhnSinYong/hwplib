package kr.dogfoot.hwplib.object.docinfo.borderfill;

/**
 * Slash �밢�� ���
 * 
 * @author neolord
 */
public enum SlashDiagonaShape {
	/**
	 * none
	 */
	None((byte) 0),
	/**
	 * slash
	 */
	Slash((byte) 2),
	/**
	 * LeftTop --> Bottom Edge
	 */
	LeftTopToBottomEdge((byte) 3),
	/**
	 * LeftTop --> Right Edge
	 */
	LeftTopToRightEdg((byte) 6),
	/**
	 * LeftTop --> Bottom & Right Edge
	 */
	LeftTopToBottomRightEdge((byte) 7);

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
	private SlashDiagonaShape(byte value) {
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
	public static SlashDiagonaShape valueOf(byte value) {
		for (SlashDiagonaShape sds : values()) {
			if (sds.value == value) {
				return sds;
			}
		}
		return None;
	}
}
