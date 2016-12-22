package kr.dogfoot.hwplib.object.bodytext.control.table;

/**
 * ���� ���� ����Ʈ ��� ���ڵ�
 * 
 * @author neolord
 */
public class ListHeaderForCell {
	/**
	 * ���� ����
	 */
	private int paraCount;
	/**
	 * �Ӽ�
	 */
	private ListHeaderPropertyForCell property;
	/**
	 * �� �ּ�(Column)
	 */
	private int colIndex;
	/**
	 * �� �ּ�(Row)
	 */
	private int rowIndex;
	/**
	 * ���� ���� ����
	 */
	private int colSpan;
	/**
	 * ���� ���� ����
	 */
	private int rowSpan;
	/**
	 * ���� ��
	 */
	private long width;
	/**
	 * ���� ����
	 */
	private long height;
	/**
	 * ���� ����
	 */
	private int leftMargin;
	/**
	 * ������ ����
	 */
	private int rightMargin;
	/**
	 * ���� ����
	 */
	private int topMargin;
	/**
	 * �Ʒ��� ����
	 */
	private int bottomMargin;
	/**
	 * ������ �׵θ�/��� id
	 */
	private int borderFillId;
	/**
	 * �ؽ�Ʈ ��
	 */
	private long textWidth;
	/**
	 * �ʵ� �̸�
	 */
	private String fieldName;

	/**
	 * ������
	 */
	public ListHeaderForCell() {
		property = new ListHeaderPropertyForCell();
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getParaCount() {
		return paraCount;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param paraCount
	 *            ���� ����
	 */
	public void setParaCount(int paraCount) {
		this.paraCount = paraCount;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public ListHeaderPropertyForCell getProperty() {
		return property;
	}

	/**
	 * �� �ּ�(Column)�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �ּ�(Column)
	 */
	public int getColIndex() {
		return colIndex;
	}

	/**
	 * �� �ּ�(Column)�� �����Ѵ�.
	 * 
	 * @param colIndex
	 *            �� �ּ�(Column)
	 */
	public void setColIndex(int colIndex) {
		this.colIndex = colIndex;
	}

	/**
	 * �� �ּ�(Row)�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �ּ�(Row)
	 */
	public int getRowIndex() {
		return rowIndex;
	}

	/**
	 * �� �ּ�(Row)�� �����Ѵ�.
	 * 
	 * @param rowIndex
	 *            �� �ּ�(Row)
	 */
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	/**
	 * ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ����
	 */
	public int getColSpan() {
		return colSpan;
	}

	/**
	 * ���� ���� ������ �����Ѵ�.
	 * 
	 * @param colSpan
	 *            ���� ���� ����
	 */
	public void setColSpan(int colSpan) {
		this.colSpan = colSpan;
	}

	/**
	 * ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ����
	 */
	public int getRowSpan() {
		return rowSpan;
	}

	/**
	 * ���� ���� ������ �����Ѵ�.
	 * 
	 * @param rowSpan
	 *            ���� ���� ����
	 */
	public void setRowSpan(int rowSpan) {
		this.rowSpan = rowSpan;
	}

	/**
	 * ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public long getWidth() {
		return width;
	}

	/**
	 * ���� ���� �����Ѵ�.
	 * 
	 * @param width
	 *            ���� ��
	 */
	public void setWidth(long width) {
		this.width = width;
	}

	/**
	 * ���� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param height
	 *            ���� ����
	 */
	public void setHeight(long height) {
		this.height = height;
	}

	/**
	 * ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ũ��
	 */
	public int getLeftMargin() {
		return leftMargin;
	}

	/**
	 * ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param leftMargin
	 *            ���� ������ ũ��
	 */
	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}

	/**
	 * ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ������ ũ��
	 */
	public int getRightMargin() {
		return rightMargin;
	}

	/**
	 * ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param rightMargin
	 *            ������ ������ ũ��
	 */
	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}

	/**
	 * ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ũ��
	 */
	public int getTopMargin() {
		return topMargin;
	}

	/**
	 * ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param topMargin
	 *            ���� ������ ũ��
	 */
	public void setTopMargin(int topMargin) {
		this.topMargin = topMargin;
	}

	/**
	 * �Ʒ��� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �Ʒ��� ������ ũ��
	 */
	public int getBottomMargin() {
		return bottomMargin;
	}

	/**
	 * �Ʒ��� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param bottomMargin
	 *            �Ʒ��� ������ ũ��
	 */
	public void setBottomMargin(int bottomMargin) {
		this.bottomMargin = bottomMargin;
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
	 * �ؽ�Ʈ ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ ��
	 */
	public long getTextWidth() {
		return textWidth;
	}

	/**
	 * �ؽ�Ʈ ���� �����Ѵ�.
	 * 
	 * @param textWidth
	 *            �ؽ�Ʈ ��
	 */
	public void setTextWidth(long textWidth) {
		this.textWidth = textWidth;
	}

	/**
	 * �ʵ� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return �ʵ� �̸�
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * �ʵ� �̸��� �����Ѵ�.
	 * 
	 * @param fieldName
	 *            �ʵ� �̸�
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
}
