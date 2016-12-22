package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine.ColumnDefineHeaderProperty;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine.ColumnInfo;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �� ���� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderColumnDefine extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private ColumnDefineHeaderProperty property;
	/**
	 * �� ���� ����
	 */
	private int gapBetweenColumn;
	/**
	 * �Ӽ�2(���� ����)
	 */
	private int property2;
	/**
	 * �� ���� ����Ʈ
	 */
	private ArrayList<ColumnInfo> columnInfoList;
	/**
	 * �� ���м� ����
	 */
	private BorderType divideLineSort;
	/**
	 * �� ���м� ����
	 */
	private BorderThickness divideLineThickness;
	/**
	 * �� ���м� ����
	 */
	private Color4Byte divideLineColor;

	/**
	 * ������
	 */
	public CtrlHeaderColumnDefine() {
		super(ControlType.ColumnDefine.getCtrlId());

		property = new ColumnDefineHeaderProperty();
		columnInfoList = new ArrayList<ColumnInfo>();
		divideLineColor = new Color4Byte();
	}

	/**
	 * �� ���� ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��Ʈ���� �Ӽ� ��ü
	 */
	public ColumnDefineHeaderProperty getProperty() {
		return property;
	}

	/**
	 * �� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ����
	 */
	public int getGapBetweenColumn() {
		return gapBetweenColumn;
	}

	/**
	 * �� ���� ���ݸ� �����Ѵ�.
	 * 
	 * @param gapBetweenColumn
	 *            �� ���� ����
	 */
	public void setGapBetweenColumn(int gapBetweenColumn) {
		this.gapBetweenColumn = gapBetweenColumn;
	}

	/**
	 * �Ӽ�2�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ�2
	 */
	public int getProperty2() {
		return property2;
	}

	/**
	 * �Ӽ�2�� �����Ѵ�.
	 * 
	 * @param property2
	 *            �Ӽ�2
	 */
	public void setProperty2(int property2) {
		this.property2 = property2;
	}

	/**
	 * ���ο� �� ���� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ���� ��ü
	 */
	public ColumnInfo addNewColumnInfo() {
		ColumnInfo ci = new ColumnInfo();
		columnInfoList.add(ci);
		return ci;
	}

	/**
	 * �� ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ����Ʈ
	 */
	public ArrayList<ColumnInfo> getColumnInfoList() {
		return columnInfoList;
	}

	/**
	 * �� ���м� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �� ���м� ����
	 */
	public BorderType getDivideLineSort() {
		return divideLineSort;
	}

	/**
	 * �� ���м� ������ �����Ѵ�.
	 * 
	 * @param divideLineSort
	 *            �� ���м� ����
	 */
	public void setDivideLineSort(BorderType divideLineSort) {
		this.divideLineSort = divideLineSort;
	}

	/**
	 * �� ���м� ���⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �� ���м� ����
	 */
	public BorderThickness getDivideLineThickness() {
		return divideLineThickness;
	}

	/**
	 * �� ���м� ���⸦ �����Ѵ�.
	 * 
	 * @param divideLineThickness
	 *            �� ���м� ����
	 */
	public void setDivideLineThickness(BorderThickness divideLineThickness) {
		this.divideLineThickness = divideLineThickness;
	}

	/**
	 * �� ���м� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���м� ����
	 */
	public Color4Byte getDivideLineColor() {
		return divideLineColor;
	}
}