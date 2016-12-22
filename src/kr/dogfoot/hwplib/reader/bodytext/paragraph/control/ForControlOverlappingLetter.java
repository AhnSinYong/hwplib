package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlOverlappingLetter;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderOverlappingLetter;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��ħ ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlOverlappingLetter {
	/**
	 * ���� ��ħ ��Ʈ���� �д´�.
	 * 
	 * @param tcps
	 *            ���� ��ħ ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlOverlappingLetter tcps, StreamReader sr)
			throws IOException {
		ctrlHeader(tcps.getHeader(), sr);
	}

	/**
	 * ���� ��ħ ��Ʈ���� ��Ʈ�� ��� ���ڵ��� �д´�.
	 * 
	 * @param header
	 *            ���� ��ħ ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderOverlappingLetter header,
			StreamReader sr) throws IOException {
		overlappingLetters(header, sr);

		header.setBorderType(sr.readUInt1());
		header.setInternalFontSize(sr.readSInt1());
		header.setExpendInsideLetter(sr.readUInt1());

		charShapeIds(header, sr);
	}

	/**
	 * ��ħ ���� �κ��� �д´�.
	 * 
	 * @param header
	 *            ���� ��ħ ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void overlappingLetters(CtrlHeaderOverlappingLetter header,
			StreamReader sr) throws IOException {
		int count = sr.readUInt2();
		for (int i = 0; i < count; i++) {
			String letter = sr.readWChar();
			header.addOverlappingLetter(letter);
		}
	}

	/**
	 * ���� ��� �κ��� �д´�.
	 * 
	 * @param header
	 *            ���� ��ħ ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void charShapeIds(CtrlHeaderOverlappingLetter header,
			StreamReader sr) throws IOException {
		short count = sr.readUInt1();
		for (short i = 0; i < count; i++) {
			long charShapeId = sr.readUInt4();
			header.addCharShapeId(charShapeId);
		}
	}
}
