package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.parashape.ParaShapeProperty1;
import kr.dogfoot.hwplib.object.docinfo.parashape.ParaShapeProperty2;
import kr.dogfoot.hwplib.object.docinfo.parashape.ParaShapeProperty3;

/**
 * ���� ��翡 ����  ���ڵ�
 * 
 * @author neolord
 */
public class ParaShape {
	/**
	 * �Ӽ� 1
	 */
	private ParaShapeProperty1 property1;
	/**
	 * ���� ����
	 */
	private int leftMargin;
	/**
	 * ������ ����
	 */
	private int rightMargin;
	/**
	 * �鿩 ����/���� ����
	 */
	private int indent;
	/**
	 * ���� �� ����
	 */
	private int topParaSpace;
	/**
	 * ���� �Ʒ� ����
	 */
	private int bottomParaSpace;
	/**
	 * �� ����. �ѱ� 2007 ���� ����(5.0.2.5 ���� �̸�)���� ���
	 */
	private int lineSpace;
	/**
	 * ������ �� ���� ���̵�
	 */
	private int tabDefId;
	/**
	 * ������ ���� ��ȣ ���̵� �� ������ �۸Ӹ�ǥ ���̵�
	 */
	private int paraHeadId;
	/**
	 * ������ �׵θ�/��� ��� ���̵�
	 */
	private int borderFillId;
	/**
	 * ���� �׵θ� ���� ����
	 */
	private short leftBorderSpace;
	/**
	 * ���� �׵θ� ������ ����
	 */
	private short rightBorderSpace;
	/**
	 * ���� �׵θ� ���� ����
	 */
	private short topBorderSpace;
	/**
	 * ���� �׵θ� �Ʒ��� ����
	 */
	private short bottomBorderSpace;
	/**
	 * �Ӽ� 2 (5.0.1.7 ���� �̻�)
	 */
	private ParaShapeProperty2 property2;
	/**
	 * �Ӽ� 3 (5.0.2.5 ���� �̻�)
	 */
	private ParaShapeProperty3 property3;
	/**
	 * �� ����(5.0.2.5 ���� �̻�)
	 */
	private long lineSpace2;

	/**
	 * ������
	 */
	public ParaShape() {
		property1 = new ParaShapeProperty1();
		property2 = new ParaShapeProperty2();
		property3 = new ParaShapeProperty3();
	}

