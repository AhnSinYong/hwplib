package kr.dogfoot.hwplib.object.bodytext.control.table;

/**
 * ���� �Ӽ�
 * 
 * @author neolord
 */
public class ZoneInfo {
	/**
	 * ���� �� �ּ�
	 */
	private int startColumn;
	/**
	 * ���� �� �ּ�
	 */
	private int startRow;
	/**
	 * �� �� �ּ�
	 */
	private int endColumn;
	/**
	 * �� �� �ּ�
	 */
	private int endRow;
	/**
	 * ������ �׵θ�/��� Id
	 */
	private int bordefFillId;

	/**
	 * ������
	 */
	public ZoneInfo() {
	}

	/**
	 * ���� �� �ּҸ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� �ּ�
	 */
	public int getStartColumn() {
		return startColumn;
	}

	/**
	 * ���� �� �ּҸ� �����Ѵ�.
	 * 
	 * @param startColumn
	 *            ���� �� �ּ�
	 */
	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}

	/**
	 * ���� �� �ּҸ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� �ּ�
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * ���� �� �ּҸ� �����Ѵ�.
	 * 
	 * @param startRow
	 *            ���� �� �ּ�
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	/**
	 * �� �� �ּҸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� �� �ּ�
	 */
	public int getEndColumn() {
		return endColumn;
	}

	/**
	 * �� �� �ּҸ� �����Ѵ�.
	 * 
	 * @param endColumn
	 *            �� �� �ּ�
	 */
	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}

	/**
	 * �� �� �ּҸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� �� �ּ�
	 */
	public int getEndRow() {
		return endRow;
	}

	/**
	 * �� �� �ּҸ� �����Ѵ�.
	 * 
	 * @param endRow
	 *            �� �� �ּ�
	 */
	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	/**
	 * ������ �׵θ�/��� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �׵θ�/��� Id
	 */
	public int getBordefFillId() {
		return bordefFillId;
	}

	/**
	 * ������ �׵θ�/��� Id�� �����Ѵ�.
	 * 
	 * @param bordefFillId
	 *            ������ �׵θ�/��� Id
	 */
	public void setBordefFillId(int bordefFillId) {
		this.bordefFillId = bordefFillId;
	}
}
