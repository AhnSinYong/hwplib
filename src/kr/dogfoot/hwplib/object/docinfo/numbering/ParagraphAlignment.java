package kr.dogfoot.hwplib.object.docinfo.numbering;

/**
 * ������ ���� ����
 * 
 * @author neolord
 */
public enum ParagraphAlignment {
	/**
	 * ����
	 */
	Left((byte) 0),
	/**
	 * ���
	 */
	Center((byte) 1),
	/**
	 * ������
	 */
	Right((byte) 2);

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
	private ParagraphAlignment(byte value) {
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
	public static ParagraphAlignment valueOf(byte value) {
		for (ParagraphAlignment pa : values()) {
			if (pa.value == value) {
				return pa;
			}
		}
		return Left;
	}
}
