package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentLine;

/**
 * �� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlLine extends GsoControl {
	/**
	 * �� ��ü �Ӽ�
	 */
	private ShapeComponentLine shapeComponentLine;

	/**
	 * ������
	 */
	public ControlLine() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlLine(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Line.getId());

		shapeComponentLine = new ShapeComponentLine();
	}

	/**
	 * �� ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentLine getShapeComponentLine() {
		return shapeComponentLine;
	}
}
