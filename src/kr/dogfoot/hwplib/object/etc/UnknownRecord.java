package kr.dogfoot.hwplib.object.etc;

import kr.dogfoot.hwplib.reader.RecordHeader;

/**
 * �˷����� ���� ���ڵ�
 * 
 * @author neolord
 */
public class UnknownRecord {
	/**
	 * ���ڵ� ���
	 */
	private RecordHeader header;
	/**
	 * ���ڵ� ������
	 */
	private byte[] body;

	/**
	 * ������
	 */
	public UnknownRecord() {
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            ���ڵ� ���
	 */
	public UnknownRecord(RecordHeader header) {
		this.header = header.copy();
	}

	/**
	 * ���ڵ� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڵ� ���
	 */
	public RecordHeader getHeader() {
		return header;
	}
	
	/**
	 * ���ڵ� ����� �����Ѵ�.
	 * 
	 * @param header
	 *            ���ڵ� ���
	 */
	public void setHeader(RecordHeader header) {
		this.header = header.copy();
	}

	/**
	 * ���ڵ� �����͸� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڵ� ������
	 */
	public byte[] getBody() {
		return body;
	}

	/**
	 * ���ڵ� �����͸� �����Ѵ�.
	 * 
	 * @param body
	 *            ���ڵ� ������
	 */
	public void setBody(byte[] body) {
		this.body = body;
	}
}
