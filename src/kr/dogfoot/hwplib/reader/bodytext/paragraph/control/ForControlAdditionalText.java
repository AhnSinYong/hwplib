package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlAdditionalText;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderAdditionalText;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.additionaltext.AdditionalTextPosition;
import kr.dogfoot.hwplib.object.docinfo.parashape.Alignment;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlAdditionalText {
	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param at
	 *            ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlAdditionalText at, StreamReader sr)
			throws IOException {
		ctrlHeader(at.getHeader(), sr);
	}

	/**
	 * ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @param h
	 *            ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void ctrlHeader(CtrlHeaderAdditionalText h, StreamReader sr)
			throws IOException {
		h.setMainText(sr.readUTF16LEString());
		h.setSubText(sr.readUTF16LEString());
		h.setPosition(AdditionalTextPosition.valueOf((byte) sr.readUInt4()));
		h.setFsizeratio(sr.readUInt4());
		h.setOption(sr.readUInt4());
		h.setStyleId(sr.readUInt4());
		h.setAlignment(Alignment.valueOf((byte) sr.readUInt4()));
	}
}
