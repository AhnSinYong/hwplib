package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * �׷����̼� ����
 * 
 * @author neolord
 */
public enum GradientType {
	/**
	 * �ٹ�����
	 */
	Stripe((byte) 1),
	/**
	 * ����
	 */
	Circle((byte) 2),
	/**
	 * ������
	 */
	Cone((byte) 3),
	/**
	 * �簢��
	 */
	Square((byte) 4);

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
	private GradientType(byte value) {
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
	public static GradientType valueOf(byte value) {
		for (GradientType gt : values()) {
			if (gt.value == value) {
				return gt;
			}
		}
		return Stripe;
	}
}
