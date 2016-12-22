package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ä���� ������ ����
 * 
 * @author neolord
 */
public enum FillArea {
	/**
	 * ����
	 */
	Paper((byte) 0),
	/**
	 * ��
	 */
	Page((byte) 1),
	/**
	 * �׵θ�
	 */
	Border((byte) 2);

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
	private FillArea(byte value) {
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
	public static FillArea valueOf(byte value) {
		for (FillArea fa : values()) {
			if (fa.value == value) {
				return fa;
			}
		}
		return Paper;
	}
}
