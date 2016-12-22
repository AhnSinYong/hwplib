package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlLine;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentLine;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlLine {
	/**
	 * �� ��Ʈ���� �д´�.
	 * 
	 * @param line
	 *            �� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlLine line, StreamReader sr)
			throws IOException {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_LINE) {
			shapeComponentLine(line.getShapeComponentLine(), sr);
		}
	}

	/**
	 * �� ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param scl
	 *            �� ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentLine(ShapeComponentLine scl,
			StreamReader sr) throws IOException {
		scl.setStartX(sr.readSInt4());
		scl.setStartY(sr.readSInt4());
		scl.setEndX(sr.readSInt4());
		scl.setEndY(sr.readSInt4());
		int temp = sr.readSInt4();
		if (temp == 1) {
			scl.setStartedRightOrBottom(true);
		}
	}
}
