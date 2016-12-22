package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �׸� ȿ���� �Ӽ��� ���³��� ��ü
 * 
 * @author neolord
 */
public class PictureEffectProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public PictureEffectProperty() {
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
	 * �׸��� ȿ�� ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �׸��� ȿ�� ����
	 */
	public boolean hasShadowEffect() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �׸��� ȿ�� ������ �����Ѵ�. (0 bit)
	 * 
	 * @param hasShadowEffect
	 *            �׸��� ȿ�� ����
	 */
	public void setHasShadowEffect(boolean hasShadowEffect) {
		value = BitFlag.set(value, 0, hasShadowEffect);
	}

	/**
	 * �׿� ȿ�� ������ ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return �׿� ȿ�� ����
	 */
	public boolean hasNeonEffect() {
		return BitFlag.get(value, 1);
	}

	/**
	 * �׿� ȿ�� ������ �����Ѵ�. (1 bit)
	 * 
	 * @param hasNeonEffect
	 *            �׿� ȿ�� ����
	 */
	public void setHasNeonEffect(boolean hasNeonEffect) {
		value = BitFlag.set(value, 1, hasNeonEffect);
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� ������ ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return �ε巯�� �����ڸ� ȿ�� ����
	 */
	public boolean hasSoftBorderEffect() {
		return BitFlag.get(value, 2);
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� ������ �����Ѵ�. (2 bit)
	 * 
	 * @param hasSoftBorderEffect
	 *            �ε巯�� �����ڸ� ȿ�� ����
	 */
	public void setHasSoftBorderEffect(boolean hasSoftBorderEffect) {
		value = BitFlag.set(value, 2, hasSoftBorderEffect);
	}

	/**
	 * �ݻ� ȿ�� ������ ��ȯ�Ѵ�. (3 bit)
	 * 
	 * @return �ݻ� ȿ�� ����
	 */
	public boolean hasReflectionEffect() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �ݻ� ȿ�� ������ �����Ѵ�. (3 bit)
	 * 
	 * @param hasReflectionEffect
	 *            �ݻ� ȿ�� ����
	 */
	public void setHasReflectionEffect(boolean hasReflectionEffect) {
		value = BitFlag.set(value, 3, hasReflectionEffect);
	}
}
