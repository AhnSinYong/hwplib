package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

/**
 * Outline style
 * 
 * @author neolord
 */
public enum OutlineStyle {
	/**
	 * �Ϲ�
	 */
	Normal((byte) 0),
	/**
	 * �ܺ�
	 */
	Outter((byte) 1),
	/**
	 * ����
	 */
	Inner((byte) 2);

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
	private OutlineStyle(byte value) {
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
	public static OutlineStyle valueOf(byte value) {
		for (OutlineStyle os : values()) {
			if (os.value == value) {
				return os;
			}
		}
		return Normal;
	}
}
