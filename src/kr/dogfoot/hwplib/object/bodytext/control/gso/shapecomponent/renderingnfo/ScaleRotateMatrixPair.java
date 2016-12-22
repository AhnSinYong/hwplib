package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo;

/**
 * Ȯ��/ȸ���� ���� ����� ���� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ScaleRotateMatrixPair {
	/**
	 * Ȯ���� ���� ���
	 */
	private Matrix scaleMatrix;
	/**
	 * ȸ���� ���� ���
	 */
	private Matrix rotateMatrix;

	/**
	 * ������
	 */
	public ScaleRotateMatrixPair() {
		scaleMatrix = new Matrix();
		rotateMatrix = new Matrix();
	}

	/**
	 * Ȯ���� ���� ����� ��ȯ�Ѵ�.
	 * 
	 * @return Ȯ���� ���� ���
	 */
	public Matrix getScaleMatrix() {
		return scaleMatrix;
	}

	/**
	 * ȸ���� ���� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ȸ���� ���� ���
	 */
	public Matrix getRotateMatrix() {
		return rotateMatrix;
	}
}
