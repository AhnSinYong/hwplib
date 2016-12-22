package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderColumnDefine;

/**
 * �� ���� ��Ʈ�ѿ� ���� ��ü
 * 
 * @author neolord
 */
public class ControlColumnDefine extends Control {
	/**
	 * ������
	 */
	public ControlColumnDefine() {
		super(new CtrlHeaderColumnDefine());
	}

	/**
	 * �� ���ǿ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���ǿ� ��Ʈ�� ���
	 */
	public CtrlHeaderColumnDefine getHeader() {
		return (CtrlHeaderColumnDefine) header;
	}
}
