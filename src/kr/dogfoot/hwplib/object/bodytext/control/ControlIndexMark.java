package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderIndexMark;

/**
 * ã�ƺ��� ǥ�� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlIndexMark extends Control {
	/**
	 * ������
	 */
	public ControlIndexMark() {
		super(new CtrlHeaderIndexMark());
	}

	/**
	 * ã�ƺ��� ǥ�Ŀ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ã�ƺ��� ǥ�Ŀ� ��Ʈ�� ���
	 */
	public CtrlHeaderIndexMark getHeader() {
		return (CtrlHeaderIndexMark) header;
	}
}