package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagehide.PagehideHeaderProperty;

/**
 * ���߱� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderPageHide extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private PagehideHeaderProperty property;

	/**
	 * ������
	 */
	public CtrlHeaderPageHide() {
		super(ControlType.PageHide.getCtrlId());

		property = new PagehideHeaderProperty();
	}

	/**
	 * ���߱� ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���߱� ��Ʈ���� �Ӽ� ��ü
	 */
	public PagehideHeaderProperty getProperty() {
		return property;
	}
}
