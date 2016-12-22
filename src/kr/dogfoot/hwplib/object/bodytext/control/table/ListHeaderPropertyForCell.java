package kr.dogfoot.hwplib.object.bodytext.control.table;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.sectiondefine.TextDirection;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.LineChange;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextVerticalAlignment;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ���� ����Ʈ ����� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ListHeaderPropertyForCell {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ListHeaderPropertyForCell() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
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
	 *            �ؽ�Ʈ ����
	 */
	public void setTextDirection(TextDirection textDirection) {
		value = BitFlag.set(value, 0, 2, textDirection.getValue());
	}

	/**
	 * ������ �ٹٲ��� ��ȯ�Ѵ�. (3~4 bit)
	 * 
	 * @return ������ �ٹٲ� ���
	 */
	public LineChange getLineChange() {
		return LineChange.valueOf((byte) BitFlag.get(value, 3, 4));
	}

	/**
	 * ������ �ٹٲ��� �����Ѵ�. (3~4 bit)
	 * 
	 * @param lineChange
	 *            ������ �ٹٲ� ���
	 */
	public void setLineChange(LineChange lineChange) {
		value = BitFlag.set(value, 3, 4, lineChange.getValue());
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�. (5~6 bit)
	 * 
	 * @return ���� ����
	 */
	public TextVerticalAlignment getTextVerticalAlignment() {
		return TextVerticalAlignment.valueOf((byte) BitFlag.get(value, 5, 6));
	}

	/**
	 * ���� ������ �����Ѵ�. (5~6 bit)
	 * 
	 * @param textVerticalAlignment
	 *            ���� ����
	 */
	public void setTextVerticalAlignment(
			TextVerticalAlignment textVerticalAlignment) {
		value = BitFlag.set(value, 5, 6, textVerticalAlignment.getValue());
	}

	/**
	 * ��� ��忡�� ���� ���� ���θ� ��ȯ�Ѵ�. (19 bit)
	 * 
	 * @return ��� ��忡�� ���� ���� ����
	 */
	public boolean isEditableAtFormMode() {
		return BitFlag.get(value, 19);
	}

	/**
	 * ��� ��忡�� ���� ���� ���θ� �����Ѵ�. (19 bit)
	 * 
	 * @param editableAtFormMode
	 *            ��� ��忡�� ���� ���� ����
	 */
	public void setEditableAtFormMode(boolean editableAtFormMode) {
		value = BitFlag.set(value, 19, editableAtFormMode);
	}
}
