package kr.dogfoot.hwplib.object.docinfo.numbering;

/**
 * ���غ� �������� �Ÿ� ����
 * 
 * @author neolord
 */
public enum ValueType {
	/**
	 * ���� ũ�⿡ ���� ��� ����
	 */
	RatioForLetter((byte) 0),
	/**
	 * ��
	 */
	Value((byte) 1);

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
	private ValueType(byte value) {
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
	public static ValueType valueOf(byte value) {
		for (ValueType vt : values()) {
			if (vt.value == value) {
				return vt;
			}
		}
		return RatioForLetter;
	}
}
