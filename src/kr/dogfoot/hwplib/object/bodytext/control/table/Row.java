package kr.dogfoot.hwplib.object.bodytext.control.table;

import java.util.ArrayList;

/**
 * ǥ�� ���� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class Row {
	/**
	 * �� ����Ʈ
	 */
	private ArrayList<Cell> cellList;

	/**
	 * ������
	 */
	public Row() {
		cellList = new ArrayList<Cell>();
	}

	/**
	 * ���ο� �� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ��ü
	 */
	public Cell addNewCell() {
		Cell c = new Cell();
		cellList.add(c);
		return c;
	}

	/**
	 * �� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ����Ʈ
	 */
	public ArrayList<Cell> getCellList() {
		return cellList;
	}
}
