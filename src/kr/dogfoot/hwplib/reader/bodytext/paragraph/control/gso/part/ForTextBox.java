package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.ListHeaderForTextBox;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;
import kr.dogfoot.hwplib.object.bodytext.paragraph.ParagraphList;
import kr.dogfoot.hwplib.reader.bodytext.ForParagraphList;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ۻ��ڸ� �д´�.
 * 
 * @author neolord
 */
public class ForTextBox {
	/**
	 * �ۻ��ڸ� �д´�.
	 * 
	 * @param textBox
	 *            �ۻ���
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(TextBox textBox, StreamReader sr) throws Exception {
		listHeader(textBox.getListHeader(), sr);
		paragraphList(textBox.getParagraphList(), sr);
	}

	/**
	 * �ۻ����� ���� ����Ʈ ��� ���ڵ带 �д´�.
	 * 
	 * @param lh
	 *            �ۻ����� ���� ����Ʈ ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void listHeader(ListHeaderForTextBox lh, StreamReader sr)
			throws IOException {
		lh.setParaCount(sr.readSInt4());
		lh.getProperty().setValue(sr.readUInt4());
		lh.setLeftMargin(sr.readUInt2());
		lh.setRightMargin(sr.readUInt2());
		lh.setTopMargin(sr.readUInt2());
		lh.setBottomMargin(sr.readUInt2());
		lh.setTextWidth(sr.readUInt4());
		unknownBytes(8, sr);
		int temp = sr.readSInt4();
		if (temp == 1) {
			lh.setEditableAtFormMode(true);
		} else {
			lh.setEditableAtFormMode(false);
		}
		short temp2 = sr.readUInt1();
		if (temp2 == 0xff) {
			unknownBytes(10, sr);
			lh.setFieldName(sr.readUTF16LEString());
		}
	}

	/**
	 * �˷����� ���� n ����ƮƲ ó���Ѵ�.
	 * 
	 * @param n
	 *            �˷����� ���� ����Ʈ ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknownBytes(int n, StreamReader sr) throws IOException {
		sr.skip(n);
	}

	/**
	 * ���� ����Ʈ�� �д´�.
	 * 
	 * @param paragraphList
	 *            ���� ����Ʈ
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void paragraphList(ParagraphList paragraphList,
			StreamReader sr) throws Exception {
		ForParagraphList.read(paragraphList, sr);
	}

}
