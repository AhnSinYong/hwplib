package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.paragraph.header.ParaHeader;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��� ���ڵ带 �д� ��ü
 * 
 * @author neolord
 */
public class ForParaHeader {
	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @param ph
	 *            ���� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ParaHeader ph, StreamReader sr) throws IOException {
		LastInList_TextCount(ph, sr);
		ph.getControlMask().setValue(sr.readUInt4());
		ph.setParaShapeId(sr.readUInt2());
		ph.setStyleId(sr.readUInt1());
		ph.getDivideSort().setValue(sr.readUInt1());
		ph.setCharShapeCount(sr.readUInt2());
		ph.setRangeTagCount(sr.readUInt2());
		ph.setLineAlignCount(sr.readUInt2());
		ph.setInstanceID(sr.readUInt4());
		if (sr.getFileVersion().isOver(5, 0, 3, 2)) {
			ph.setIsMergedByTrack(sr.readUInt2());
		}
	}

	/**
	 * ���� ����Ʈ���� ������ �������� ���ο� ������ ���� ������ �д´�.
	 * 
	 * @param ph
	 *            ���� ��� ���ڵ� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void LastInList_TextCount(ParaHeader ph, StreamReader sr)
			throws IOException {
		long value = sr.readUInt4();
		if ((value & 0x80000000) == 0x80000000) {
			ph.setLastInList(true);
			ph.setCharacterCount(value & 0x7fffffff);
		} else {
			ph.setLastInList(false);
			ph.setCharacterCount(value);
		}
	}
}
