package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.polygon.PositionXY;

/**
 * �ٰ��� ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentPolygon {
	/**
	 * ��ǥ ����Ʈ
	 */
	private ArrayList<PositionXY> positionList;
	/**
	 * �ٰ����� �������� ����
	 */
	private boolean closed;

	/**
	 * ������
	 */
	public ShapeComponentPolygon() {
		positionList = new ArrayList<PositionXY>();
	}

	/**
	 * ���ο� ��ǥ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ��ǥ ��ü
	 */
	public PositionXY addNewPosition() {
		PositionXY p = new PositionXY();
		positionList.add(p);
		return p;
	}

	/**
	 * ��ǥ ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ǥ ����Ʈ
	 */
	public ArrayList<PositionXY> getPositionList() {
		return positionList;
	}

	/**
	 * �ٰ����� �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return �ٰ����� �������� ����
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * �ٰ����� �������� ���θ� �����Ѵ�.
	 * 
	 * @param closed
	 *            �ٰ����� �������� ����
	 */
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
