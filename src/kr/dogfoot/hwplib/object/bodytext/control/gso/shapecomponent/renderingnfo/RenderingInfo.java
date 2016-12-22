package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo;

import java.util.ArrayList;

/**
 * Rendering ����
 * 
 * @author neolord
 */
public class RenderingInfo {
	/**
	 * �̵��� ���� ���
	 */
	private Matrix translationMatrix;
	/**
	 * Ȯ��/ȸ���� ���� ����� �ֿ� ���� ����Ʈ
	 */
	private ArrayList<ScaleRotateMatrixPair> scaleRotateMatrixPairList;

	/**
	 * ������
	 */
	public RenderingInfo() {
		translationMatrix = new Matrix();
		scaleRotateMatrixPairList = new ArrayList<ScaleRotateMatrixPair>();
	}

	/**
	 * �̵��� ���� ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �̵��� ���� ��� ��ü
	 */
	public Matrix getTranslationMatrix() {
		return translationMatrix;
	}

	/**
	 * ���ο� Ȯ��/ȸ���� ���� ����� ���� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ Ȯ��/ȸ���� ���� ����� ��
	 */
	public ScaleRotateMatrixPair addNewScaleRotateMatrixPair() {
		ScaleRotateMatrixPair srmp = new ScaleRotateMatrixPair();
		scaleRotateMatrixPairList.add(srmp);
		return srmp;
	}

	/**
	 * Ȯ��/ȸ���� ���� ����� �ֿ� ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return Ȯ��/ȸ���� ���� ����� �ֿ� ���� ����Ʈ
	 */
	public ArrayList<ScaleRotateMatrixPair> getScaleRotateMatrixPairList() {
		return scaleRotateMatrixPairList;
	}
}
