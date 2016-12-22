package kr.dogfoot.hwplib.object.docinfo.parashape;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ����� �Ӽ�2 ��ü. (5.0.1.7 ���� �̻�)
 * 
 * @author neolord
 */
public class ParaShapeProperty2 {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;
	
	/**
	 * ������
	 */
	public ParaShapeProperty2() {
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
	 * �� �ٷ� �Է� ���θ� �����Ѵ�. (0~1 bit)
	 * @return �� �ٷ� �Է� ���� 
	 */
	public boolean isInputSingleLine() {
		return BitFlag.get(value, 0) | BitFlag.get(value, 1);
	}
	
	/**
	 * �� �ٷ� �Է� ���θ� �����Ѵ�. (0~1 bit)
	 * @param inputSingleLine �� �ٷ� �Է� ����
	 */
	public void setInputSingleLine(boolean inputSingleLine) {
		value = BitFlag.set(value, 0, inputSingleLine);
		value = BitFlag.set(value, 1, inputSingleLine);
	}

	/**
	 * �ѱ۰� ���� ������ �ڵ� ���� ���θ� ��ȯ�Ѵ�. (4 bit)
	 * @return �ѱ۰� ���� ������ �ڵ� ���� ����
	 */
	public boolean isAutoAdjustGapHangulEnglish() {
		return BitFlag.get(value, 4);
	}
	
	/**
	 * �ѱ۰� ���� ������ �ڵ� ���� ���θ� �����Ѵ�. (4 bit)
	 * @param autoAdjustGapHangulEnglish �ѱ۰� ���� ������ �ڵ� ���� ����
	 */
	public void setAutoAdjustGapHangulEnglish(boolean autoAdjustGapHangulEnglish) {
		value = BitFlag.set(value, 4, autoAdjustGapHangulEnglish);
	}
	
	/**
	 * �ѱ۰� ���� ������ �ڵ� ���� ���θ� ��ȯ�Ѵ�. (5 bit)
	 * @return �ѱ۰� ���� ������ �ڵ� ���� ����
	 */
	public boolean isAutoAdjustGapHangulNumber() {
		return BitFlag.get(value, 5);
	}
	
	/**
	 * �ѱ۰� ���� ������ �ڵ� ���� ���θ� �����Ѵ�. (5 bit)
	 * @param autoAdjustGapHangulNumber �ѱ۰� ���� ������ �ڵ� ���� ����
	 */
	public void setAutoAdjustGapHangulNumber(boolean autoAdjustGapHangulNumber) {
		value = BitFlag.set(value, 5, autoAdjustGapHangulNumber);
	}
}
