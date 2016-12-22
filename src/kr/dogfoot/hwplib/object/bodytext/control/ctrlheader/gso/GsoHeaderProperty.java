package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �׸��� ��ü ��Ʈ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class GsoHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public GsoHeaderProperty() {
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
	 * ����ó�� ��� ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return ����ó�� ��� ����
	 */
	public boolean isLikeWord() {
		return BitFlag.get(value, 0);
	}

	/**
	 * ����ó�� ��� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param likeWord
	 *            ����ó�� ��� ����
	 */
	public void setLikeWord(boolean likeWord) {
		value = BitFlag.set(value, 0, likeWord);
	}

	/**
	 * �� ���ݿ� ������ ���� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return �� ���ݿ� ������ ���� ����
	 */
	public boolean isApplyLineSpace() {
		return BitFlag.get(value, 2);
	}

	/**
	 * �� ���ݿ� ������ ���� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param applyLineSpace
	 *            �� ���ݿ� ������ ���� ����
	 */
	public void setApplyLineSpace(boolean applyLineSpace) {
		value = BitFlag.set(value, 2, applyLineSpace);
	}

	/**
	 * ���� ��ġ�� ������ ��ȯ�Ѵ�. (3~4 bit)
	 * 
	 * @return ���� ��ġ�� ����
	 */
	public VertRelTo getVertRelTo() {
		return VertRelTo.valueOf((byte) BitFlag.get(value, 3, 4));
	}

	/**
	 * ���� ��ġ�� ������ �����Ѵ�. (3~4 bit)
	 * 
	 * @param vertRelTo
	 *            ���� ��ġ�� ����
	 */
	public void setVertRelTo(VertRelTo vertRelTo) {
		value = BitFlag.set(value, 3, 4, vertRelTo.getValue());
	}

	/**
	 * ���� ��ġ�� ���ؿ� ���� ������� �迭����� ��ȯ�Ѵ�. (5~7 bit)
	 * 
	 * @return ���� ��ġ�� ���ؿ� ���� ������� �迭���
	 */
	public RelativeArrange getVertRelativeArrange() {
		return RelativeArrange.valueOf((byte) BitFlag.get(value, 5, 7));
	}

	/**
	 * ���� ��ġ�� ���ؿ� ���� ������� �迭��ĸ� �����Ѵ�. (5~7 bit)
	 * 
	 * @param vertRelativeArrange
	 *            ���� ��ġ�� ���ؿ� ���� ������� �迭���
	 */
	public void setVertRelativeArrange(RelativeArrange vertRelativeArrange) {
		value = BitFlag.set(value, 5, 7, vertRelativeArrange.getValue());
	}

	/**
	 * ���� ��ġ�� ������ ��ȯ�Ѵ�. (8~9 bit)
	 * 
	 * @return ���� ��ġ�� ����
	 */
	public HorzRelTo getHorzRelTo() {
		return HorzRelTo.valueOf((byte) BitFlag.get(value, 8, 9));
	}

	/**
	 * ���� ��ġ�� ������ �����Ѵ�. (8~9 bit)
	 * 
	 * @param horzRelTo
	 *            ���� ��ġ�� ����
	 */
	public void setHorzRelTo(HorzRelTo horzRelTo) {
		value = BitFlag.set(value, 8, 9, horzRelTo.getValue());
	}

	/**
	 * HorzRelTo�� ���� ������� �迭����� ��ȯ�Ѵ�. (10~12 bit)
	 * 
	 * @return HorzRelTo�� ���� ������� �迭���
	 */
	public RelativeArrange getHorzRelativeArrange() {
		return RelativeArrange.valueOf((byte) BitFlag.get(value, 10, 12));
	}

	/**
	 * HorzRelTo�� ���� ������� �迭����� �����Ѵ�. (10~12 bit)
	 * 
	 * @param horzRelativeArrange
	 *            HorzRelTo�� ���� ������� �迭���
	 */
	public void setHorzRelativeArrange(RelativeArrange horzRelativeArrange) {
		value = BitFlag.set(value, 10, 12, horzRelativeArrange.getValue());
	}

	/**
	 * VertRelTo�� ��para���� �� ������Ʈ�� ���� ��ġ�� ���� �������� �������� ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return VertRelTo�� ��para���� �� ������Ʈ�� ���� ��ġ�� ���� �������� �������� ����
	 */
	public boolean isVertRelToParaLimit() {
		return BitFlag.get(value, 13);
	}

	/**
	 * VertRelTo�� ��para���� �� ������Ʈ�� ���� ��ġ�� ���� �������� �������� ������ �����Ѵ�.
	 * 
	 * @param vertRelToParaLimit
	 *            VertRelTo�� ��para���� �� ������Ʈ�� ���� ��ġ�� ���� �������� �������� ����
	 */
	public void setVertRelToParaLimit(boolean vertRelToParaLimit) {
		value = BitFlag.set(value, 13, vertRelToParaLimit);
	}

	/**
	 * �ٸ� ������Ʈ�� ��ġ�� ���� ������� ������ �����Ѵ�. (14 bit)
	 * 
	 * @return �ٸ� ������Ʈ�� ��ġ�� ���� ������� ����
	 */
	public boolean isAllowOverlap() {
		return BitFlag.get(value, 14);
	}

	/**
	 * �ٸ� ������Ʈ�� ��ġ�� ���� ������� ������ �����Ѵ�. (14 bit)
	 * 
	 * @param allowOverlap
	 *            �ٸ� ������Ʈ�� ��ġ�� ���� ������� ����
	 */
	public void setAllowOverlap(boolean allowOverlap) {
		value = BitFlag.set(value, 14, allowOverlap);
	}

	/**
	 * ������Ʈ ���� ������ ��ȯ�Ѵ�. (15~17 bit)
	 * 
	 * @return ������Ʈ ���� ����
	 */
	public WidthCriterion getWidthCriterion() {
		return WidthCriterion.valueOf((byte) BitFlag.get(value, 15, 17));
	}

	/**
	 * ������Ʈ ���� ������ �����Ѵ�. (15~17 bit)
	 * 
	 * @param widthCriterion
	 *            ������Ʈ ���� ����
	 */
	public void setWidthCriterion(WidthCriterion widthCriterion) {
		value = BitFlag.set(value, 15, 17, widthCriterion.getValue());
	}

	/**
	 * ������Ʈ ������ ������ ��ȯ�Ѵ� (18~19 bit)
	 * 
	 * @return ������Ʈ ������ ����
	 */
	public HeightCriterion getHeightCriterion() {
		return HeightCriterion.valueOf((byte) BitFlag.get(value, 18, 19));
	}

	/**
	 * ������Ʈ ������ ������ �����Ѵ�. (18~19 bit)
	 * 
	 * @param heightCriterion
	 *            ������Ʈ ������ ����
	 */
	public void setHeightCriterion(HeightCriterion heightCriterion) {
		value = BitFlag.set(value, 18, 19, heightCriterion.getValue());
	}

	/**
	 * VertRelTo�� para�� �� ũ�� ��ȣ ������ ��ȯ�Ѵ�. (20 bit)
	 * 
	 * @return VertRelTo�� para�� �� ũ�� ��ȣ ����
	 */
	public boolean isProtectSize() {
		return BitFlag.get(value, 20);
	}

	/**
	 * VertRelTo�� para�� �� ũ�� ��ȣ ���θ� �����Ѵ�.
	 * 
	 * @param protectSize
	 *            VertRelTo�� para�� �� ũ�� ��ȣ ����
	 */
	public void setProtectSize(boolean protectSize) {
		value = BitFlag.set(value, 20, protectSize);
	}

	/**
	 * ������Ʈ ������ �ؽ�Ʈ�� ��� �귯���� �����ϴ� �ɼ��� ��ȯ�Ѵ�. (21~23 bit)
	 * 
	 * @return ������Ʈ ������ �ؽ�Ʈ�� ��� �귯���� �����ϴ� �ɼ�
	 */
	public TextFlowMethod getTextFlowMethod() {
		return TextFlowMethod.valueOf((byte) BitFlag.get(value, 21, 23));
	}

	/**
	 * ������Ʈ ������ �ؽ�Ʈ�� ��� �귯���� �����ϴ� �ɼ��� �����Ѵ�. (21~23 bit)
	 * 
	 * @param textFlowMethod
	 *            ������Ʈ ������ �ؽ�Ʈ�� ��� �귯���� �����ϴ� �ɼ�
	 */
	public void setTextFlowMethod(TextFlowMethod textFlowMethod) {
		value = BitFlag.set(value, 21, 23, textFlowMethod.getValue());
	}

	/**
	 * ������Ʈ�� ��/�� ��� �ʿ� ���� ��ġ���� �����ϴ� �ɼ��� ��ȯ�Ѵ�. (24~25 bit)
	 * 
	 * @return ������Ʈ�� ��/�� ��� �ʿ� ���� ��ġ���� �����ϴ� �ɼ�
	 */
	public TextHorzArrange getTextHorzArrange() {
		return TextHorzArrange.valueOf((byte) BitFlag.get(value, 24, 25));
	}

	/**
	 * ������Ʈ�� ��/�� ��� �ʿ� ���� ��ġ���� �����ϴ� �ɼ��� �����Ѵ�. (24~25 bit)
	 * 
	 * @param textHorzArrange
	 *            ������Ʈ�� ��/�� ��� �ʿ� ���� ��ġ���� �����ϴ� �ɼ�
	 */
	public void setTextHorzArrange(TextHorzArrange textHorzArrange) {
		value = BitFlag.set(value, 24, 25, textHorzArrange.getValue());
	}

	/**
	 * ��ü�� ���ϴ� ��ȣ ���ָ� ��ȯ�Ѵ�. (26~28 bit)
	 * 
	 * @return ��ü�� ���ϴ� ��ȣ ����
	 */
	public ObjectNumberSort getObjectNumberSort() {
		return ObjectNumberSort.valueOf((byte) BitFlag.get(value, 26, 28));
	}

	/**
	 * ��ü�� ���ϴ� ��ȣ ���ָ� �����Ѵ�. (26~28 bit)
	 * 
	 * @param objectNumberSort
	 *            ��ü�� ���ϴ� ��ȣ ����
	 */
	public void setObjectNumberSort(ObjectNumberSort objectNumberSort) {
		value = BitFlag.set(value, 26, 28, objectNumberSort.getValue());
	}
}
