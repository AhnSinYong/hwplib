package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentPolygon;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;

/**
 * �ٰ��� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlPolygon extends GsoControl {
	/**
	 * �ۻ���
	 */
	private TextBox textBox;
	/**
	 * �ٰ��� ��ü �Ӽ�
	 */
	private ShapeComponentPolygon shapeComponentPolygon;

	/**
	 * ������
	 */
	public ControlPolygon() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlPolygon(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Polygon.getId());

		textBox = null;
		shapeComponentPolygon = new ShapeComponentPolygon();
	}

	/**
	 * �ۻ��� ��ü�� �����Ѵ�.
	 */
	public void createTextBox() {
		textBox = new TextBox();
	}

	/**
	 * �ۻ��� ��ü�� �����Ѵ�.
	 */
	public void deleteTextBox() {
		textBox = null;
	}

	/**
	 * �ۻ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ۻ��� ��ü
	 */
	public TextBox getTextBox() {
		return textBox;
	}

	/**
	 * �ٰ��� ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ٰ��� ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentPolygon getShapeComponentPolygon() {
		return shapeComponentPolygon;
	}
}
