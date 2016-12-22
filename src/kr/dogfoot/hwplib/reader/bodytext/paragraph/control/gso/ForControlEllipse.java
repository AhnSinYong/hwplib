package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlEllipse;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentEllipse;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForTextBox;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * Ÿ�� ��Ʈ���� �д´�.
 * 
 * @author neolord
 */
public class ForControlEllipse {
	/**
	 * Ÿ�� ��Ʈ���� �д´�.
	 * 
	 * @param ellipse
	 *            Ÿ�� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlEllipse ellipse, StreamReader sr)
			throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			ellipse.createTextBox();
			ForTextBox.read(ellipse.getTextBox(), sr);
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				rh = sr.readRecordHeder();
			}
		}
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_ELLIPSE) {
			shapeComponentEllipse(ellipse.getShapeComponentEllipse(), sr);
		}
	}

	/**
	 * Ÿ�� ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param sce
	 *            Ÿ�� ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentEllipse(ShapeComponentEllipse sce,
			StreamReader sr) throws IOException {
		sce.getProperty().setValue(sr.readUInt4());
		sce.setCenterX(sr.readSInt4());
		sce.setCenterY(sr.readSInt4());
		sce.setAxis1X(sr.readSInt4());
		sce.setAxis1Y(sr.readSInt4());
		sce.setAxis2X(sr.readSInt4());
		sce.setAxis2Y(sr.readSInt4());
		sce.setStartX(sr.readSInt4());
		sce.setStartY(sr.readSInt4());
		sce.setEndX(sr.readSInt4());
		sce.setEndY(sr.readSInt4());
		sce.setStartX2(sr.readSInt4());
		sce.setStartY2(sr.readSInt4());
		sce.setEndX2(sr.readSInt4());
		sce.setEndY2(sr.readSInt4());
	}
}
