package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ��å ���
 * 
 * @author neolord
 */
public enum MakingBookMethod {
	/**
	 * ���� ����
	 */
	OneSideEditing((byte) 0),
	/**
	 * ���� ����
	 */
	BothSideEditing((byte) 1),
	/**
	 * ���� �ѱ��
	 */
	BackFlip((byte) 2);

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
	private MakingBookMethod(byte value) {
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
	public static MakingBookMethod valueOf(byte value) {
		for (MakingBookMethod mbm : values()) {
			if (mbm.value == value) {
				return mbm;
			}
		}
		return OneSideEditing;
	}
}
