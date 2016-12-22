package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg.ParaLineSeg;
import kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg.LineSegItem;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ������ ���̾ƿ� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForParaLineSeq {
	/**
	 * ������ ���̾ƿ� ���ڵ带 �д´�.
	 * 
	 * @param p
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(Paragraph p, StreamReader sr) throws IOException {
		p.createLineSeg();
		ParaLineSeg pls = p.getLineSeg();
		int count = p.getHeader().getLineAlignCount();
		for (int i = 0; i < count; i++) {
			paraLineSeqItem(pls.addNewLineSegItem(), sr);
		}
	}

	/**
	 * �� ������ ���̾ƿ� ������ �д´�.
	 * 
	 * @param plsi
	 *            �� ������ ���̾ƿ� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void paraLineSeqItem(LineSegItem plsi, StreamReader sr)
			throws IOException {
		plsi.setTextStartPositon(sr.readUInt4());
		plsi.setLineVerticalPosition(sr.readSInt4());
		plsi.setLineHeight(sr.readSInt4());
		plsi.setTextPartHeight(sr.readSInt4());
		plsi.setDistanceBaseLineToLineVerticalPosition(sr.readSInt4());
		plsi.setLineSpace(sr.readSInt4());
		plsi.setStartPositionFromColumn(sr.readSInt4());
		plsi.setSegmentWidth(sr.readSInt4());
		plsi.getTag().setValue(sr.readUInt4());
	}
}
