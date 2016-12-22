package kr.dogfoot.hwplib.reader.bodytext;

import kr.dogfoot.hwplib.object.bodytext.ParagraphListInterface;
import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.ForParagraph;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ����Ʈ�� �д� ��ü
 * 
 * @author neolord
 */
public class ForParagraphList {
	/**
	 * ���� ����Ʈ�� �д´�.
	 * 
	 * @param pli
	 *            ���� ����Ʈ ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ParagraphListInterface pli, StreamReader sr)
			throws Exception {
		ForParagraph fp = new ForParagraph();
		sr.readRecordHeder();
		while (sr.isEndOfStream() == false) {
			Paragraph para = pli.addNewParagraph();
			fp.read(para, sr);
			if (para.getHeader().isLastInList()) {
				break;
			}
		}
	}
}
