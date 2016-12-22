package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.LayoutCompatibility;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���̾ƿ� ȣȯ ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForLayoutCompatibility {
	/**
	 * ȣȯ ���� ���ڵ带 �д´�.
	 * 
	 * @param lc
	 *            ���̾ƿ� ȣȯ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(LayoutCompatibility lc, StreamReader sr)
			throws IOException {
		lc.setLetterLevelFormat(sr.readUInt4());
		lc.setParagraphLevelFormat(sr.readUInt4());
		lc.setSectionLevelFormat(sr.readUInt4());
		lc.setObjectLevelFormat(sr.readUInt4());
		lc.setFieldLevelFormat(sr.readUInt4());
	}
}
