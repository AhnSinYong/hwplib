package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.numbering.ParagraphHeadInfo;

/**
 * �۸Ӹ�ǥ�� ���� ���ڵ�
 * 
 * @author neolord
 */
public class Bullet {
	/**
	 * ���� �Ӹ��� ����
	 */
	private ParagraphHeadInfo paragraphHeadInfo;
	/**
	 * �۸Ӹ�ǥ ����
	 */
	private String bulletChar;

	/**
	 * ������
	 */
	public Bullet() {
		paragraphHeadInfo = new ParagraphHeadInfo();
	}

	/**
	 * ���� �Ӹ��� ������ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ӹ��� ������ ���� ��ü
	 */
	public ParagraphHeadInfo getParagraphHeadInfo() {
		return paragraphHeadInfo;
	}

	/**
	 * �۸Ӹ�ǥ ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �۸Ӹ�ǥ ����
	 */
	public String getBulletChar() {
		return bulletChar;
	}

	/**
	 * �۸Ӹ�ǥ ���ڸ� �����Ѵ�.
	 * 
	 * @param bulletChar
	 *            �۸Ӹ�ǥ ����
	 */
	public void setBulletChar(String bulletChar) {
		this.bulletChar = bulletChar;
	}
}
