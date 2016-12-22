package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ������ ���� ��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForParaCharShape {
	/**
	 * ������ ���� ��� ���ڵ带 �д´�.
	 * 
	 * @param paragraph
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(Paragraph paragraph, StreamReader sr)
			throws IOException {
		paragraph.createCharShape();

		int count = paragraph.getHeader().getCharShapeCount();
		for (int i = 0; i < count; i++) {
			long position = sr.readUInt4();
			long charShapeId = sr.readUInt4();

			paragraph.getCharShape().addParaCharShape(position, charShapeId);
		}
	}
}
