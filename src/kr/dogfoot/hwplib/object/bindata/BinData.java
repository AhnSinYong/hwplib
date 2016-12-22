package kr.dogfoot.hwplib.object.bindata;

import java.util.ArrayList;

/**
 * ���̳ʸ� �����͸� ��Ÿ���� ��ü HWP���� ���� "BinData" storage�� ����ȴ�.
 * 
 * @author neolord
 */
public class BinData {
	/**
	 * HWP ���� �ӿ� ÷�ε� ���̳ʸ� ������(�̹��� ��)�� ����Ʈ
	 */
	private ArrayList<EmbeddedBinaryData> embeddedBinaryDataList;

	/**
	 * ������
	 */
	public BinData() {
		embeddedBinaryDataList = new ArrayList<EmbeddedBinaryData>();
	}

	/**
	 * ���ο� ÷�ε� ���̳ʸ� ������ ��ü�� �����ϰ� list�� �߰��մϴ�.
	 * 
	 * @return ���� ������ ÷�ε� ���̳ʸ� ������ ��ü
	 */
	public EmbeddedBinaryData addNewEmbeddedBinaryData() {
		EmbeddedBinaryData ebd = new EmbeddedBinaryData();
		embeddedBinaryDataList.add(ebd);
		return ebd;
	}

	/**
	 * ÷�ε� ���̳ʸ� �������� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ÷�ε� ���̳ʸ� �������� ����Ʈ;
	 */
	public ArrayList<EmbeddedBinaryData> getEmbeddedBinaryDataList() {
		return embeddedBinaryDataList;
	}

	/**
	 * ���ο� ÷�ε� ���̳ʸ� ������ ��ü�� �����Ͽ� list�� �߰��մϴ�.
	 * 
	 * @param name
	 *            ���ο� ÷�ε� ���̳ʸ� ������ ��ü�� �̸�
	 * @param data
	 *            ���ο� ÷�ε� ���̳ʸ� ������ ��ü�� ������
	 */
	public void addNewEmbeddedBinaryData(String name, byte[] data) {
		EmbeddedBinaryData ebd = addNewEmbeddedBinaryData();
		ebd.setName(name);
		ebd.setData(data);
	}
}
