package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ������Ʈ ������ ����
 * 
 * @author neolord
 */
public enum HeightCriterion {
	/**
	 * ����
	 */
	Paper((byte) 0),
	/**
	 * ��
	 */
	Page((byte) 1),
	/**
	 * ���밪
	 */
	Absolute((byte) 2);

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
	private HeightCriterion(byte value) {
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
	public static HeightCriterion valueOf(byte value) {
		for (HeightCriterion hc : values()) {
			if (hc.value == value) {
				return hc;
			}
		}
		return Paper;
	}
}
