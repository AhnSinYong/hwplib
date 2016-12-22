package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlHeader;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.header.HeaderFooterApplyPage;
import kr.dogfoot.hwplib.object.bodytext.control.headerfooter.ListHeaderForHeaderFooter;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �Ӹ��� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlHeader {
	/**
	 * �Ӹ��� ��Ʈ��
	 */
	private ControlHeader head;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ������
	 */
	public ForControlHeader() {
	}

	/**
	 * �Ӹ��� ��Ʈ���� �д´�.
	 * 
	 * @param head
	 *            �Ӹ��� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlHeader head, StreamReader sr) throws Exception {
		this.head = head;
		this.sr = sr;

		ctrlHeader();
		listHeader();
		paragraphList();
	}

	/**
	 * �Ӹ��� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void ctrlHeader() throws IOException {
		head.getHeader().setApplyPage(
				HeaderFooterApplyPage.valueOf((byte) sr.readUInt4()));
		head.getHeader().setCreateIndex(sr.readSInt4());
	}

	/**
	 * �Ӹ��� ��Ʈ���� ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void listHeader() throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			ListHeaderForHeaderFooter lh = head.getListHeader();
			lh.setParaCount(sr.readSInt4());
			lh.getProperty().setValue(sr.readUInt4());
			lh.setTextWidth(sr.readUInt4());
			lh.setTextHeight(sr.readUInt4());
			sr.skipToEndRecord();
		} else {
			throw new Exception("List header must be located.");
		}
	}

	/**
	 * ���� ����Ʈ�� �д´�.
	 * 
	 * @throws Exception
	 */
	private void paragraphList() throws Exception {
		ForParagraphList.read(head.getParagraphList(), sr);
	}
}
