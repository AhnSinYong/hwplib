package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * �� ������ ������ ���ָ� �ٴܿ� ��ġ��ų ���
 * 
 * @author neolord
 */
public enum FootNoteDisplayMethod {
	/**
	 * �� �ܸ��� ���� �迭
	 */
	EachColumn((byte) 0),
	/**
	 * ������� �迭
	 */
	AllColumn((byte) 1),
	/**
	 * ���� ������ �ܿ� �迭
	 */
	RightColumn((byte) 2);

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
	private FootNoteDisplayMethod(byte value) {
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
	public static FootNoteDisplayMethod valueOf(byte value) {
		for (FootNoteDisplayMethod fndm : values()) {
			if (fndm.value == value) {
				return fndm;
			}
		}
		return EachColumn;
	}
}
