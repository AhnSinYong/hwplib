package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * ���� ���� ����
 * 
 * @author neolord
 */
public class InnerMargin {
	/**
	 * ���� ����
	 */
	private int left;
	/**
	 * ������ ����
	 */
	private int right;
	/**
	 * ���� ����
	 */
	private int top;
	/**
	 * �Ʒ��� ����
	 */
	private int bottom;

	/**
	 * ������
	 */
	public InnerMargin() {
	}

	/**
	 * ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ũ��
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param left
	 *            ���� ������ ũ��
	 */
	public void setLeft(int left) {
		this.left = left;
	}

	/**
	 * ������ ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ������ ũ��
	 */
	public int getRight() {
		return right;
	}

	/**
	 * ������ ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param right
	 *            ������ ������ ũ��
	 */
	public void setRight(int right) {
		this.right = right;
	}

	/**
	 * ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ũ��
	 */
	public int getTop() {
		return top;
	}

	/**
	 * ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param top
	 *            ���� ������ ũ��
	 */
	public void setTop(int top) {
		this.top = top;
	}

	/**
	 * �Ʒ��� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �Ʒ��� ������ ũ��
	 */
	public int getBottom() {
		return bottom;
	}

	/**
	 * �Ʒ��� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param bottom
	 *            �Ʒ��� ������ ũ��
	 */
	public void setBottom(int bottom) {
		this.bottom = bottom;
	}
}
