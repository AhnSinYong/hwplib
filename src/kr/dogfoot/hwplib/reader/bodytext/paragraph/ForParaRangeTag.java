package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.object.bodytext.paragraph.rangetag.ParaRangeTag;
import kr.dogfoot.hwplib.object.bodytext.paragraph.rangetag.RangeTagItem;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ������ ���� �ױ� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForParaRangeTag {
	/**
	 * ������ ���� �±� ���ڵ带 �д´�.
	 * 
	 * @param p
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @param size
	 *            ���ڵ� ũ��
	 * @throws Exception
	 */
	public static void read(Paragraph p, StreamReader sr, short size)
			throws Exception {
		p.createRangeTag();
		ParaRangeTag prt = p.getRangeTag();

		int count = size / 12;
		for (int index = 0; index < count; index++) {
			RangeTagItem rti = prt.addNewRangeTagItem();
			rti.setRangeStart(sr.readUInt4());
			rti.setRangeEnd(sr.readUInt4());
			tag(rti, sr);
		}
	}

	/**
	 * ���� �±� �������� ���� �κ��� �д´�.
	 * 
	 * @param rti
	 *            ���� �±� ������
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 * @throws Exception
	 */
	private static void tag(RangeTagItem rti, StreamReader sr)
			throws IOException, Exception {
		byte[] data = new byte[3];
		sr.readBytes(data);
		rti.setData(data);
		rti.setSort(sr.readUInt1());
	}
}
