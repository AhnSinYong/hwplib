package kr.dogfoot.hwplib.object.docinfo.tabdef;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� ������ �Ӽ� ��ü
 * 
 * @author neolord
 */
public class TabDefProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public TabDefProperty() {
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
	 * ���� ���� �� �ڵ� ��(���� ����� �ڵ� ��) ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ���� ���� �� �ڵ� ��(���� ����� �ڵ� ��) ����
	 */
	public boolean isAutoTabAtParagraphLeftEnd() {
		return BitFlag.get(value, 0);
	}

	/**
	 * ���� ���� �� �ڵ� ��(���� ����� �ڵ� ��) ������ �����Ѵ�. (0 bit)
	 * 
	 * @param autoTabAtParagraphLeftEnd
	 *            ���� ���� �� �ڵ� ��(���� ����� �ڵ� ��) ����
	 */
	public void setAutoTabAtParagraphLeftEnd(boolean autoTabAtParagraphLeftEnd) {
		value = BitFlag.set(value, 0, autoTabAtParagraphLeftEnd);
	}

	/**
	 * ���� ������ �� �ڵ� �� ������ ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return ���� ������ �� �ڵ� �� ����
	 */
	public boolean isAutoTabAtParagraphRightEnd() {
		return BitFlag.get(value, 1);
	}

	/**
	 * ���� ������ �� �ڵ� �� ������ �����Ѵ�. (1 bit)
	 * 
	 * @param autoTabAtParagraphRightEnd
	 *            ���� ������ �� �ڵ� �� ����
	 */
	public void setAutoTabAtParagraphRightEnd(boolean autoTabAtParagraphRightEnd) {
		value = BitFlag.set(value, 1, autoTabAtParagraphRightEnd);
	}
}
