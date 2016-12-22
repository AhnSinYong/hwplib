package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.arc.ArcBorder;

/**
 * ȣ ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentArc {
	/**
	 * ȣ �׵θ�
	 */
	private ArcBorder arcBorder;
	/**
	 * Ÿ���� �߽� ��ǥ X��
	 */
	private int centerX;
	/**
	 * Ÿ���� �߽� ��ǥ Y��
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
	 * ������
	 */
	public ShapeComponentArc() {
	}

	/**
	 * ȣ �׵θ� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ȣ �׵θ� ����
	 */
	public ArcBorder getArcBorder() {
		return arcBorder;
	}

	/**
	 * ȣ �׵θ� ������ �����Ѵ�.
	 * 
	 * @param arcBorder
	 *            ȣ �׵θ� ����
	 */
	public void setArcBorder(ArcBorder arcBorder) {
		this.arcBorder = arcBorder;
	}

	/**
	 * Ÿ���� �߽� ��ǥ X���� ��ȯ�Ѵ�.
	 * 
	 * @return Ÿ���� �߽� ��ǥ X��
	 */
	public int getCenterX() {
		return centerX;
	}

	/**
	 * Ÿ���� �߽� ��ǥ X���� �����Ѵ�.
	 * 
	 * @param centerX
	 *            Ÿ���� �߽� ��ǥ X��
	 */
	public void setCenterX(int centerX) {
		this.centerX = centerX;
	}

	/**
	 * Ÿ���� �߽� ��ǥ Y���� ��ȯ�Ѵ�.
	 * 
	 * @return Ÿ���� �߽� ��ǥ Y��
	 */
	public int getCenterY() {
		return centerY;
	}

	/**
	 * Ÿ���� �߽� ��ǥ Y���� �����Ѵ�.
	 * 
	 * @param centerY
	 *            Ÿ���� �߽� ��ǥ Y��
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
}
