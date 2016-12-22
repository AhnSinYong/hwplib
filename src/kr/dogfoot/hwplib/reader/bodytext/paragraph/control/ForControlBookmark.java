package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import kr.dogfoot.hwplib.object.bodytext.control.ControlBookmark;
import kr.dogfoot.hwplib.object.bodytext.control.bookmark.CtrlData;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * å���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlBookmark {
	/**
	 * å���� ��Ʈ���� �д´�.
	 * 
	 * @param b
	 *            å���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlBookmark b, StreamReader sr)
			throws Exception {
		ctrlData(b.getCtrlData(), sr);
	}

	/**
	 * ��Ʈ�� ������ ���ڵ带 �д´�.
	 * 
	 * @param cd
	 *            ��Ʈ�� ������ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void ctrlData(CtrlData cd, StreamReader sr) throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.CTRL_DATA) {
			byte[] data = new byte[rh.getSize()];
			sr.readBytes(data);
			cd.setData(data);
		}
	}
}
