package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlNewNumber;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderNewNumber;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� ��ȣ ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlNewNumber {
	/**
	 * �� ��ȣ ���� ��Ʈ���� �д´�.
	 * 
	 * @param nwno
	 *            �� ��ȣ ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlNewNumber nwno, StreamReader sr)
			throws IOException {
		ctrlHeader(nwno.getHeader(), sr);
	}

	/**
	 * �� ��ȣ ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            �� ��ȣ ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderNewNumber header, StreamReader sr)
			throws IOException {
		header.getProperty().setValue(sr.readUInt4());
		header.setNumber(sr.readUInt2());
	}
}
