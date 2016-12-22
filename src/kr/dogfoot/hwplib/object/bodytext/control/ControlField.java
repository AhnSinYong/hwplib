package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderField;

/**
 * �ʵ� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlField extends Control {
	/**
	 * ������
	 */
	public ControlField() {
		super(new CtrlHeaderField());
	}

	/**
	 * ������
	 * 
	 * @param ctrlId
	 *            : ctrl header�� ctrl-id.
	 */
	public ControlField(long ctrlId) {
		super(new CtrlHeaderField(ctrlId));
	}

	/**
	 * �ʵ�� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �ʵ�� ��Ʈ�� ���
	 */
	public CtrlHeaderField getHeader() {
		return (CtrlHeaderField) header;
	}
}
