package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.PageBorderFill;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� �׵θ�/��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForPageBorderFill {
	/**
	 * �� �׵θ�/��� ���ڵ带 �д´�.
	 * 
	 * @param pbf
	 *            �� �׵θ�/��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(PageBorderFill pbf, StreamReader sr)
			throws IOException {
		pbf.getProperty().setValue(sr.readUInt4());
		pbf.setLeftGap(sr.readUInt2());
		pbf.setRightGap(sr.readUInt2());
		pbf.setTopGap(sr.readUInt2());
		pbf.setBottomGap(sr.readUInt2());
		pbf.setBorderFillId(sr.readUInt2());
	}
}
