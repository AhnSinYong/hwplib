package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ä��� ����
 * 
 * @author neolord
 */
public class FillType {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public FillType() {
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
	 * �ܻ� ä��� ���� ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �ܻ� ä��� ���� ����
	 */
	public boolean hasPatternFill() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �ܻ� ä��� ���� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param patternFill
	 *            �ܻ� ä��� ���� ����
	 */
	public void setPatternFill(boolean patternFill) {
		value = BitFlag.set(value, 0, patternFill);
	}

	/**
	 * �̹��� ä��� ���� ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �̹��� ä��� ���� ����
	 */
	public boolean hasImageFill() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �̹��� ä��� ���� ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param imageFill
	 *            �̹��� ä��� ���� ����
	 */
	public void setImageFill(boolean imageFill) {
		value = BitFlag.set(value, 1, imageFill);
	}

	/**
	 * �׷����̼� ä��� ���� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return �׷����̼� ä��� ���� ����
	 */
	public boolean hasGradientFill() {
		return BitFlag.get(value, 2);
	}

	/**
	 * �׷����̼� ä��� ���� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param gradientFill
	 *            �׷����̼� ä��� ���� ����
	 */
	public void setGradientFill(boolean gradientFill) {
		value = BitFlag.set(value, 2, gradientFill);
	}
}
