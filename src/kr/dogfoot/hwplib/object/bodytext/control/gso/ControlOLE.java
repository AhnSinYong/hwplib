package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentOLE;

/**
 * OLE ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlOLE extends GsoControl {
	/**
	 * OLE ��ü �Ӽ�
	 */
	private ShapeComponentOLE shapeComponentOLE;

	/**
	 * ������
	 */
	public ControlOLE() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlOLE(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.OLE.getId());

		shapeComponentOLE = new ShapeComponentOLE();
	}

	/**
	 * OLE ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return OLE ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentOLE getShapeComponentOLE() {
		return shapeComponentOLE;
	}
}
