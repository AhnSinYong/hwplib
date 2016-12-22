package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ���ָ� ��ġ��ų ���
 * 
 * @author neolord
 */
public enum EndNoteDisplayMethod {
	/**
	 * ������ ������
	 */
	DocumentEnd((byte) 0),
	/**
	 * ������ ������
	 */
	SectionEnd((byte) 1);

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
	private EndNoteDisplayMethod(byte value) {
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
	public static EndNoteDisplayMethod valueOf(byte value) {
		for (EndNoteDisplayMethod endm : values()) {
			if (endm.value == value) {
				return endm;
			}
		}
		return DocumentEnd;
	}
}
