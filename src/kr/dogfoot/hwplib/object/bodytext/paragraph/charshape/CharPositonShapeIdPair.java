package kr.dogfoot.hwplib.object.bodytext.paragraph.charshape;

/**
 * ���� ��ġ�� ���� ����� ��
 * 
 * @author neolord
 */
public class CharPositonShapeIdPair {
	/**
	 * ���� ����� �ٲ�� ���� ��ġ
	 */
	private long positon;
	/**
	 * ���� ��� ID
	 */
	private long shapeId;

	/**
	 * ������
	 * 
	 * @param position
	 *            ���� ����� �ٲ�� ���� ��ġ
	 * @param shapeId
	 *            ���� ��� ID
	 */
	public CharPositonShapeIdPair(long position, long shapeId) {
		this.positon = position;
		this.shapeId = shapeId;
	}

	/**
	 * ���� ����� �ٲ�� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����� �ٲ�� ���� ��ġ
	 */
	public long getPositon() {
		return positon;
	}

	/**
	 * ���� ����� �ٲ�� ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param positon
	 *            ���� ����� �ٲ�� ���� ��ġ
	 */
	public void setPositon(long positon) {
		this.positon = positon;
	}

	/**
	 * ������ ���� ��� ID�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��� ID
	 */
	public long getShapeId() {
		return shapeId;
	}

	/**
	 * ������ ���� ��� ID�� �����Ѵ�.
	 * 
	 * @param shapeId
	 *            ������ ���� ��� ID
	 */
	public void setShapeId(long shapeId) {
		this.shapeId = shapeId;
	}
}
