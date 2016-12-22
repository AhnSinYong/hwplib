package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.eqed;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.equation.EQEdit;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ���� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForEQEdit {
	/**
	 * ���� ���� ���ڵ带 �д´�.
	 * 
	 * @param eqEdit
	 *            ���� ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(EQEdit eqEdit, StreamReader sr) throws IOException {
		eqEdit.setProperty(sr.readUInt4());
		eqEdit.setScript(sr.readUTF16LEString());
		eqEdit.setLetterSize(sr.readUInt4());
		eqEdit.getLetterColor().setColor(sr.readUInt4());
		eqEdit.setBaseLine(sr.readSInt2());
		sr.skip(2); // unknown
		eqEdit.setVersionInfo(sr.readUTF16LEString());
	}

}
