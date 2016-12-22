package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentEllipse;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;

/**
 * Ÿ�� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlEllipse extends GsoControl {
	/**
	 * �ۻ���
	 */
	private TextBox textBox;
	/**
	 * Ÿ�� ��ü �Ӽ�
	 */
	private ShapeComponentEllipse shapeComponentEllipse;

	/**
	 * ������
	 */
	public ControlEllipse() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlEllipse(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Ellipse.getId());

		textBox = null;
		shapeComponentEllipse = new ShapeComponentEllipse();
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
	 * Ÿ�� ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return Ÿ�� ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentEllipse getShapeComponentEllipse() {
		return shapeComponentEllipse;
	}
}
