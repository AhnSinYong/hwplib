package kr.dogfoot.hwplib.reader.docinfo;

import kr.dogfoot.hwplib.object.docinfo.CharShape;
import kr.dogfoot.hwplib.object.docinfo.charshape.CharOffsets;
import kr.dogfoot.hwplib.object.docinfo.charshape.CharSpaces;
import kr.dogfoot.hwplib.object.docinfo.charshape.FaceNameIds;
import kr.dogfoot.hwplib.object.docinfo.charshape.Ratios;
import kr.dogfoot.hwplib.object.docinfo.charshape.RelativeSizes;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForCharShape {
	/**
	 * ���� ����� �д´�.
	 * 
	 * @param cs
	 *            ���� ��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(CharShape cs, StreamReader sr) throws Exception {
		faceNameIds(cs.getFaceNameIds(), sr);
		ratios(cs.getRatios(), sr);
		charSpaces(cs.getCharSpaces(), sr);
		relativeSizes(cs.getRelativeSizes(), sr);
		charPositions(cs.getCharOffsets(), sr);

		cs.setBaseSize(sr.readSInt4());
		cs.getProperty().setValue(sr.readUInt4());
		cs.setShadowGap1(sr.readSInt1());
		cs.setShadowGap2(sr.readSInt1());
		cs.getCharColor().setColor(sr.readUInt4());
		cs.getUnderLineColor().setColor(sr.readUInt4());
		cs.getShadeColor().setColor(sr.readUInt4());
		cs.getShadowColor().setColor(sr.readUInt4());

		if (sr.getFileVersion().isOver(5, 0, 2, 1)) {
			cs.setBorderFillId(sr.readUInt2());
		}
		if (sr.getFileVersion().isOver(5, 0, 3, 0)) {
			cs.getStrikeLineColor().setColor(sr.readUInt4());
		}
	}

	/**
	 * �� �۲�ID �κ��� �д´�.
	 * 
	 * @param fnis
	 *            �� �۲�ID �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void faceNameIds(FaceNameIds fnis, StreamReader sr)
			throws Exception {
		int[] array = new int[7];
		for (int i = 0; i < 7; i++) {
			array[i] = sr.readUInt2();
		}
		fnis.setArray(array);
	}

	/**
	 * �� ���� �κ��� �д´�.
	 * 
	 * @param rs
	 *            �� ���� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void ratios(Ratios rs, StreamReader sr) throws Exception {
		short[] array = new short[7];
		for (int i = 0; i < 7; i++) {
			array[i] = sr.readUInt1();
		}
		rs.setArray(array);
	}

	/**
	 * �� �ڰ� �κ��� �д´�.
	 * 
	 * @param css
	 *            �� �ڰ� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void charSpaces(CharSpaces css, StreamReader sr)
			throws Exception {
		byte[] array = new byte[7];
		for (int i = 0; i < 7; i++) {
			array[i] = sr.readSInt1();
		}
		css.setArray(array);
	}

	/**
	 * �� ��� ũ�� �κ��� �д´�.
	 * 
	 * @param rss
	 *            �� ��� ũ���� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void relativeSizes(RelativeSizes rss, StreamReader sr)
			throws Exception {
		short[] array = new short[7];
		for (int i = 0; i < 7; i++) {
			array[i] = sr.readUInt1();
		}
		rss.setArray(array);
	}

	/**
	 * �� ���� ��ġ �κ��� �д´�.
	 * 
	 * @param cos
	 *            �� ���� ��ġ�� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void charPositions(CharOffsets cos, StreamReader sr)
			throws Exception {
		byte[] array = new byte[7];
		for (int i = 0; i < 7; i++) {
			array[i] = sr.readSInt1();
		}
		cos.setArray(array);
	}
}
