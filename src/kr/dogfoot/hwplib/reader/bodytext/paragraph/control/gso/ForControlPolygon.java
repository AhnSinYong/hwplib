package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlPolygon;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentPolygon;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.polygon.PositionXY;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForTextBox;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ٰ��� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlPolygon {
	/**
	 * �ٰ��� ��Ʈ���� �д´�.
	 * 
	 * @param polygon �ٰ��� ��Ʈ��
	 * @param sr ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlPolygon polygon, StreamReader sr) throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			polygon.createTextBox();
			ForTextBox.read(polygon.getTextBox(), sr);
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				rh = sr.readRecordHeder();
			}
		}
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_POLYGON) {
			shapeComponentPolygon(polygon.getShapeComponentPolygon(), sr);
		}
	}

	/**
	 * �ٰ��� ��ü �Ӽ� ���ڵ��� �д´�.
	 * 
	 * @param scp �ٰ��� ��ü �Ӽ� ���ڵ�
	 * @param sr ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentPolygon(
			ShapeComponentPolygon scp, StreamReader sr) throws IOException {
		int positionCount = sr.readSInt4();
		for (int i = 0; i < positionCount; i++) {
			PositionXY p = scp.addNewPosition();
			p.setX(sr.readSInt4());
			p.setY(sr.readSInt4());
		}
		long rest = sr.readUInt4();
		if (rest != 0) {
			scp.setClosed(true);
		}
 	}
}
