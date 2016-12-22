package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderAutoNumber;

/**
 * �ڵ���ȣ ��Ʈ�ѿ� ���� ��ü
 * 
 * @author neolord
 */
public class ControlAutoNumber extends Control {
	/**
	 * ������
	 */
	public ControlAutoNumber() {
		super(new CtrlHeaderAutoNumber());
	}

	/**
	 * �ڵ���ȣ ��Ʈ�ѿ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �ڵ���ȣ ��Ʈ�ѿ� ��Ʈ�� ���
	 */
	public CtrlHeaderAutoNumber getHeader() {
		return (CtrlHeaderAutoNumber) header;
	}
}
