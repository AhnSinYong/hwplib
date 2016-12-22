package kr.dogfoot.hwplib.util.binary;

/**
 * ���� ������ �ϴ� ��ü
 * 
 * @author neolord
 */
public class BitFlag {
	/**
	 * mask���� position��° ��Ʈ�� 1���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            long ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @return mask������ position��° ��Ʈ�� 1���� ����
	 */
	public static boolean get(long mask, int position) {
		long mask2 = 1 << position;
		return (mask & mask2) == mask2;
	}

	/**
	 * mask���� position��° ��Ʈ�� 1���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            int ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @return mask������ position��° ��Ʈ�� 1���� ����
	 */
	public static boolean get(int mask, int position) {
		int mask2 = 1 << position;
		return (mask & mask2) == mask2;
	}

	/**
	 * mask���� position��° ��Ʈ�� 1���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            short ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @return mask������ position��° ��Ʈ�� 1���� ����
	 */
	public static boolean get(short mask, int position) {
		short mask2 = (short) (1 << position);
		return (mask & mask2) == mask2;
	}

	/**
	 * mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� �����Ѵ�..
	 * 
	 * @param mask
	 *            ���� long ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @param flag
	 *            bool ��
	 * @return mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� ������ �����
	 */
	public static long set(long mask, int position, boolean flag) {
		if (flag) {
			mask = (long) (mask | (0x1 << position));
		} else {
			if ((mask & (0x1 << position)) != 0) {
				mask = (long) (mask ^ (0x1 << position));
			}
		}
		return mask;
	}

	/**
	 * mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� �����Ѵ�..
	 * 
	 * @param mask
	 *            ���� int ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @param flag
	 *            bool ��
	 * @return mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� ������ �����
	 */
	public static int set(int mask, int position, boolean flag) {
		if (flag) {
			mask = (int) (mask | (0x1 << position));
		} else {
			if ((mask & (0x1 << position)) != 0) {
				mask = (int) (mask ^ (0x1 << position));
			}
		}
		return mask;
	}

	/**
	 * mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� �����Ѵ�..
	 * 
	 * @param mask
	 *            ���� short ��
	 * @param position
	 *            ��Ʈ ��ġ
	 * @param flag
	 *            bool ��
	 * @return mask�� position��° ��Ʈ�� flag���� true�϶� 1, false�϶� 0���� ������ �����
	 */
	public static short set(short mask, int position, boolean flag) {
		if (flag) {
			mask = (short) (mask | (0x1 << position));
		} else {
			if ((mask & (0x1 << position)) != 0) {
				mask = (short) (mask ^ (0x1 << position));
			}
		}
		return mask;
	}

	/**
	 * mask ������ start���� end������ ��Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            long ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @return mask ������ start���� end���� ��Ʈ�� ������
	 */
	public static long get(long mask, int start, int end) {
		long ret = 0;
		ret = mask >> start;

		long temp = 0;
		for (int nIndex = 0; nIndex < end - start + 1; nIndex++) {
			temp = temp << 1;
			temp += 1;
		}

		ret = ret & temp;

		return ret;
	}

	/**
	 * mask ������ start���� end������ ��Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            int ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @return mask ������ start���� end���� ��Ʈ�� ������
	 */
	public static int get(int mask, int start, int end) {
		int ret = 0;
		ret = mask >> start;

		int temp = 0;
		for (int nIndex = 0; nIndex < end - start + 1; nIndex++) {
			temp = temp << 1;
			temp += 1;
		}

		ret = ret & temp;

		return ret;
	}

	/**
	 * mask ������ start���� end������ ��Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @param mask
	 *            short ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @return mask ������ start���� end���� ��Ʈ�� ������
	 */
	public static short get(short mask, int start, int end) {
		short ret = 0;
		ret = (short) (mask >> start);

		int temp = 0;
		for (int nIndex = 0; nIndex < end - start + 1; nIndex++) {
			temp = temp << 1;
			temp += 1;
		}

		ret = (short) (ret & temp);

		return ret;
	}

	/**
	 * mask������ start���� end������ ��Ʈ�� value������ �����Ѵ�.
	 * 
	 * @param mask
	 *            ���� long ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @param value
	 *            ������
	 * @return mask������ start���� end������ ��Ʈ�� value������ ������ �����
	 */
	public static long set(long mask, int start, int end, int value) {
		for (int position = start; position <= end; position++) {
			boolean flag = BitFlag.get(value, position - start);
			mask = BitFlag.set(mask, position, flag);
		}
		return mask;
	}

	/**
	 * mask������ start���� end������ ��Ʈ�� value������ �����Ѵ�.
	 * 
	 * @param mask
	 *            ���� int ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @param value
	 *            ������
	 * @return mask������ start���� end������ ��Ʈ�� value������ ������ �����
	 */
	public static int set(int mask, int start, int end, int value) {
		for (int position = start; position <= end; position++) {
			boolean flag = BitFlag.get(value, position - start);
			mask = BitFlag.set(mask, position, flag);
		}
		return mask;
	}

	/**
	 * mask������ start���� end������ ��Ʈ�� value������ �����Ѵ�.
	 * 
	 * @param mask
	 *            ���� short ��
	 * @param start
	 *            ��Ʈ ���� ��ġ
	 * @param end
	 *            ��Ʈ �� ��ġ
	 * @param value
	 *            ������
	 * @return mask������ start���� end������ ��Ʈ�� value������ ������ �����
	 */
	public static short set(short mask, int start, int end, int value) {
		for (int position = start; position <= end; position++) {
			boolean flag = BitFlag.get(value, position - start);
			mask = BitFlag.set(mask, position, flag);
		}
		return mask;
	}

}
