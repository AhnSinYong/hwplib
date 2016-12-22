package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlArc;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentArc;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.arc.ArcBorder;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForTextBox;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ȣ ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlArc {
	/**
	 * ȣ ��Ʈ���� �д´�.
	 * 
	 * @param arc
	 *            ȣ ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlArc arc, StreamReader sr) throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			arc.createTextBox();
			ForTextBox.read(arc.getTextBox(), sr);
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				rh = sr.readRecordHeder();
			}
		}
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_ARC) {
			shapeComponentArc(arc.getShapeComponentArc(), sr);
		}
	}

	/**
	 * ȣ ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param sca
	 *            ȣ ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentArc(ShapeComponentArc sca, StreamReader sr)
			throws IOException {
		sca.setArcBorder(ArcBorder.valueOf((byte) sr.readUInt1()));
		sca.setCenterX(sr.readSInt4());
		sca.setCenterY(sr.readSInt4());
		sca.setAxis1X(sr.readSInt4());
		sca.setAxis1Y(sr.readSInt4());
		sca.setAxis2X(sr.readSInt4());
		sca.setAxis2Y(sr.readSInt4());
	}
}
