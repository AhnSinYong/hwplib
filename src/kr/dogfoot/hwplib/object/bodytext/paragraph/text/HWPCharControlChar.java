package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

/**
 * ���� ��Ʈ�� Character
 * 
 * @author neolord
 */
public class HWPCharControlChar extends HWPChar {
	/**
	 * ���� �ڵ�
	 */
	private int code;

	/**
	 * ������
	 */
	public HWPCharControlChar() {
	}

	@Override
	public HWPCharType getType() {
		return HWPCharType.ControlChar;
	}

	/**
	 * ���� �ڵ带 ��ȯ�Ѵ�.
	 * 
	 * @return ���� �ڵ�
	 */
	public int getCode() {
		return code;
	}

	/**
	 * ���� �ڵ带 �����Ѵ�.
	 * 
	 * @param code
	 *            ���� �ڵ�
	 */
	public void setCode(int code) {
		this.code = code;
	}
}
