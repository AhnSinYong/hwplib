package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.curve.CurveSegmentType;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.polygon.PositionXY;

/**
 * � ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentCurve {
	/**
	 * ��ǥ ����Ʈ
	 */
	private ArrayList<PositionXY> positionList;
	/**
	 * segment type ����Ʈ
	 */
	private ArrayList<CurveSegmentType> segmentTypeList;
	/**
	 * ��� �������� ����
	 */
	private boolean closed;

	/**
	 * ������
	 */
	public ShapeComponentCurve() {
		positionList = new ArrayList<PositionXY>();
		segmentTypeList = new ArrayList<CurveSegmentType>();
	}

	/**
	 * ���ο� ��ǥ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �·� ��ü
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
	 * segment type�� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param cst
	 *            segment type
	 */
	public void addCurveSegmentType(CurveSegmentType cst) {
		segmentTypeList.add(cst);
	}

	/**
	 * segment type ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return segment type ����Ʈ
	 */
	public ArrayList<CurveSegmentType> getSegmentTypeList() {
		return segmentTypeList;
	}

	/**
	 * ��� �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ��� �������� ����
	 */
	public boolean isClosed() {
		return closed;
	}

	/**
	 * ��� �������� ���θ� �����Ѵ�.
	 * 
	 * @param closed
	 *            ��� �������� ����
	 */
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
