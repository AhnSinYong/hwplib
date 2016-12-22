package kr.dogfoot.hwplib.reader.bodytext;

import kr.dogfoot.hwplib.object.bodytext.Section;
import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.BatangPageInfo;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd.ForBatangPageInfo;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author �ڼ���
 * 
 */
public class ForSection {
	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param s
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Section s, StreamReader sr) throws Exception {
		ForParagraphList.read(s, sr);
		if (sr.isEndOfStream() == false) {
			lastBatangPageInfo(s.getLastBatangPageInfo(), sr);
		}
	}

	/**
	 * ������ �������� �д´�.
	 * 
	 * @param lastBatangPageInfo ������ ������ ��ü
	 * @param sr ��Ʈ�� ����
	 * @throws Exception 
	 */
	private static void lastBatangPageInfo(BatangPageInfo lastBatangPageInfo,
			StreamReader sr) throws Exception {
		ForBatangPageInfo.read(lastBatangPageInfo, sr);
	}
}
