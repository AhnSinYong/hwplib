package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;
import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ControlTable;
import kr.dogfoot.hwplib.object.bodytext.control.table.Cell;
import kr.dogfoot.hwplib.object.bodytext.control.table.Row;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCaption;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCtrlHeaderGso;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.tbl.ForCell;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.tbl.ForTable;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ǥ ��Ʈ���� �б� ���� ��ü
 * 
 * @author �ڼ���
 */
public class ForControlTable {
	/**
	 * ǥ ��Ʈ��
	 */
	private ControlTable table;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ������
	 */
	public ForControlTable() {
	}

	/**
	 * ǥ ��Ʈ���� �д´�.
	 * 
	 * @param table
	 *            ǥ ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlTable table, StreamReader sr) throws Exception {
		this.table = table;
		this.sr = sr;

		ctrlHeader();
		caption();
		table();
		rows();
	}

	/**
	 * ǥ ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void ctrlHeader() throws IOException {
		ForCtrlHeaderGso.read(table.getHeader(), sr);
	}

	/**
	 * ĸ�� ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void caption() throws Exception {
		sr.readRecordHeder();
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.LIST_HEADER) {
			table.createCaption();
			ForCaption.read(table.getCaption(), sr);
		}
	}

	/**
	 * ǥ ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void table() throws IOException {
		if (sr.isImmediatelyAfterReadingHeader() == false) {
			sr.readRecordHeder();
		}
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.TABLE) {
			ForTable.read(table.getTable(), sr);
		}
	}

	/**
	 * ����� �д´�.
	 * 
	 * @throws Exception
	 */
	private void rows() throws Exception {
		int rowCount = table.getTable().getRowCount();
		ArrayList<Integer> cellCountOfRow = table.getTable()
				.getCellCountOfRowList();
		for (int rowIndex = 0; rowIndex < rowCount; rowIndex++) {
			Row r = table.addNewRow();
			row(r, cellCountOfRow.get(rowIndex));
		}
	}

	/**
	 * �ϳ��� �� �ȿ� ������ �д´�.
	 * 
	 * @param r
	 *            ��
	 * @param cellCount
	 *            �࿡ ���Ե� �� ����
	 * @throws Exception
	 */
	private void row(Row r, int cellCount) throws Exception {
		for (int cellIndex = 0; cellIndex < cellCount; cellIndex++) {
			Cell c = r.addNewCell();
			ForCell.read(c, sr);
		}
	}
}
