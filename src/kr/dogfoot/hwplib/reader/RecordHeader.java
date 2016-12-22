package kr.dogfoot.hwplib.reader;

/**
 * ���ڵ� ���
 * 
 * @author neolord
 */
public class RecordHeader {
	/**
	 * �ױ� ���̵� - ���ڵ��� ����
	 */
	private short tagID;
	/**
	 * ���� - Ʈ���������� �׸��� ����
	 */
	private short level;
	/**
	 * ũ��
	 */
	private short size;

	/**
	 * ������
	 */
	public RecordHeader() {
	}

	/**
	 * �ױ� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return �ױ� ���̵�
	 */
	public short getTagID() {
		return tagID;
	}

	/**
	 * �ױ� ���̵� �����Ѵ�.
	 * 
	 * @param tagID
	 *            �ױ� ���̵�
	 */
	public void setTagID(short tagID) {
		this.tagID = tagID;
	}

	/**
	 * ������ ��ȯ�Ѵ�.
	 * 
	 * @return ����
	 */
	public short getLevel() {
		return level;
	}

	/**
	 * ������ �����Ѵ�.
	 * 
	 * @param level
	 *            ����
	 */
	public void setLevel(short level) {
		this.level = level;
	}

	/**
	 * ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ũ��
	 */
	public short getSize() {
		return size;
	}

	/**
	 * ũ�⸦ �����Ѵ�.
	 * 
	 * @param size
	 *            ũ��
	 */
	public void setSize(short size) {
		this.size = size;
	}

	/**
	 * ���ο� ���ڵ� ��� ��ü�� �����ϰ� ���� �����Ѵ�.
	 * 
	 * @return ���� ������ ���ڵ� ��� ��ü
	 */
	public RecordHeader copy() {
		RecordHeader rh = new RecordHeader();
		rh.tagID = this.tagID;
		rh.level = this.level;
		rh.size = this.size;
		return rh;
	}
}
