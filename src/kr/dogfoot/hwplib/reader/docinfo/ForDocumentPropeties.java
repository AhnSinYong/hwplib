package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.DocumentPropeties;
import kr.dogfoot.hwplib.object.docinfo.documentproperties.CaretPosition;
import kr.dogfoot.hwplib.object.docinfo.documentproperties.StartNumber;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� �Ӽ� ���ڵ带 �б� ���� ��ü.
 * 
 * @author neolord
 */
public class ForDocumentPropeties {
	/**
	 * ���� �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param dp
	 *            ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(DocumentPropeties dp,
			StreamReader sr) throws IOException {
		property(dp, sr);
		startNumber(dp.getStartNumber(), sr);
		caretPosition(dp.getCurrentPosition(), sr);
	}

	/**
	 * �Ӽ� �κ��� �д´�.
	 * 
	 * @param dp
	 *            ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void property(DocumentPropeties dp,
			StreamReader sr) throws IOException {
		dp.setSectionCount(sr.readUInt2());
	}

	/**
	 * ���� ��ȣ �κ��� �д´�.
	 * 
	 * @param sn
	 *            ���� ��ȣ �κ� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void startNumber(StartNumber sn,
			StreamReader sr) throws IOException {
		sn.setPage(sr.readUInt2());
		sn.setFootnote(sr.readUInt2());
		sn.setEndnote(sr.readUInt2());
		sn.setPicture(sr.readUInt2());
		sn.setTable(sr.readUInt2());
		sn.setEquation(sr.readUInt2());
	}

	/**
	 * ĳ�� ��ġ �κ��� �д´�.
	 * 
	 * @param cp
	 *            ĳ�� ��ġ �κ��� ���³��� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void caretPosition(CaretPosition cp,
			StreamReader sr) throws IOException {
		cp.setListID(sr.readUInt4());
		cp.setParagraphID(sr.readUInt4());
		cp.setPositionInParagraph(sr.readUInt4());
	}
}
