package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ole;

/**
 * windows API DVASPECT enumeration
 * 
 * @author neolord
 */
public enum DVASPECT {
	/**
	 * CONTENT
	 */
	CONTENT((byte) 1),
	/**
	 * THUMBNAIL
	 */
	THUMBNAIL((byte) 2),
	/**
	 * ICON
	 */
	ICON((byte) 4),
	/**
	 * DOCPRINT
	 */
	DOCPRINT((byte) 8);

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
	private DVASPECT(byte value) {
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
	public static DVASPECT valueOf(byte value) {
		for (DVASPECT d : values()) {
			if (d.value == value) {
				return d;
			}
		}
		return CONTENT;
	}
}
