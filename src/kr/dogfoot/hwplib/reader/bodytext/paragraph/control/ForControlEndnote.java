package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlEndnote;
import kr.dogfoot.hwplib.object.bodytext.control.footnoteendnote.ListHeaderForFootnodeEndnote;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlEndnote {
	/**
	 * ���� ��Ʈ��
	 */
	private ControlEndnote en;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ������
	 */
	public ForControlEndnote() {
	}

	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param en
	 *            ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlEndnote en, StreamReader sr) throws Exception {
		this.en = en;
		this.sr = sr;

		ctrlHeader();
		listHeader();
		paragraphList();
	}

	/**
	 * ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void ctrlHeader() throws IOException {
		en.getHeader().setNumber(sr.readUInt4());
		sr.skipToEndRecord();
	}

	/**
	 * ���� ��Ʈ���� ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void listHeader() throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			ListHeaderForFootnodeEndnote lh = en.getListHeader();
			lh.setParaCount(sr.readSInt4());
			lh.getProperty().setValue(sr.readUInt4());
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
		ForParagraphList.read(en.getParagraphList(), sr);
	}
}
