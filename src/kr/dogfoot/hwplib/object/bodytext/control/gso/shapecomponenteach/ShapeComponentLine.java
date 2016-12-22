package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

/**
 * �� ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentLine {
	/**
	 * ������ x ��ǥ
	 */
	private int startX;
	/**
	 * ������ y ��ǥ
	 */
	private int startY;
	/**
	 * ���� x ��ǥ
	 */
	private int endX;
	/**
	 * ���� y ��ǥ
	 */
	private int endY;
	/**
	 * ���� �������̳� �Ʒ��� ���� ���۵Ǿ����� ����
	 * 
	 * �Ӽ�. ó�� ���� �� ���� �Ǵ� ������ ��, ���� ������ ������ ������(����)���� �������� ���� ���� ������, ������ �ٷ�
	 * ����ֱ� ���� �÷���.
	 */
	private boolean startedRightOrBottom;

	/**
	 * ������
	 */
	public ShapeComponentLine() {
	}

	/**
	 * ������ x ��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ x ��ǥ
	 */
	public int getStartX() {
		return startX;
	}

	/**
	 * ������ x ��ǥ�� �����Ѵ�.
	 * 
	 * @param startX
	 *            ������ x ��ǥ
	 */
	public void setStartX(int startX) {
		this.startX = startX;
	}

	/**
	 * ������ y ��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ y ��ǥ
	 */
	public int getStartY() {
		return startY;
	}

	/**
	 * ������ y ��ǥ�� �����Ѵ�.
	 * 
	 * @param startY
	 *            ������ y ��ǥ
	 */
	public void setStartY(int startY) {
		this.startY = startY;
	}

	/**
	 * ���� x ��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� x ��ǥ
	 */
	public int getEndX() {
		return endX;
	}

	/**
	 * ���� x ��ǥ�� �����Ѵ�.
	 * 
	 * @param endX
	 *            ���� x ��ǥ
	 */
	public void setEndX(int endX) {
		this.endX = endX;
	}

	/**
	 * ���� y ��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� y ��ǥ
	 */
	public int getEndY() {
		return endY;
	}

	/**
	 * ���� y ��ǥ�� �����Ѵ�.
	 * 
	 * @param endY
	 *            ���� y ��ǥ
	 */
	public void setEndY(int endY) {
		this.endY = endY;
	}

	/**
	 * ���� �������̳� �Ʒ��� ���� ���۵Ǿ����� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �������̳� �Ʒ��� ���� ���۵Ǿ����� ����
	 */
	public boolean isStartedRightOrBottom() {
		return startedRightOrBottom;
	}

	/**
	 * ���� �������̳� �Ʒ��� ���� ���۵Ǿ����� ���θ� �����Ѵ�.
	 * 
	 * @param startedRightOrBottom
	 *            ���� �������̳� �Ʒ��� ���� ���۵Ǿ����� ����
	 */
	public void setStartedRightOrBottom(boolean startedRightOrBottom) {
		this.startedRightOrBottom = startedRightOrBottom;
	}
}
