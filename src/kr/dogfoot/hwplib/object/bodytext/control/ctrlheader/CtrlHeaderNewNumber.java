package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.newnumber.NewNumberHeaderProperty;

/**
 * �� ��ȣ ���� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderNewNumber extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private NewNumberHeaderProperty property;
	/**
	 * ��ȣ
	 */
	private int number;

	/**
	 * ������
	 */
	public CtrlHeaderNewNumber() {
		super(ControlType.NewNumber.getCtrlId());

		property = new NewNumberHeaderProperty();
	}

	/**
	 * �� ��ȣ ���� ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ȣ ���� ��Ʈ���� �Ӽ� ��ü
	 */
	public NewNumberHeaderProperty getProperty() {
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
}
