package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import kr.dogfoot.hwplib.object.bodytext.control.ControlHiddenComment;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlHiddenComment {
	/**
	 * ���� ���� ��Ʈ��
	 */
	private ControlHiddenComment tcmt;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ������
	 */
	public ForControlHiddenComment() {
	}

	/**
	 * ���� ���� ��Ʈ���� �д´�.
	 * 
	 * @param tcmt
	 *            ���� ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlHiddenComment tcmt, StreamReader sr)
			throws Exception {
		this.tcmt = tcmt;
		this.sr = sr;

		listHeader();
		paragraphList();
	}

	/**
	 * ���� ���� ��Ʈ���� ���� ����Ʈ ��� ���ڵ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void listHeader() throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			tcmt.getListHeader().setParaCount(sr.readSInt4());
			tcmt.getListHeader().getProperty().setValue(sr.readUInt4());
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
		ForParagraphList.read(tcmt.getParagraphList(), sr);
	}
}
