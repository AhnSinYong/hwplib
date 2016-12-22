package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.BatangPageInfo;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.ListHeaderForBatangPage;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ������ ������ �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForBatangPageInfo {
	/**
	 * ������ ������ �д´�.
	 * 
	 * @param bpi
	 *            ������ ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(BatangPageInfo bpi, StreamReader sr)
			throws Exception {
		listHeader(bpi.getListHeader(), sr);
		paragraphList(bpi.getParagraphList(), sr);
	}

	/**
	 * �������� ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @param lh
	 *            �������� ���� ����Ʈ ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void listHeader(ListHeaderForBatangPage lh, StreamReader sr)
			throws Exception {
		lh.setParaCount(sr.readSInt4());
		lh.getProperty().setValue(sr.readUInt4());
		lh.setTextWidth(sr.readUInt4());
		lh.setTextHeight(sr.readUInt4());
		sr.skipToEndRecord();
	}

	/**
	 * ���� ����Ʈ�� �д´�.
	 * 
	 * @param paragraphList
	 *            ���� ����Ʈ
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void paragraphList(ParagraphList paragraphList,
			StreamReader sr) throws Exception {
		ForParagraphList.read(paragraphList, sr);
	}

}
