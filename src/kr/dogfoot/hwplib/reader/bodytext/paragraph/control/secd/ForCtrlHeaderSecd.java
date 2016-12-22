package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderSectionDefine;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForCtrlHeaderSecd {
	/**
	 * ���� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            ���� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(CtrlHeaderSectionDefine header, StreamReader sr)
			throws IOException {
		header.getProperty().setValue(sr.readUInt4());
		header.setColumnGap(sr.readUInt2());
		header.setVerticalLineAlign(sr.readUInt2());
		header.setHorizontalLineAlign(sr.readUInt2());
		header.setDefaultTabGap(sr.readUInt4());
		header.setNumberParaShapeId(sr.readUInt2());
		header.setPageStartNumber(sr.readUInt2());
		header.setImageStartNumber(sr.readUInt2());
		header.setTableStartNumber(sr.readUInt2());
		header.setEquationStartNumber(sr.readUInt2());
		if (sr.getFileVersion().isOver(5, 0, 1, 2)) {
			header.setDefaultLanguage(sr.readUInt2());
		}
		unknown8Bytes(sr);
	}

	/**
	 * �ӷ����� ���� 8 bytes�� ó���Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknown8Bytes(StreamReader sr) throws IOException {
		sr.skip(8);
	}
}
