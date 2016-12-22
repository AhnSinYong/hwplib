package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.FootEndNoteShape;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ����/���� ��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForFootEndNoteShape {
	/**
	 * ����/���� ��� ���ڵ带 �д´�.
	 * 
	 * @param fens
	 *            ����/���� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(FootEndNoteShape fens, StreamReader sr)
			throws IOException {
		fens.getProperty().setValue(sr.readUInt4());
		fens.setUserSymbol(sr.readWChar());
		fens.setBeforeDecorativeLetter(sr.readWChar());
		fens.setAfterDecorativeLetter(sr.readWChar());
		fens.setStartNumber(sr.readUInt2());
		fens.setDivideLineLength(sr.readUInt4());
		fens.setDivideLineTopMargin(sr.readUInt2());
		fens.setDivideLineBottomMargin(sr.readUInt2());
		fens.setBetweenNotesMargin(sr.readUInt2());
		fens.setDivideLineSort(BorderType.valueOf((byte) sr
				.readUInt1()));
		fens.setDivideLineThickness(BorderThickness.valueOf((byte) sr
				.readUInt1()));
		fens.getDivideLineColor().setColor(sr.readUInt4());
	}

}
