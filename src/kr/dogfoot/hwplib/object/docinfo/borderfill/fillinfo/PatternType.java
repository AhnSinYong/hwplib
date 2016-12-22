package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * ä��� ���� ����
 * 
 * @author neolord
 */
public enum PatternType {
	/**
	 * �ܻ� (solid)
	 */
	None((byte) -1),
	/**
	 * ���� (- - - -)
	 */
	HorizontalLine((byte) 0),
	/**
	 * ������ (|||||)
	 */
	VerticalLine((byte) 1),
	/**
	 * ���� �밢�� (\\\\\)
	 */
	BackDiagonalLine((byte) 2),
	/**
	 * ���� �밢�� (/////)
	 */
	FrontDiagonalLine((byte) 3),
	/**
	 * ���ڼ� (+++++)
	 */
	CrossLine((byte) 4),
	/**
	 * üũ (xxxxx)
	 */
	CrossDiagonalLine((byte) 5);

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
	private PatternType(byte value) {
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
	public static PatternType valueOf(byte value) {
		for (PatternType pt : values()) {
			if (pt.value == value) {
				return pt;
			}
		}
		return None;
	}
}
