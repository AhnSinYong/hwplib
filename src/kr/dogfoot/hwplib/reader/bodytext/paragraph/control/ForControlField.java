package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlField;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderField;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ʵ� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlField {
	/**
	 * �ʵ� ��Ʈ���� �д´�.
	 * 
	 * @param field
	 *            �ʵ� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlField field, StreamReader sr)
			throws IOException {
		ctrlHeader(field.getHeader(), sr);
	}

	/**
	 * �ʵ� ��Ʈ���� ��Ʈ�� ��� ���ڵ��� �д´�.
	 * 
	 * @param h
	 *            �ʵ� ��Ʈ���� ��Ʈ�� ���
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderField h, StreamReader sr)
			throws IOException {
		h.getProperty().setValue(sr.readUInt4());
		h.setEtcProperty(sr.readUInt1());
		h.setCommand(sr.readUTF16LEString());
		h.setInstanceId(sr.readUInt4());

		unknown4Bytes(sr);
	}

	/**
	 * �˷����� ���� 4 byte�� ó���Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknown4Bytes(StreamReader sr) throws IOException {
		sr.skip(4);
	}
}
