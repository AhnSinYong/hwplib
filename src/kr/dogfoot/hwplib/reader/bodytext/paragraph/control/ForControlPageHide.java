package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlPageHide;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderPageHide;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���߱� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlPageHide {
	/**
	 * ���߱� ��Ʈ���� �д´�.
	 * 
	 * @param pghd
	 *            ���߱� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlPageHide pghd, StreamReader sr)
			throws IOException {
		ctrlHeader(pghd.getHeader(), sr);
	}

	/**
	 * ���߱� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            ���߱� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderPageHide header, StreamReader sr)
			throws IOException {
		header.getProperty().setValue(sr.readUInt4());
	}
}
