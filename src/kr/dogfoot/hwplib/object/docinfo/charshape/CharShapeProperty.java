package kr.dogfoot.hwplib.object.docinfo.charshape;

import kr.dogfoot.hwplib.object.docinfo.borderfill.BorderType;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ��� ��ü�� �Ӽ�
 * 
 * @author neolord
 */
public class CharShapeProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public CharShapeProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public long getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * �۲� ����� ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �۲� ����� ����
	 */
	public boolean isItalic() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �۲� ����� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param italic
	 *            �۲� ����� ����
	 */
	public void setItalic(boolean italic) {
		value = BitFlag.set(value, 0, italic);
	}

	/**
	 * �۲� ���ϰ� ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �۲� ���ϰ� ����
	 */
	public boolean isBold() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �۲� ���ϰ� ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param bold
	 *            �۲� ���ϰ� ����
	 */
	public void setBold(boolean bold) {
		value = BitFlag.set(value, 1, bold);
	}

	/**
	 * ������ ������ ��ȯ�Ѵ�. (2~3 bit)
	 * 
	 * @return ������ ����
	 */
	public UnderLineSort getUnderLineSort() {
		return UnderLineSort.valueOf((byte) BitFlag.get(value, 2, 3));
	}

	/**
	 * ������ ������ �����Ѵ�. (2~3 bit)
	 * 
	 * @param underLineSort
	 *            ������ ����
	 */
	public void setUnderLineSort(UnderLineSort underLineSort) {
		value = BitFlag.set(value, 2, 3, underLineSort.getValue());
	}

	/**
	 * ������ ����� ��ȯ�Ѵ�. (4~7 bit)
	 * 
	 * @return ������ ���
	 */
	public BorderType getUnderLineShape() {
		return BorderType.valueOf((byte) BitFlag.get(value, 4, 7));
	}

	/**
	 * ������ ����� �����Ѵ�. (4~7 bit)
	 * 
	 * @param underLineShape
	 *            ������ ���
	 */
	public void setUnderLineShape(BorderType underLineShape) {
		value = BitFlag.set(value, 4, 7, underLineShape.getValue());
	}

	/**
	 * �ܰ����� ������ ��ȯ�Ѵ�. (8~10 bit)
	 * 
	 * @return �ܰ����� ����
	 */
	public OutterLineSort getOutterLineSort() {
		return OutterLineSort.valueOf((byte) BitFlag.get(value, 8, 10));
	}

	/**
	 * �ܰ����� ������ �����Ѵ�. (8~10 bit)
	 * 
	 * @param outterLineSort
	 *            �ܰ����� ����
	 */
	public void setOutterLineSort(OutterLineSort outterLineSort) {
		value = BitFlag.set(value, 8, 10, outterLineSort.getValue());
	}

	/**
	 * �׸����� ������ ��ȯ�Ѵ�. (11~12 bit)
	 * 
	 * @return �׸����� ����
	 */
	public ShadowSort getShadowSort() {
		return ShadowSort.valueOf((byte) BitFlag.get(value, 11, 12));
	}

	/**
	 * �׸����� ������ �����Ѵ�. (11~12 bit)
	 * 
	 * @param shadowSort
	 *            �׸����� ����
	 */
	public void setShadowSort(ShadowSort shadowSort) {
		value = BitFlag.set(value, 11, 12, shadowSort.getValue());
	}

	/**
	 * �簢 ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return �簢 ����
	 */
	public boolean isEmboss() {
		return BitFlag.get(value, 13);
	}

	/**
	 * �簢 ���θ� �����Ѵ�. (13 bit)
	 * 
	 * @param emboss
	 *            �簢 ����
	 */
	public void setEmboss(boolean emboss) {
		value = BitFlag.set(value, 13, emboss);
	}

	/**
	 * ���� ���θ� ��ȯ�Ѵ�. (14 bit)
	 * 
	 * @return ���� ����
	 */
	public boolean isEngrave() {
		return BitFlag.get(value, 14);
	}

	/**
	 * ���� ���θ� �����Ѵ�. (14 bit)
	 * 
	 * @param engrave
	 *            ���� ����
	 */
	public void setEngrave(boolean engrave) {
		value = BitFlag.set(value, 14, engrave);
	}

	/**
	 * �� ÷�� ���θ� ��ȯ�Ѵ�. (15 bit)
	 * 
	 * @return �� ÷�� ����
	 */
	public boolean isSuperScript() {
		return BitFlag.get(value, 15);
	}

	/**
	 * �� ÷�� ���θ� �����Ѵ�. (15 bit)
	 * 
	 * @param superScript
	 *            �� ÷�� ����
	 */
	public void setSuperScript(boolean superScript) {
		value = BitFlag.set(value, 15, superScript);
	}

	/**
	 * �Ʒ� ÷�� ���θ� ��ȯ�Ѵ�. (16 bit)
	 * 
	 * @return �Ʒ� ÷�� ����
	 */
	public boolean isSubScript() {
		return BitFlag.get(value, 16);
	}

	/**
	 * �Ʒ� ÷�� ���θ� �����Ѵ�. (16 bit)
	 * 
	 * @param subScript
	 *            �Ʒ� ÷�� ����
	 */
	public void setSubScript(boolean subScript) {
		value = BitFlag.set(value, 16, subScript);
	}

	/**
	 * ��Ҽ� ���θ� ��ȯ�Ѵ�. (18~20 bit)
	 * 
	 * @return ��Ҽ� ����
	 */
	public boolean isStrikeLine() {
		return BitFlag.get(value, 18) | BitFlag.get(value, 19)
				| BitFlag.get(value, 20);
	}

	/**
	 * ��Ҽ� ���θ� �����Ѵ�. (18~20 bit)
	 * 
	 * @param strikeLine
	 *            ��Ҽ� ����
	 */
	public void setStrikeLine(boolean strikeLine) {
		value = BitFlag.set(value, 18, strikeLine);
		value = BitFlag.set(value, 19, strikeLine);
		value = BitFlag.set(value, 20, strikeLine);
	}

	/**
	 * �������� ������ ��ȯ�Ѵ�. (21~24 bit)
	 * 
	 * @return �������� ����
	 */
	public EmphasisSort getEmphasisSort() {
		return EmphasisSort.valueOf((byte) BitFlag.get(value, 21, 24));
	}

	/**
	 * �������� ������ �����Ѵ�. (21~24 bit)
	 * 
	 * @param emphasisSort
	 *            �������� ����
	 */
	public void setEmphasisSort(EmphasisSort emphasisSort) {
		value = BitFlag.set(value, 21, 24, emphasisSort.getValue());
	}

	/**
	 * �۲ÿ� ��︮�� ��ĭ ��� ���θ� ��ȯ�Ѵ�. (25 bit)
	 * 
	 * @return �۲ÿ� ��︮�� ��ĭ ��� ����
	 */
	public boolean isUsingSpaceAppropriateForFont() {
		return BitFlag.get(value, 25);
	}

	/**
	 * �۲ÿ� ��︮�� ��ĭ ��� ���θ� �����Ѵ�. (25 bit)
	 * 
	 * @param usingSpaceAppropriateForFont
	 *            �۲ÿ� ��︮�� ��ĭ ��� ����
	 */
	public void setUsingSpaceAppropriateForFont(
			boolean usingSpaceAppropriateForFont) {
		value = BitFlag.set(value, 25, usingSpaceAppropriateForFont);
	}

	/**
	 * ��Ҽ��� ����� ��ȯ�Ѵ�. (26~29 bit)
	 * 
	 * @return ��Ҽ��� ���
	 */
	public BorderType getStrikeLineShape() {
		return BorderType.valueOf((byte) BitFlag.get(value, 26, 29));
	}

	/**
	 * ��Ҽ��� ����� �����Ѵ�. (26~29 bit)
	 * 
	 * @param strikeLineShape
	 *            ��Ҽ��� ���
	 */
	public void setStrikeLineShape(BorderType strikeLineShape) {
		value = BitFlag.set(value, 26, 29, strikeLineShape.getValue());
	}

	/**
	 * Kerning ���θ� ��ȯ�Ѵ�. (30 bit)
	 * 
	 * @return Kerning ����
	 */
	public boolean isKerning() {
		return BitFlag.get(value, 30);
	}

	/**
	 * Kerning ���θ� �����Ѵ�. (30 bit)
	 * 
	 * @param kerning
	 *            Kerning ����
	 */
	public void setKerning(boolean kerning) {
		value = BitFlag.set(value, 30, kerning);
	}
}
