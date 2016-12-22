package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

/**
 * ParaText�� ����Ǵ� ���ڸ� ��Ÿ���� �߻� ��ü
 * 
 * @author neolord
 * 
 */
public abstract class HWPChar {
	/**
	 * ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������ Ÿ��
	 */
	public abstract HWPCharType getType();

	/**
	 * code�� �ش�Ǵ� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @param code
	 *            utf16le ���ڿ��� �����ϴ� unsigned 2 byte �� ����
	 * @return code�� �ش�Ǵ� ������ ����
	 */
	public static HWPCharType type(int code) {
		if (code > 31) {
			return HWPCharType.Normal;
		}
		switch (code) {
		case 1: // ����
		case 2: // ���� ����/�� ����
		case 3: // �ʵ� ����(����Ʋ, �����۸�ũ, ��� å����, ǥ ���� ...)
		case 11: // �׸��� ��ü/ǥ
		case 12: // ����
		case 14: // ����
		case 15: // ���� ����
		case 16: // �Ӹ���/������
		case 17: // ����/����
		case 18: // �ڵ���ȣ(����, ǥ ��)
		case 21: // ������ ��Ʈ��(���߱�, �� ��ȣ�� ���� ��)
		case 22: // å����/ã�ƺ��� ǥ��
		case 23: // ����/���� ��ħ
			return HWPCharType.ControlExtend;
		case 4: // �ʵ� ��
		case 5: // ����
		case 6: // ����
		case 7: // ����
		case 8: // title mark
		case 9: // ��
		case 19: // ����
		case 20: // ����
			return HWPCharType.ControlInline;
		case 0: // unusable
		case 10: // �� �� ��(line break)
		case 13: // ���� ��(para break)
		case 24: // ������
		case 25: // ����
		case 26: // ����
		case 27: // ����
		case 28: // ����
		case 29: // ����
		case 30: // ���� ��ĭ
		case 31: // ������ ��ĭ
			return HWPCharType.ControlChar;
		}
		return HWPCharType.Normal;
	}
}
