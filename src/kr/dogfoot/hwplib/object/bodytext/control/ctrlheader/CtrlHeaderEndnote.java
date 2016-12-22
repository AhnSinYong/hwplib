package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;

/**
 * ����(End Note) ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderEndnote extends CtrlHeader {
	/**
	 * ���� ��ȣ ??
	 */
	private long number;

	/**
	 * ������
	 */
	public CtrlHeaderEndnote() {
		super(ControlType.Endnote.getCtrlId());
	}

	/**
	 * ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ȣ
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param number
	 *            ���� ��ȣ
	 */
	public void setNumber(long number) {
		this.number = number;
	}
}
