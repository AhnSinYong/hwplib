package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * ����/���� ��� ������ ���� ���ڵ�
 * 
 * @author neolord
 */
public class FootEndNoteShape {
	/**
	 * �Ӽ�
	 */
	private FootNoteShapeProperty property;
	/**
	 * ����� ��ȣ
	 */
	private String userSymbol;
	/**
	 * �� ��� ����
	 */
	private String beforeDecorativeLetter;
	/**
	 * �� ��� ����
	 */
	private String afterDecorativeLetter;
	/**
	 * ���� ��ȣ
	 */
	private int startNumber;
	/**
	 * ���м� ����
	 */
	private long divideLineLength;
	/**
	 * ���м� �� ����
	 */
	private int divideLineTopMargin;
	/**
	 * ���м� �Ʒ� ����
	 */
	private int divideLineBottomMargin;
	/**
	 * �ּ� ���� ����
	 */
	private int betweenNotesMargin;
	/**
	 * ���м� ����
	 */
	private BorderType divideLineSort;
	/**
	 * ���м� ����
	 */
	private BorderThickness divideLineThickness;
	/**
	 * ���м� ����
	 */
	private Color4Byte divideLineColor;

	/**
	 * ������
	 */
	public FootEndNoteShape() {
		property = new FootNoteShapeProperty();
		divideLineColor = new Color4Byte();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public FootNoteShapeProperty getProperty() {
		return property;
	}

	/**
	 * ����� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ��ȣ
	 */
	public String getUserSymbol() {
		return userSymbol;
	}

	/**
	 * ����� ��ȣ�� �����Ѵ�.
	 * 
	 * @param userSymbol
	 *            ����� ��ȣ
	 */
	public void setUserSymbol(String userSymbol) {
		this.userSymbol = userSymbol;
	}

	/**
	 * �� ��� ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��� ����
	 */
	public String getBeforeDecorativeLetter() {
		return beforeDecorativeLetter;
	}

	/**
	 * �� ��� ���ڸ� �����Ѵ�.
	 * 
	 * @param beforeDecorativeLetter
	 *            �� ��� ����
	 */
	public void setBeforeDecorativeLetter(String beforeDecorativeLetter) {
		this.beforeDecorativeLetter = beforeDecorativeLetter;
	}

	/**
	 * �� ��� ���ڸ� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��� ����
	 */
	public String getAfterDecorativeLetter() {
		return afterDecorativeLetter;
	}

	/**
	 * �� ��� ���ڸ� �����Ѵ�.
	 * 
	 * @param afterDecorativeLetter
	 *            �� ��� ����
	 */
	public void setAfterDecorativeLetter(String afterDecorativeLetter) {
		this.afterDecorativeLetter = afterDecorativeLetter;
	}

	/**
	 * ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ȣ
	 */
	public int getStartNumber() {
		return startNumber;
	}

	/**
	 * ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param startNumber
	 *            ���� ��ȣ
	 */
	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	/**
	 * ���м� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ���м� ����
	 */
	public long getDivideLineLength() {
		return divideLineLength;
	}

	/**
	 * ���м� ���̸� �����Ѵ�.
	 * 
	 * @param divideLineLength
	 *            ���м� ����
	 */
	public void setDivideLineLength(long divideLineLength) {
		this.divideLineLength = divideLineLength;
	}

	/**
	 * ���м� �� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���м� �� ������ ũ��
	 */
	public int getDivideLineTopMargin() {
		return divideLineTopMargin;
	}

	/**
	 * ���м� �� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param divideLineTopMargin
	 *            ���м� �� ������ ũ��
	 */
	public void setDivideLineTopMargin(int divideLineTopMargin) {
		this.divideLineTopMargin = divideLineTopMargin;
	}

	/**
	 * ���м� �Ʒ� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���м� �Ʒ� ������ ũ��
	 */
	public int getDivideLineBottomMargin() {
		return divideLineBottomMargin;
	}

	/**
	 * ���м� �Ʒ� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param divideLineBottomMargin
	 *            ���м� �Ʒ� ������ ũ��
	 */
	public void setDivideLineBottomMargin(int divideLineBottomMargin) {
		this.divideLineBottomMargin = divideLineBottomMargin;
	}

	/**
	 * �ּ� ���� ������ ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �ּ� ���� ������ ũ��
	 */
	public int getBetweenNotesMargin() {
		return betweenNotesMargin;
	}

	/**
	 * �ּ� ���� ������ ũ�⸦ �����Ѵ�.
	 * 
	 * @param betweenNotesMargin
	 *            �ּ� ���� ������ ũ��
	 */
	public void setBetweenNotesMargin(int betweenNotesMargin) {
		this.betweenNotesMargin = betweenNotesMargin;
	}

	/**
	 * ���м� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���м� ����
	 */
	public BorderType getDivideLineSort() {
		return divideLineSort;
	}

	/**
	 * ���м� ������ �����Ѵ�.
	 * 
	 * @param divideLineSort
	 *            ���м� ����
	 */
	public void setDivideLineSort(BorderType divideLineSort) {
		this.divideLineSort = divideLineSort;
	}

	/**
	 * ���м� ���⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���м� ����
	 */
	public BorderThickness getDivideLineThickness() {
		return divideLineThickness;
	}

	/**
	 * ���м� ���⸦ �����Ѵ�.
	 * 
	 * @param divideLineThickness
	 *            ���м� ����
	 */
	public void setDivideLineThickness(BorderThickness divideLineThickness) {
		this.divideLineThickness = divideLineThickness;
	}

	/**
	 * ���м� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���м� ���� ��ü
	 */
	public Color4Byte getDivideLineColor() {
		return divideLineColor;
	}
}
