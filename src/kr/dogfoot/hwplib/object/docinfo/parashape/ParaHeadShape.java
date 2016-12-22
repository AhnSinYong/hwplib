package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * ���� �Ӹ� ����� ����
 * 
 * @author neolord
 */
public enum ParaHeadShape {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * ����
	 */
	Outline((byte) 1),
	/**
	 * ��ȣ
	 */
	Numbering((byte) 2),
	/**
	 * �۸Ӹ�ǥ(bullet)
	 */
	Bullet((byte) 3);

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
	private ParaHeadShape(byte value) {
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
	public static ParaHeadShape valueOf(byte value) {
		for (ParaHeadShape phs : values()) {
			if (phs.value == value) {
				return phs;
			}
		}
		return None;
	}
}