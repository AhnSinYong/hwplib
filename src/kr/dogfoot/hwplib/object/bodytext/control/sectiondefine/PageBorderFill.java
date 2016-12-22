package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

/**
 * �� �׵θ�/��� ������ ���� ���ڵ�
 * 
 * @author neolord
 */
public class PageBorderFill {
	/**
	 * �Ӽ�
	 */
	private PageBorderFillProperty property;
	/**
	 * �׵θ�/��� ��ġ ���� ����
	 */
	private int leftGap;
	/**
	 * �׵θ�/��� ��ġ ������ ����
	 */
	private int rightGap;
	/**
	 * �׵θ�/��� ��ġ ���� ����
	 */
	private int topGap;
	/**
	 * �׵θ�/��� ��ġ �Ʒ��� ����
	 */
	private int bottomGap;
	/**
	 * ������ �׵θ�/����� id
	 */
	private int borderFillId;

	/**
	 * ������
	 */
	public PageBorderFill() {
		property = new PageBorderFillProperty();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public PageBorderFillProperty getProperty() {
		return property;
	}

	/**
	 * �׵θ�/��� ��ġ ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/��� ��ġ ���� ����
	 */
	public int getLeftGap() {
		return leftGap;
	}

	/**
	 * �׵θ�/��� ��ġ ���� ������ �����Ѵ�.
	 * 
	 * @param leftGap
	 *            �׵θ�/��� ��ġ ���� ����
	 */
	public void setLeftGap(int leftGap) {
		this.leftGap = leftGap;
	}

	/**
	 * �׵θ�/��� ��ġ ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/��� ��ġ ������ ����
	 */
	public int getRightGap() {
		return rightGap;
	}

	/**
	 * �׵θ�/��� ��ġ ������ ������ �����Ѵ�.
	 * 
	 * @param rightGap
	 *            �׵θ�/��� ��ġ ������ ����
	 */
	public void setRightGap(int rightGap) {
		this.rightGap = rightGap;
	}

	/**
	 * �׵θ�/��� ��ġ ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/��� ��ġ ���� ����
	 */
	public int getTopGap() {
		return topGap;
	}

	/**
	 * �׵θ�/��� ��ġ ���� ������ �����Ѵ�.
	 * 
	 * @param topGap
	 *            �׵θ�/��� ��ġ ���� ����
	 */
	public void setTopGap(int topGap) {
		this.topGap = topGap;
	}

	/**
	 * �׵θ�/��� ��ġ �Ʒ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/��� ��ġ �Ʒ��� ����
	 */
	public int getBottomGap() {
		return bottomGap;
	}

	/**
	 * �׵θ�/��� ��ġ �Ʒ��� ������ �����Ѵ�.
	 * 
	 * @param bottomGap
	 *            �׵θ�/��� ��ġ �Ʒ��� ����
	 */
	public void setBottomGap(int bottomGap) {
		this.bottomGap = bottomGap;
	}

	/**
	 * ������ �׵θ�/����� id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �׵θ�/����� id
	 */
	public int getBorderFillId() {
		return borderFillId;
	}

	/**
	 * ������ �׵θ�/����� id�� �����Ѵ�.
	 * 
	 * @param borderFillId
	 *            ������ �׵θ�/����� id
	 */
	public void setBorderFillId(int borderFillId) {
		this.borderFillId = borderFillId;
	}
}
