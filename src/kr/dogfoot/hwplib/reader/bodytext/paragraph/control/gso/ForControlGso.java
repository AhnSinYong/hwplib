package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.FactoryForControl;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlArc;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlContainer;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlCurve;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlEllipse;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlLine;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlOLE;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlPicture;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlPolygon;
import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlRectangle;
import kr.dogfoot.hwplib.object.bodytext.control.gso.GsoControl;
import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.Caption;
import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCaption;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForCtrlHeaderGso;
import kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part.ForShapeComponent;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׸��� ��ü ��Ʈ�ѵ��� �д´�.
 * 
 * @author neolord
 */
public class ForControlGso {
	/**
	 * ���� ��ü
	 */
	private Paragraph paragraph;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;
	/**
	 * ������ �׸��� ��ü ��Ʈ��
	 */
	private GsoControl gsoControl;

	/**
	 * ������
	 */
	public ForControlGso() {
	}

	/**
	 * �׸��� ��ü ��Ʈ���� �д´�.
	 * 
	 * @param paragraph
	 *            ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(Paragraph paragraph, StreamReader sr) throws Exception {
		this.paragraph = paragraph;
		this.sr = sr;
		CtrlHeaderGso header = ctrlHeader();
		Caption caption = caption();
		long gsoId = gsoIDFromShapeComponent();
		gsoControl = createGsoControl(header, caption, gsoId);
		restPartOfShapeCompponent();
		restPartOfControl();
	}

	/**
	 * �׸��� ��ü�� ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @return �׸��� ��ü�� ��Ʈ�� ��� ���ڵ�
	 * @throws IOException
	 */
	private CtrlHeaderGso ctrlHeader() throws IOException {
		CtrlHeaderGso header = new CtrlHeaderGso();
		ForCtrlHeaderGso.read(header, sr);
		return header;
	}

	/**
	 * ĸ�� ������ �д´�.
	 * 
	 * @return ĸ�� ����
	 * @throws Exception
	 */
	private Caption caption() throws Exception {
		sr.readRecordHeder();
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.LIST_HEADER) {
			Caption caption = new Caption();
			ForCaption.read(caption, sr);
			return caption;
		} else {
			return null;
		}
	}

	/**
	 * ��ü ���� �Ӽ� ���ڵ�� ���� �׸��� ��ü�� id�� �д´�.
	 * 
	 * @return �׸��� ��ü�� id
	 * @throws Exception
	 */
	private long gsoIDFromShapeComponent() throws Exception {
		if (sr.isImmediatelyAfterReadingHeader() == false) {
			sr.readRecordHeder();
		}
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.SHAPE_COMPONENT) {
			long id = sr.readUInt4();
			sr.skip(4); // id2;
			return id;
		} else {
			throw new Exception(
					"Shape Component must come after CtrlHeader for gso control.");
		}
	}

	/**
	 * �׸��� ��ü ��Ʈ���� �����Ѵ�.
	 * 
	 * @param header
	 *            ��Ʈ�� ���
	 * @param caption
	 *            ĸ�� ����
	 * @param gsoId
	 *            �׸��� ��ü ���̵�
	 * @return ������ �׸��� ��ü ��Ʈ��
	 */
	private GsoControl createGsoControl(CtrlHeaderGso header, Caption caption,
			long gsoId) {
		GsoControl gc = paragraph.addNewGsoControl(gsoId, header);
		gc.setCaption(caption);
		return gc;
	}

	/**
	 * ��ü ���� �Ӽ� ���ڵ��� ������ �κ��� �д´�.
	 * 
	 * @throws IOException
	 */
	private void restPartOfShapeCompponent() throws IOException {
		ForShapeComponent.read(gsoControl, sr);
	}

	/**
	 * ��Ʈ���� �ʸ��� �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void restPartOfControl() throws Exception {
		switch (gsoControl.getGsoType()) {
		case Line:
			line();
			break;
		case Rectangle:
			rectangle();
			break;
		case Ellipse:
			ellipse();
			break;
		case Arc:
			arc();
			break;
		case Polygon:
			polygon();
			break;
		case Curve:
			curve();
			break;
		case Picture:
			picture();
			break;
		case OLE:
			ole();
			break;
		case Container:
			container();
			break;
		}
	}

	/**
	 * �� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws IOException
	 */
	private void line() throws IOException {
		ForControlLine.read((ControlLine) gsoControl, sr);
	}

	/**
	 * �簢�� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void rectangle() throws Exception {
		ForControlRectangle.read((ControlRectangle) gsoControl, sr);
	}

	/**
	 * Ÿ�� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void ellipse() throws Exception {
		ForControlEllipse.read((ControlEllipse) gsoControl, sr);
	}

	/**
	 * ȣ ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void arc() throws Exception {
		ForControlArc.read((ControlArc) gsoControl, sr);
	}

	/**
	 * �ٰ��� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void polygon() throws Exception {
		ForControlPolygon.read((ControlPolygon) gsoControl, sr);
	}

	/**
	 * � ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void curve() throws Exception {
		ForControlCurve.read((ControlCurve) gsoControl, sr);
	}

	/**
	 * �׸� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void picture() throws Exception {
		ForControlPicture.read((ControlPicture) gsoControl, sr);
	}

	/**
	 * OLE ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws IOException
	 */
	private void ole() throws IOException {
		ForControlOLE.read((ControlOLE) gsoControl, sr);
	}

	/**
	 * ���� ��Ʈ���� ������ �κ��� �д´�.
	 * 
	 * @throws Exception
	 */
	private void container() throws Exception {
		ForControlContainer.read((ControlContainer) gsoControl, sr);
	}

	/**
	 * ���� ��Ʈ�� �ȿ� ���Ե� ��Ʈ���� �д´�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @return ���� ��Ʈ�� �ȿ� ���Ե� ��Ʈ��
	 * @throws Exception
	 */
	public GsoControl readInContainer(StreamReader sr) throws Exception {
		this.sr = sr;

		shapeComponentInContainer();
		restPartOfControl();
		return gsoControl;
	}

	/**
	 * ���� ��Ʈ�� �ȿ� ���Ե� ��Ʈ���� ���� �׸��� ��ü ��Ʈ�� ��� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void shapeComponentInContainer() throws Exception {
		sr.readRecordHeder();
		if (sr.getCurrentRecordHeader().getTagID() == HWPTag.SHAPE_COMPONENT) {
			long id = sr.readUInt4();
			gsoControl = FactoryForControl.createGso(id, null);
			ForShapeComponent.read(gsoControl, sr);
		} else {
			throw new Exception(
					"Shape Component must come after CtrlHeader for gso control.");
		}
	}
}
