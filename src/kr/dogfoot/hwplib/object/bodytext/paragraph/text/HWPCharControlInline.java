package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

/**
 * �ζ��� ��Ʈ�� character
 * 
 * @author neolord
 */
public class HWPCharControlInline extends HWPChar {
	/**
	 * ���� �ڵ�
	 */
	private int code;
	/**
	 * �߰� ����
	 */
	private byte[] addition;

	/**
	 * ������
	 */
	public HWPCharControlInline() {
	}

	@Override
	public HWPCharType getType() {
		return HWPCharType.ControlInline;
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

	/**
	 * �߰� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �߰� ����
	 */
	public byte[] getAddition() {
		return addition;
	}

	/**
	 * �߰� ������ �����Ѵ�.
	 * 
	 * @param addition
	 *            �߰� ����
	 */
	public void setAddition(byte[] addition) {
		this.addition = addition;
	}
}
