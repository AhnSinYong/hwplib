package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * ������ ����
 * 
 * @author neolord
 */
public enum EmphasisSort {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * ���� ���׶�� ������
	 */
	Circle((byte) 1),
	/**
	 * �� �� ���׶�� ������
	 */
	EmptyCircle((byte) 2),
	/**
	 * v
	 */
	Type3((byte) 3),
	/**
	 * "
	 */
	Type4((byte) 4),
	/**
	 * .
	 */
	Type5((byte) 5),
	/**
	 * :
	 */
	Type6((byte) 6);

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
	private EmphasisSort(byte value) {
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
	public static EmphasisSort valueOf(byte value) {
		for (EmphasisSort es : values()) {
			if (es.value == value) {
				return es;
			}
		}
		return None;
	}
}
