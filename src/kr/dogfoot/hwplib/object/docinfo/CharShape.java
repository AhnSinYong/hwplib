package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.charshape.CharOffsets;
import kr.dogfoot.hwplib.object.docinfo.charshape.CharShapeProperty;
import kr.dogfoot.hwplib.object.docinfo.charshape.CharSpaces;
import kr.dogfoot.hwplib.object.docinfo.charshape.FaceNameIds;
import kr.dogfoot.hwplib.object.docinfo.charshape.Ratios;
import kr.dogfoot.hwplib.object.docinfo.charshape.RelativeSizes;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * ���� ����� ��Ÿ���� ���ڵ�
 * 
 * @author neolord
 */
public class CharShape {
	/**
	 * �� �۲� ID(FaceID) ���� ��
	 */
	private FaceNameIds faceNameIds;
	/**
	 * �� ����, 50%~200%
	 */
	private Ratios ratios;
	/**
	 * �� �ڰ�, -50%~50%
	 */
	private CharSpaces charSpaces;
	/**
	 * �� ��� ũ��, 10%~250%
	 */
	private RelativeSizes relativeSizes;
	/**
	 * �� ���� ��ġ, -100%~100%
	 */
	private CharOffsets charOffsets;
	/**
	 * ���� ũ��
	 */
	private int baseSize;
	/**
	 * �Ӽ�
	 */
	private CharShapeProperty property;
	/**
	 * �׸��� ����1, -100%~100%
	 */
	private byte shadowGap1;
	/**
	 * �׸��� ����2, -100%��100%
	 */
	private byte shadowGap2;
	/**
	 * ���� ��
	 */
	private Color4Byte charColor;
	/**
	 * ���� ��
	 */
	private Color4Byte underLineColor;
	/**
	 * ���� ��
	 */
	private Color4Byte shadeColor;
	/**
	 * �׸��� ��
	 */
	private Color4Byte shadowColor;
	/**
	 * ������ �׵θ�/��� ID ���� ��
	 */
	private int borderFillId;
	/**
	 * ��Ҽ� �� (5.0.3.0 �̻�)
	 */
	private Color4Byte strikeLineColor;

	/**
	 * ������
	 */
	public CharShape() {
		faceNameIds = new FaceNameIds();
		ratios = new Ratios();
		charSpaces = new CharSpaces();
		relativeSizes = new RelativeSizes();
		charOffsets = new CharOffsets();
		property = new CharShapeProperty();
		charColor = new Color4Byte();
		underLineColor = new Color4Byte();
		shadeColor = new Color4Byte();
		shadowColor = new Color4Byte();
		strikeLineColor = new Color4Byte();
	}

	/**
	 * ���� ������ �۲� ID(FaceID)�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ �۲� ID(FaceID)�� ���� ��ü
	 */
	public FaceNameIds getFaceNameIds() {
		return faceNameIds;
	}

	/**
	 * �� ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ���� ��ü
	 */
	public Ratios getRatios() {
		return ratios;
	}

	/**
	 * �� �ڰ��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� �ڰ��� ���� ��ü
	 */
	public CharSpaces getCharSpaces() {
		return charSpaces;
	}

	/**
	 * �� ��� ũ�⿡ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��� ũ��
	 */
	public RelativeSizes getRelativeSizes() {
		return relativeSizes;
	}

	/**
	 * �� ���� ��ġ�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ġ�� ���� ��ü
	 */
	public CharOffsets getCharOffsets() {
		return charOffsets;
	}

	/**
	 * ���� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ũ��
	 */
	public int getBaseSize() {
		return baseSize;
	}

	/**
	 * ���� ũ�⸦ �����Ѵ�.
	 * 
	 * @param baseSize
	 *            ���� ũ��
	 */
	public void setBaseSize(int baseSize) {
		this.baseSize = baseSize;
	}

	/**
	 * ���ڸ�� �Ӽ��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڸ�� �Ӽ��� ���� ��ü
	 */
	public CharShapeProperty getProperty() {
		return property;
	}

	/**
	 * �׸��� ����1�� �����Ѵ�.
	 * 
	 * @return �׸��� ����1
	 */
	public byte getShadowGap1() {
		return shadowGap1;
	}

	/**
	 * �׸��� ����1�� �����Ѵ�.
	 * 
	 * @param shadowGap1
	 *            �׸��� ����1
	 */
	public void setShadowGap1(byte shadowGap1) {
		this.shadowGap1 = shadowGap1;
	}

	/**
	 * �׸��� ����2�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ����2��
	 */
	public byte getShadowGap2() {
		return shadowGap2;
	}

	/**
	 * �׸��� ����2�� �����Ѵ�.
	 * 
	 * @param shadowGap2
	 *            �׸��� ����2
	 */
	public void setShadowGap2(byte shadowGap2) {
		this.shadowGap2 = shadowGap2;
	}

	/**
	 * ���� �� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ��ü
	 */
	public Color4Byte getCharColor() {
		return charColor;
	}

	/**
	 * ���� �� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ��ü
	 */
	public Color4Byte getUnderLineColor() {
		return underLineColor;
	}

	/**
	 * ���� �� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ��ü
	 */
	public Color4Byte getShadeColor() {
		return shadeColor;
	}

	/**
	 * �׸��� �� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� �� ��ü
	 */
	public Color4Byte getShadowColor() {
		return shadowColor;
	}

	/**
	 * ������ �׵θ�/��� �� id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �׵θ�/��� �� id
	 */
	public int getBorderFillId() {
		return borderFillId;
	}

	/**
	 * ������ �׵θ�/��� �� id�� �����Ѵ�.
	 * 
	 * @param borderFillId
	 *            ������ �׵θ�/��� �� id
	 */
	public void setBorderFillId(int borderFillId) {
		this.borderFillId = borderFillId;
	}

	/**
	 * ��Ҽ� �� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ҽ� �� ��ü (5.0.3.0 �̻�)
	 */
	public Color4Byte getStrikeLineColor() {
		return strikeLineColor;
	}
}
