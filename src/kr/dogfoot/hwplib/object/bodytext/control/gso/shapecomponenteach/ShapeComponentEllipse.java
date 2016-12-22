package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ellipse.ShapeComponentEllipseProperty;

/**
 * Ÿ�� ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentEllipse {
	/**
	 * �Ӽ�
	 */
	private ShapeComponentEllipseProperty property;
	/**
	 * �߽� ��ǥ�� X��
	 */
	private int centerX;
	/**
	 * �߽� ��ǥ�� Y��
	 */
	private int centerY;
	/**
	 * ��1�� X��ǥ ��
	 */
	private int axis1X;
	/**
	 * ��1�� Y��ǥ ��
	 */
	private int axis1Y;
	/**
	 * ��2�� X��ǥ ��
	 */
	private int axis2X;
	/**
	 * ��2�� Y��ǥ ��
	 */
	private int axis2Y;
	/**
	 * start pos x
	 */
	private int startX;
	/**
	 * start pos y
	 */
	private int startY;
	/**
	 * end pos x
	 */
	private int endX;
	/**
	 * end pos y
	 */
	private int endY;
	/**
	 * start pos x2 interval of curve(effective only when it is an arc)
	 */
	private int startX2;
	/**
	 * start pos y2
	 */
	private int startY2;
	/**
	 * end pos x2
	 */
	private int endX2;
	/**
	 * end pos y2
	 */
	private int endY2;

	/**
	 * ������
	 */
	public ShapeComponentEllipse() {
		property = new ShapeComponentEllipseProperty();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public ShapeComponentEllipseProperty getProperty() {
		return property;
	}

	/**
	 * �߽� ��ǥ�� X���� ��ȯ�Ѵ�.
	 * 
	 * @return �߽� ��ǥ�� X��
	 */
	public int getCenterX() {
		return centerX;
	}

	/**
	 * �߽� ��ǥ�� X���� �����Ѵ�.
	 * 
	 * @param centerX
	 *            �߽� ��ǥ�� X��
	 */
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	/**
	 * �߽� ��ǥ�� Y���� ��ȯ�Ѵ�.
	 * 
	 * @return �߽� ��ǥ�� Y��
	 */
	public int getCenterY() {
		return centerY;
	}

	/**
	 * �߽� ��ǥ�� Y���� �����Ѵ�.
	 * 
	 * @param centerY
	 *            �߽� ��ǥ�� Y��
	 */
	public void setCenterY(int centerY) {
		this.centerY = centerY;
	}

	/**
	 * ��1�� X��ǥ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��1�� X��ǥ ��
	 */
	public int getAxis1X() {
		return axis1X;
	}

	/**
	 * ��1�� X��ǥ ���� �����Ѵ�.
	 * 
	 * @param axis1X
	 *            ��1�� X��ǥ ��
	 */
	public void setAxis1X(int axis1X) {
		this.axis1X = axis1X;
	}

	/**
	 * ��1�� Y��ǥ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��1�� Y��ǥ ��
	 */
	public int getAxis1Y() {
		return axis1Y;
	}

	/**
	 * ��1�� Y��ǥ ���� �����Ѵ�.
	 * 
	 * @param axis1Y
	 *            ��1�� Y��ǥ ��
	 */
	public void setAxis1Y(int axis1Y) {
		this.axis1Y = axis1Y;
	}

	/**
	 * ��2�� X��ǥ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��2�� X��ǥ ��
	 */
	public int getAxis2X() {
		return axis2X;
	}

	/**
	 * ��2�� X��ǥ ���� �����Ѵ�.
	 * 
	 * @param axis2X
	 *            ��2�� X��ǥ ��
	 */
	public void setAxis2X(int axis2X) {
		this.axis2X = axis2X;
	}

	/**
	 * ��2�� Y��ǥ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��2�� Y��ǥ ��
	 */
	public int getAxis2Y() {
		return axis2Y;
	}

	/**
	 * ��2�� Y��ǥ ���� �����Ѵ�.
	 * 
	 * @param axis2Y
	 *            ��2�� Y��ǥ ��
	 */
	public void setAxis2Y(int axis2Y) {
		this.axis2Y = axis2Y;
	}

	/**
	 * start pos x���� ��ȯ�Ѵ�.
	 * 
	 * @return start pos x��
	 */
	public int getStartX() {
		return startX;
	}

	/**
	 * start pos x���� �����Ѵ�.
	 * 
	 * @param startX
	 *            start pos x
	 */
	public void setStartX(int startX) {
		this.startX = startX;
	}

	/**
	 * start pos y���� ��ȯ�Ѵ�.
	 * 
	 * @return start pos y��
	 */
	public int getStartY() {
		return startY;
	}

	/**
	 * start pos y���� �����Ѵ�.
	 * 
	 * @param startY
	 *            start pos y��
	 */
	public void setStartY(int startY) {
		this.startY = startY;
	}

	/**
	 * end pos x���� ��ȯ�Ѵ�.
	 * 
	 * @return end pos x��
	 */
	public int getEndX() {
		return endX;
	}

	/**
	 * end pos x���� �����Ѵ�.
	 * 
	 * @param endX
	 *            end pos x��
	 */
	public void setEndX(int endX) {
		this.endX = endX;
	}

	/**
	 * end pos y���� ��ȯ�Ѵ�.
	 * 
	 * @return end pos y��
	 */
	public int getEndY() {
		return endY;
	}

	/**
	 * end pos y���� �����Ѵ�.
	 * 
	 * @param endY
	 *            end pos y��
	 */
	public void setEndY(int endY) {
		this.endY = endY;
	}

	/**
	 * start pos x2���� ��ȯ�Ѵ�.
	 * 
	 * @return start pos x2��
	 */
	public int getStartX2() {
		return startX2;
	}

	/**
	 * start pos x2���� �����Ѵ�.
	 * 
	 * @param startX2
	 *            start pos x2
	 */
	public void setStartX2(int startX2) {
		this.startX2 = startX2;
	}

	/**
	 * start pos y2���� ��ȯ�Ѵ�.
	 * 
	 * @return start pos y2��
	 */
	public int getStartY2() {
		return startY2;
	}

	/**
	 * start pos y2���� �����Ѵ�.
	 * 
	 * @param startY2
	 *            start pos y2
	 */
	public void setStartY2(int startY2) {
		this.startY2 = startY2;
	}

	/**
	 * end pos x2���� ��ȯ�Ѵ�.
	 * 
	 * @return end pos x2��
	 */
	public int getEndX2() {
		return endX2;
	}

	/**
	 * end pos x2���� �����Ѵ�.
	 * 
	 * @param endX2
	 *            end pos x2��
	 */
	public void setEndX2(int endX2) {
		this.endX2 = endX2;
	}

	/**
	 * end pos y2���� ��ȯ�Ѵ�.
	 * 
	 * @return end pos y2��
	 */
	public int getEndY2() {
		return endY2;
	}

	/**
	 * end pos y2���� �����Ѵ�.
	 * 
	 * @param endY2
	 *            end pos y2��
	 */
	public void setEndY2(int endY2) {
		this.endY2 = endY2;
	}
}
