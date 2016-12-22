package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * �׸� ȿ��
 * 
 * @author neolord
 */
public class PictureEffect {
	/**
	 * �Ӽ�
	 */
	private PictureEffectProperty property;
	/**
	 * �׸��� ȿ��
	 */
	private ShadowEffect shadowEffect;
	/**
	 * �׿� ȿ��
	 */
	private NeonEffect neonEffect;
	/**
	 * �ε巯�� �����ڸ� ȿ��
	 */
	private SoftEdgeEffect softEdgeEffect;
	/**
	 * �ݻ� ȿ��
	 */
	private ReflectionEffect reflectionEffect;

	/**
	 * ������
	 */
	public PictureEffect() {
		property = new PictureEffectProperty();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public PictureEffectProperty getProperty() {
		return property;
	}

	/**
	 * �׸��� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void createShadowEffect() {
		shadowEffect = new ShadowEffect();
	}

	/**
	 * �׸��� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void deleteShadowEffect() {
		shadowEffect = null;
	}

	/**
	 * �׸��� ȿ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ȿ�� ��ü
	 */
	public ShadowEffect getShadowEffect() {
		return shadowEffect;
	}

	/**
	 * �׿� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void createNeonEffect() {
		neonEffect = new NeonEffect();
	}

	/**
	 * �׿� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void deleteNeonEffect() {
		neonEffect = null;
	}

	/**
	 * �׿� ȿ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׿� ȿ�� ��ü
	 */
	public NeonEffect getNeonEffect() {
		return neonEffect;
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void createSoftEdgeEffect() {
		softEdgeEffect = new SoftEdgeEffect();
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void deleteSoftEdgeEffect() {
		softEdgeEffect = null;
	}

	/**
	 * �ε巯�� �����ڸ� ȿ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ε巯�� �����ڸ� ȿ�� ��ü
	 */
	public SoftEdgeEffect getSoftEdgeEffect() {
		return softEdgeEffect;
	}

	/**
	 * �ݻ� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void createReflectionEffect() {
		reflectionEffect = new ReflectionEffect();
	}

	/**
	 * �ݻ� ȿ�� ��ü�� �����Ѵ�.
	 */
	public void deleteReflectionEffect() {
		reflectionEffect = null;
	}

	/**
	 * �ݻ� ȿ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ݻ� ȿ�� ��ü
	 */
	public ReflectionEffect getReflectionEffect() {
		return reflectionEffect;
	}
}
