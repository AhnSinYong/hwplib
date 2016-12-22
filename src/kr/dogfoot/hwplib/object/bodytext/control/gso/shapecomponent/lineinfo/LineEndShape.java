package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

/**
 * �� �� ���
 * 
 * @author neolord
 */
public enum LineEndShape {
	/**
	 * �ձ� �� ��
	 */
	Round((byte) 0),
	/**
	 * ���� �� ��
	 */
	Flat((byte) 1);

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
	private LineEndShape(byte value) {
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
	public static LineEndShape valueOf(byte value) {
		for (LineEndShape les : values()) {
			if (les.value == value) {
				return les;
			}
		}
		return Round;
	}
}
