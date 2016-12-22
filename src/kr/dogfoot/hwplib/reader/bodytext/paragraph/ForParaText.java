package kr.dogfoot.hwplib.reader.bodytext.paragraph;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.object.bodytext.paragraph.text.HWPChar;
import kr.dogfoot.hwplib.object.bodytext.paragraph.text.HWPCharControlExtend;
import kr.dogfoot.hwplib.object.bodytext.paragraph.text.HWPCharControlInline;
import kr.dogfoot.hwplib.object.bodytext.paragraph.text.ParaText;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ������ �ؽ�Ʈ ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForParaText {
	/**
	 * ������ �ؽ�Ʈ ���ڵ带 �д´�.
	 * 
	 * @param p
	 *            ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Paragraph p, StreamReader sr) throws Exception {
		p.createText();

		long size = p.getHeader().getCharacterCount() * 2;
		long read = 0;
		while (read < size) {
			read += hwpChar(p.getText(), sr);
		}
	}

	/**
	 * HWP���ڸ� ������ ���� �д´�.
	 * 
	 * @param paraText
	 *            ������ �ؽ�Ʈ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @return ���� byte ��
	 * @throws Exception
	 */
	private static int hwpChar(ParaText paraText, StreamReader sr)
			throws Exception {
		short code = sr.readSInt2();
		switch (HWPChar.type(code)) {
		case ControlChar:
			paraText.addNewCharControlChar().setCode(code);
			return 2;
		case ControlExtend:
			extendChar(paraText.addNewExtendControlChar(), sr);
			return 16;
		case ControlInline:
			inlineChar(paraText.addNewInlineControlChar(), sr);
			return 16;
		case Normal:
			paraText.addNewNormalChar().setCh(shortToString(code));
			return 2;
		}
		return 0;
	}

	/**
	 * 2 byte �����ڵ带 ���ڿ��� ��ȯ�Ѵ�.
	 * 
	 * @param code
	 *            2 byte �����ڵ�
	 * @return ��ȯ�� ���ڿ�
	 * @throws UnsupportedEncodingException
	 */
	private static String shortToString(short code)
			throws UnsupportedEncodingException {
		byte[] ch = new byte[2];
		ch[0] = (byte) (code & 0xff);
		ch[1] = (byte) ((code >> 8) & 0xff);
		return new String(ch, 0, 2, "UTF-16LE");
	}

	/**
	 * Ȯ�� ��Ʈ�� ������ �д´�.
	 * 
	 * @param extendChar
	 *            Ȯ�� ��Ʈ�� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void extendChar(HWPCharControlExtend extendChar,
			StreamReader sr) throws IOException {
		byte[] addition = new byte[12];
		sr.readBytes(addition);
		extendChar.setInstanceId(makeInstanceId(addition));
		sr.skip(2); // code
	}

	/**
	 * Ȯ�� ��Ʈ���� ����Ű�� ��ü�� �ν��Ͻ� ���̵� �����.
	 * 
	 * @param bytes
	 *            ���Ͽ� ����� ���̳ʸ� �迭
	 * @return Ȯ�� ��Ʈ���� ����Ű�� ��ü�� �ν��Ͻ� ���̵�
	 */
	private static String makeInstanceId(byte[] bytes) {
		int bufferIndex = 0;
		boolean insert = false;
		byte[] buf = new byte[bytes.length];
		for (int i = bytes.length - 1; i >= 0; i--) {
			if (bytes[i] != 0) {
				insert = true;
			}

			if (insert == true) {
				buf[bufferIndex++] = bytes[i];
			}
		}

		return new String(buf, 0, bufferIndex);
	}

	/**
	 * �ζ��� ��Ʈ�� ���ڸ� �д´�.
	 * 
	 * @param inlineChar
	 *            �ζ��� ��Ʈ�� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void inlineChar(HWPCharControlInline inlineChar,
			StreamReader sr) throws IOException {
		byte[] addition = new byte[12];
		sr.readBytes(addition);
		inlineChar.setAddition(addition);

		sr.skip(2); // code
	}
}
