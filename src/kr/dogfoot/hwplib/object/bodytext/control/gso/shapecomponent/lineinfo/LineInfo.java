package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׵θ� �� ����
 * 
 * @author neolord
 */
public class LineInfo {
	/**
	 * �� ����
	 */
	private Color4Byte color;
	/**
	 * �� ����
	 */
	private int thickness;
	/**
	 * �Ӽ�
	 */
	private LineInfoProperty property;
	/**
	 * outline style
	 */
	private OutlineStyle outlineStyle;

	/**
	 * ������
	 */
	public LineInfo() {
		color = new Color4Byte();
		property = new LineInfoProperty();
	}

	/**
	 * �� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ü
	 */
	public Color4Byte getColor() {
		return color;
	}

	/**
	 * �� ���⸦ ��ȯ�Ѵ�.
	 * 
	 * @return �� ����
	 */
	public int getThickness() {
		return thickness;
	}

	/**
	 * �� ���⸦ �����Ѵ�.
	 * 
	 * @param thickness
	 *            �� ����
	 */
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public LineInfoProperty getProperty() {
		return property;
	}

	/**
	 * outline style�� ��ȯ�Ѵ�.
	 * 
	 * @return outline style
	 */
	public OutlineStyle getOutlineStyle() {
		return outlineStyle;
	}

	/**
	 * outline style�� �����Ѵ�.
	 * 
	 * @param outlineStyle
	 *            outline style
	 */
	public void setOutlineStyle(OutlineStyle outlineStyle) {
		this.outlineStyle = outlineStyle;
	}
}
