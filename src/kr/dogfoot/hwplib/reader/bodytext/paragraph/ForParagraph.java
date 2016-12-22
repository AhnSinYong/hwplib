package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.Control;
import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.ForControl;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.ForControlGso;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ϳ��� ������ �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForParagraph {
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ���� ����� level
	 */
	private short paraHeaderLevel;

	/**
	 * ���� ��ü
	 */
	private Paragraph paragraph;

	/**
	 * ������
	 */
	public ForParagraph() {
	}

	/**
	 * �ϳ��� ������ �д´�.
	 * 
	 * @param paragraph
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(Paragraph paragraph, StreamReader sr) throws Exception {
		if (sr.getCurrentRecordHeader().getTagID() != HWPTag.PARA_HEADER) {
			throw new Exception("This is not paragraph.");
		}

		this.sr = sr;
		this.paragraph = paragraph;
		this.paraHeaderLevel = sr.getCurrentRecordHeader().getLevel();

		paraHeader();
		while (sr.isEndOfStream() == false) {
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				sr.readRecordHeder();
			}
			if (isOutOfParagraph(sr) || isFollowLastBatangPageInfo(sr)) {
				break;
			}
	
			readBody();
		}
	}
	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void paraHeader() throws Exception {
		ForParaHeader.read(paragraph.getHeader(), sr);
	}

	/**
	 * ���� ���ڵ� ����� ���� �ٱ������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param sr ��Ʈ�� ����
	 * @return ���� ���ڵ� ����� ���� �ٱ������� ����
	 */
	private boolean isOutOfParagraph(StreamReader sr) {
		return this.paraHeaderLevel >= sr.getCurrentRecordHeader().getLevel();
	}

	/**
	 * ������ ������ ������ �ڿ� �پ� �ִ��� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @return ������ ������ ������ �ڿ� �پ� �ִ��� ����
	 */
	private boolean isFollowLastBatangPageInfo(StreamReader sr) {
		return this.paraHeaderLevel == 0
				&& sr.getCurrentRecordHeader().getTagID() == HWPTag.LIST_HEADER
				&& sr.getCurrentRecordHeader().getLevel() == 1;
	}


	/**
	 * �̹� ���� ���ڵ� ����� ���� ���ڵ� ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void readBody() throws Exception {
		switch (sr.getCurrentRecordHeader().getTagID()) {
		case HWPTag.PARA_TEXT:
			paraText();
			break;
		case HWPTag.PARA_CHAR_SHAPE:
			paraCharShape();
			break;
		case HWPTag.PARA_LINE_SEG:
			paraLineSeg();
			break;
		case HWPTag.PARA_RANGE_TAG:
			paraRangeTag();
			break;
		case HWPTag.CTRL_HEADER:
			control();
			break;
		}
	}

	/**
	 * ������ �ؽ�Ʈ ���ڵ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void paraText() throws Exception {
		ForParaText.read(paragraph, sr);
	}

	/**
	 * ������ ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void paraCharShape() throws IOException {
		ForParaCharShape.read(paragraph, sr);
	}

	/**
	 * ������ ���̾ƿ� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void paraLineSeg() throws IOException {
		ForParaLineSeq.read(paragraph, sr);
	}

	/**
	 * ������ ���� �±� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void paraRangeTag() throws Exception {
		ForParaRangeTag.read(paragraph, sr, sr.getCurrentRecordHeader()
				.getSize());
	}

	/**
	 * ���ܿ� ���Ե� ��Ʈ���� �д´�.
	 * 
	 * @throws Exception
	 */
	private void control() throws Exception {
		long id = sr.readUInt4();
		if (id == ControlType.Gso.getCtrlId()) {
			ForControlGso fgc = new ForControlGso();
			fgc.read(paragraph, sr);
		} else {
			Control c = paragraph.addNewControl(id);
			ForControl.read(c, sr);
		}
	}


}
