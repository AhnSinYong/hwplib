package kr.dogfoot.hwplib.object.bodytext.control.bookmark;

/**
 * �ϸ�ũ�� ���� ������ ���ڵ�
 * 
 * @author neolord
 */
public class CtrlData {
	/**
	 * ���� ����Ÿ
	 */
	private byte[] data;

	/**
	 * ������
	 */
	public CtrlData() {
	}

	/**
	 * ���� �����͸� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * ���� �����͸� �����Ѵ�.
	 * 
	 * @param data
	 *            ���� ������
	 */
	public void setData(byte[] data) {
		this.data = data;
	}
}
