package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlIndexMark;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderIndexMark;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ã�ƺ��� ǥ�� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlIndexMark {
	/**
	 * ã�ƺ��� ǥ�� ��Ʈ���� �д´�.
	 * 
	 * @param idxm
	 *            ã�ƺ��� ǥ�� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlIndexMark idxm, StreamReader sr)
			throws IOException {
		ctrlHeader(idxm.getHeader(), sr);
	}

	/**
	 * ã�ƺ��� ǥ�� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            ã�ƺ��� ǥ�� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderIndexMark header, StreamReader sr)
			throws IOException {
		header.setKeyword1(sr.readUTF16LEString());
		header.setKeyword2(sr.readUTF16LEString());
		sr.skip(4);
	}
}
