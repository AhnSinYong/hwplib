package kr.dogfoot.hwplib.object.bodytext.control.table;

import java.util.ArrayList;

/**
 * ���̺� ������ �����ϴ� ���ڵ�
 * 
 * @author neolord
 */
public class Table {
	/**
	 * �Ӽ�
	 */
	private TableProperty property;
	/**
	 * ���� ����
	 */
	private int rowCount;
	/**
	 * ���� ����
	 */
	private int columnCount;
	/**
	 * �� ������ ����
	 */
	private int cellSpacing;
	/**
	 * ���� ���� ����
	 */
	private int leftInnerMargin;
	/**
	 * ������ ���� ����
	 */
	private int rightInnerMargin;
	/**
	 * ���� ���� ����
	 */
	private int topInnerMargin;
	/**
	 * �Ʒ��� ���� ����
	 */
	private int bottomInnerMargin;
	/**
	 * �� ���� ���� ������ �����ϴ� ����Ʈ
	 */
	private ArrayList<Integer> cellCountOfRowList;
	/**
	 * ������ �׵θ�/��� id
	 */
	private int borderFillId;
	/**
	 * ���� �Ӽ� ����Ʈ (5.0.1.0 �̻�)
	 */
	private ArrayList<ZoneInfo> zoneInfoList;

	/**
	 * ������
	 */
	public Table() {
		property = new TableProperty();
		cellCountOfRowList = new ArrayList<Integer>();
		zoneInfoList = new ArrayList<ZoneInfo>();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public TableProperty getProperty() {
		return property;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getRowCount() {
		return rowCount;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param rowCount
	 *            ���� ����
	 */
	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getColumnCount() {
		return columnCount;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param columnCount
	 *            ���� ����
	 */
	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}

	/**
	 * �� ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �� ������ ������ ũ��
	 */
	public int getCellSpacing() {
		return cellSpacing;
	}

	/**
	 * �� ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param cellSpacing
	 *            �� ������ ������ ũ��
	 */
	public void setCellSpacing(int cellSpacing) {
		this.cellSpacing = cellSpacing;
	}

	/**
	 * ���� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ������ ũ��
	 */
	public int getLeftInnerMargin() {
		return leftInnerMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param leftInnerMargin
	 *            ���� ���� ������ ũ��
	 */
	public void setLeftInnerMargin(int leftInnerMargin) {
		this.leftInnerMargin = leftInnerMargin;
	}

	/**
	 * ������ ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ������ ũ��
	 */
	public int getRightInnerMargin() {
		return rightInnerMargin;
	}

	/**
	 * ������ ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param rightInnerMargin
	 *            ������ ���� ������ ũ��
	 */
	public void setRightInnerMargin(int rightInnerMargin) {
		this.rightInnerMargin = rightInnerMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ������ ũ��
	 */
	public int getTopInnerMargin() {
		return topInnerMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param topInnerMargin
	 *            ���� ���� ������ ũ��
	 */
	public void setTopInnerMargin(int topInnerMargin) {
		this.topInnerMargin = topInnerMargin;
	}

	/**
	 * �Ʒ��� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �Ʒ��� ���� ������ ũ��
	 */
	public int getBottomInnerMargin() {
		return bottomInnerMargin;
	}

	/**
	 * �Ʒ��� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param bottomInnerMargin
	 *            �Ʒ��� ���� ������ ũ��
	 */
	public void setBottomInnerMargin(int bottomInnerMargin) {
		this.bottomInnerMargin = bottomInnerMargin;
	}

	/**
	 * ���� �� ������ �߰��Ѵ�.
	 * 
	 * @param cellCountOfRow
	 *            Ư�� ���� �� ����
	 */
	public void addCellCountOfRow(int cellCountOfRow) {
		cellCountOfRowList.add(cellCountOfRow);
	}

	/**
	 * �� ���� ���� ������ �����ϴ� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ���� ������ �����ϴ� ����Ʈ 
	 */
	public ArrayList<Integer> getCellCountOfRowList() {
		return cellCountOfRowList;
	}

	/**
	 * ������ �׵θ�/��� id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �׵θ�/��� id
	 */
	public int getBorderFillId() {
		return borderFillId;
	}

	/**
	 * ������ �׵θ�/��� id�� �����Ѵ�.
	 * 
	 * @param borderFillId
	 *            ������ �׵θ�/��� id
	 */
	public void setBorderFillId(int borderFillId) {
		this.borderFillId = borderFillId;
	}

	/**
	 * ���ο� ���� �Ӽ� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�. (5.0.1.0 �̻�)
	 * 
	 * @return ���� ������ ���� �Ӽ� ��ü
	 */
	public ZoneInfo addNewZoneInfo() {
		ZoneInfo zi = new ZoneInfo();
		zoneInfoList.add(zi);
		return zi;
	}

	/**
	 * ���� �Ӽ� ����Ʈ�� ��ȯ�Ѵ�. (5.0.1.0 �̻�)
	 * 
	 * @return ���� �Ӽ� ����Ʈ
	 */
	public ArrayList<ZoneInfo> getZoneInfoList() {
		return zoneInfoList;
	}
}
