package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * ���� ������ ���� ���ڵ�
 * 
 * @author neolord
 */
public class PageDef {
	/**
	 * ���� ���� ũ��
	 */
	private long paperWidth;
	/**
	 * ���� ���� ũ��
	 */
	private long paperHeight;
	/**
	 * ���� ���� ����
	 */
	private long leftMargin;
	/**
	 * ���� ������ ����
	 */
	private long rightMargin;
	/**
	 * ���� ���� ����
	 */
	private long topMargin;
	/**
	 * ���� �Ʒ��� ����
	 */
	private long bottomMargin;
	/**
	 * �Ӹ��� ����
	 */
	private long headerMargin;
	/**
	 * ������ ����
	 */
	private long footerMargin;
	/**
	 * ���� ����
	 */
	private long gutterMargin;
	/**
	 * �Ӽ�
	 */
	private PageDefProperty property;

	/**
	 * ������
	 */
	public PageDef() {
		property = new PageDefProperty();
	}

	/**
	 * ���� ���� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ũ��
	 */
	public long getPaperWidth() {
		return paperWidth;
	}

	/**
	 * ���� ���� ũ�⸦ �����Ѵ�.
	 * 
	 * @param paperWidth
	 *            ���� ���� ũ��
	 */
	public void setPaperWidth(long paperWidth) {
		this.paperWidth = paperWidth;
	}

	/**
	 * ���� ���� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ũ��
	 */
	public long getPaperHeight() {
		return paperHeight;
	}

	/**
	 * ���� ���� ũ�⸦ �����Ѵ�.
	 * 
	 * @param paperHeight
	 *            ���� ���� ũ��
	 */
	public void setPaperHeight(long paperHeight) {
		this.paperHeight = paperHeight;
	}

	/**
	 * ���� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ������ ũ��
	 */
	public long getLeftMargin() {
		return leftMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param leftMargin
	 *            ���� ���� ������ ũ��
	 */
	public void setLeftMargin(long leftMargin) {
		this.leftMargin = leftMargin;
	}

	/**
	 * ���� ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ������ ũ��
	 */
	public long getRightMargin() {
		return rightMargin;
	}

	/**
	 * ���� ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param rightMargin
	 *            ���� ������ ������ ũ��
	 */
	public void setRightMargin(long rightMargin) {
		this.rightMargin = rightMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ������ ũ��
	 */
	public long getTopMargin() {
		return topMargin;
	}

	/**
	 * ���� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param topMargin
	 *            ���� ���� ������ ũ��
	 */
	public void setTopMargin(long topMargin) {
		this.topMargin = topMargin;
	}

	/**
	 * ���� �Ʒ��� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ʒ��� ������ ũ��
	 */
	public long getBottomMargin() {
		return bottomMargin;
	}

	/**
	 * ���� �Ʒ��� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param bottomMargin
	 *            ���� �Ʒ��� ������ ũ��
	 */
	public void setBottomMargin(long bottomMargin) {
		this.bottomMargin = bottomMargin;
	}

	/**
	 * �Ӹ��� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �Ӹ��� ������ ũ��
	 */
	public long getHeaderMargin() {
		return headerMargin;
	}

	/**
	 * �Ӹ��� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param headerMargin
	 *            �Ӹ��� ������ ũ��
	 */
	public void setHeaderMargin(long headerMargin) {
		this.headerMargin = headerMargin;
	}

	/**
	 * ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ������ ũ��
	 */
	public long getFooterMargin() {
		return footerMargin;
	}

	/**
	 * ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param footerMargin
	 *            ������ ������ ũ��
	 */
	public void setFooterMargin(long footerMargin) {
		this.footerMargin = footerMargin;
	}

	/**
	 * ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ũ��
	 */
	public long getGutterMargin() {
		return gutterMargin;
	}

	/**
	 * ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param gutterMargin
	 *            ���� ������ ũ��
	 */
	public void setGutterMargin(long gutterMargin) {
		this.gutterMargin = gutterMargin;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public PageDefProperty getProperty() {
		return property;
	}
}
