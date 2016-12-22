package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderPageNumberPosition;

/**
 * �� ��ȣ ��ġ ��Ʈ��
 * 
 * @author neolord
 */
public class ControlPageNumberPosition extends Control {
	/**
	 * ������
	 */
	public ControlPageNumberPosition() {
		super(new CtrlHeaderPageNumberPosition());
	}

	/**
	 * �� ��ȣ ��ġ ��Ʈ�� �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ȣ ��ġ ��Ʈ�� �� ��Ʈ�� ���
	 */
	public CtrlHeaderPageNumberPosition getHeader() {
		return (CtrlHeaderPageNumberPosition) header;
	}
}
