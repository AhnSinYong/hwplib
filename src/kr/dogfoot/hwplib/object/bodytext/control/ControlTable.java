package kr.dogfoot.hwplib.object.bodytext.control;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeader;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.Caption;
import kr.dogfoot.hwplib.object.bodytext.control.table.Row;
import kr.dogfoot.hwplib.object.bodytext.control.table.Table;

/**
 * ǥ ��Ʈ��
 * 
 * @author neolord
 */
public class ControlTable extends Control {
	/**
	 * ĸ��
	 */
	private Caption caption;
	/**
	 * ǥ ����
	 */
	private Table table;
	/**
	 * �� ����Ʈ
	 */
	private ArrayList<Row> rowList;

	/**
	 * ������
	 */
	public ControlTable() {
		this(new CtrlHeaderGso(ControlType.Table));
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            ��Ʈ�� ���
	 */
	public ControlTable(CtrlHeader header) {
		super(header);

		table = new Table();
		rowList = new ArrayList<Row>();
	}

	/**
	 * �׸��� ��ü �� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü �� ��Ʈ�� ���
	 */
	public CtrlHeaderGso getHeader() {
		return (CtrlHeaderGso) header;
	}

	/**
	 * ĸ�� ��ü�� �����Ѵ�.
	 */
	public void createCaption() {
		caption = new Caption();
	}

	/**
	 * ĸ�� ��ü�� �����Ѵ�.
	 */
	public void deleteCaption() {
		caption = null;
	}

	/**
	 * ĸ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ĸ�� ��ü
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * ǥ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ǥ ���� ��ü
	 */
	public Table getTable() {
		return table;
	}

	/**
	 * ���ο� �� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ��ü
	 */
	public Row addNewRow() {
		Row r = new Row();
		rowList.add(r);
		return r;
	}

	/**
	 * �� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ����Ʈ
	 */
	public ArrayList<Row> getRowList() {
		return rowList;
	}
}
