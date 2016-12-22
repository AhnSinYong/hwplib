package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * �� ���� ���� ���� ����
 * 
 * @author neolord
 */
public enum LineDivideForEnglish {
	/**
	 * �ܾ�
	 */
	ByWord((byte) 0),
	/**
	 * ������
	 */
	ByHypen((byte) 1),
	/**
	 * ����
	 */
	ByLetter((byte) 2);

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
	private LineDivideForEnglish(byte value) {
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
	public static LineDivideForEnglish valueOf(byte value) {
		for (LineDivideForEnglish lde : values()) {
			if (lde.value == value) {
				return lde;
			}
		}
		return ByWord;
	}
}
