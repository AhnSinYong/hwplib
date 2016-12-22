package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderNewNumber;

/**
 * �� ��ȣ ���� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlNewNumber extends Control {
	/**
	 * ������
	 */
	public ControlNewNumber() {
		super(new CtrlHeaderNewNumber());
	}

	/**
	 * �� ��ȣ ������ ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ȣ ������ ��Ʈ�� ���
	 */
	public CtrlHeaderNewNumber getHeader() {
		return (CtrlHeaderNewNumber) header;
	}
}
