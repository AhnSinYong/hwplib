package kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �� ���� align ������ �±� ������ ���� ��ü
 * 
 * @author neolord
 */
public class LineSegItemTag {
	/**
	 * ���Ͽ� ����Ǵ� �� (unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public LineSegItemTag() {
	}

	/**
	 * ���Ͽ� ����Ǵ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ��
	 */
	public long getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� ���� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ��
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * �������� ù ������ ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �������� ù ������ ����
	 */
	public boolean isFirstLineAtPage() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �������� ù ������ ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param firstLineAtPage
	 *            �������� ù ������ ����
	 */
	public void setFirstLineAtPage(boolean firstLineAtPage) {
		value = BitFlag.set(value, 0, firstLineAtPage);
	}

	/**
	 * �÷��� ù ������ ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �÷��� ù ������ ����
	 */
	public boolean isFirstLineAtColumn() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �÷��� ù ������ ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param firstLineAtColumn
	 *            �÷��� ù ������ ����
	 */
	public void setFirstLineAtColumn(boolean firstLineAtColumn) {
		value = BitFlag.set(value, 1, firstLineAtColumn);
	}

	/**
	 * �ؽ�Ʈ�� �迭���� ���� �� ���׸�Ʈ���� ���θ� ��ȯ�Ѵ�. (16 bit)
	 * 
	 * @return �ؽ�Ʈ�� �迭���� ���� �� ���׸�Ʈ���� ����
	 */
	public boolean isEmptySegment() {
		return BitFlag.get(value, 16);
	}

	/**
	 * �ؽ�Ʈ�� �迭���� ���� �� ���׸�Ʈ���� ���θ� �����Ѵ�. (16 bit)
	 * 
	 * @param emptySegment
	 *            �ؽ�Ʈ�� �迭���� ���� �� ���׸�Ʈ���� ����
	 */
	public void setEmptySegment(boolean emptySegment) {
		value = BitFlag.set(value, 16, emptySegment);
	}

	/**
	 * ���� ù ���׸�Ʈ���� ���θ� ��ȯ�Ѵ�. (17 bit)
	 * 
	 * @return ���� ù ���׸�Ʈ���� ����
	 */
	public boolean getFirstSegmentAtLine() {
		return BitFlag.get(value, 17);
	}

	/**
	 * ���� ù ���׸�Ʈ���� ���θ� �����Ѵ�. (17 bit)
	 * 
	 * @param firstSegmentAtLine
	 *            ���� ù ���׸�Ʈ���� ����
	 */
	public void setFirstSegmentAtLine(boolean firstSegmentAtLine) {
		value = BitFlag.set(value, 17, firstSegmentAtLine);
	}

	/**
	 * ���� ������ ���׸�Ʈ���� ���θ� ��ȯ�Ѵ�. (18 bit)
	 * 
	 * @return ���� ������ ���׸�Ʈ���� ����
	 */
	public boolean getLastSegmentAtLine() {
		return BitFlag.get(value, 18);
	}

	/**
	 * ���� ������ ���׸�Ʈ���� ���θ� �����Ѵ�. (18 bit)
	 * 
	 * @param lastSegmentAtLine
	 *            ���� ������ ���׸�Ʈ���� ����
	 */
	public void setLastSegmentAtLine(boolean lastSegmentAtLine) {
		value = BitFlag.set(value, 18, lastSegmentAtLine);
	}

	/**
	 * ���� �������� auto-hyphenation�� ����Ǿ����� ���θ� ��ȯ�Ѵ�. (19 bit)
	 * 
	 * @return ���� �������� auto-hyphenation�� ����Ǿ����� ����
	 */
	public boolean isAutoHyphenation() {
		return BitFlag.get(value, 19);
	}

	/**
	 * ���� �������� auto-hyphenation�� ����Ǿ����� ���θ� �����Ѵ�. (19 bit)
	 * 
	 * @param autoHyphenation
	 *            ���� �������� auto-hyphenation�� ����Ǿ����� ����
	 */
	public void setAutoHyphenation(boolean autoHyphenation) {
		value = BitFlag.set(value, 19, autoHyphenation);
	}

	/**
	 * indentation ���� ���θ� ��ȯ�Ѵ�. (20 bit)
	 * 
	 * @return indentation ���� ����
	 */
	public boolean isAdjustIndentation() {
		return BitFlag.get(value, 20);
	}

	/**
	 * indentation ���� ���θ� �����Ѵ�. (20 bit)
	 * 
	 * @param adjustIndentation
	 *            indentation ���� ����
	 */
	public void setAdjustIndentation(boolean adjustIndentation) {
		value = BitFlag.set(value, 20, adjustIndentation);
	}

	/**
	 * ���� �Ӹ� ��� ���� ���θ� ��ȯ�Ѵ�. (21 bit)
	 * 
	 * @return ���� �Ӹ� ��� ���� ����
	 */
	public boolean isAdjustBullet() {
		return BitFlag.get(value, 21);
	}

	/**
	 * ���� �Ӹ� ��� ���� ���θ� �����Ѵ�. (21 bit)
	 * 
	 * @param adjustBullet
	 *            ���� �Ӹ� ��� ���� ����
	 */
	public void setAdjustBullet(boolean adjustBullet) {
		value = BitFlag.set(value, 21, adjustBullet);
	}

	/**
	 * �������� ���Ǹ� ���� property�� ��ȯ�Ѵ�. (31 bit)
	 * 
	 * @return �������� ���Ǹ� ���� property
	 */
	public boolean getBit31() {
		return BitFlag.get(value, 31);
	}

	/**
	 * �������� ���Ǹ� ���� property�� �����Ѵ�. (bit 31)
	 * 
	 * @param bit31
	 *            �������� ���Ǹ� ���� property
	 */
	public void setBit31(boolean bit31) {
		value = BitFlag.set(value, 31, bit31);
	}
}
