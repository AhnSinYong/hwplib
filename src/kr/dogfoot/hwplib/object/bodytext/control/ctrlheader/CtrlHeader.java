package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

/**
 * ��Ʈ�� ��� ��ü���� ���� �θ� Ŭ����
 * 
 * @author neolord
 */
public class CtrlHeader {
	/**
	 * ��Ʈ�� ���̵�
	 */
	protected long ctrlId;

	/**
	 * ������
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� ���̵�
	 */
	public CtrlHeader(long ctrlId) {
		this.ctrlId = ctrlId;
	}

	/**
	 * ��Ʈ�� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ���̵�
	 */
	public long getCtrlId() {
		return ctrlId;
	}
}
