package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ������� �迭 ���
 * 
 * @author neolord
 */
public enum RelativeArrange {
	/**
	 * VerRelTo�� ��paper���� ��page�� �̸� top, �׷��� ������ left
	 */
	TopOrLeft((byte) 0),
	/**
	 * VerRelTo�� ��paper���� ��page�� �̸� center
	 */
	Center((byte) 1),
	/**
	 * erRelTo�� ��paper���� ��page�� �̸� bottom, �׷��� ������ right
	 */
	BottomOrRight((byte) 2),
	/**
	 * VerRelTo�� ��paper���� ��page�� �̸� inside
	 */
	Inside((byte) 3),
	/**
	 * VerRelTo�� ��paper���� ��page�� �̸� outsides
	 */
	Outside((byte) 4);

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
	private RelativeArrange(byte value) {
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
	public static RelativeArrange valueOf(byte value) {
		for (RelativeArrange vrta : values()) {
			if (vrta.value == value) {
				return vrta;
			}
		}
		return TopOrLeft;
	}
}
