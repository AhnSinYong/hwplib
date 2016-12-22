package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ��ġ ����
 * 
 * @author neolord
 */
public enum PositionCriterion {
	/**
	 * ���� ����
	 */
	MainText((byte) 0),
	/**
	 * ���� ����
	 */
	Paper((byte) 1);

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
	private PositionCriterion(byte value) {
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
	public static PositionCriterion valueOf(byte value) {
		for (PositionCriterion pc : values()) {
			if (pc.value == value) {
				return pc;
			}
		}
		return MainText;
	}
}
