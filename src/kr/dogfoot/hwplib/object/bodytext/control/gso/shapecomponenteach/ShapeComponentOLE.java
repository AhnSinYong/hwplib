package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo.LineInfoProperty;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ole.ShapeComponentOLEProperty;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * OLE ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentOLE {
	/**
	 * �Ӽ�
	 */
	private ShapeComponentOLEProperty property;
	/**
	 * ������Ʈ ��ü�� extent xũ��
	 */
	private int extentWidth;
	/**
	 * ������Ʈ ��ü�� extent yũ��
	 */
	private int extentHeight;
	/**
	 * ������Ʈ�� ����ϴ� ���丮���� BinData ID
	 */
	private int binDataId;
	/**
	 * �׵θ� ��
	 */
	private Color4Byte borderColor;
	/**
	 * �׵θ� �β�
	 */
	private int borderThickness;
	/**
	 * �׵θ� �Ӽ�
	 */
	private LineInfoProperty borderProperty;

	/**
	 * ������
	 */
	public ShapeComponentOLE() {
		property = new ShapeComponentOLEProperty();
		borderColor = new Color4Byte();
		borderProperty = new LineInfoProperty();
	}

	/**
	 * �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ� ��ü
	 */
	public ShapeComponentOLEProperty getProperty() {
		return property;
	}

	/**
	 * ������Ʈ ��ü�� extent xũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ ��ü�� extent xũ��
	 */
	public int getExtentWidth() {
		return extentWidth;
	}

	/**
	 * ������Ʈ ��ü�� extent xũ�⸦ �����Ѵ�.
	 * 
	 * @param extentWidth
	 *            ������Ʈ ��ü�� extent xũ��
	 */
	public void setExtentWidth(int extentWidth) {
		this.extentWidth = extentWidth;
	}

	/**
	 * ������Ʈ ��ü�� extent yũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ ��ü�� extent yũ��
	 */
	public int getExtentHeight() {
		return extentHeight;
	}

	/**
	 * ������Ʈ ��ü�� extent yũ�⸦ �����Ѵ�.
	 * 
	 * @param extentHeight
	 *            ������Ʈ ��ü�� extent yũ��
	 */
	public void setExtentHeight(int extentHeight) {
		this.extentHeight = extentHeight;
	}

	/**
	 * ������Ʈ�� ����ϴ� ���丮���� BinData ID�� ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� ����ϴ� ���丮���� BinData ID
	 */
	public int getBinDataId() {
		return binDataId;
	}

	/**
	 * ������Ʈ�� ����ϴ� ���丮���� BinData ID�� �����Ѵ�.
	 * 
	 * @param binDataId
	 *            ������Ʈ�� ����ϴ� ���丮���� BinData ID
	 */
	public void setBinDataId(int binDataId) {
		this.binDataId = binDataId;
	}

	/**
	 * �׵θ� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� ���� ��ü
	 */
	public Color4Byte getBorderColor() {
		return borderColor;
	}

	/**
	 * �׵θ� �β��� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� �β�
	 */
	public int getBorderThickness() {
		return borderThickness;
	}

	/**
	 * �׵θ� �β��� �����Ѵ�.
	 * 
	 * @param borderThickness
	 *            �׵θ� �β�
	 */
	public void setBorderThickness(int borderThickness) {
		this.borderThickness = borderThickness;
	}

	/**
	 * �׵θ� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� �Ӽ� ��ü
	 */
	public LineInfoProperty getBorderProperty() {
		return borderProperty;
	}
}
