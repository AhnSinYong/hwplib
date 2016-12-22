package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.Numbering;
import kr.dogfoot.hwplib.object.docinfo.numbering.LevelNumbering;
import kr.dogfoot.hwplib.object.docinfo.numbering.ParagraphHeadInfo;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��ȣ ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForNumbering {
	/**
	 * ���� ��ȣ ���ڵ带 �д´�.
	 * 
	 * @param n
	 *            ���� ��ȣ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Numbering n, StreamReader sr) throws Exception {
		levelNumberings(n, sr);
		n.setStartNumber(sr.readUInt2());
		if (sr.getFileVersion().isOver(5, 0, 2, 5)) {
			startNumberForLevels(n, sr);
		}
	}

	/**
	 * ��� ����(1��7)�� �ش��ϴ� ���� ��ȣ ���� �κ��� �д´�.
	 * 
	 * @param n
	 *            ���� ��ȣ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void levelNumberings(Numbering n, StreamReader sr)
			throws Exception {
		for (int level = 1; level <= 7; level++) {
			levelNumbering(n.getLevelNumbering(level), sr);
		}
	}

	/**
	 * �ϳ��� ������ �ش��ϴ� ���� ��ȣ ������ �д´�.
	 * 
	 * @param ln
	 *            �ϳ��� ������ �ش��ϴ� ���� ��ȣ ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void levelNumbering(LevelNumbering ln, StreamReader sr)
			throws IOException {
		paragraphHeadInfo(ln.getParagraphHeadInfo(), sr);
		ln.setNumberFormat(sr.readUTF16LEString());
	}

	/**
	 * ���� �Ӹ� ���� �κ��� �д´�.
	 * 
	 * @param phi
	 *            ���� �Ӹ� ���� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void paragraphHeadInfo(ParagraphHeadInfo phi, StreamReader sr)
			throws IOException {
		phi.getProperty().setValue(sr.readUInt4());
		phi.setCorrectionValueForWidth(sr.readUInt2());
		phi.setDistanceFromBody(sr.readUInt2());
		phi.setCharShapeID(sr.readUInt4());
	}

	/**
	 * ���غ� ���۹�ȣ �κ��� �д´�.
	 * 
	 * @param n
	 *            ���� ��ȣ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void startNumberForLevels(Numbering n, StreamReader sr)
			throws Exception {
		for (int level = 1; level <= 7; level++) {
			n.setStartNumberForLevel(sr.readUInt4(), level);
		}
	}
}
