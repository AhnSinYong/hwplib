package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeader;

/**
 * ��Ʈ�ѿ� ���� �߻� ��ü
 * 
 * @author neolord
 */
public abstract class Control {
	/**
	 * ��Ʈ�� ��� ��ü
	 */
	protected CtrlHeader header;

	/**
	 * ������
	 * 
	 * @param header
	 *            ��Ʈ�� ��� ��ü
	 */
	public Control(CtrlHeader header) {
		this.header = header;
	}

	/**
	 * ��Ʈ�� ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ��� ��ü
	 */
	public ControlType getType() {
		return ControlType.ctrlIdOf(header.getCtrlId());
	}
}
