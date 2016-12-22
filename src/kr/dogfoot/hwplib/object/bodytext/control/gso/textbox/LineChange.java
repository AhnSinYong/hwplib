package kr.dogfoot.hwplib.object.bodytext.control.gso.textbox;

/**
 * ������ �ٹٲ� ���
 * 
 * @author neolord
 */
public enum LineChange {
	/**
	 * �Ϲ����� �ٹٲ�
	 */
	Normal((byte) 0),
	/**
	 * �ڰ��� �����Ͽ� �� ���� ����
	 */
	KeepOneLineByAdjustWordSpace((byte) 1),
	/**
	 * ���뿡 ���� ���� �þ
	 */
	IncreaseWidthByContent((byte) 2);

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
	private LineChange(byte value) {
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
	public static LineChange valueOf(byte value) {
		for (LineChange lc : values()) {
			if (lc.value == value) {
				return lc;
			}
		}
		return Normal;
	}
}
