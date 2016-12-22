package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentRectangle;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;

/**
 * �簢�� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlRectangle extends GsoControl {
	/**
	 * �ۻ���
	 */
	private TextBox textBox;
	/**
	 * �簢�� ��ü �Ӽ�
	 */
	private ShapeComponentRectangle shapeComponentRectangle;

	/**
	 * ������
	 */
	public ControlRectangle() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlRectangle(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Rectangle.getId());

		textBox = null;
		shapeComponentRectangle = new ShapeComponentRectangle();
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
	 * �簢�� ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �簢�� ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentRectangle getShapeComponentRectangle() {
		return shapeComponentRectangle;
	}
}
