package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso.part;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.ColorEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.ColorWithEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.NeonEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.PictureEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.ReflectionEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.ShadowEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.SoftEdgeEffect;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׸� ��ü �Ӽ� ���ڵ��� �׸� ȿ�� �κ��� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForPictureEffect {
	/**
	 * �׸� ��ü �Ӽ� ���ڵ��� �׸� ȿ�� �κ��� �д´�.
	 * 
	 * @param pe
	 *            �׸� ��ü �Ӽ� ���ڵ��� �׸� ȿ���� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(PictureEffect pe, StreamReader sr) throws Exception {
		pe.getProperty().setValue(sr.readUInt4());
		if (pe.getProperty().hasShadowEffect()) {
			pe.createShadowEffect();
			shadowEffect(pe.getShadowEffect(), sr);
		}
		if (pe.getProperty().hasNeonEffect()) {
			pe.createNeonEffect();
			neonEffect(pe.getNeonEffect(), sr);
		}
		if (pe.getProperty().hasSoftBorderEffect()) {
			pe.createSoftEdgeEffect();
			softEdgeEffect(pe.getSoftEdgeEffect(), sr);
		}
		if (pe.getProperty().hasReflectionEffect()) {
			pe.createReflectionEffect();
			reflectionEffect(pe.getReflectionEffect(), sr);
		}
	}

	/**
	 * �׸��� ȿ�� �κ��� �д´�.
	 * 
	 * @param se
	 *            �׸��� ȿ�� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void shadowEffect(ShadowEffect se, StreamReader sr)
			throws Exception {
		se.setStyle(sr.readSInt4());
		se.setTransparency(sr.readFloat());
		se.setCloudy(sr.readFloat());
		se.setDirection(sr.readFloat());
		se.setDistance(sr.readFloat());
		se.setSort(sr.readSInt4());
		se.setTiltAngleX(sr.readFloat());
		se.setTiltAngleY(sr.readFloat());
		se.setZoomRateX(sr.readFloat());
		se.setZoomRateY(sr.readFloat());
		se.setRotateWithShape(sr.readSInt4());

		colorPropery(se.getColor(), sr);
	}

	/**
	 * ���� �Ӽ� �κ��� �д´�.
	 * 
	 * @param cp
	 *            ���� �Ӽ� �κ��� ��Ÿ����  ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void colorPropery(ColorWithEffect cp, StreamReader sr)
			throws Exception {
		cp.setType(sr.readSInt4());
		if (cp.getType() == 0) {
			byte color[] = new byte[4];
			sr.readBytes(color);
			cp.setColor(color);
		} else {
			throw new Exception("not supported color type !!!");
		}
		int colorEffectCount = (int) sr.readUInt4();
		for (int index = 0; index < colorEffectCount; index++) {
			ColorEffect ce = cp.addNewColorEffect();
			ce.setSort(sr.readSInt4());
			ce.setValue(sr.readFloat());
		}
	}

	/**
	 * �׿� ȿ�� �κ��� �д´�.
	 * 
	 * @param ne
	 *            �׿� ȿ�� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void neonEffect(NeonEffect ne, StreamReader sr)
			throws Exception {
		ne.setTransparency(sr.readFloat());
		ne.setRadius(sr.readFloat());
		colorPropery(ne.getColor(), sr);
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� �κ��� �д´�.
	 * 
	 * @param see
	 *            �ε巯�� �����ڸ� ȿ�� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void softEdgeEffect(SoftEdgeEffect see, StreamReader sr)
			throws IOException {
		see.setRadius(sr.readFloat());
	}

	/**
	 * �ݻ� ȿ�� �κ��� �д´�.
	 * 
	 * @param re
	 *            �ݻ� ȿ�� �κ��� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void reflectionEffect(ReflectionEffect re, StreamReader sr)
			throws IOException {
		re.setStyle(sr.readSInt4());
		re.setRadius(sr.readFloat());
		re.setDirection(sr.readFloat());
		re.setDistance(sr.readFloat());
		re.setTiltAngleX(sr.readFloat());
		re.setTiltAngleY(sr.readFloat());
		re.setZoomRateX(sr.readFloat());
		re.setZoomRateY(sr.readFloat());
		re.setRotationStyle(sr.readSInt4());
		re.setStartTransparency(sr.readFloat());
		re.setStartPosition(sr.readFloat());
		re.setEndTransparency(sr.readFloat());
		re.setEndPosition(sr.readFloat());
		re.setOffsetDirection(sr.readFloat());
	}
}
