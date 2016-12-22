package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlAutoNumber;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderAutoNumber;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ڵ� ��ȣ ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlAutoNumber {
	/**
	 * �ڵ� ��ȣ ��Ʈ���� �д´�.
	 * 
	 * @param an
	 *            �ڵ���ȣ ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlAutoNumber an, StreamReader sr)
			throws IOException {
		ctrlHeader(an.getHeader(), sr);
	}

	/**
	 * �ڵ� ��ȣ ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param h
	 *            �ڵ� ��ȣ ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderAutoNumber h, StreamReader sr)
			throws IOException {
		h.getProperty().setValue(sr.readUInt4());
		h.setNumber(sr.readUInt2());
		h.setUserSymbol(sr.readWChar());
		h.setBeforeDecorationLetter(sr.readWChar());
		h.setAfterDecorationLetter(sr.readWChar());
	}
}
