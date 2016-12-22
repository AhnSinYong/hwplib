package kr.dogfoot.hwplib.object.docinfo.parashape;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ����� �Ӽ�1 ��ü
 * 
 * @author neolord
 */
public class ParaShapeProperty1 {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;
	
	public ParaShapeProperty1() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public long getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * @param value ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(long value) {
		this.value = value;
	}
	
	/**
	 * �� ������ ������ ��ȯ�Ѵ�. (0~1 bit, �ѱ� 2007 ���� �������� ���.)
	 * @return �� ������ ����
	 */
	public LineSpaceSort getLineSpaceSort() {
		return LineSpaceSort.valueOf((byte) BitFlag.get(value, 0, 1));
	}

	/**
	 * �� ������ ������ �����Ѵ�. (0~1 bit, �ѱ� 2007 ���� �������� ���.)
	 * @param lineSpaceSort �� ������ ����
	 */
	public void setLineSpaceSort(LineSpaceSort lineSpaceSort) {
		value = BitFlag.set(value, 0, 1, lineSpaceSort.getValue());
	}
	
	/**
	 * ���� ����� ��ȯ�Ѵ�. (2~4 bit)
	 * @return ���� ���
	 */
	public Alignment getAlignment()  {
		return Alignment.valueOf((byte) BitFlag.get(value, 2, 4));
	}
	
	/**
	 * ���� ����� �����Ѵ�. (2~4 bit)
	 * @param alignment ���� ���
	 */
	public void setAlignment(Alignment alignment) {
		value = BitFlag.set(value, 2, 4, alignment.getValue());
	}
	
	/**
	 * �� ���� ���� ���� ������ ��ȯ�Ѵ�. (5~6 bit)
	 * @return �� ���� ���� ���� ����
	 */
	public LineDivideForEnglish getLineDivideForEnglish() {
		return LineDivideForEnglish.valueOf((byte) BitFlag.get(value, 5, 6));
	}
	
	/**
	 * �� ���� ���� ���� ������ �����Ѵ�. (5~6 bit)
	 * @param lineDivideForEnglish �� ���� ���� ���� ����
	 */
	public void setLineDivideForEnglish(LineDivideForEnglish lineDivideForEnglish) { 
		value = BitFlag.set(value, 5, 6, lineDivideForEnglish.getValue());
	}
	
	/**
	 * �� ���� ���� �ѱ� ������ ��ȯ�Ѵ�. (7 bit)
	 * @return �� ���� ���� �ѱ� ����
	 */
	public LineDivideForHangul getLineDivideForHangul() {
		if (BitFlag.get(value, 7) == true) {
			return LineDivideForHangul.ByLetter;
		} else {
			return LineDivideForHangul.ByWord;
		}
	}

	/**
	 * �� ���� ���� �ѱ� ������ �����Ѵ�. (7 bit)
	 * @param lineDivideForHangul �� ���� ���� �ѱ� ����
	 */
	public void setLineDivideForHangul(LineDivideForHangul lineDivideForHangul) {
		if (lineDivideForHangul == LineDivideForHangul.ByLetter) {
			value = BitFlag.set(value, 7, true);
		} else {
			value = BitFlag.set(value, 7, false);
		}
	}

	/**
	 * ���� ������ �� ���� ��� ���θ� ��ȯ�Ѵ�. (8 bit)
	 * @return ���� ������ �� ���� ��� ����
	 */
	public boolean isUseGrid() {
		return BitFlag.get(value, 8);
	}
	
	/**
	 * ���� ������ �� ���� ��� ���θ� �����Ѵ�. (8 bit)
	 * @param useGrid ���� ������ �� ���� ��� ����
	 */
	public void setUseGrid(boolean useGrid) {
		value = BitFlag.set(value, 8, useGrid);
	}
	
	/**
	 * ���� �ּҰ� (0%��75%)�� ��ȯ�Ѵ�. (9~15 bit)
	 * @return ���� �ּҰ� (0%��75%)
	 */
	public byte getMinimumSpace() { 
		return (byte) BitFlag.get(value, 9, 15);
	}

	/**
	 * ���� �ּҰ� (0%��75%)�� �����Ѵ�. (9~15 bit)
	 * @param minimumSpace ���� �ּҰ� (0%��75%)
	 */
	public void setMinimumSpace(byte minimumSpace) {
		value = BitFlag.set(value, 9, 15, minimumSpace);
	}
	
	/**
	 * �������� ��ȣ ���θ� ��ȯ�Ѵ�. (16 bit)
	 * @return �������� ��ȣ ����
	 */
	public boolean isProtectLoner() {
		return BitFlag.get(value, 16);
	}

	/**
	 * �������� ��ȣ ���θ� �����Ѵ�. (16 bit)
	 * @param protectLoner �������� ��ȣ ����
	 */
	public void setProtectLoner(boolean protectLoner) {
		value = BitFlag.set(value, 16, protectLoner);
	}
	
	/**
	 * ���� ���ܰ� �Բ� ���θ� ��ȯ�Ѵ�. (17 bit)
	 * @return ���� ���ܰ� �Բ� ����
	 */
	public boolean isTogetherNextPara() {
		return BitFlag.get(value, 17);
	}

	/**
	 * ���� ���ܰ� �Բ� ���θ� �����Ѵ�. (17 bit)
	 * @param togetherNextPara ���� ���ܰ� �Բ� ����
	 */
	public void setTogetherNextPara(boolean togetherNextPara) {
		value = BitFlag.set(value, 17, togetherNextPara);
	}

