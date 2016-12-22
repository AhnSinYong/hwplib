package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo.LineInfo;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.shadowinfo.ShadowInfo;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.FillInfo;

/**
 * �Ϲ� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentNormal extends ShapeComponent {
	/**
	 * �׵θ� �� ����
	 */
	private LineInfo lineInfo;
	/**
	 * ä�� ����
	 */
	private FillInfo fillInfo;
	/**
	 * �׸��� ����
	 */
	private ShadowInfo shadowInfo;

	/**
	 * ������
	 */
	public ShapeComponentNormal() {
		lineInfo = null;
		fillInfo = null;
		shadowInfo = null;
	}

	/**
	 * �׵θ� �� ���� ��ü�� �����Ѵ�.
	 */
	public void createLineInfo() {
		lineInfo = new LineInfo();
	}

	/**
	 * �׵θ� �� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteLineInfo() {
		lineInfo = null;
	}

	/**
	 * �׵θ� �� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� �� ���� ��ü
	 */
	public LineInfo getLineInfo() {
		return lineInfo;
	}

	/**
	 * ä�� ���� ��ü�� �����Ѵ�.
	 */
	public void createFillInfo() {
		fillInfo = new FillInfo();
	}

	/**
	 * ä�� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteFillInfo() {
		fillInfo = null;
	}

	/**
	 * ä�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ä�� ���� ��ü
	 */
	public FillInfo getFillInfo() {
		return fillInfo;
	}

	/**
	 * �׸��� ���� ��ü�� �����Ѵ�.
	 */
	public void createShadowInfo() {
		shadowInfo = new ShadowInfo();
	}

	/***
	 * �׸��� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteShadowInfo() {
		shadowInfo = null;
	}

	/**
	 * �׸��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ���� ��ü
	 */
	public ShadowInfo getShadowInfo() {
		return shadowInfo;
	}
}
