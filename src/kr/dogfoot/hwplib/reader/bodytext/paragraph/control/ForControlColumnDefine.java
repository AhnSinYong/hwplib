package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlColumnDefine;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderColumnDefine;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine.ColumnInfo;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlColumnDefine {
	/**
	 * �� ���� ��Ʈ���� �д´�.
	 * 
	 * @param cd
	 *            �� ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlColumnDefine cd, StreamReader sr)
			throws IOException {
		ctrlHeader(cd.getHeader(), sr);
	}

	/**
	 * �� ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param h
	 *            �� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderColumnDefine h, StreamReader sr)
			throws IOException {
		h.getProperty().setValue(sr.readUInt2());

		int count = h.getProperty().getColumnCount();
		boolean sameWidth = h.getProperty().isSameWidth();
		if (count < 2 || sameWidth == true) {
			h.setGapBetweenColumn(sr.readUInt2());
			h.setProperty2(sr.readUInt2());
		} else {
			columnInfos(h, sr);
		}

		h.setDivideLineSort(BorderType.valueOf((byte) sr.readUInt1()));
		h.setDivideLineThickness(BorderThickness.valueOf((byte) sr.readUInt1()));
		h.getDivideLineColor().setColor(sr.readUInt4());
	}

	/**
	 * �� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ��� �� ���� �κи� �д´�.
	 * 
	 * @param h
	 *            �� ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void columnInfos(CtrlHeaderColumnDefine h, StreamReader sr)
			throws IOException {
		int count = h.getProperty().getColumnCount();
		for (int index = 0; index < count; index++) {
			ColumnInfo ci = h.addNewColumnInfo();
			ci.setWidth(sr.readUInt2());
			ci.setGap(sr.readUInt2());
		}
	}
}
