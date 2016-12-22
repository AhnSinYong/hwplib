package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.Caption;
import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.ListHeaderForCaption;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ĸ�� ������ �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForCaption {
	/**
	 * ĸ�� ������ �д´�.
	 * 
	 * @param caption
	 *            ĸ�� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Caption caption, StreamReader sr) throws Exception {
		listHeader(caption.getListHeader(), sr);
		paragraphList(caption.getParagraphList(), sr);
	}

	/**
	 * ĸ�� ������ ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @param listHeader
	 *            ĸ�� ������ ���� ����Ʈ ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void listHeader(ListHeaderForCaption listHeader,
			StreamReader sr) throws IOException {
		listHeader.setParaCount(sr.readSInt4());
		listHeader.getProperty().setValue(sr.readUInt4());
		listHeader.getCaptionProperty().setValue(sr.readUInt4());
		listHeader.setCaptionWidth(sr.readUInt4());
		listHeader.setSpaceBetweenCaptionAndFrame(sr.readUInt2());
		listHeader.setTextWidth(sr.readUInt4());
		unknown8bytes(sr);
	}

	/**
	 * �˷����� ���� 8 ����Ʈ�� ó���Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknown8bytes(StreamReader sr) throws IOException {
		sr.skip(8);
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
