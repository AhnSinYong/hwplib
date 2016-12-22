package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.ControlEquation;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.eqed.ForEQEdit;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCaption;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCtrlHeaderGso;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlEquation {
	/**
	 * ���� ��Ʈ��
	 */
	private ControlEquation eqed;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;
	/**
	 * ��Ʈ�� ��� ���ڵ��� ����
	 */
	private int ctrlHeaderLevel;

	/**
	 * ������
	 */
	public ForControlEquation() {
	}

	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param eqed
	 *            ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(ControlEquation eqed, StreamReader sr) throws Exception {
		this.eqed = eqed;
		this.sr = sr;
		this.ctrlHeaderLevel = sr.getCurrentRecordHeader().getLevel();

		ctrlHeader();
		caption();

		while (sr.isEndOfStream() == false) {
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				sr.readRecordHeder();
			}

			if (ctrlHeaderLevel >= sr.getCurrentRecordHeader().getLevel()) {
				break;
			}
			readBody();
		}
	}

	/**
	 * ���� ��Ʈ���� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void ctrlHeader() throws IOException {
		ForCtrlHeaderGso.read(eqed.getHeader(), sr);
	}

	/**
	 * ĸ�� ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void caption() throws Exception {
		sr.readRecordHeder();
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.LIST_HEADER) {
			eqed.createCaption();
			ForCaption.read(eqed.getCaption(), sr);
		}
	}

	/**
	 * �̹� ���� ���ڵ� ����� ���� ���ڵ� ������ �д´�.
	 * 
	 * @throws IOException
	 */
	private void readBody() throws IOException {
		switch (sr.getCurrentRecordHeader().getTagID()) {
		case HWPTag.EQEDIT:
			eqEdit();
			break;
		}
	}

	/**
	 * ���� ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void eqEdit() throws IOException {
		ForEQEdit.read(eqed.getEQEdit(), sr);
	}
}
