package kr.dogfoot.hwplib.object.bindata;

/**
 * HWP ���ϳ����� ����ϴ� �̹������� ���̳ʸ� �����͸� �����ϴ� ��ü
 * 
 * @author neolord
 */
public class EmbeddedBinaryData {
	/**
	 * ���̳ʸ� �������� �̸�
	 */
	private String name;
	/**
	 * ���� ������
	 */
	private byte[] data;

	/**
	 * ������
	 */
	public EmbeddedBinaryData() {
	}

	/**
	 * ���̳ʸ� �������� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� �������� �̸�
	 */
	public String getName() {
		return name;
	}

	/**
	 * ���̳ʸ� �������� �̸��� �����Ѵ�.
	 * 
	 * @param name
	 *            ���̳ʸ� �������� �̸�
	 */
	public void setName(String name) {
		this.name = name;
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
