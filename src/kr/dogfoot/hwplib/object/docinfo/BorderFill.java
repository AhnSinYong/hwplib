package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderFillProperty;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.DiagonalSort;
import kr.dogfoot.hwplib.object.docinfo.borderfill.EachBorder;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.FillInfo;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׵θ�/����� ����� ��Ÿ���� ���ڵ�
 * 
 * @author neolord
 */
public class BorderFill {
	/**
	 * �Ӽ�
	 */
	private BorderFillProperty property;
	/**
	 * ���� ���� �Ӽ�
	 */
	private EachBorder leftBorder;
	/**
	 * ������ ���� �Ӽ�
	 */
	private EachBorder rightBorder;
	/**
	 * ���� ���� �Ӽ�
	 */
	private EachBorder topBorder;
	/**
	 * �Ʒ��� ���� �Ӽ�
	 */
	private EachBorder bottomBorder;
	/**
	 * �밢�� ����
	 */
	private DiagonalSort diagonalSort;
	/**
	 * �밢�� ����
	 */
	private BorderThickness diagonalThickness;
	/**
	 * �밢�� ����
	 */
	private Color4Byte diagonalColor;
	/**
	 * ä��� ����
	 */
	private FillInfo fillInfo;

	/**
	 * ������
	 */
	public BorderFill() {
		property = new BorderFillProperty();
		leftBorder = new EachBorder();
		rightBorder = new EachBorder();
		topBorder = new EachBorder();
		bottomBorder = new EachBorder();
		diagonalColor = new Color4Byte();
		fillInfo = new FillInfo();
	}

	/**
	 * �׵θ�/����� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/����� �Ӽ� ��ü
	 */
	public BorderFillProperty getProperty() {
		return property;
	}

	/**
	 * ���� ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� �Ӽ� ��ü
	 */
	public EachBorder getLeftBorder() {
		return leftBorder;
	}

	/**
	 * ������ ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� �Ӽ� ��ü
	 */
	public EachBorder getRightBorder() {
		return rightBorder;
	}

	/**
	 * ���� ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� �Ӽ� ��ü
	 */
	public EachBorder getTopBorder() {
		return topBorder;
	}

	/**
	 * �Ʒ��� ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ʒ��� ���� �Ӽ� ��ü
	 */
	public EachBorder getBottomBorder() {
		return bottomBorder;
	}

	/**
	 * �밢���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �밢���� ����
	 */
	public DiagonalSort getDiagonalSort() {
		return diagonalSort;
	}

	/**
	 * �밢���� ������ �����Ѵ�.
	 * 
	 * @param diagonalSort
	 *            �밢���� ����
	 */
	public void setDiagonalSort(DiagonalSort diagonalSort) {
		this.diagonalSort = diagonalSort;
	}

	/**
	 * �밢���� �β��� ��ȯ�Ѵ�.
	 * 
	 * @return �밢���� �β�
	 */
	public BorderThickness getDiagonalThickness() {
		return diagonalThickness;
	}

	/**
	 * �밢���� �β��� �����Ѵ�.
	 * 
	 * @param diagonalThickness
	 *            �밢���� �β�
	 */
	public void setDiagonalThickness(BorderThickness diagonalThickness) {
		this.diagonalThickness = diagonalThickness;
	}

	/**
	 * �밢���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �밢���� ���� ��ü
	 */
	public Color4Byte getDiagonalColor() {
		return diagonalColor;
	}

	/**
	 * ä��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ä��� ���� ��ü
	 */
	public FillInfo getFillInfo() {
		return fillInfo;
	}
}
