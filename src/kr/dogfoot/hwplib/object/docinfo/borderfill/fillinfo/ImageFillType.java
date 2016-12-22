package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * �̹��� ä��� ����
 * 
 * @author neolord
 */
public enum ImageFillType {
	/**
	 * �ٵ��ǽ�����-���
	 */
	TileAll((byte) 0),
	/**
	 * �ٵ��ǽ�����-����/��
	 */
	TileHorizonalTop((byte) 1),
	/**
	 * �ٵ��ǽ�����-����/�Ʒ�
	 */
	TileHorizonalBottom((byte) 2),
	/**
	 * �ٵ��ǽ�����-����/����
	 */
	TileVerticalLeft((byte) 3),
	/**
	 * �ٵ��ǽ�����-����/������
	 */
	TileVerticalRight((byte) 4),
	/**
	 * ũ�⿡ ���߾�
	 */
	FitSize((byte) 5),
	/**
	 * �����
	 */
	Center((byte) 6),
	/**
	 * ��� ����
	 */
	CenterTop((byte) 7),
	/**
	 * ��� �Ʒ���
	 */
	CenterBottom((byte) 8),
	/**
	 * ���� �����
	 */
	LeftCenter((byte) 9),
	/**
	 * ���� ����
	 */
	LeftTop((byte) 10),
	/**
	 * ���� �Ʒ���
	 */
	LeftBottom((byte) 11),
	/**
	 * ������ �����
	 */
	RightCenter((byte) 12),
	/**
	 * ������ ����
	 */
	RightTop((byte) 13),
	/**
	 * ������ �Ʒ���
	 */
	RightBottom((byte) 14),
	/**
	 * NONE
	 */
	None((byte) 15);

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
	private ImageFillType(byte value) {
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
	public static ImageFillType valueOf(byte value) {
		for (ImageFillType ift : values()) {
			if (ift.value == value) {
				return ift;
			}
		}
		return None;
	}
}
