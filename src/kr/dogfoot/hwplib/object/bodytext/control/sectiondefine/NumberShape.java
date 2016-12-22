package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ��ȣ ���
 * 
 * @author neolord
 */
public enum NumberShape {
	/**
	 * 1, 2, 3
	 */
	Type0((short) 0),
	/**
	 * ���׶�� ���� 1, 2, 3
	 */
	Type1((short) 1),
	/**
	 * I, II, III
	 */
	Type2((short) 2),
	/**
	 * i, ii, iii
	 */
	Type3((short) 3),
	/**
	 * A, B, C
	 */
	Type4((short) 4),
	/**
	 * a, b, c
	 */
	Type5((short) 5),
	/**
	 * ���׶�� ���� A, B, C
	 */
	Type6((short) 6),
	/**
	 * ���׶�� ���� a, b, c
	 */
	Type7((short) 7),
	/**
	 * ��, ��, ��
	 */
	Type8((short) 8),
	/**
	 * ���׶�� ���� ��,��,��
	 */
	Type9((short) 9),
	/**
	 * ��, ��, ��
	 */
	Type10((short) 10),
	/**
	 * ���׶�� ���� ��,��,��
	 */
	Type11((short) 11),
	/**
	 * ��, ��, ��
	 */
	Type12((short) 12),
	/**
	 * ��, �, ߲
	 */
	Type13((short) 13),
	/**
	 * ���׶�� ���� ��,�,߲
	 */
	Type14((short) 14),
	/**
	 * ��, ��, ��, ��, ��, ��, ��, ��, ��, ��
	 */
	Type15((short) 15),
	/**
	 * ˣ, ��, ܰ, ��, ��, ��, ��, ��, ��, ͤ
	 */
	Type16((short) 16),
	/**
	 * 4���� ���ڰ� ���ʷ� �ݺ�(����/���� ����)
	 */
	Type128((short) 0x80),
	/**
	 * ����� ���� ���� �ݺ�
	 */
	Type129((short) 0x81);

	/**
	 * ���Ͽ� ����Ǵ� ������
	 */
	private short value;

	/**
	 * ������
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	private NumberShape(short value) {
		this.value = value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public short getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �ش�Ǵ� enum ���� ��ȯ�Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 * @return enum ��
	 */
	public static NumberShape valueOf(short value) {
		for (NumberShape ns : values()) {
			if (ns.value == value) {
				return ns;
			}
		}
		return Type0;
	}
}
