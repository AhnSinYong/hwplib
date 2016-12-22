package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.sectiondefine.SectionDefineHeaderProperty;

/**
 * ���� ���� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderSectionDefine extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private SectionDefineHeaderProperty property;
	/**
	 * ������ ���������� ���� �ٸ� �� ������ ����
	 */
	private int columnGap;
	/**
	 * ���η� �ٸ����� ���� ����
	 */
	private int verticalLineAlign;
	/**
	 * ���η� �ٸ����� ���� ����
	 */
	private int horizontalLineAlign;
	/**
	 * �⺻ �� ����
	 */
	private long defaultTabGap;
	/**
	 * ��ȣ ���� ��� ID
	 */
	private int numberParaShapeId;
	/**
	 * �� ���� ��ȣ
	 */
	private int pageStartNumber;
	/**
	 * �׸� ���� ��ȣ
	 */
	private int imageStartNumber;
	/**
	 * ǥ ���� ��ȣ
	 */
	private int tableStartNumber;
	/**
	 * ���� ���� ��ȣ
	 */
	private int equationStartNumber;
	/**
	 * ��ǥLanguage(5.0.1.5 �̻�)
	 */
	private int defaultLanguage;

	/**
	 * ������
	 */
	public CtrlHeaderSectionDefine() {
		super(ControlType.SectionDefine.getCtrlId());
		property = new SectionDefineHeaderProperty();
	}

	/**
	 * ���� ���� ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��Ʈ���� �Ӽ� ��ü
	 */
	public SectionDefineHeaderProperty getProperty() {
		return property;
	}

	/**
	 * ������ ���������� ���� �ٸ� �� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���������� ���� �ٸ� �� ������ ����
	 */
	public int getColumnGap() {
		return columnGap;
	}

	/**
	 * ������ ���������� ���� �ٸ� �� ������ ������ �����Ѵ�.
	 * 
	 * @param columnGap
	 *            ������ ���������� ���� �ٸ� �� ������ ����
	 */
	public void setColumnGap(int columnGap) {
		this.columnGap = columnGap;
	}

	/**
	 * ���η� �ٸ����� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���η� �ٸ����� ���� ����
	 */
	public int getVerticalLineAlign() {
		return verticalLineAlign;
	}

	/**
	 * ���η� �ٸ����� ���� ���θ� �����Ѵ�.
	 * 
	 * @param verticalLineAlign
	 *            ���η� �ٸ����� ���� ����
	 */
	public void setVerticalLineAlign(int verticalLineAlign) {
		this.verticalLineAlign = verticalLineAlign;
	}

	/**
	 * ���η� �ٸ����� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���η� �ٸ����� ���� ����
	 */
	public int getHorizontalLineAlign() {
		return horizontalLineAlign;
	}

	/**
	 * ���η� �ٸ����� ���� ���θ� �����Ѵ�.
	 * 
	 * @param horizontalLineAlign
	 *            ���η� �ٸ����� ���� ����
	 */
	public void setHorizontalLineAlign(int horizontalLineAlign) {
		this.horizontalLineAlign = horizontalLineAlign;
	}

	/**
	 * �⺻ �� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �⺻ �� ����
	 */
	public long getDefaultTabGap() {
		return defaultTabGap;
	}

	/**
	 * �⺻ �� ������ �����Ѵ�.
	 * 
	 * @param defaultTabGap
	 *            �⺻ �� ����
	 */
	public void setDefaultTabGap(long defaultTabGap) {
		this.defaultTabGap = defaultTabGap;
	}

	/**
	 * ��ȣ ���� ��� ID�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ ���� ��� ID
	 */
	public int getNumberParaShapeId() {
		return numberParaShapeId;
	}

	/**
	 * ��ȣ ���� ��� ID�� �����Ѵ�.
	 * 
	 * @param numberParaShapeId
	 *            ��ȣ ���� ��� ID
	 */
	public void setNumberParaShapeId(int numberParaShapeId) {
		this.numberParaShapeId = numberParaShapeId;
	}

	/**
	 * �� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ȣ
	 */
	public int getPageStartNumber() {
		return pageStartNumber;
	}

	/**
	 * �� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param pageStartNumber
	 *            �� ���� ��ȣ
	 */
	public void setPageStartNumber(int pageStartNumber) {
		this.pageStartNumber = pageStartNumber;
	}

	/**
	 * �ƹ��� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ƹ��� ���� ��ȣ
	 */
	public int getImageStartNumber() {
		return imageStartNumber;
	}

	/**
	 * �ƹ��� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param imageStartNumber
	 *            �ƹ��� ���� ��ȣ
	 */
	public void setImageStartNumber(int imageStartNumber) {
		this.imageStartNumber = imageStartNumber;
	}

	/**
	 * ǥ ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ǥ ���� ��ȣ
	 */
	public int getTableStartNumber() {
		return tableStartNumber;
	}

	/**
	 * ǥ ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param tableStartNumber
	 *            ǥ ���� ��ȣ
	 */
	public void setTableStartNumber(int tableStartNumber) {
		this.tableStartNumber = tableStartNumber;
	}

	/**
	 * ���� ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ȣ
	 */
	public int getEquationStartNumber() {
		return equationStartNumber;
	}

	/**
	 * ���� ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param equationStartNumber
	 *            ���� ���� ��ȣ
	 */
	public void setEquationStartNumber(int equationStartNumber) {
		this.equationStartNumber = equationStartNumber;
	}

	/**
	 * ��ǥLanguage ���� ��ȯ�Ѵ�. (5.0.1.5 �̻�)
	 * 
	 * @return ��ǥLanguage ��
	 */
	public int getDefaultLanguage() {
		return defaultLanguage;
	}

	/**
	 * ��ǥLanguage ���� �����Ѵ�. (5.0.1.5 �̻�)
	 * 
	 * @param defaultLanguage
	 *            ��ǥLanguage ��
	 */
	public void setDefaultLanguage(int defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}
}
