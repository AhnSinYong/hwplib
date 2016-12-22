package kr.dogfoot.hwplib.object.docinfo.numbering;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� �Ӹ� ������ �Ӽ� ��ü
 * 
 * @author neolord
 */
public class ParagraphHeadInfoProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ParagraphHeadInfoProperty() {
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
	 * ������ ���� ������ ��ȯ�Ѵ�. (0~1 bit)
	 * 
	 * @return ������ ���� ����
	 */
	public ParagraphAlignment getParagraphAlignment() {
		return ParagraphAlignment.valueOf((byte) BitFlag.get(value, 0, 1));
	}

	/**
	 * ������ ���� ������ �����Ѵ�. (0~1 bit)
	 * 
	 * @param paragraphAlignment
	 *            ������ ���� ����
	 */
	public void setParagraphAlignment(ParagraphAlignment paragraphAlignment) {
		value = BitFlag.set(value, 0, 1, paragraphAlignment.getValue());
	}

	/**
	 * ��ȣ �ʺ� ���� �ν��Ͻ� ���ڿ��� �ʺ� ������ ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ��ȣ �ʺ� ���� �ν��Ͻ� ���ڿ��� �ʺ� ������ ����
	 */
	public boolean isFollowStringWidth() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ��ȣ �ʺ� ���� �ν��Ͻ� ���ڿ��� �ʺ� ������ ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param followStringWidth
	 *            ��ȣ �ʺ� ���� �ν��Ͻ� ���ڿ��� �ʺ� ������ ����
	 */
	public void setFollowStringWidth(boolean followStringWidth) {
		value = BitFlag.set(value, 2, followStringWidth);
	}

	/**
	 * �ڵ� ���� ���� ���θ� ��ȯ�Ѵ�. (3 bit)
	 * 
	 * @return �ڵ� ���� ���� ����
	 */
	public boolean isAutoIndent() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �ڵ� ���� ���� ���θ� �����Ѵ�. (3 bit)
	 * 
	 * @param autoIndent
	 *            �ڵ� ���� ���� ����
	 */
	public void setAutoIndent(boolean autoIndent) {
		value = BitFlag.set(value, 3, autoIndent);
	}

	/**
	 * ���غ� �������� �Ÿ� ������ ��ȯ�Ѵ�. (4 bit)
	 * 
	 * @return ���غ� �������� �Ÿ� ����
	 */
	public ValueType getValueTypeForDistanceFromBody() {
		if (BitFlag.get(value, 4) == false) {
			return ValueType.RatioForLetter;
		} else {
			return ValueType.Value;
		}
	}

	/**
	 * ���غ� �������� �Ÿ� ������ �����Ѵ�. (4 bit)
	 * 
	 * @param valueType
	 *            ���غ� �������� �Ÿ� ����
	 */
	public void setValueTypeForDistanceFromBody(ValueType valueType) {
		if (valueType == ValueType.RatioForLetter) {
			value = BitFlag.set(value, 4, false);
		} else {
			value = BitFlag.set(value, 4, true);
		}
	}
}
