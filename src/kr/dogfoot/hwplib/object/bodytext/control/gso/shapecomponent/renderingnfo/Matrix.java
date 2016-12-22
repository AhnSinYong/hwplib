package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo;

/**
 * ����� ��Ÿ���� ��ü. �� ��Ĵ� ���Ұ� double�� ǥ���Ǵ� 3 X 3 matrix�� �����ȴ�. ������ ���� �׻� [0,0,1]�̱�
 * ������ �����Ǿ� ���� 6���� ���Ҹ� �����Ѵ�.
 * 
 * @author neolord
 */
public class Matrix {
	/**
	 * ����� ���Ҹ� �����ϴ� �迭
	 */
	private double[] values;

	/**
	 * ������
	 */
	public Matrix() {
		values = new double[6];
	}

	/**
	 * ����� ���Ҹ� ��ȯ�Ѵ�.
	 * 
	 * @param i
	 *            ������ �ε���
	 * @return ����� ����
	 */
	public double getValue(int i) {
		return values[i];
	}

	/**
	 * ����� ���Ҹ� �����Ѵ�.
	 * 
	 * @param i
	 *            ������ �ε���
	 * @param value
	 *            ����� ����
	 */
	public void setValue(int i, double value) {
		values[i] = value;
	}
}
