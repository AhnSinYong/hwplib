package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentCurve;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;

/**
 * � ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlCurve extends GsoControl {
	/**
	 * �ۻ���
	 */
	private TextBox textBox;
	/**
	 * � ��ü �Ӽ�
	 */
	private ShapeComponentCurve shapeComponentCurve;

	/**
	 * ������
	 */
	public ControlCurve() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlCurve(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Curve.getId());

		textBox = null;
		shapeComponentCurve = new ShapeComponentCurve();
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
	 * � ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return � ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentCurve getShapeComponentCurve() {
		return shapeComponentCurve;
	}
}
