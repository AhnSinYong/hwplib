package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.FaceName;
import kr.dogfoot.hwplib.object.docinfo.facename.FontTypeInfo;
import kr.dogfoot.hwplib.object.docinfo.facename.FontType;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �۲� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForFaceName {
	/**
	 * �۲� ���ڵ带 �д´�.
	 * 
	 * @param fn
	 *            �۲� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(FaceName fn, StreamReader sr) throws IOException {
		fn.getProperty().setValue(sr.readUInt1());
		fn.setName(sr.readUTF16LEString());

		if (fn.getProperty().hasSubstituteFont()) {
			substituteFontInfo(fn, sr);
		}

		if (fn.getProperty().hasFontInfo()) {
			fontTypeInfo(fn.getFontTypeInfo(), sr);
		}

		if (fn.getProperty().hasBaseFont()) {
			fn.setBaseFontName(sr.readUTF16LEString());
		}
	}

	/**
	 * ��ü �۲� ���� �κ��� �д´�.
	 * 
	 * @param fn
	 *            ��ü �۲� ���� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void substituteFontInfo(FaceName fn, StreamReader sr)
			throws IOException {
		FontType substituteFontType = FontType.valueOf((byte) sr.readUInt1());
		fn.setSubstituteFontType(substituteFontType);
		fn.setSubstituteFontName(sr.readUTF16LEString());
	}

	/**
	 * �۲� ���� ���� �κ��� �д´�.
	 * 
	 * @param fti
	 *            �۲� ���� ���� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void fontTypeInfo(FontTypeInfo fti, StreamReader sr)
			throws IOException {
		fti.setFontType(sr.readUInt1());
		fti.setSerifType(sr.readUInt1());
		fti.setThickness(sr.readUInt1());
		fti.setRatio(sr.readUInt1());
		fti.setContrast(sr.readUInt1());
		fti.setStrokeDeviation(sr.readUInt1());
		fti.setCharacterStrokeType(sr.readUInt1());
		fti.setCharacterShape(sr.readUInt1());
		fti.setMiddleLine(sr.readUInt1());
		fti.setxHeight(sr.readUInt1());
	}
}