	/**
	 * ���� ����� �Ӽ�1 ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����� �Ӽ�1 ��ü
	 */
	public ParaShapeProperty1 getProperty1() {
		return property1;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getLeftMargin() {
		return leftMargin;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param leftMargin
	 *            ���� ����
	 */
	public void setLeftMargin(int leftMargin) {
		this.leftMargin = leftMargin;
	}

	/**
	 * ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ����
	 */
	public int getRightMargin() {
		return rightMargin;
	}

	/**
	 * ������ ������ �����Ѵ�.
	 * 
	 * @param rightMargin
	 *            ������ ����
	 */
	public void setRightMargin(int rightMargin) {
		this.rightMargin = rightMargin;
	}

	/**
	 * �鿩 ����/���� ���⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �鿩 ����/���� ����
	 */
	public int getIndent() {
		return indent;
	}

	/**
	 * �鿩 ����/���� ���⸦ �����Ѵ�.
	 * 
	 * @param indent
	 *            �鿩 ����/���� ����
	 */
	public void setIndent(int indent) {
		this.indent = indent;
	}

	/**
	 * ���� �� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ����
	 */
	public int getTopParaSpace() {
		return topParaSpace;
	}

	/**
	 * ���� �� ������ �����Ѵ�.
	 * 
	 * @param topParaSpace
	 *            ���� �� ����
	 */
	public void setTopParaSpace(int topParaSpace) {
		this.topParaSpace = topParaSpace;
	}

	/**
	 * ���� �Ʒ� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ʒ� ����
	 */
	public int getBottomParaSpace() {
		return bottomParaSpace;
	}

	/**
	 * ���� �Ʒ� ������ �����Ѵ�.
	 * 
	 * @param bottomParaSpace
	 *            ���� �Ʒ� ����
	 */
	public void setBottomParaSpace(int bottomParaSpace) {
		this.bottomParaSpace = bottomParaSpace;
	}

	/**
	 * �� ������ ��ȯ�Ѵ�. �ѱ� 2007 ���� ����(5.0.2.5 ���� �̸�)���� ���
	 * 
	 * @return �� ����
	 */
	public int getLineSpace() {
		return lineSpace;
	}

	/**
	 * �� ������ �����Ѵ�. �ѱ� 2007 ���� ����(5.0.2.5 ���� �̸�)���� ���
	 * 
	 * @param lineSpace
	 *            �� ����
	 */
	public void setLineSpace(int lineSpace) {
		this.lineSpace = lineSpace;
	}

	/**
	 * ������ �� ���� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �� ���� ���̵�
	 */
	public int getTabDefId() {
		return tabDefId;
	}

	/**
	 * ������ �� ���� ���̵� �����Ѵ�.
	 * 
	 * @param tabDefId
	 *            ������ �� ���� ���̵�
	 */
	public void setTabDefId(int tabDefId) {
		this.tabDefId = tabDefId;
	}

	/**
	 * ������ ���� ��ȣ ���̵� �� ������ �۸Ӹ�ǥ ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��ȣ ���̵� �� ������ �۸Ӹ�ǥ ���̵�
	 */
	public int getParaHeadId() {
		return paraHeadId;
	}

	/**
	 * ������ ���� ��ȣ ���̵� �� ������ �۸Ӹ�ǥ ���̵�e �����Ѵ�.
	 * 
	 * @param paraHeadId
	 *            ������ ���� ��ȣ ���̵� �� ������ �۸Ӹ�ǥ ���̵�
	 */
	public void setParaHeadId(int paraHeadId) {
		this.paraHeadId = paraHeadId;
	}

	/**
	 * ������ �׵θ�/��� ��� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �׵θ�/��� ��� ���̵�
	 */
	public int getBorderFillId() {
		return borderFillId;
	}

	/**
	 * ������ �׵θ�/��� ��� ���̵� �����Ѵ�.
	 * 
	 * @param borderFillId
	 *            ������ �׵θ�/��� ��� ���̵�
	 */
	public void setBorderFillId(int borderFillId) {
		this.borderFillId = borderFillId;
	}

	/**
	 * ���� �׵θ� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �׵θ� ���� ����
	 */
	public short getLeftBorderSpace() {
		return leftBorderSpace;
	}

	/**
	 * ���� �׵θ� ���� ������ �����Ѵ�.
	 * 
	 * @param leftBorderSpace
	 *            ���� �׵θ� ���� ����
	 */
	public void setLeftBorderSpace(short leftBorderSpace) {
		this.leftBorderSpace = leftBorderSpace;
	}

	/**
	 * ���� �׵θ� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �׵θ� ������ ����
	 */
	public short getRightBorderSpace() {
		return rightBorderSpace;
	}

	/**
	 * ���� �׵θ� ������ ������ �����Ѵ�.
	 * 
	 * @param rightBorderSpace
	 *            ���� �׵θ� ������ ����
	 */
	public void setRightBorderSpace(short rightBorderSpace) {
		this.rightBorderSpace = rightBorderSpace;
	}

	/**
	 * ���� �׵θ� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �׵θ� ���� ����
	 */
	public short getTopBorderSpace() {
		return topBorderSpace;
	}

	/**
	 * ���� �׵θ� ���� ������ �����Ѵ�.
	 * 
	 * @param topBorderSpace
	 *            ���� �׵θ� ���� ����
	 */
	public void setTopBorderSpace(short topBorderSpace) {
		this.topBorderSpace = topBorderSpace;
	}

	/**
	 * ���� �׵θ� �Ʒ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �׵θ� �Ʒ��� ����
	 */
	public short getBottomBorderSpace() {
		return bottomBorderSpace;
	}

	/**
	 * ���� �׵θ� �Ʒ��� ������ �����Ѵ�.
	 * 
	 * @param bottomBorderSpace
	 *            ���� �׵θ� �Ʒ��� ����
	 */
	public void setBottomBorderSpace(short bottomBorderSpace) {
		this.bottomBorderSpace = bottomBorderSpace;
	}

	/**
	 * �ȴ� ����� �Ӽ� 2 ��ü�� ��ȯ�Ѵ�. (5.0.1.7 ���� �̻�)
	 * 
	 * @return �ȴ� ����� �Ӽ� 2 ��ü
	 */
	public ParaShapeProperty2 getProperty2() {
		return property2;
	}

	/**
	 * ���� ����� �Ӽ� 3 ��ü�� ��ȯ�Ѵ�. (5.0.2.5 ���� �̻�)
	 * 
	 * @return ���� ����� �Ӽ� 3 ��ü
	 */
	public ParaShapeProperty3 getProperty3() {
		return property3;
	}

	/**
	 * �� ������ ��ȯ�Ѵ�. (5.0.2.5 ���� �̻�)
	 * 
	 * @return �� ����
	 */
	public long getLineSpace2() {
		return lineSpace2;
	}

	/**
	 * �� ������ �����Ѵ�. (5.0.2.5 ���� �̻�)
	 * 
	 * @param lineSpace2
	 *            �� ����
	 */
	public void setLineSpace2(long lineSpace2) {
		this.lineSpace2 = lineSpace2;
	}
}
