package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.bindata.BinDataProperty;

/**
 * ���̳ʸ� �����͸� ��Ÿ���� ���ڵ�
 * 
 * @author neolord
 */
public class BinData {
	/**
	 * �Ӽ�
	 */
	private BinDataProperty property;
	/**
	 * Type�� "LINK"�� ��, ���� ������ ���� ���
	 */
	private String absolutePathForLink;
	/**
	 * Type�� "LINK"�� ��, ���� ������ ��� ���
	 */
	private String relativePathForLink;
	/**
	 * Type�� "EMBEDDING"�̰ų� "STORAGE"�� ��, BINDATASTORAGE�� ����� ���̳ʸ� �������� ���̵�
	 */
	private int binDataID;
	/**
	 * Type�� "EMBEDDING"�� �� extension("." ����)
	 */
	private String extensionForEmbedding;

	/**
	 * ������
	 */
	public BinData() {
		property = new BinDataProperty();
	}

	/**
	 * ���̳ʸ� �������� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� �������� �Ӽ� ��ü
	 */
	public BinDataProperty getProperty() {
		return property;
	}

	/**
	 * Type�� "LINK"�� ��, ���� ������ ���� ��θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ���� ���
	 */
	public String getAbsolutePathForLink() {
		return absolutePathForLink;
	}

	/**
	 * Type�� "LINK"�� ��, ���� ������ ���� ��θ� �����Ѵ�.
	 * 
	 * @param absolutePathForLink
	 *            ���� ������ ���� ���
	 */
	public void setAbsolutePathForLink(String absolutePathForLink) {
		this.absolutePathForLink = absolutePathForLink;
	}

	/**
	 * Type�� "LINK"�� ��, ���� ������ ��� ��θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��� ���
	 */
	public String getRelativePathForLink() {
		return relativePathForLink;
	}

	/**
	 * Type�� "LINK"�� ��, ���� ������ ��� ��θ� �����Ѵ�.
	 * 
	 * @param relativePathForLink
	 *            ���� ������ ��� ���
	 */
	public void setRelativePathForLink(String relativePathForLink) {
		this.relativePathForLink = relativePathForLink;
	}

	/**
	 * Type�� "EMBEDDING"�̰ų� "STORAGE"�� ��, ���̳ʸ� �������� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� �������� ���̵�
	 */
	public int getBinDataID() {
		return binDataID;
	}

	/**
	 * Type�� "EMBEDDING"�̰ų� "STORAGE"�� ��, ���̳ʸ� �������� ���̵� �����Ѵ�.
	 * 
	 * @param binDataID
	 *            ���̳ʸ� �������� ���̵�
	 */
	public void setBinDataID(int binDataID) {
		this.binDataID = binDataID;
	}

	/**
	 * Type�� "EMBEDDING"�� ��, ������ extension�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ extension
	 */
	public String getExtensionForEmbedding() {
		return extensionForEmbedding;
	}

	/**
	 * Type�� "EMBEDDING"�� ��, ������ extension�� �����Ѵ�.
	 * 
	 * @param extensionForEmbedding
	 *            ������ extension
	 */
	public void setExtensionForEmbedding(String extensionForEmbedding) {
		this.extensionForEmbedding = extensionForEmbedding;
	}
}
