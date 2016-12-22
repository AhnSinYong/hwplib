package kr.dogfoot.hwplib.object.bodytext.control.gso.textbox;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.sectiondefine.TextDirection;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ����Ʈ ����� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ListHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ListHeaderProperty() {
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
	 * �ؽ�Ʈ ������ ��ȯ�Ѵ�. (0~2 bit)
	 * 
	 * @return �ؽ�Ʈ ����
	 */
	public TextDirection getTextDirection() {
		return TextDirection.valueOf((byte) BitFlag.get(value, 0, 2));
	}

	/**
	 * �ؽ�Ʈ ������ �����Ѵ�. (0~2 bit)
	 * 
	 * @param textDirection
	 */
	public void setTextDirection(TextDirection textDirection) {
		value = BitFlag.set(value, 0, 2, textDirection.getValue());
	}

	/**
	 * ������ �ٹٲ� ����� ��ȯ�Ѵ�. (3~4 bit)
	 * 
	 * @return ������ �ٹٲ� ���
	 */
	public LineChange getLineChange() {
		return LineChange.valueOf((byte) BitFlag.get(value, 3, 4));
	}

	/**
	 * ������ �ٹٲ� ����� �����Ѵ�. (3~4 bit)
	 * 
	 * @param lineChange
	 *            ������ �ٹٲ� ���
	 */
	public void setLineChange(LineChange lineChange) {
		value = BitFlag.set(value, 3, 4, lineChange.getValue());
	}

	/**
	 * ���� ���� ����� ��ȯ�Ѵ�. (5~6 bit)
	 * 
	 * @return ���� ���� ���
	 */
	public TextVerticalAlignment getTextVerticalAlignment() {
		return TextVerticalAlignment.valueOf((byte) BitFlag.get(value, 5, 6));
	}

	/**
	 * ���� ���� ����� �����Ѵ�. (5~6 bit)
	 * 
	 * @param textVerticalAlignment
	 *            ���� ���� ���
	 */
	public void setTextVerticalAlignment(
			TextVerticalAlignment textVerticalAlignment) {
		value = BitFlag.set(value, 5, 6, textVerticalAlignment.getValue());
	}
}
