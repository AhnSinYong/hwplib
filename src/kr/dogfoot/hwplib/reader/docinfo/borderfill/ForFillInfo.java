package kr.dogfoot.hwplib.reader.docinfo.borderfill;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.FillInfo;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.GradientFill;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.GradientType;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.ImageFill;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.ImageFillType;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.PatternFill;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.PatternType;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.PictureEffect;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.PictureInfo;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �׵θ�/��� ���ڵ��� ä��� ������ �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForFillInfo {
	/**
	 * �׵θ�/��� ���ڵ��� ä��� ������ �д´�.
	 * 
	 * @param fi
	 *            �׵θ�/��� ���ڵ��� ä��� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(FillInfo fi, StreamReader sr) throws IOException {
		fi.getType().setValue(sr.readUInt4());
		if (fi.getType().getValue() != 0) {
			if (fi.getType().hasPatternFill()) {
				fi.createPatternFill();
				patternFill(fi.getPatternFill(), sr);
			}

			if (fi.getType().hasGradientFill()) {
				fi.createGradientFill();
				gradientFill(fi.getGradientFill(), sr);
			}

			if (fi.getType().hasImageFill()) {
				fi.createImageFill();
				imageFill(fi.getImageFill(), sr);
			}
			additionalProperty(fi, sr);
			unknownBytes(fi, sr);
		} else {
			sr.skip(4);
		}
	}

	/**
	 * ���� ä�� ������ �д´�.
	 * 
	 * @param pf
	 *            ���� ä�� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void patternFill(PatternFill pf, StreamReader sr)
			throws IOException {
		pf.getBackColor().setColor(sr.readUInt4());
		pf.getPatternColor().setColor(sr.readUInt4());
		pf.setPatternType(PatternType.valueOf((byte) sr.readSInt4()));
	}

	/**
	 * �׶��̼� ä�� ������ �д´�.
	 * 
	 * @param gf
	 *            �׶��̼� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void gradientFill(GradientFill gf, StreamReader sr)
			throws IOException {
		gf.setGradientType(GradientType.valueOf(sr.readSInt1())); // �������� 2byte
																	// -> 1 byte
		gf.setStartAngle(sr.readUInt4()); // �������� 2byte -> 4 byte
		gf.setCenterX(sr.readUInt4()); // �������� 2byte -> 4 byte
		gf.setCenterY(sr.readUInt4()); // �������� 2byte -> 4 byte
		gf.setBlurringDegree(sr.readUInt4()); // �������� 2byte -> 4 byte

		long colorCount = sr.readUInt4(); // �������� 2byte -> 4 byte
		if (colorCount > 2) {
			for (int i = 0; i < colorCount; i++) {
				gf.addChangePoint(sr.readSInt4());
			}
		}
		for (int i = 0; i < colorCount; i++) {
			gf.addNewColor().setColor(sr.readUInt4());
		}
	}

	/**
	 * �̹��� ä�� ������ �д´�.
	 * 
	 * @param imf
	 *            �̹��� ä�� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void imageFill(ImageFill imf, StreamReader sr)
			throws IOException {
		imf.setImageFillType(ImageFillType.valueOf((byte) sr.readUInt1()));
		pictureInfo(imf.getPictureInfo(), sr);
	}

	/**
	 * �׸� ������ �д´�.
	 * 
	 * @param pi
	 *            �׸� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void pictureInfo(PictureInfo pi, StreamReader sr)
			throws IOException {
		pi.setBrightness(sr.readSInt1());
		pi.setContrast(sr.readSInt1());
		pi.setEffect(PictureEffect.valueOf((byte) sr.readUInt1()));
		pi.setBinItemID(sr.readUInt2());
	}

	/**
	 * �߰����� �Ӽ��� �д´�.
	 * 
	 * @param fi
	 *            ä��� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void additionalProperty(FillInfo fi, StreamReader sr)
			throws IOException {
		long size = sr.readUInt4();
		if (size == 1) {
			if (fi.getType().hasGradientFill()) {
				fi.getGradientFill().setBlurringCenter(sr.readUInt1());
			}
		} else {
			sr.skip(size);
		}
	}

	/**
	 * �˷����� ���� ����Ʈ�� �д¾�.
	 * 
	 * @param fi
	 *            ä��� ����
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknownBytes(FillInfo fi, StreamReader sr)
			throws IOException {
		if (fi.getType().hasPatternFill()) {
			sr.skip(1);
		}
		if (fi.getType().hasGradientFill()) {
			sr.skip(1);
		}
		if (fi.getType().hasImageFill()) {
			sr.skip(1);
		}
	}
}
