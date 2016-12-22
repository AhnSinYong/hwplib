package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlPageNumberPosition;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderPageNumberPosition;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� ��ȣ ��ġ ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlPageNumberPosition {
	/**
	 * �� ��ȣ ��ġ ��Ʈ���� �д´�.
	 * 
	 * @param pgnp
	 *            �� ��ȣ ��ġ ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlPageNumberPosition pgnp, StreamReader sr)
			throws IOException {
		ctrlHeader(pgnp.getHeader(), sr);
	}

	/**
	 * �� ��ȣ ��ġ ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            �� ��ȣ ��ġ ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderPageNumberPosition header,
			StreamReader sr) throws IOException {
		header.getProperty().setValue(sr.readUInt4());
		header.setNumber(sr.readUInt2());
		header.setUserSymbol(sr.readWChar());
		header.setBeforeDecorationLetter(sr.readWChar());
		header.setAfterDecorationLetter(sr.readWChar());
	}
}
