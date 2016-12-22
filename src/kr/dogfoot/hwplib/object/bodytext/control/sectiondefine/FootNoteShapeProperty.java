package kr.dogfoot.hwplib.object.bodytext.control.sectiondefine;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ��翡 ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class FootNoteShapeProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public FootNoteShapeProperty() {
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
	 * ��ȣ ����� ��ȯ�Ѵ�. (0~7 bit) (0~16 �� ����. 0x80, 0x81�� ����/���� ����)
	 * 
	 * @return ��ȣ ���
	 */
	public NumberShape getNumberShape() {
		return NumberShape.valueOf((short) BitFlag.get(value, 0, 7));
	}

	/**
	 * ��ȣ ����� �����Ѵ�. (0~7 bit) (0~16 �� ����. 0x80, 0x81�� ����/���� ����)
	 * 
	 * @param numberShape
	 *            ��ȣ ���
	 */
	public void setNumberShape(NumberShape numberShape) {
		value = BitFlag.set(value, 0, 7, numberShape.getValue());
	}

	/**
	 * �� ������ ������ ���ָ� �ٴܿ� ��ġ��ų ����� ��ȯ�Ѵ�.(���� �� ���) (8~9 bit)
	 * 
	 * @return �� ������ ������ ���ָ� �ٴܿ� ��ġ��ų ���
	 */
	public FootNoteDisplayMethod getFootNoteDisplayMethod() {
		return FootNoteDisplayMethod.valueOf((byte) BitFlag.get(value, 8, 9));
	}

	/**
	 * �� ������ ������ ���ָ� �ٴܿ� ��ġ��ų ����� �����Ѵ�. (���� �� ���) (8~9 bit)
	 * 
	 * @param footNoteDisplayMethod
	 *            �� ������ ������ ���ָ� �ٴܿ� ��ġ��ų ���
	 */
	public void setFootNoteDisplayMethod(
			FootNoteDisplayMethod footNoteDisplayMethod) {
		value = BitFlag.set(value, 8, 9, footNoteDisplayMethod.getValue());
	}

	/**
	 * ���ָ� ��ġ��ų ����� ��ȯ�Ѵ�.(���� �� ���) (8~9 bit)
	 * 
	 * @return ���ָ� ��ġ��ų ���
	 */
	public EndNoteDisplayMethod getEndNoteDisplayMethod() {
		return EndNoteDisplayMethod.valueOf((byte) BitFlag.get(value, 8, 9));
	}

	/**
	 * ���ָ� ��ġ��ų ����� �����Ѵ�.(���� �� ���) (8~9 bit)
	 * 
	 * @param endNoteDisplayMethod
	 *            ���ָ� ��ġ��ų ���
	 */
	public void setEndNoteDisplayMethod(
			EndNoteDisplayMethod endNoteDisplayMethod) {
		value = BitFlag.set(value, 8, 9, endNoteDisplayMethod.getValue());
	}

	/**
	 * ��ȣ �ű� ����� ��ȯ�Ѵ�. (10~11 bit)
	 * 
	 * @return ��ȣ �ű� ���
	 */
	public NumberingMethod getNumberingMethod() {
		return NumberingMethod.valueOf((byte) BitFlag.get(value, 10, 11));
	}

	/**
	 * ��ȣ �ű� ����� �����Ѵ�. (10~11 bit)
	 * 
	 * @param numberingMethod
	 *            ��ȣ �ű� ���
	 */
	public void setNumberingMethod(NumberingMethod numberingMethod) {
		value = BitFlag.set(value, 10, 11, numberingMethod.getValue());
	}

	/**
	 * ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ������ ��ȯ�Ѵ�. (12 bit)
	 * 
	 * @return ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ����
	 */
	public boolean isDisplayWithSupscript() {
		return BitFlag.get(value, 12);
	}

	/**
	 * ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ���θ� �����Ѵ�. (12 bit)
	 * 
	 * @param displayWithSupscript
	 *            ���� ���� �� ��ȣ �ڵ��� ����� �� ÷�� �������� ���� ����
	 */
	public void setDisplayWithSupscript(boolean displayWithSupscript) {
		value = BitFlag.set(value, 12, displayWithSupscript);
	}

	/**
	 * �ؽ�Ʈ�� �̾� �ٷ� ������� ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return �ؽ�Ʈ�� �̾� �ٷ� ������� ����
	 */
	public boolean isContinueFromText() {
		return BitFlag.get(value, 13);
	}

	/**
	 * �ؽ�Ʈ�� �̾� �ٷ� ������� ���θ� �����Ѵ�. (13 bit)
	 * 
	 * @param continueFromText
	 *            �ؽ�Ʈ�� �̾� �ٷ� ������� ����
	 */
	public void setContinueFromText(boolean continueFromText) {
		value = BitFlag.set(value, 13, continueFromText);
	}
}
