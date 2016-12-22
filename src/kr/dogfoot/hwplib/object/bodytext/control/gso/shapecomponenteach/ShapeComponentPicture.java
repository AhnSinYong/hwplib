package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo.LineInfoProperty;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.InnerMargin;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture.PictureEffect;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.polygon.PositionXY;
import kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo.PictureInfo;
import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׸� ��ü �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentPicture {
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
	 * left,top ��ǥ
	 */
	private PositionXY leftTop;
	/**
	 * right,top ��ǥ
	 */
	private PositionXY rightTop;
	/**
	 * left, bottom ��ǥ
	 */
	private PositionXY leftBottom;
	/**
	 * right, bottom ��ǥ
	 */
	private PositionXY rightBottom;
	/**
	 * �ڸ��� �� �� �簢���� left��ǥ
	 */
	private int leftAfterCutting;
	/**
	 * �ڸ��� �� �� �簢���� top��ǥ
	 */
	private int topAfterCutting;
	/**
	 * �ڸ��� �� �� �簢���� right��ǥ
	 */
	private int rightAfterCutting;
	/**
	 * �ڸ��� �� �� �簢���� bottom��ǥ
	 */
	private int bottomAfterCutting;
	/**
	 * ���� ���� ����
	 */
	private InnerMargin innerMargin;
	/**
	 * �׸� ����
	 */
	private PictureInfo pictureInfo;
	/**
	 * �׵θ� ����
	 */
	private short borderTransparency;
	/**
	 * ���� �� �� ��ü�� ���� ���� ���̵�
	 */
	private long instanceId;
	/**
	 * �׸� ȿ�� ����
	 */
	private PictureEffect pictureEffect;
	/**
	 * �̹��� �ʺ� (??)
	 */
	private long imageWidth;
	/**
	 * �̹��� ���� (??)
	 */
	private long imageHeight;

	/**
	 * ������
	 */
	public ShapeComponentPicture() {
		borderColor = new Color4Byte();
		borderProperty = new LineInfoProperty();
		leftTop = new PositionXY();
		rightTop = new PositionXY();
		leftBottom = new PositionXY();
		rightBottom = new PositionXY();
		innerMargin = new InnerMargin();
		pictureInfo = new PictureInfo();
		pictureEffect = new PictureEffect();
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
	 * �׵θ� ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� ���� �Ӽ� ��ü
	 */
	public LineInfoProperty getBorderProperty() {
		return borderProperty;
	}

	/**
	 * left,top ��ǥ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return left,top ��ǥ ��ü
	 */
	public PositionXY getLeftTop() {
		return leftTop;
	}

	/**
	 * right,top ��ǥ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return right,top ��ǥ ��ü
	 */
	public PositionXY getRightTop() {
		return rightTop;
	}

	/**
	 * left, bottom ��ǥ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return left, bottom ��ǥ ��ü
	 */
	public PositionXY getLeftBottom() {
		return leftBottom;
	}

	/**
	 * right, bottom ��ǥ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return right, bottom ��ǥ ��ü
	 */
	public PositionXY getRightBottom() {
		return rightBottom;
	}

	/**
	 * �ڸ��� �� �� �簢���� left��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ڸ��� �� �� �簢���� left��ǥ
	 */
	public int getLeftAfterCutting() {
		return leftAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� left��ǥ�� �����Ѵ�.
	 * 
	 * @param leftAfterCutting
	 *            �ڸ��� �� �� �簢���� left��ǥ
	 */
	public void setLeftAfterCutting(int leftAfterCutting) {
		this.leftAfterCutting = leftAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� top��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ڸ��� �� �� �簢���� top��ǥ
	 */
	public int getTopAfterCutting() {
		return topAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� top��ǥ�� �����Ѵ�.
	 * 
	 * @param topAfterCutting
	 *            �ڸ��� �� �� �簢���� top��ǥ
	 */
	public void setTopAfterCutting(int topAfterCutting) {
		this.topAfterCutting = topAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� right��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ڸ��� �� �� �簢���� right��ǥ
	 */
	public int getRightAfterCutting() {
		return rightAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� right��ǥ�� �����Ѵ�.
	 * 
	 * @param rightAfterCutting
	 *            �ڸ��� �� �� �簢���� right��ǥ
	 */
	public void setRightAfterCutting(int rightAfterCutting) {
		this.rightAfterCutting = rightAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� bottom��ǥ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ڸ��� �� �� �簢���� bottom��ǥ
	 */
	public int getBottomAfterCutting() {
		return bottomAfterCutting;
	}

	/**
	 * �ڸ��� �� �� �簢���� bottom��ǥ�� �����Ѵ�.
	 * 
	 * @param bottomAfterCutting
	 *            �ڸ��� �� �� �簢���� bottom��ǥ
	 */
	public void setBottomAfterCutting(int bottomAfterCutting) {
		this.bottomAfterCutting = bottomAfterCutting;
	}

	/**
	 * ���� ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ���� ��ü
	 */
	public InnerMargin getInnerMargin() {
		return innerMargin;
	}

	/**
	 * �׸� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ���� ��ü
	 */
	public PictureInfo getPictureInfo() {
		return pictureInfo;
	}

	/**
	 * �׵θ� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� ����
	 */
	public short getBorderTransparency() {
		return borderTransparency;
	}

	/**
	 * �׵θ� ������ �����Ѵ�.
	 * 
	 * @param borderTransparency
	 *            �׵θ� ����
	 */
	public void setBorderTransparency(short borderTransparency) {
		this.borderTransparency = borderTransparency;
	}

	/**
	 * ���� �� �� ��ü�� ���� ���� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� �� ��ü�� ���� ���� ���̵�
	 */
	public long getInstanceId() {
		return instanceId;
	}

	/**
	 * ���� �� �� ��ü�� ���� ���� ���̵� �����Ѵ�.
	 * 
	 * @param instanceId
	 *            ���� �� �� ��ü�� ���� ���� ���̵�
	 */
	public void setInstanceId(long instanceId) {
		this.instanceId = instanceId;
	}

	/**
	 * �׸� ȿ�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ȿ�� ���� ��ü
	 */
	public PictureEffect getPictureEffect() {
		return pictureEffect;
	}

	/**
	 * �̹��� ���� ��ȯ�Ѵ�.(??)
	 * 
	 * @return �̹��� ��
	 */
	public long getImageWidth() {
		return imageWidth;
	}

	/**
	 * �̹��� ���� �����Ѵ�. (??)
	 * 
	 * @param imageWidth
	 *            �̹��� ��
	 */
	public void setImageWidth(long imageWidth) {
		this.imageWidth = imageWidth;
	}

	/**
	 * �̹��� ���̸� ��ȯ�Ѵ�. (??)
	 * 
	 * @return �̹��� ����
	 */
	public long getImageHeight() {
		return imageHeight;
	}

	/**
	 * �̹��� ���̸� �����Ѵ�. (??)
	 * 
	 * @param imageHeight
	 *            �̹��� ����
	 */
	public void setImageHeight(long imageHeight) {
		this.imageHeight = imageHeight;
	}
}
