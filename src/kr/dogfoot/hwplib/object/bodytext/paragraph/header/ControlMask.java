package kr.dogfoot.hwplib.object.bodytext.paragraph.header;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���ܿ� ���Ե� ��Ʈ���� ������ ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ControlMask {
	/**
	 * ���Ͽ� ����Ǵ� �� (unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ControlMask() {
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
	 * ������ ����/�� ���� ��Ʈ���� �������� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ������ ����/�� ���� ��Ʈ���� �������� ����
	 */
	public boolean hasSectColDef() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ������ ����/�� ���� ��Ʈ���� �������� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param hasSectColDef
	 *            ������ ����/�� ���� ��Ʈ���� �������� ����
	 */
	public void setHasSectColDef(boolean hasSectColDef) {
		value = BitFlag.set(value, 2, hasSectColDef);
	}

	/**
	 * �ʵ� ���� ��Ʈ���� �������� ���θ� ��ȯ�Ѵ�. (3 bit)
	 * 
	 * @return �ʵ� ���� ��Ʈ���� �������� ����
	 */
	public boolean hasFieldStart() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �ʵ� ���� ��Ʈ���� �������� ���θ� �����Ѵ�. (3 bit)
	 * 
	 * @param hasFieldStart
	 *            �ʵ� ���� ��Ʈ���� �������� ����
	 */
	public void setHasFieldStart(boolean hasFieldStart) {
		value = BitFlag.set(value, 3, hasFieldStart);
	}

	/**
	 * �ʵ� �� ��Ʈ���� �������� ���θ� ��ȯ�Ѵ�. (4 bit)
	 * 
	 * @return �ʵ� �� ��Ʈ���� �������� ����
	 */
	public boolean hasFieldEnd() {
		return BitFlag.get(value, 4);
	}

	/**
	 * �ʵ� �� ��Ʈ���� �������� ���θ� �����Ѵ�. (4 bit)
	 * 
	 * @param hasFieldEnd
	 *            �ʵ� �� ��Ʈ���� �������� ����
	 */
	public void setHasFieldEnd(boolean hasFieldEnd) {
		value = BitFlag.set(value, 4, hasFieldEnd);
	}

	/**
	 * ���� �������� ���θ� ��ȯ�Ѵ�. (9 bit)
	 * 
	 * @return ���� �������� ����
	 */
	public boolean hasTab() {
		return BitFlag.get(value, 9);
	}

	/**
	 * ���� �������� ���θ� �����Ѵ�. (9 bit)
	 * 
	 * @param hasTab
	 *            ���� �������� ����
	 */
	public void setHasTab(boolean hasTab) {
		value = BitFlag.set(value, 9, hasTab);
	}

	/**
	 * ���� �� ������ �������� ���θ� ��ȯ�Ѵ�. (10 bit)
	 * 
	 * @return ���� �� ������ �������� ����
	 */
	public boolean hasDivideLineForce() {
		return BitFlag.get(value, 10);
	}

	/**
	 * ���� �� ������ �������� ���θ� �����Ѵ�. (10 bit)
	 * 
	 * @param hasDivideLineForce
	 *            ���� �� ������ �������� ����
	 */
	public void setHasDivideLineForce(boolean hasDivideLineForce) {
		value = BitFlag.set(value, 10, hasDivideLineForce);
	}

	/**
	 * �׸��� ��ü �Ǵ� ǥ ��ü�� �������� ���θ� ��ȯ�Ѵ�. (11 bit)
	 * 
	 * @return �׸��� ��ü �Ǵ� ǥ ��ü�� �������� ����
	 */
	public boolean hasGsoTable() {
		return BitFlag.get(value, 11);
	}

	/**
	 * �׸��� ��ü �Ǵ� ǥ ��ü�� �������� ���θ� �����Ѵ�. (11 bit)
	 * 
	 * @param hasObjectTable
	 *            �׸��� ��ü �Ǵ� ǥ ��ü�� �������� ����
	 */
	public void setHasGsoTable(boolean hasObjectTable) {
		value = BitFlag.set(value, 11, hasObjectTable);
	}

	/**
	 * ���� �����⸦ �������� ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return ���� �����⸦ �������� ����
	 */
	public boolean hasDivideParagraph() {
		return BitFlag.get(value, 13);
	}

	/**
	 * ���� �����⸦ �������� ���θ� �����Ѵ�. (13 bit)
	 * 
	 * @param hasDivideParagraph
	 *            ���� �����⸦ �������� ����
	 */
	public void setHasDivideParagraph(boolean hasDivideParagraph) {
		value = BitFlag.set(value, 13, hasDivideParagraph);
	}

	/**
	 * �ּ��� �������� ���θ� ��ȯ�Ѵ�. (15 bit)
	 * 
	 * @return �ּ��� �������� ����
	 */
	public boolean hasRemark() {
		return BitFlag.get(value, 15);
	}

	/**
	 * �ּ��� �������� ���θ� �����Ѵ�. (15 bit)
	 * 
	 * @param hasRemark
	 *            �ּ��� �������� ����
	 */
	public void setHasRemark(boolean hasRemark) {
		value = BitFlag.set(value, 15, hasRemark);
	}

	/**
	 * �Ӹ��� �Ǵ� �������� �������� ���θ� ��ȯ�Ѵ�. (16 bit)
	 * 
	 * @return �Ӹ��� �Ǵ� �������� �������� ����
	 */
	public boolean hasHeaderFooter() {
		return BitFlag.get(value, 16);
	}

	/**
	 * �Ӹ��� �Ǵ� �������� �������� ���θ� �����Ѵ�. (16 bit)
	 * 
	 * @param hasHeaderFooter
	 *            �Ӹ��� �Ǵ� �������� �������� ����
	 */
	public void setHasHeaderFooter(boolean hasHeaderFooter) {
		value = BitFlag.set(value, 16, hasHeaderFooter);
	}

	/**
	 * ���� �Ǵ� ���ָ� �������� ���θ� ��ȯ�Ѵ�. (17 bit)
	 * 
	 * @return ���� �Ǵ� ���ָ� �������� ����
	 */
	public boolean hasFootnoteEndnote() {
		return BitFlag.get(value, 17);
	}

	/**
	 * ���� �Ǵ� ���ָ� �������� ���θ� �����Ѵ�. (17 bit)
	 * 
	 * @param hasFootnoteEndnote
	 *            ���� �Ǵ� ���ָ� �������� ����
	 */
	public void setHasFootnoteEndnote(boolean hasFootnoteEndnote) {
		value = BitFlag.set(value, 17, hasFootnoteEndnote);
	}

	/**
	 * �ڵ� ��ȣ�� �������� ���θ� ��ȯ�Ѵ�. (18 bit)
	 * 
	 * @return �ڵ� ��ȣ�� �������� ����
	 */
	public boolean hasAutoNumber() {
		return BitFlag.get(value, 18);
	}

	/**
	 * �ڵ� ��ȣ�� �������� ���θ� �����Ѵ�. (18 bit)
	 * 
	 * @param hasAutoNumber
	 *            �ڵ� ��ȣ�� �������� ����
	 */
	public void setHasAutoNumber(boolean hasAutoNumber) {
		value = BitFlag.set(value, 18, hasAutoNumber);
	}

	/**
	 * �� �ٲ��� �������� ���θ� ��ȯ�Ѵ�. (21 bit)
	 * 
	 * @return �� �ٲ��� �������� ����
	 */
	public boolean hasPageFeed() {
		return BitFlag.get(value, 21);
	}

	/**
	 * �� �ٲ��� �������� ���θ� �����Ѵ�. (21 bit)
	 * 
	 * @param hasPageFeed
	 *            �� �ٲ��� �������� ����
	 */
	public void setHasPageFeed(boolean hasPageFeed) {
		value = BitFlag.set(value, 21, hasPageFeed);
	}

	/**
	 * å����/ã�̺��� ǥ�ø� �������� ���θ� ��ȯ�Ѵ�. (22 bit)
	 * 
	 * @return å����/ã�̺��� ǥ�ø� �������� ����
	 */
	public boolean hasBookmark() {
		return BitFlag.get(value, 22);
	}

	/**
	 * å����/ã�̺��� ǥ�ø� �������� ���θ� �����Ѵ�. (22 bit)
	 * 
	 * @param hasBookmark
	 *            å����/ã�̺��� ǥ�ø� �������� ����
	 */
	public void setHasBookmark(boolean hasBookmark) {
		value = BitFlag.set(value, 22, hasBookmark);
	}

	/**
	 * ����/���� ��ħ�� �������� ���θ� ��ȯ�Ѵ�. (23 bit)
	 * 
	 * @return ����/���� ��ħ�� �������� ����
	 */
	public boolean hasDutMalOverlapLetter() {
		return BitFlag.get(value, 23);
	}

	/**
	 * ����/���� ��ħ�� �������� ���θ� �����Ѵ�. (23 bit)
	 * 
	 * @param hasOverlapLetter
	 *            ����/���� ��ħ�� �������� ����
	 */
	public void setHasDutMalOverlapLetter(boolean hasOverlapLetter) {
		value = BitFlag.set(value, 23, hasOverlapLetter);
	}

	/**
	 * �������� �������� ���θ� ��ȯ�Ѵ�. (24 bit)
	 * 
	 * @return �������� �������� ����
	 */
	public boolean hasHyphen() {
		return BitFlag.get(value, 24);
	}

	/**
	 * �������� �������� ���θ� �����Ѵ�. (24 bit)
	 * 
	 * @param hasHyphen
	 *            �������� �������� ����
	 */
	public void setHasHyphen(boolean hasHyphen) {
		value = BitFlag.set(value, 24, hasHyphen);
	}

	/**
	 * ���� ��ĭ�� �������� ���θ� ��ȯ�Ѵ�. (30 bit)
	 * 
	 * @return ���� ��ĭ�� �������� ����
	 */
	public boolean hasBundleBlank() {
		return BitFlag.get(value, 30);
	}

	/**
	 * ���� ��ĭ�� �������� ���θ� �����Ѵ�. (30 bit)
	 * 
	 * @param hasBundleBlank
	 *            ���� ��ĭ�� �������� ����
	 */
	public void setHasBundleBlank(boolean hasBundleBlank) {
		value = BitFlag.set(value, 30, hasBundleBlank);
	}

	/**
	 * ���� �� ��ĭ�� �������� ���θ� ��ȯ�Ѵ�. (31 bit)
	 * 
	 * @return ���� �� ��ĭ�� �������� ����
	 */
	public boolean hasFixWidthBlank() {
		return BitFlag.get(value, 31);
	}

	/**
	 * ���� �� ��ĭ�� �������� ���θ� �����Ѵ�. (31 bit)
	 * 
	 * @param hasFixWidthBlank
	 *            ���� �� ��ĭ�� �������� ����
	 */
	public void setHasFixWidthBlank(boolean hasFixWidthBlank) {
		value = BitFlag.set(value, 31, hasFixWidthBlank);
	}
}
