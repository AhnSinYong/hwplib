package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.tbl;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.table.Cell;
import kr.dogfoot.hwplib.object.bodytext.control.table.ListHeaderForCell;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ǥ�� ���� �б� ���� ��ü
 * 
 * @author �ڼ���
 * 
 */
public class ForCell {
	/**
	 * ǥ�� ���� �д´�.
	 * 
	 * @param cell
	 *            ǥ�� ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Cell cell, StreamReader sr) throws Exception {
		if (sr.isImmediatelyAfterReadingHeader() == false) {
			sr.readRecordHeder();
		}
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.LIST_HEADER) {
			listHeader(cell.getListHeader(), sr);
		} else {
			throw new Exception("cell's list header does not exist.");
		}
		ForParagraphList.read(cell.getParagraphList(), sr);
	}

	/**
	 * ���� ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @param lh
	 *            ���� ���� ����Ʈ ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void listHeader(ListHeaderForCell lh, StreamReader sr)
			throws IOException {
		lh.setParaCount(sr.readSInt4());
		lh.getProperty().setValue(sr.readUInt4());
		lh.setColIndex(sr.readUInt2());
		lh.setRowIndex(sr.readUInt2());
		lh.setColSpan(sr.readUInt2());
		lh.setRowSpan(sr.readUInt2());
		lh.setWidth(sr.readUInt4());
		lh.setHeight(sr.readUInt4());
		lh.setLeftMargin(sr.readUInt2());
		lh.setRightMargin(sr.readUInt2());
		lh.setTopMargin(sr.readUInt2());
		lh.setBottomMargin(sr.readUInt2());
		lh.setBorderFillId(sr.readUInt2());
		lh.setTextWidth(sr.readUInt4());
		short flag = sr.readUInt1();
		if (flag == 0xff) {
			unknownBytes(10, sr);
			lh.setFieldName(sr.readUTF16LEString());
			unknownBytes(8, sr);
		} else {
			unknownBytes(8, sr);
		}
	}

	/**
	 * �˷����� ���� n ����Ʈ�� ó���Ѵ�.
	 * 
	 * @param n
	 *            �˷����� ���� ����Ʈ ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknownBytes(int n, StreamReader sr) throws IOException {
		sr.skip(n);
	}
}
