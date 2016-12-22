package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderOverlappingLetter;

/**
 * ���� ��ħ ��Ʈ��
 * 
 * @author neolord
 */
public class ControlOverlappingLetter extends Control {
	/**
	 * ������
	 */
	public ControlOverlappingLetter() {
		super(new CtrlHeaderOverlappingLetter());
	}

	/**
	 * ���� ��ħ �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ħ �� ��Ʈ�� ���
	 */
	public CtrlHeaderOverlappingLetter getHeader() {
		return (CtrlHeaderOverlappingLetter) header;
	}
}
