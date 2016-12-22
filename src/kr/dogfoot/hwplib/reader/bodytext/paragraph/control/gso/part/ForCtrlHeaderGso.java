package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.util.binary.BitFlag;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׸��� ��ü�� ��Ʈ�� ��� ���ڵ带 �д´�.
 * 
 * @author neolord
 */
public class ForCtrlHeaderGso {
	/**
	 * �׸��� ��ü�� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param header
	 *            �׸��� ��ü�� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(CtrlHeaderGso header, StreamReader sr)
			throws IOException {
		header.getProperty().setValue(sr.readUInt4());
		header.setyOffset(sr.readUInt4());
		header.setxOffset(sr.readUInt4());
		header.setWidth(sr.readUInt4());
		header.setHeight(sr.readUInt4());
		header.setzOrder(sr.readSInt4());
		header.setOutterMarginLeft(sr.readUInt2());
		header.setOutterMarginRight(sr.readUInt2());
		header.setOutterMarginTop(sr.readUInt2());
		header.setOutterMarginBottom(sr.readUInt2());
		header.setInstanceId(sr.readUInt4());
		int temp = sr.readSInt4();
		header.setPreventPageDivide(BitFlag.get(temp, 0));
		header.setExplanation(sr.readUTF16LEString());
	}
}
