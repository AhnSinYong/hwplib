package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentPicture;

/**
 * �׸� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlPicture extends GsoControl {
	/**
	 * �׸� ��ü �Ӽ�
	 */
	private ShapeComponentPicture shapeComponentPicture;

	/**
	 * ������
	 */
	public ControlPicture() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlPicture(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Picture.getId());

		shapeComponentPicture = new ShapeComponentPicture();
	}

	/**
	 * �׸� ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentPicture getShapeComponentPicture() {
		return shapeComponentPicture;
	}

}
