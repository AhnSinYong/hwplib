package kr.dogfoot.hwplib.object.bodytext.control.gso.textbox;

/**
 * �ۻ��ڸ� ���� ���� ����Ʈ ��� ���ڵ�
 * 
 * @author neolord
 */
public class ListHeaderForTextBox {
	/**
	 * ���� ����
	 */
	private int paraCount;
	/**
	 * �Ӽ�
	 */
	private ListHeaderProperty property;
	/**
	 * �ۻ��� �ؽ�Ʈ ���� ����
	 */
	private int leftMargin;
	/**
	 * �ۻ��� �ؽ�Ʈ ������ ����
	 */
	private int rightMargin;
	/**
	 * �ۻ��� �ؽ�Ʈ ���� ����
	 */
	private int topMargin;
	/**
	 * �ۻ��� �ؽ�Ʈ �Ʒ��� ����
	 */
	private int bottomMargin;
	/**
	 * �ؽ�Ʈ ���ڿ��� �ִ� ��
	 */
	private long textWidth;
	/**
	 * ��� ��忡�� ���� ����
	 */
	private boolean editableAtFormMode;
	/**
	 * �ʵ� �̸�
	 */
	private String fieldName;

	/**
	 * ������
	 */
	public ListHeaderForTextBox() {
		property = new ListHeaderProperty();
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
	 */
	public void setParaCount(int paraCount) {
		this.paraCount = paraCount;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public ListHeaderProperty getProperty() {
		return property;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �ۻ��� �ؽ�Ʈ ���� ������ ũ��
	 */
	public int getLeftMargin() {
		return leftMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param leftMargin
	 *            �ۻ��� �ؽ�Ʈ ���� ������ ũ��
	 */
	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �ۻ��� �ؽ�Ʈ ������ ������ ũ��
	 */
	public int getRightMargin() {
		return rightMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param rightMargin
	 *            �ۻ��� �ؽ�Ʈ ������ ������ ũ��
	 */
	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �ۻ��� �ؽ�Ʈ ���� ������ ũ��
	 */
	public int getTopMargin() {
		return topMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param topMargin
	 *            �ۻ��� �ؽ�Ʈ ���� ������ ũ��
	 */
	public void setTopMargin(int topMargin) {
		this.topMargin = topMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ �Ʒ��� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �ۻ��� �ؽ�Ʈ �Ʒ��� ������ ũ��
	 */
	public int getBottomMargin() {
		return bottomMargin;
	}

	/**
	 * �ۻ��� �ؽ�Ʈ �Ʒ��� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param bottomMargin
	 *            �ۻ��� �ؽ�Ʈ �Ʒ��� ������ ũ��
	 */
	public void setBottomMargin(int bottomMargin) {
		this.bottomMargin = bottomMargin;
	}

	/**
	 * �ؽ�Ʈ ���ڿ��� �ִ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ ���ڿ��� �ִ� ��
	 */
	public long getTextWidth() {
		return textWidth;
	}

	/**
	 * �ؽ�Ʈ ���ڿ��� �ִ� ���� �����Ѵ�.
	 * 
	 * @param textWidth
	 *            �ؽ�Ʈ ���ڿ��� �ִ� ��
	 */
	public void setTextWidth(long textWidth) {
		this.textWidth = textWidth;
	}

	/**
	 * ��� ��忡�� ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ��忡�� ���� ���� ����
	 */
	public boolean isEditableAtFormMode() {
		return editableAtFormMode;
	}

	/**
	 * ��� ��忡�� ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param editableAtFormMode
	 *            ��� ��忡�� ���� ���� ����
	 */
	public void setEditableAtFormMode(boolean editableAtFormMode) {
		this.editableAtFormMode = editableAtFormMode;
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
