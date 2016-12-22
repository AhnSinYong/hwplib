package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.GsoControl;
import kr.dogfoot.hwplib.object.bodytext.control.gso.GsoControlType;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponent;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponentContainer;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponentNormal;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo.LineInfo;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo.OutlineStyle;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo.Matrix;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo.RenderingInfo;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo.ScaleRotateMatrixPair;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.shadowinfo.ShadowInfo;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.shadowinfo.ShadowType;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.FillInfo;
import kr.dogfoot.hwplib.reader.docinfo.borderfill.ForFillInfo;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׸��� ��ü�� ��ü ���� �Ӽ� ���ڵ��� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForShapeComponent {
	/**
	 * �׸��� ��ü�� ��ü ���� �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param gsoControl
	 *            �׸��� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(GsoControl gsoControl, StreamReader sr)
			throws IOException {
		if (gsoControl.getGsoType() != GsoControlType.Container) {
			shapeComponentForNormal(gsoControl.getShapeComponent(), sr);
		} else {
			shapeComponentForContainer(gsoControl.getShapeComponent(), sr);
		}
	}

	/**
	 * �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ��� �д´�.
	 * 
	 * @param sc
	 *            ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentForNormal(ShapeComponent sc,
			StreamReader sr) throws IOException {
		commonPart(sc, sr);
		if (sr.isEndOfRecord() == true) {
			return;
		}
		ShapeComponentNormal scn = (ShapeComponentNormal) sc;
		lineInfo(scn, sr);
		if (sr.isEndOfRecord() == true) {
			return;
		}
		fillInfo(scn, sr);
		if (sr.isEndOfRecord() == true) {
			return;
		}
		shadowInfo(scn, sr);
	}

	/**
	 * ��ü ���� �Ӽ� ���ڵ��� ���� �κ��� �д´�.
	 * 
	 * @param sc
	 *            ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void commonPart(ShapeComponent sc, StreamReader sr)
			throws IOException {
		sc.setOffsetX(sr.readSInt4());
		sc.setOffsetY(sr.readSInt4());
		sc.setGroupingCount(sr.readUInt2());
		sc.setLocalFileVersion(sr.readUInt2());
		sc.setWidthAtCreate(sr.readUInt4());
		sc.setHeightAtCreate(sr.readUInt4());
		sc.setWidthAtCurrent(sr.readUInt4());
		sc.setHeightAtCurrent(sr.readUInt4());
		sc.setProperty(sr.readUInt4());
		sc.setRotateAngle(sr.readUInt2());
		sc.setRotateXCenter(sr.readSInt4());
		sc.setRotateYCenter(sr.readSInt4());

		renderingInfo(sc.getRenderingInfo(), sr);
	}

	/**
	 * ��ü ���� �Ӽ� ���ڵ��� rendering ������ �д´�.
	 * 
	 * @param ri
	 *            rendering ������ ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void renderingInfo(RenderingInfo ri, StreamReader sr)
			throws IOException {
		int scaleRotateMatrixCount = sr.readUInt2();
		matrix(ri.getTranslationMatrix(), sr);
		for (int i = 0; i < scaleRotateMatrixCount; i++) {
			ScaleRotateMatrixPair srmp = ri.addNewScaleRotateMatrixPair();
			matrix(srmp.getScaleMatrix(), sr);
			matrix(srmp.getRotateMatrix(), sr);
		}
	}

	/**
	 * ��ȯ ����� �д´�.
	 * 
	 * @param m
	 *            ��ȯ ��� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void matrix(Matrix m, StreamReader sr) throws IOException {
		for (int i = 0; i < 6; i++) {
			m.setValue(i, sr.readDouble());
		}
	}

	/**
	 * �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ��� line ������ �д´�.
	 * 
	 * @param scn
	 *            �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ��� line ������ ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void lineInfo(ShapeComponentNormal scn, StreamReader sr)
			throws IOException {
		scn.createLineInfo();
		LineInfo li = scn.getLineInfo();
		li.getColor().setColor(sr.readUInt4());
		li.setThickness(sr.readSInt4());
		li.getProperty().setValue(sr.readUInt4());
		li.setOutlineStyle(OutlineStyle.valueOf((byte) sr.readUInt1()));
	}

	/**
	 * �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ��� ��� ������ �д´�.
	 * 
	 * @param scn
	 *            �Ϲ� ��Ʈ���� ����  ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void fillInfo(ShapeComponentNormal scn, StreamReader sr)
			throws IOException {
		scn.createFillInfo();
		FillInfo fi = scn.getFillInfo();
		ForFillInfo.read(fi, sr);
	}

	/**
	 * �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ��� �׸��� ������ �д´�.
	 * 
	 * @param scn
	 *            �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shadowInfo(ShapeComponentNormal scn, StreamReader sr)
			throws IOException {
		scn.createShadowInfo();
		ShadowInfo si = scn.getShadowInfo();
		si.setType(ShadowType.valueOf((byte) sr.readUInt4()));
		si.getColor().setColor(sr.readUInt4());
		si.setOffsetX(sr.readSInt4());
		si.setOffsetY(sr.readSInt4());
		sr.skip(5);
		si.setTransparnet(sr.readUInt1());
	}

	/**
	 * ���� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ带 �д´�.
	 *
	 * @param sc
	 *            ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void shapeComponentForContainer(ShapeComponent sc,
			StreamReader sr) throws IOException {
		commonPart(sc, sr);
		ShapeComponentContainer scc = (ShapeComponentContainer) sc;
		childInfo(scc, sr);
		unknown4Bytes(sr);
	}

	/**
	 * �����ϰ� �ִ� ��Ʈ�ѿ� ���� ���� �κ��� �д´�.
	 * 
	 * @param scc
	 *            ���� ��Ʈ���� ��ü ���� �Ӽ� ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void childInfo(ShapeComponentContainer scc, StreamReader sr)
			throws IOException {
		int count = sr.readUInt2();
		for (int i = 0; i < count; i++) {
			long childId = sr.readUInt4();
			scc.addChildControlId(childId);
		}
	}

	/**
	 * �˷����� ���� 4 ����Ʈ�� ó���Ѵ�.
	 * 
	 * @param sr
	 * @throws IOException
	 */
	private static void unknown4Bytes(StreamReader sr) throws IOException {
		sr.skip(4);
	}
}
