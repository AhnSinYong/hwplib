package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderPageHide;

/**
 * ���߱� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlPageHide extends Control {
	/**
	 * ������
	 */
	public ControlPageHide() {
		super(new CtrlHeaderPageHide());
	}

	/**
	 * ���߱� ��Ʈ�� �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���߱� ��Ʈ�� �� ��Ʈ�� ���
	 */
	public CtrlHeaderPageHide getHeader() {
		return (CtrlHeaderPageHide) header;
	}
}
