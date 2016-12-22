package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.bookmark.CtrlData;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderBookmark;

/**
 * å���� ��Ʈ�ѿ� ���� ��ü
 * 
 * @author neolord
 */
public class ControlBookmark extends Control {
	/**
	 * ���� ������ ��ü
	 */
	private CtrlData ctrlData;

	/**
	 * ������
	 */
	public ControlBookmark() {
		super(new CtrlHeaderBookmark());

		ctrlData = new CtrlData();
	}

	/**
	 * å���ǿ� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return å���ǿ� ��Ʈ�� ���
	 */
	public CtrlHeaderBookmark getHeader() {
		return (CtrlHeaderBookmark) header;
	}

	/**
	 * ���� ������ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��ü
	 */
	public CtrlData getCtrlData() {
		return ctrlData;
	}
}
