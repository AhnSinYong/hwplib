package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * �׿� ȿ�� �Ӽ�
 * 
 * @author neolord
 */
public class NeonEffect {
	/**
	 * �׿� ����
	 */
	private float transparency;
	/**
	 * �׿� �ݰ�
	 */
	private float radius;
	/**
	 * �׿� ����
	 */
	private ColorWithEffect color;

	/**
	 * ������
	 */
	public NeonEffect() {
		color = new ColorWithEffect();
	}

	/**
	 * �׿� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׿� ����
	 */
	public float getTransparency() {
		return transparency;
	}

	/**
	 * �׿� ������ �����Ѵ�.
	 * 
	 * @param transparency
	 *            �׿� ����
	 */
	public void setTransparency(float transparency) {
		this.transparency = transparency;
	}

	/**
	 * �׿� �ݰ��� ��ȯ�Ѵ�.
	 * 
	 * @return �׿� �ݰ�
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * �׿� �ݰ��� �����Ѵ�.
	 * 
	 * @param radius
	 *            �׿� �ݰ�
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}

	/**
	 * �׿� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׿� ���� ��ü
	 */
	public ColorWithEffect getColor() {
		return color;
	}
}
