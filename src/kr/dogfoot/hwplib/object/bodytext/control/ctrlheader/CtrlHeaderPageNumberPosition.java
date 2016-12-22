package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagenumberposition.PageNumberPositionHeaderProperty;

/**
 * �� ��ȣ ��ġ ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderPageNumberPosition extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private PageNumberPositionHeaderProperty property;
	/**
	 * ��ȣ
	 */
	private int number;
	/**
	 * ����� ��ȣ
	 */
	private String userSymbol;
	/**
	 * �A ��� ����
	 */
	private String beforeDecorationLetter;
	/**
	 * �� ��� ����
	 */
	private String afterDecorationLetter;

	/**
	 * ������
	 */
	public CtrlHeaderPageNumberPosition() {
		super(ControlType.PageNumberPositon.getCtrlId());

		property = new PageNumberPositionHeaderProperty();
	}

	/**
	 * �� ��ȣ ��ġ ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ȣ ��ġ ��Ʈ���� �Ӽ� ��ü
	 */
	public PageNumberPositionHeaderProperty getProperty() {
		return property;
	}

	/**
	 * ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * ��ȣ�� �����Ѵ�.
	 * 
	 * @param number
	 *            ��ȣ
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * ����� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ��ȣ
	 */
	public String getUserSymbol() {
		return userSymbol;
	}

	/**
	 * ����� ��ȣ�� �����Ѵ�.
	 * 
	 * @param userSymbol
	 *            ����� ��ȣ
	 */
	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}

	/**
	 * �A ��� ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �A ��� ����
	 */
	public String getBeforeDecorationLetter() {
		return beforeDecorationLetter;
	}

	/**
	 * �A ��� ���ڸ� �����Ѵ�.
	 * 
	 * @param beforeDecorationLetter
	 *            �A ��� ����
	 */
	public void setBeforeDecorationLetter(String beforeDecorationLetter) {
		this.beforeDecorationLetter = beforeDecorationLetter;
	}

	/**
	 * �� ��� ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��� ����
	 */
	public String getAfterDecorationLetter() {
		return afterDecorationLetter;
	}

	/**
	 * �� ��� ���ڸ� �����Ѵ�.
	 * 
	 * @param afterDecorationLetter
	 *            �� ��� ����
	 */
	public void setAfterDecorationLetter(String afterDecorationLetter) {
		this.afterDecorationLetter = afterDecorationLetter;
	}
}
