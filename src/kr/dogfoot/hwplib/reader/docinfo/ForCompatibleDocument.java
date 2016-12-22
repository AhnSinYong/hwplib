package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.CompatibleDocument;
import kr.dogfoot.hwplib.object.docinfo.compatibledocument.CompatibleDocumentSort;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ȣȯ ���� ���ڵ带  �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForCompatibleDocument {
	/**
	 * ȣȯ ���� ������ �д´�.
	 * 
	 * @param cd
	 *            ȣȯ ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(CompatibleDocument cd,
			StreamReader sr) throws IOException {
		cd.setTargetProgream(CompatibleDocumentSort.valueOf((byte) sr.readUInt4()));
	}
}
