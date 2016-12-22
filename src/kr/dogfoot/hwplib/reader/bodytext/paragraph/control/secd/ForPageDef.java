package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.secd;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.PageDef;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ���� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForPageDef {
	/**
	 * ���� ���� ���ڵ带 �д´�.
	 * 
	 * @param pd
	 *            ���� ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(PageDef pd, StreamReader sr)
			throws IOException {
		pd.setPaperWidth(sr.readUInt4());
		pd.setPaperHeight(sr.readUInt4());
		pd.setLeftMargin(sr.readUInt4());
		pd.setRightMargin(sr.readUInt4());
		pd.setTopMargin(sr.readUInt4());
		pd.setBottomMargin(sr.readUInt4());
		pd.setHeaderMargin(sr.readUInt4());
		pd.setFooterMargin(sr.readUInt4());
		pd.setGutterMargin(sr.readUInt4());
		pd.getProperty().setValue(sr.readUInt4());
	}
}
