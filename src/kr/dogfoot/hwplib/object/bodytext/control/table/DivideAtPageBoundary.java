package kr.dogfoot.hwplib.object.bodytext.control.table;

/**
 * �� ��迡�� ���� ���
 * 
 * @author neolord
 */
public enum DivideAtPageBoundary {
	/**
	 * ������ ����
	 */
	NoDivide((byte) 0),
	/**
	 * �� ������ ����
	 */
	DivideByCell((byte) 1),
	/**
	 * ����
	 */
	Divide((byte) 2);

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
	private DivideAtPageBoundary(byte value) {
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
	public static DivideAtPageBoundary valueOf(byte value) {
		for (DivideAtPageBoundary dapb : values()) {
			if (dapb.value == value) {
				return dapb;
			}
		}
		return NoDivide;
	}
}
