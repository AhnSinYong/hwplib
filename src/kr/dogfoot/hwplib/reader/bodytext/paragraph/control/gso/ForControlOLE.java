package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlOLE;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentOLE;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * OLE ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlOLE {
	/**
	 * OLE ��Ʈ���� �д´�.
	 * 
	 * @param ole
	 *            OLE ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(ControlOLE ole, StreamReader sr) throws IOException {
		RecordHeader rh = sr.readRecordHeder();
		if (rh.getTagID() == HWPTag.SHAPE_COMPONENT_OLE) {
			shapeComponentOLE(ole.getShapeComponentOLE(), sr);
		}
	}

	/**
	 * OLE ��ü �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param sco
	 *            OLE ��ü �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentOLE(ShapeComponentOLE sco, StreamReader sr)
			throws IOException {
		sco.getProperty().setValue(sr.readUInt4());
		sco.setExtentWidth(sr.readSInt4());
		sco.setExtentHeight(sr.readSInt4());
		sco.setBinDataId(sr.readUInt2());
		sco.getBorderColor().setColor(sr.readUInt4());
		sco.setBorderThickness(sr.readSInt4());
		sco.getBorderProperty().setValue(sr.readUInt4());
	}
}
