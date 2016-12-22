package kr.dogfoot.hwplib.object.docinfo.numbering;

/**
 * �� ����(1~7)�� �ش��ϴ� ���� ��ȣ ����
 * 
 * @author neolord
 */
public class LevelNumbering {
	/**
	 * ���� �Ӹ� ����
	 */
	private ParagraphHeadInfo paragraphHeadInfo;
	/**
	 * ��ȣ ����
	 */
	private String numberFormat;

	/**
	 * ������
	 */
	public LevelNumbering() {
		paragraphHeadInfo = new ParagraphHeadInfo();
	}

	/**
	 * ���� �Ӹ� ������ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ӹ� ������ ���� ��ü
	 */
	public ParagraphHeadInfo getParagraphHeadInfo() {
		return paragraphHeadInfo;
	}

	/**
	 * ��ȣ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ ����
	 */
	public String getNumberFormat() {
		return numberFormat;
	}

	/**
	 * ��ȣ ������ �����Ѵ�.
	 * 
	 * @param numberFormat
	 *            ��ȣ ����
	 */
	public void setNumberFormat(String numberFormat) {
		this.numberFormat = numberFormat;
	}
}
