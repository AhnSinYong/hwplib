package kr.dogfoot.hwplib.reader;

import java.io.IOException;

import kr.dogfoot.hwplib.object.etc.UnknownRecord;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �˼� ���� ���ڵ带 �б� ���� ��ü
 * 
 * @author �ڼ���
 */
public class ForUnknown {
	/**
	 * �˼� ���� ���ڵ带 �д´�.
	 * 
	 * @param unknown
	 *            �� �� ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(UnknownRecord unknown, StreamReader sr)
			throws IOException {
		byte[] body = new byte[unknown.getHeader().getSize()];
		sr.readBytes(body);
		unknown.setBody(body);
	}
}
