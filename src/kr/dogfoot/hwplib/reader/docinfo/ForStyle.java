package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.Style;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ��Ÿ�� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForStyle {
	/**
	 * ��Ÿ�� ���ڵ带 �д´�.
	 * 
	 * @param s
	 *            ��Ÿ�� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(Style s, StreamReader sr) throws IOException {
		s.setHangulName(sr.readUTF16LEString());
		s.setEnglishName(sr.readUTF16LEString());
		s.getProeprty().setValue(sr.readUInt1());
		s.setNextStyleId(sr.readUInt1());
		s.setLanguageId(sr.readSInt2());
		s.setParaShapeId(sr.readUInt2());
		s.setCharShapeId(sr.readUInt2());
		unknown2Bytes(sr);
	}

	/**
	 * �˷����� ���� 2 ����Ʈ�� ó���Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknown2Bytes(StreamReader sr) throws IOException {
		sr.skip(2);
	}
}
