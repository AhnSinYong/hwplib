package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlSectionDefine;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForBatangPageInfo;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForCtrlHeaderSecd;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForFootEndNoteShape;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForPageBorderFill;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForPageDef;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlSectionDefine {
	/**
	 * ���� ���� ��Ʈ��
	 */
	private ControlSectionDefine secd;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ��Ʈ������� ����
	 */
	private short ctrlHeaderLevel;
	/**
	 * ��/���ָ�� ���ڵ� �ε���
	 */
	private int endFootnoteShapeIndex;
	/**
	 * �� �׵θ�/��� ���ڵ� �ε���
	 */
	private int pageBorderFillIndex;

	/**
	 * ������
	 */
	public ForControlSectionDefine() {
		endFootnoteShapeIndex = 0;
		pageBorderFillIndex = 0;
	}

	/**
	 * ���� ���� ��Ʈ���� �д´�.
	 * 
	 * @param secd
	 *            ���� ���� ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlSectionDefine secd, StreamReader sr)
			throws Exception {
		this.secd = secd;
		this.sr = sr;
		this.ctrlHeaderLevel = sr.getCurrentRecordHeader().getLevel();

		ctrlHeader();

		while (sr.isEndOfStream() == false) {
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				sr.readRecordHeder();
			}

			if (ctrlHeaderLevel >= sr.getCurrentRecordHeader().getLevel()) {
				break;
			}
			readBody();
		}
	}

	/**
	 * ���� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void ctrlHeader() throws IOException {
		ForCtrlHeaderSecd.read(secd.getHeader(), sr);
	}

	/**
	 * �̹� ���� ���ڵ� ����� ���� ���ڵ� ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void readBody() throws Exception {
		switch (sr.getCurrentRecordHeader().getTagID()) {
		case HWPTag.PAGE_DEF:
			pageDef();
			break;
		case HWPTag.FOOTNOTE_SHAPE:
			endFootnoteShapes();
			break;
		case HWPTag.PAGE_BORDER_FILL:
			pageBorderFills();
			break;
		case HWPTag.LIST_HEADER:
			batangPageInfo();
			break;
		}
	}

	/**
	 * ���� ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void pageDef() throws IOException {
		ForPageDef.read(secd.getPageDef(), sr);
	}

	/**
	 * ����/���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void endFootnoteShapes() throws IOException {
		if (endFootnoteShapeIndex == 0) {
			footNoteShape();
		} else if (endFootnoteShapeIndex == 1) {
			endNoteShape();
		}
		endFootnoteShapeIndex++;
	}

	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void footNoteShape() throws IOException {
		ForFootEndNoteShape.read(secd.getFootNoteShape(), sr);
	}

	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void endNoteShape() throws IOException {
		ForFootEndNoteShape.read(secd.getEndNoteShape(), sr);
	}

	/**
	 * �� �׵θ�/��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void pageBorderFills() throws IOException {
		if (pageBorderFillIndex == 0) {
			bothPageBorderFill();
		} else if (pageBorderFillIndex == 1) {
			evenPageBorderFill();
		} else if (pageBorderFillIndex == 2) {
			oddPageBorderFill();
		}

		pageBorderFillIndex++;
	}

	/**
	 * ���� �������� ���� �� �׵θ�/��� ���ڵ带 �д���.
	 * 
	 * @throws IOException
	 */
	private void bothPageBorderFill() throws IOException {
		ForPageBorderFill.read(secd.getBothPageBorderFill(), sr);
	}

	/**
	 * ¦���� �������� ���� �� �׵θ�/��� ���ڵ带 �д���.
	 * 
	 * @throws IOException
	 */
	private void evenPageBorderFill() throws IOException {
		ForPageBorderFill.read(secd.getEvenPageBorderFill(), sr);
	}

	/**
	 * Ȧ���� �������� ���� �� �׵θ�/��� ���ڵ带 �д���.
	 * 
	 * @throws IOException
	 */
	private void oddPageBorderFill() throws IOException {
		ForPageBorderFill.read(secd.getOddPageBorderFill(), sr);
	}

	/**
	 * ������ ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void batangPageInfo() throws Exception {
		ForBatangPageInfo.read(secd.addNewBatangPageInfo(), sr);
	}
}
