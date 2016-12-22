package kr.dogfoot.hwplib.object.docinfo.documentproperties;

/**
 * ���� ���۹�ȣ�� ���� ����
 * 
 * @author neolord
 */
public class StartNumber {
	/**
	 * ������ ���� ��ȣ
	 */
	private int page;
	/**
	 * ���� ���� ��ȣ
	 */
	private int footnote;
	/**
	 * ���� ���� ��ȣ
	 */
	private int endnote;
	/**
	 * �׸� ���� ��ȣ
	 */
	private int picture;
	/**
	 * ǥ ���� ��ȣ
	 */
	private int table;
	/**
	 * ���� ���� ��ȣ
	 */
	private int equation;

	/**
	 * ������
	 */
	public StartNumber() {
	}

	/**
	 * ������ ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��ȣ
	 */
	public int getPage() {
		return page;
	}

	/**
	 * ������ ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param page
	 *            ������ ���� ��ȣ
	 */
	public void setPage(int page) {
		this.page = page;
	}

	/**
	 * ���� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ȣ
	 */
	public int getFootnote() {
		return footnote;
	}

	/**
	 * ���� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param footnote
	 *            ���� ���� ��ȣ
	 */
	public void setFootnote(int footnote) {
		this.footnote = footnote;
	}

	/**
	 * ���� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ȣ
	 */
	public int getEndnote() {
		return endnote;
	}

	/**
	 * ���� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param endnote
	 *            ���� ���� ��ȣ
	 */
	public void setEndnote(int endnote) {
		this.endnote = endnote;
	}

	/**
	 * �׸� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ���� ��ȣ
	 */
	public int getPicture() {
		return picture;
	}

	/**
	 * �׸� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param picture
	 *            �׸� ���� ��ȣ
	 */
	public void setPicture(int picture) {
		this.picture = picture;
	}

	/**
	 * ǥ ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ǥ ���� ��ȣ
	 */
	public int getTable() {
		return table;
	}

	/**
	 * ǥ ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param table
	 *            ǥ ���� ��ȣ
	 */
	public void setTable(int table) {
		this.table = table;
	}

	/**
	 * ���� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ȣ
	 */
	public int getEquation() {
		return equation;
	}

	/**
	 * ���� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param equation
	 *            ���� ���� ��ȣ
	 */
	public void setEquation(int equation) {
		this.equation = equation;
	}
}
