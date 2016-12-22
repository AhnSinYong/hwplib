package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlCurve;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentCurve;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.curve.CurveSegmentType;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.polygon.PositionXY;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForTextBox;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * � ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlCurve {
	/**
	 * � ��Ʈ���� �д´�.
	 * 
	 * @param curve
	 *            � ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlCurve curve, StreamReader sr)
			throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			curve.createTextBox();
			ForTextBox.read(curve.getTextBox(), sr);
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				rh = sr.readRecordHeder();
			}
		}
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_CURVE) {
			shapeComponentCurve(curve.getShapeComponentCurve(), sr);
		}
	}

	/**
	 * � ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param scc
	 *            � ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentCurve(ShapeComponentCurve scc,
			StreamReader sr) throws IOException {
		int positionCount = sr.readSInt4();
		for (int i = 0; i < positionCount; i++) {
			PositionXY p = scc.addNewPosition();
			p.setX(sr.readSInt4());
			p.setY(sr.readSInt4());
		}
		for (int i = 0; i < positionCount - 1; i++) {
			CurveSegmentType cst = CurveSegmentType.valueOf((byte) sr
					.readUInt1());
			scc.addCurveSegmentType(cst);
		}
		long rest = sr.readUInt4();
		if (rest != 0) {
			scc.setClosed(true);
		}
	}
}