	/**
	 * ���� ��ȣ ���θ� ��ȯ�Ѵ�. (18 bit)
	 * @return ���� ��ȣ ����
	 */
	public boolean isProtectPara() {
		return BitFlag.get(value, 18);
	}
	
	/**
	 * ���� ��ȣ ���θ�  �����Ѵ�. (18 bit)
	 * @param protectPara ���� ��ȣ ����
	 */
	public void setProtectPara(boolean protectPara) {
		value = BitFlag.set(value, 18, protectPara);
	}
	
	/**
	 * ���� �տ��� �׻� �� ���� ���θ� ��ȯ�Ѵ�. (19 bit)
	 * @return ���� �տ��� �׻� �� ���� ����
	 */
	public boolean isSplitPageBeforePara() {
		return BitFlag.get(value, 19);
	}
	
	/**
	 * ���� �տ��� �׻� �� ���� ���θ� �����Ѵ�. (19 bit)
	 * @param splitPageBeforePara ���� �տ��� �׻� �� ���� ����
	 */
	public void setSplitPageBeforePara(boolean splitPageBeforePara) {
		value = BitFlag.set(value, 19, splitPageBeforePara);
	}
	
	/**
	 * ���� ������ ��ȯ�Ѵ�. (20~21 bit) 
	 * @return ���� ���� 
	 */
	public VerticalAlignment getVerticalAlignment() {
		return VerticalAlignment.valueOf((byte) BitFlag.get(value, 20, 21));
	}
	
	/**
	 * ���� ������ �����Ѵ�. (20~21 bit)
	 * @param verticalAlignment ���� ����
	 */
	public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
		value = BitFlag.set(value, 20, 21, verticalAlignment.getValue());
	}
	
	/**
	 * �۲ÿ� ��︮�� �� ���� ���θ� ��ȯ�Ѵ�. (22 bit)
	 * @return �۲ÿ� ��︮�� �� ���� ����
	 */
	public boolean isLineHeightForFont() {
		return BitFlag.get(value, 22);
	}

	/**
	 * �۲ÿ� ��︮�� �� ���� ���θ� �����Ѵ�. (22 bit)
	 * @param lineHeightForFont �۲ÿ� ��︮�� �� ���� ����
 	 */
	public void setLineHeightForFont(boolean lineHeightForFont) {
		value = BitFlag.set(value, 22, lineHeightForFont);
	}
	
	/**
	 * ���� �Ӹ��� ����� ��ȯ�Ѵ�. (23~24 bit)
	 * @return ���� �Ӹ��� ���
	 */
	public ParaHeadShape getParaHeadShape() {
		return ParaHeadShape.valueOf((byte) BitFlag.get(value, 23, 24));
	}
	
	/**
	 * ���� �Ӹ��� ����� �����Ѵ�. (23~24 bit)
	 * @param paraHeadShape ���� �Ӹ��� ���
	 */
	public void setParaHeadShape(ParaHeadShape paraHeadShape) {
		value = BitFlag.set(value, 23,	24, paraHeadShape.getValue());
	}
	
	/**
	 * ���� ����(1���آ�7����)�� ��ȭ�Ѵ�. (25~27 bit)
	 * @return ���� ����
	 */
	public byte getParaLevel() {
		return (byte) BitFlag.get(value, 25, 27);
	}
	
	/**
	 * ���� ������ �����Ѵ�. (25~27 bit)
	 * @param paraLevel ���� ����
	 */
	public void setParaLevel(byte paraLevel) {
		value = BitFlag.set(value, 25, 27, paraLevel);
	}
	
	/**
	 * ���� �׵θ� ���� ���θ� ��ȯ�Ѵ�. (28 bit)
	 * @return ���� �׵θ� ���� ����
	 */
	public boolean isLinkBorder() {
		return BitFlag.get(value, 28);
	}

	/**
	 * ���� �׵θ� ���� ���θ� �����Ѵ�. (28 bit) 
	 * @param linkBorder ���� �׵θ� ���� ����
	 */
	public void setLinkBorder(boolean linkBorder) {
		value = BitFlag.set(value, 28, linkBorder);
	}
	
	/**
	 * ���� ���� ���� ���θ� ��ȯ�Ѵ�. (29 bit) 
	 * @return ���� ���� ���� ����  
	 */
	public boolean isIgnoreParaMargin() {
		return BitFlag.get(value, 29);
	}
	
	/**
	 * ���� ���� ���� ���θ� �����Ѵ�. (29 bit)
	 * @param ignoreParaMargin ���� ���� ���� ����
	 */
	public void setIgnoreParaMargin(boolean ignoreParaMargin) {
		value = BitFlag.set(value, 29, ignoreParaMargin);
	}
	
	/**
	 * ���� ���� ���(??)�� ��ȯ�Ѵ�. (30 bit)
	 * @return ���� ���� ���(??)
	 */
	public boolean isParaTailShape() {
		return BitFlag.get(value, 30);
	}
	
	/**
	 * ���� ���� ���(??)�� �����Ѵ�. (30 bit)
	 * @param paraTailShape ���� ���� ���(??)
	 */
	public void setParaTailShape(boolean paraTailShape) {
		value = BitFlag.set(value, 30, paraTailShape);
	}
}
