package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * ä��� ������ ���³��� ��ü
 * 
 * @author neolord
 */
public class FillInfo {
	/**
	 * ä��� ����
	 */
	private FillType type;
	/**
	 * �ܻ� ä���
	 */
	private PatternFill patternFill;
	/**
	 * �׷����̼� ä���
	 */
	private GradientFill gradientFill;
	/**
	 * �̹��� ä���
	 */
	private ImageFill imageFill;

	/**
	 * ������
	 */
	public FillInfo() {
		type = new FillType();
	}

	/**
	 * ä��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ä��� ���� ��ü
	 */
	public FillType getType() {
		return type;
	}

	/**
	 * �ܻ� ä��� ��ü�� �����Ѵ�.
	 */
	public void createPatternFill() {
		patternFill = new PatternFill();
	}

	/**
	 * �ܻ� ä��� ��ü�� �����Ѵ�.
	 */
	public void deletePatternFill() {
		patternFill = null;
	}

	/**
	 * �ܻ� ä��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ܻ� ä��� ��ü
	 */
	public PatternFill getPatternFill() {
		return patternFill;
	}

	/**
	 * �׷����̼� ä��� ��ü�� �����Ѵ�.
	 */
	public void createGradientFill() {
		gradientFill = new GradientFill();
	}

	/**
	 * �׷����̼� ä��� ��ü�� �����Ѵ�.
	 */
	public void deleteGradientFill() {
		gradientFill = null;
	}

	/**
	 * �׷����̼� ä��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׷����̼� ä��� ��ü
	 */
	public GradientFill getGradientFill() {
		return gradientFill;
	}

	/**
	 * �̹��� ä��� ��ü�� �����Ѵ�.
	 */
	public void createImageFill() {
		imageFill = new ImageFill();
	}

	/**
	 * �̹��� ä��� ��ü�� �����Ѵ�.
	 */
	public void deleteImageFill() {
		imageFill = null;
	}

	/**
	 * �̹��� ä��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �̹��� ä��� ��ü
	 */
	public ImageFill getImageFill() {
		return imageFill;
	}
}
