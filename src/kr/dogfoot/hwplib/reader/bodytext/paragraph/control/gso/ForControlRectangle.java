package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlRectangle;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentRectangle;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForTextBox;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �簢�� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlRectangle {
	/**
	 * �簢�� ��Ʈ���� �д´�.
	 * 
	 * @param rectangle
	 *            �簢�� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlRectangle rectangle, StreamReader sr)
			throws Exception {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.LIST_HEADER) {
			rectangle.createTextBox();
			ForTextBox.read(rectangle.getTextBox(), sr);
			if (sr.isImmediatelyAfterReadingHeader() == false) {
				rh = sr.readRecordHeder();
			}
		}
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_RECTANGLE) {
			shapeComponentRectangle(rectangle.getShapeComponentRectangle(), sr);
		}
	}

	/**
	 * �簢�� ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param scr
	 *            �簢�� ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentRectangle(ShapeComponentRectangle scr,
			StreamReader sr) throws IOException {
		scr.setRoundRate(sr.readSInt1());
		scr.setX1(sr.readSInt4());
		scr.setY1(sr.readSInt4());
		scr.setX2(sr.readSInt4());
		scr.setY2(sr.readSInt4());
		scr.setX3(sr.readSInt4());
		scr.setY3(sr.readSInt4());
		scr.setX4(sr.readSInt4());
		scr.setY4(sr.readSInt4());
	}
}
