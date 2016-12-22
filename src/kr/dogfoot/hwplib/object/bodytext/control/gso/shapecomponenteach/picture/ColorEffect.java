package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * ���� ȿ�� �Ӽ�
 * 
 * @author neolord
 */
public class ColorEffect {
	/**
	 * ���� ȿ�� ���� (���� ����)
	 */
	private int sort;
	/**
	 * ���� ȿ�� ��
	 */
	private float value;

	/**
	 * ������
	 */
	public ColorEffect() {
	}

	/**
	 * ���� ȿ�� ������ ��ȯ�Ѵ�. (���� ����)
	 * 
	 * @return ���� ȿ�� ����
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * ���� ȿ�� ������ �����Ѵ�. (���� ����)
	 * 
	 * @param sort
	 *            ���� ȿ�� ����
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

	/**
	 * ���� ȿ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ȿ�� ��
	 */
	public float getValue() {
		return value;
	}

	/**
	 * ���� ȿ�� ���� �����Ѵ�.
	 * 
	 * @param value
	 *            ���� ȿ�� ��
	 */
	public void setValue(float value) {
		this.value = value;
	}
}
