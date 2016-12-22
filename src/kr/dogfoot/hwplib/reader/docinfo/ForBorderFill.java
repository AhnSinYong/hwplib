package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.BorderFill;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderFillProperty;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderThickness;
import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.object.docinfo.borderfill.DiagonalSort;
import kr.dogfoot.hwplib.object.docinfo.borderfill.EachBorder;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.FillInfo;
import kr.dogfoot.hwplib.reader.docinfo.borderfill.ForFillInfo;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׵θ�/��� ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForBorderFill {
	/**
	 * �׵θ�/��� ���ڵ带 �д´�.
	 * 
	 * @param bf
	 *            �׵θ�/��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(BorderFill bf, StreamReader sr) throws IOException {
		property(bf.getProperty(), sr);
		eachBorder(bf.getLeftBorder(), sr);
		eachBorder(bf.getRightBorder(), sr);
		eachBorder(bf.getTopBorder(), sr);
		eachBorder(bf.getBottomBorder(), sr);
		diagonal(bf, sr);
		fillInfo(bf.getFillInfo(), sr);
	}

	/**
	 * �Ӽ� �κ��� �д´�.
	 * 
	 * @param p
	 *            �׵θ�/��� �Ӽ� �κ� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void property(BorderFillProperty p, StreamReader sr)
			throws IOException {
		p.setValue(sr.readUInt2());
	}

	/**
	 * 4������ �׵θ��� ǥ���ϴ� ������ ���� �д´�.
	 * 
	 * @param eb
	 *            4������ �׵θ��� ǥ���ϴ� ���� �� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void eachBorder(EachBorder eb, StreamReader sr)
			throws IOException {
		eb.setType(BorderType.valueOf((byte) sr.readUInt1()));
		eb.setThickness(BorderThickness.valueOf((byte) sr.readUInt1()));
		eb.getColor().setColor(sr.readUInt4());
	}

	/**
	 * �밢�� ���� �κи� �д´�.
	 * 
	 * @param bf
	 *            �׵θ�/��� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void diagonal(BorderFill bf, StreamReader sr)
			throws IOException {
		bf.setDiagonalSort(DiagonalSort.valueOf((byte) sr.readUInt1()));
		bf.setDiagonalThickness(BorderThickness.valueOf((byte) sr.readUInt1()));
		bf.getDiagonalColor().setColor(sr.readUInt4());
	}

	/**
	 * ��� ������ �д´�.
	 * 
	 * @param fi
	 *            ��� ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void fillInfo(FillInfo fi, StreamReader sr)
			throws IOException {
		ForFillInfo.read(fi, sr);
	}
}
