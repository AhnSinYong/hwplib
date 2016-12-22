package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

/**
 * ������Ʈ ������ �ؽ�Ʈ�� ��� �귯���� �����ϴ� �ɼ�
 * 
 * @author neolord
 */
public enum TextFlowMethod {
	/**
	 * bound rect�� ����
	 */
	Square((byte) 0),
	/**
	 * ������Ʈ�� outline�� ����
	 */
	Tight((byte) 1),
	/**
	 * ������Ʈ ������ �� ��������
	 */
	Through((byte) 2),
	/**
	 * ��, �쿡�� �ؽ�Ʈ�� ��ġ���� ����
	 */
	TopAndBottom((byte) 3),
	/**
	 * �۰� ��ġ�� �Ͽ� �� �ڷ�
	 */
	BehindText((byte) 4),
	/**
	 * �۰� ��ġ�� �Ͽ� �� ������
	 */
	InFrontOfText((byte) 5);

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
	private TextFlowMethod(byte value) {
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
	public static TextFlowMethod valueOf(byte value) {
		for (TextFlowMethod tfm : values()) {
			if (tfm.value == value) {
				return tfm;
			}
		}
		return Square;
	}
}
