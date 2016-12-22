package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

/**
 * �Ϲ� Character
 * 
 * @author neolord
 */
public class HWPCharNormal extends HWPChar {
	/**
	 * ����
	 */
	private String ch;

	/**
	 * ������
	 */
	public HWPCharNormal() {
	}

	@Override
	public HWPCharType getType() {
		return HWPCharType.Normal;
	}

	/**
	 * ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return ����
	 */
	public String getCh() {
		return ch;
	}

	/**
	 * ���ڸ� �����Ѵ�.
	 * 
	 * @param ch
	 *            ����
	 * @throws Exception
	 *             ch�� ���̰� 1�� �ƴ� �� �߻�
	 */
	public void setCh(String ch) throws Exception {
		if (ch.length() != 1) {
			throw new Exception("ch's length must be 1");
		}
		this.ch = ch;
	}
}
