package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * �� ���� ����(�ѱ� 2007���� �������� ���)
 * 
 * @author neolord
 */
public enum LineSpaceSort {
	/**
	 * ���ڿ� ����(%)
	 */
	RatioForLetter((byte) 0),
	/**
	 * ������
	 */
	FixedValue((byte) 1),
	/**
	 * ���鸸 ����
	 */
	OnlyMargin((byte) 2),
	/**
	 * �ּ�
	 */
	Minimum((byte) 3);

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
	private LineSpaceSort(byte value) {
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
	public static LineSpaceSort valueOf(byte value) {
		for (LineSpaceSort lss : values()) {
			if (lss.value == value) {
				return lss;
			}
		}
		return RatioForLetter;
	}
}
