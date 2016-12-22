package kr.dogfoot.hwplib.object.bodytext.paragraph.rangetag;

/**
 * ���� �±� ������ ���� ��ü
 * 
 * @author neolord
 */
public class RangeTagItem {
	/**
	 * ���� ����
	 */
	private long rangeStart;
	/**
	 * ���� ��
	 */
	private long rangeEnd;
	/**
	 * �±� ����
	 */
	private short sort;
	/**
	 * �±� ����Ÿ (3byte)
	 */
	private byte[] data;

	/**
	 * ������
	 */
	public RangeTagItem() {
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public long getRangeStart() {
		return rangeStart;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param rangeStart
	 *            ���� ����
	 */
	public void setRangeStart(long rangeStart) {
		this.rangeStart = rangeStart;
	}

	/**
	 * ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public long getRangeEnd() {
		return rangeEnd;
	}

	/**
	 * ���� ���� �����Ѵ�.
	 * 
	 * @param rangeEnd
	 *            ���� ��
	 */
	public void setRangeEnd(long rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	/**
	 * �±� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �±� ����
	 */
	public short getSort() {
		return sort;
	}

	/**
	 * �±� ������ �����Ѵ�.
	 * 
	 * @param sort
	 *            �±� ����
	 */
	public void setSort(short sort) {
		this.sort = sort;
	}

	/**
	 * �±� ����Ÿ�� ��ȯ�Ѵ�.
	 * 
	 * @return �±� ����Ÿ
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * �±� ����Ÿ�� �����Ѵ�.
	 * 
	 * @param data
	 *            �±� ����Ÿ
	 * @throws Exception
	 *             �±� ����Ÿ�� 3 bytes�� �ƴ� ��.
	 */
	public void setData(byte[] data) throws Exception {
		if (data.length != 3) {
			throw new Exception("data must be 3 bytes.");
		}
		this.data = data;
	}
}
