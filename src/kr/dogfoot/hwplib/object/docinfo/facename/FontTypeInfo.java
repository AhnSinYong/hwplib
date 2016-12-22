package kr.dogfoot.hwplib.object.docinfo.facename;

/**
 * �۲� ���� ������ ���� ��ü
 * 
 * @author neolord
 */
public class FontTypeInfo {
	/**
	 * �۲� �迭
	 */
	private short fontType;
	/**
	 * ������ ����
	 */
	private short serifType;
	/**
	 * ����
	 */
	private short thickness;
	/**
	 * ���
	 */
	private short ratio;
	/**
	 * ����
	 */
	private short contrast;
	/**
	 * ��Ʈ��ũ ����
	 */
	private short strokeDeviation;
	/**
	 * ��ȹ ����
	 */
	private short characterStrokeType;
	/**
	 * ������
	 */
	private short characterShape;
	/**
	 * �߰���
	 */
	private short middleLine;
	/**
	 * X-����
	 */
	private short xHeight;

	/**
	 * ������
	 */
	public FontTypeInfo() {
	}

	/**
	 * �۲� �迭 ���� ��ȯ�Ѵ�.
	 * 
	 * @return �۲� �迭 ��
	 */
	public short getFontType() {
		return fontType;
	}

	/**
	 * �۲� �迭 ���� �����Ѵ�.
	 * 
	 * @param fontType
	 *            �۲� �迭 ��
	 */
	public void setFontType(short fontType) {
		this.fontType = fontType;
	}

	/**
	 * ������ ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��
	 */
	public short getSerifType() {
		return serifType;
	}

	/**
	 * ������ ���� ���� �����Ѵ�.
	 * 
	 * @param serifType
	 *            ������ ���� ��
	 */
	public void setSerifType(short serifType) {
		this.serifType = serifType;
	}

	/**
	 * ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public short getThickness() {
		return thickness;
	}

	/**
	 * ���� ���� �����Ѵ�.
	 * 
	 * @param thickness
	 *            ���� ��
	 */
	public void setThickness(short thickness) {
		this.thickness = thickness;
	}

	/**
	 * ��� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ��
	 */
	public short getRatio() {
		return ratio;
	}

	/**
	 * ��� ���� �����Ѵ�.
	 * 
	 * @param ratio
	 *            ��� ��
	 */
	public void setRatio(short ratio) {
		this.ratio = ratio;
	}

	/**
	 * ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public short getContrast() {
		return contrast;
	}

	/**
	 * ���� ���� �����Ѵ�.
	 * 
	 * @param contrast
	 *            ���� ��
	 */
	public void setContrast(short contrast) {
		this.contrast = contrast;
	}

	/**
	 * ��Ʈ��ũ ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ��ũ ���� ��
	 */
	public short getStrokeDeviation() {
		return strokeDeviation;
	}

	/**
	 * ��Ʈ��ũ ���� ���� �����Ѵ�.
	 * 
	 * @param strokeDeviation
	 *            ��Ʈ��ũ ���� ��
	 */
	public void setStrokeDeviation(short strokeDeviation) {
		this.strokeDeviation = strokeDeviation;
	}

	/**
	 * ��ȹ ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȹ ���� ��
	 */
	public short getCharacterStrokeType() {
		return characterStrokeType;
	}

	/**
	 * ��ȹ ���� ���� �����Ѵ�.
	 * 
	 * @param characterStrokeType
	 *            ��ȹ ���� ��
	 */
	public void setCharacterStrokeType(short characterStrokeType) {
		this.characterStrokeType = characterStrokeType;
	}

	/**
	 * ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ��
	 */
	public short getCharacterShape() {
		return characterShape;
	}

	/**
	 * ������ ���� �����Ѵ�.
	 * 
	 * @param characterShape
	 *            ������ ��
	 */
	public void setCharacterShape(short characterShape) {
		this.characterShape = characterShape;
	}

	/**
	 * �߰��� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �߰��� ��
	 */
	public short getMiddleLine() {
		return middleLine;
	}

	/**
	 * �߰��� ���� �����Ѵ�.
	 * 
	 * @param middleLine
	 *            �߰��� ��
	 */
	public void setMiddleLine(short middleLine) {
		this.middleLine = middleLine;
	}

	/**
	 * X-���̸� ��ȯ�Ѵ�.
	 * 
	 * @return X-����
	 */
	public short getxHeight() {
		return xHeight;
	}

	/**
	 * X-���̸� �����Ѵ�.
	 * 
	 * @param xHeight
	 *            X-����
	 */
	public void setxHeight(short xHeight) {
		this.xHeight = xHeight;
	}
}
