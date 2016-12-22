package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.TabDef;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.object.docinfo.tabdef.TabInfo;
import kr.dogfoot.hwplib.object.docinfo.tabdef.TabSort;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� ���� ���ڵ带 �д´�.
 * 
 * @author neolord
 */
public class ForTabDef {
	/**
	 * �� ���� ���ڵ带 �д´�.
	 * 
	 * @param td
	 *            �� ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(TabDef td, StreamReader sr) throws IOException {
		td.getProperty().setValue(sr.readUInt4());
		long tabInfoCount = sr.readUInt4();
		if (tabInfoCount > 0) {
			tabInfos(td, sr, tabInfoCount);
		}
	}

	/**
	 * �� ���� �κ��� �д´�.
	 * 
	 * @param td
	 *            �� ���� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @param tabInfoCount
	 *            �� ������ ����
	 * @throws IOException
	 */
	private static void tabInfos(TabDef td, StreamReader sr, long tabInfoCount)
			throws IOException {
		for (long i = 0; i < tabInfoCount; i++) {
			TabInfo ti = td.addNewTabInfo();
			ti.setPosition(sr.readUInt4());
			ti.setTabSort(TabSort.valueOf((byte) sr.readUInt1()));
			ti.setFillSort(BorderType.valueOf((byte) sr.readUInt1()));
			sr.skip(2); // reserved
		}
	}
}
