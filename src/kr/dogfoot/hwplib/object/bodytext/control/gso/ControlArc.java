package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ShapeComponentArc;
import kr.dogfoot.hwplib.object.bodytext.control.gso.textbox.TextBox;

/**
 * ȣ ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlArc extends GsoControl {
	/**
	 * �ۻ���
	 */
	private TextBox textBox;
	/**
	 * ȣ ��ü �Ӽ�
	 */
	private ShapeComponentArc shapeComponentArc;

	/**
	 * ������
	 */
	public ControlArc() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlArc(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Arc.getId());

		textBox = null;
		shapeComponentArc = new ShapeComponentArc();
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
	 * ȣ ��ü�� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ȣ ��ü�� �Ӽ� ��ü
	 */
	public ShapeComponentArc getShapeComponentArc() {
		return shapeComponentArc;
	}
}
