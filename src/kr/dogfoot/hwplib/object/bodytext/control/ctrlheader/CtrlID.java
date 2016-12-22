package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

/**
 * ��Ʈ�� id�� �����ϱ� ���� ��ü
 * 
 * @author neolord
 */
public class CtrlID {
	/**
	 * ��Ʈ�� ���̵� �����Ѵ�.
	 * 
	 * @param a
	 *            24~31 bit��
	 * @param b
	 *            16~23 bit��
	 * @param c
	 *            8~15 bit��
	 * @param d
	 *            0~7 bit��
	 * @return ��Ʈ�� ���̵�
	 */
	public static long make(char a, char b, char c, char d) {
		return ((byte) a << 24) | ((byte) b << 16) | ((byte) c << 8) | (byte) d;
	}
}
