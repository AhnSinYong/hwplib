package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.sectiondefine;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ���� ��Ʈ���� �Ӽ� ��ü
 * 
 * @author neoloed
 */
public class SectionDefineHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public SectionDefineHeaderProperty() {
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
	 * �Ӹ����� ������ ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �Ӹ����� ������ ����
	 */
	public boolean isHideHeader() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �Ӹ����� ������ ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param hideHeader
	 *            �Ӹ����� ������ ����
	 */
	public void setHideHeader(boolean hideHeader) {
		value = BitFlag.set(value, 0, hideHeader);
	}

	/**
	 * �������� ������ ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �������� ������ ����
	 */
	public boolean isHideFooter() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �������� ������ ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @param hideFooter
	 *            �������� ������ ����
	 */
	public void setHideFooter(boolean hideFooter) {
		value = BitFlag.set(value, 1, hideFooter);
	}

	/**
	 * �������� ������ ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return �������� ������ ����
	 */
	public boolean isHideBatangPage() {
		return BitFlag.get(value, 2);
	}

	/**
	 * �������� ������ ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param hideBatangPage
	 *            �������� ������ ����
	 */
	public void setHideBatangPage(boolean hideBatangPage) {
		value = BitFlag.set(value, 2, hideBatangPage);
	}

	/**
	 * �׵θ��� ������ ���θ� ��ȯ�Ѵ�. (3 bit)
	 * 
	 * @return �׵θ��� ������ ����
	 */
	public boolean isHideBorder() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �׵θ��� ������ ���θ� �����Ѵ�. (3 bit)
	 * 
	 * @param hideBorder
	 *            �׵θ��� ������ ����
	 */
	public void setHideBorder(boolean hideBorder) {
		value = BitFlag.set(value, 3, hideBorder);
	}

	/**
	 * ����� ������ ���θ� ��ȯ�Ѵ�. (4 bit)
	 * 
	 * @return ����� ������ ����
	 */
	public boolean isHideBackground() {
		return BitFlag.get(value, 4);
	}

	/**
	 * ����� ������ ���θ� �����Ѵ�. (4 bit)
	 * 
	 * @param hideBackground
	 *            ����� ������ ����
	 */
	public void setHideBackground(boolean hideBackground) {
		value = BitFlag.set(value, 4, hideBackground);
	}

	/**
	 * �� ��ȣ ��ġ�� ������ ���θ� ��ȯ�Ѵ�. (5 bit)
	 * 
	 * @return �� ��ȣ ��ġ�� ������ ����
	 */
	public boolean isHidePageNumberPosition() {
		return BitFlag.get(value, 5);
	}

	/**
	 * �� ��ȣ ��ġ�� ������ ���θ� �����Ѵ�. (5 bit)
	 * 
	 * @param hidePageNumberPosition
	 *            �� ��ȣ ��ġ�� ������ ����
	 */
	public void setHidePageNumberPosition(boolean hidePageNumberPosition) {
		value = BitFlag.set(value, 5, hidePageNumberPosition);
	}

	/**
	 * ������ ù �ʿ��� �׵θ� ǥ�� ���θ� ��ȯ�Ѵ�. (8 bit)
	 * 
	 * @return ������ ù �ʿ��� �׵θ� ǥ�� ����
	 */
	public boolean isDisplayBorderAtFirstPageOfSection() {
		return BitFlag.get(value, 8);
	}

	/**
	 * ������ ù �ʿ��� �׵θ� ǥ�� ���θ� �����Ѵ�. (8 bit)
	 * 
	 * @param displayBorderAtFirstPageOfSection
	 *            ������ ù �ʿ��� �׵θ� ǥ�� ����
	 */
	public void setDisplayBorderAtFirstPageOfSection(
			boolean displayBorderAtFirstPageOfSection) {
		value = BitFlag.set(value, 8, displayBorderAtFirstPageOfSection);
	}

	/**
	 * ������ ù �ʿ��� ��� ǥ�� ���θ� ��ȯ�Ѵ�. (9 bit)
	 * 
	 * @return ������ ù �ʿ��� ��� ǥ�� ����
	 */
	public boolean isDisplayBackgroundAtFirstPageOfSection() {
		return BitFlag.get(value, 9);
	}

	/**
	 * ������ ù �ʿ��� ��� ǥ�� ���θ� �����Ѵ�. (9 bit)
	 * 
	 * @param displayBackgroundAtFirstPageOfSection
	 *            ������ ù �ʿ��� ��� ǥ�� ����
	 */
	public void setDisplayBackgroundAtFirstPageOfSection(
			boolean displayBackgroundAtFirstPageOfSection) {
		value = BitFlag.set(value, 9, displayBackgroundAtFirstPageOfSection);
	}

	/**
	 * �ؽ�Ʈ ������ ��ȯ�Ѵ�. (16~18 bit)
	 * 
	 * @return �ؽ�Ʈ ����
	 */
	public TextDirection getTextDirection() {
		return TextDirection.valueOf((byte) BitFlag.get(value, 16, 18));
	}

	/**
	 * �ؽ�Ʈ ������ �����Ѵ�. (16~18 bit)
	 * 
	 * @param textDirection
	 *            �ؽ�Ʈ ����
	 */
	public void setTextDirection(TextDirection textDirection) {
		value = BitFlag.set(value, 16, 18, textDirection.getValue());
	}

	/**
	 * �� �� ���� ���θ� ��ȯ�Ѵ�. (19 bit)
	 * 
	 * @return �� �� ���� ����
	 */
	public boolean isHideEmptyLine() {
		return BitFlag.get(value, 19);
	}

	/**
	 * �� �� ���� ���θ� �����Ѵ�. (19 bit)
	 * 
	 * @param hideEmptyLine
	 *            �� �� ���� ����
	 */
	public void setHideEmptyLine(boolean hideEmptyLine) {
		value = BitFlag.set(value, 19, hideEmptyLine);
	}

	/**
	 * ���� �������� �� �������� ���� ���� ������ ��ȣ �������� ���θ� ��ȯ�Ѵ�. (20~21 bit)
	 * 
	 * @return ���� �������� �� �������� ���� ���� ������ ��ȣ �������� ����
	 */
	public boolean isApplyPageNumberByDivideSection() {
		return BitFlag.get(value, 20) | BitFlag.get(value, 21);
	}

	/**
	 * ���� �������� �� �������� ���� ���� ������ ��ȣ �������� ���θ� �����Ѵ�. (20~21 bit)
	 * 
	 * @param applyPageNumberByDivideSection
	 *            ���� �������� �� �������� ���� ���� ������ ��ȣ �������� ����
	 */
	public void setApplyPageNumberByDivideSection(
			boolean applyPageNumberByDivideSection) {
		value = BitFlag.set(value, 20, applyPageNumberByDivideSection);
		value = BitFlag.set(value, 21, applyPageNumberByDivideSection);
	}

	/**
	 * ������ ������ ���� ���θ� ��ȯ�Ѵ�. (22 bit)
	 * 
	 * @return ������ ������ ���� ����
	 */
	public boolean isApplyWongoji() {
		return BitFlag.get(value, 22);
	}

	/**
	 * ������ ������ ���� ���θ� �����Ѵ�. (22 bit)
	 * 
	 * @param applyWongoji
	 *            ������ ������ ���� ����
	 */
	public void setApplyWongoji(boolean applyWongoji) {
		value = BitFlag.set(value, 22, applyWongoji);
	}
}
