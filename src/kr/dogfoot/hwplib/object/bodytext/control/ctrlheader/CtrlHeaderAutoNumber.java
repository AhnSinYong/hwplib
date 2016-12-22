package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.autonumber.AutoNumberHeaderProperty;

/**
 * �ڵ���ȣ ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderAutoNumber extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private AutoNumberHeaderProperty property;
	/**
	 * ��ȣ
	 */
	private int number;
	/**
	 * ����� ��ȣ
	 */
	private String userSymbol;
	/**
	 * �� ��� ����
	 */
	private String beforeDecorationLetter;
	/**
	 * �� ��� ����
	 */
	private String afterDecorationLetter;

	/**
	 * ������
	 */
	public CtrlHeaderAutoNumber() {
		super(ControlType.AutoNumber.getCtrlId());

		property = new AutoNumberHeaderProperty();
	}

	/**
	 * �ڵ���ȣ ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ڵ���ȣ ��Ʈ���� �Ӽ� ��ü
	 */
	public AutoNumberHeaderProperty getProperty() {
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
	 * �� ��� ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��� ����
	 */
	public String getBeforeDecorationLetter() {
		return beforeDecorationLetter;
	}

	/**
	 * �� ��� ���ڸ� �����Ѵ�.
	 * 
	 * @param beforeDecorationLetter
	 *            �� ��� ����
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
