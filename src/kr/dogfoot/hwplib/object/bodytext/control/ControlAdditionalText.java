package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderAdditionalText;

/**
 * ���� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlAdditionalText extends Control {
	/**
	 * ������
	 */
	public ControlAdditionalText() {
		super(new CtrlHeaderAdditionalText());
	}

	/**
	 * ���� �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ��Ʈ�� ���
	 */
	public CtrlHeaderAdditionalText getHeader() {
		return (CtrlHeaderAdditionalText) header;
	}
}
