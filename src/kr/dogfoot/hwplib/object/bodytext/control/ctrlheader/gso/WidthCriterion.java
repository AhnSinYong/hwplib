package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ������Ʈ ���� ����
 * 
 * @author neolord
 */
public enum WidthCriterion {
	/**
	 * ����
	 */
	Paper((byte) 0),
	/**
	 * ��
	 */
	Page((byte) 1),
	/**
	 * ��
	 */
	Column((byte) 2),
	/**
	 * ����
	 */
	Para((byte) 3),
	/**
	 * ���밪
	 */
	Absolute((byte) 4);

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
	private WidthCriterion(byte value) {
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
	public static WidthCriterion valueOf(byte value) {
		for (WidthCriterion wc : values()) {
			if (wc.value == value) {
				return wc;
			}
		}
		return Paper;
	}
}
