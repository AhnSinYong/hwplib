package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.gso.GsoHeaderProperty;

/**
 * �׸��� ��ü�� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderGso extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private GsoHeaderProperty property;
	/**
	 * ���� ������ ��
	 */
	private long yOffset;
	/**
	 * ���� ������ ��
	 */
	private long xOffset;
	/**
	 * ������Ʈ�� ��
	 */
	private long width;
	/**
	 * ������Ʈ�� ����
	 */
	private long height;
	/**
	 * z-order
	 */
	private int zOrder;
	/**
	 * ������Ʈ�� �ٱ� �ަU ����
	 */
	private int outterMarginLeft;
	/**
	 * ������Ʈ�� �ٱ� ������ ����
	 */
	private int outterMarginRight;
	/**
	 * ������Ʈ�� �ٱ� ���� ����
	 */
	private int outterMarginTop;
	/**
	 * ������Ʈ�� �ٱ� �Ʒ��� ����
	 */
	private int OutterMarginBottom;
	/**
	 * ���� �� �� ��ü�� ���� ���� ���̵�
	 */
	private long instanceId;
	/**
	 * �ʳ��� ���� on(1) / off(0)
	 */
	private boolean preventPageDivide;
	/**
	 * ��ü ����
	 */
	private String explanation;

	/**
	 * ������
	 */
	public CtrlHeaderGso() {
		super(ControlType.Gso.getCtrlId());

		property = new GsoHeaderProperty();
	}

	/**
	 * ������
	 * 
	 * @param controlType
	 *            ��Ʈ�� Ÿ��
	 */
	public CtrlHeaderGso(ControlType controlType) {
		super(controlType.getCtrlId());

		property = new GsoHeaderProperty();
	}

	/**
	 * �׸��� ��ü ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü ��Ʈ���� �Ӽ� ��ü
	 */
	public GsoHeaderProperty getProperty() {
		return property;
	}

	/**
	 * ���� ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��
	 */
	public long getyOffset() {
		return yOffset;
	}

	/**
	 * ���� ������ ���� �����Ѵ�.
	 * 
	 * @param yOffset
	 *            ���� ������ ��
	 */
	public void setyOffset(long yOffset) {
		this.yOffset = yOffset;
	}

	/**
	 * ���� ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��
	 */
	public long getxOffset() {
		return xOffset;
	}

	/**
	 * ���� ������ ���� �����Ѵ�.
	 * 
	 * @param xOffset
	 *            ���� ������ ��
	 */
	public void setxOffset(long xOffset) {
		this.xOffset = xOffset;
	}

	/**
	 * ������Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� ��
	 */
	public long getWidth() {
		return width;
	}

	/**
	 * ������Ʈ�� ���� �����Ѵ�.
	 * 
	 * @param width
	 *            ������Ʈ�� ��
	 */
	public void setWidth(long width) {
		this.width = width;
	}

	/**
	 * ������Ʈ�� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� ����
	 */
	public long getHeight() {
		return height;
	}

	/**
	 * ������Ʈ�� ���̸� �����Ѵ�.
	 * 
	 * @param height
	 *            ������Ʈ�� ����
	 */
	public void setHeight(long height) {
		this.height = height;
	}

	/**
	 * z-order�� ��ȯ�Ѵ�.
	 * 
	 * @return z-order
	 */
	public int getzOrder() {
		return zOrder;
	}

	/**
	 * z-order�� �����Ѵ�.
	 * 
	 * @param zOrder
	 *            z-order
	 */
	public void setzOrder(int zOrder) {
		this.zOrder = zOrder;
	}

	/**
	 * ������Ʈ�� �ٱ� �ަU ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� �ٱ� �ަU ����
	 */
	public int getOutterMarginLeft() {
		return outterMarginLeft;
	}

	/**
	 * ������Ʈ�� �ٱ� �ަU ������ �����Ѵ�.
	 * 
	 * @param outterMarginLeft
	 *            ������Ʈ�� �ٱ� �ަU ����
	 */
	public void setOutterMarginLeft(int outterMarginLeft) {
		this.outterMarginLeft = outterMarginLeft;
	}

	/**
	 * ������Ʈ�� �ٱ� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� �ٱ� ������ ����
	 */
	public int getOutterMarginRight() {
		return outterMarginRight;
	}

	/**
	 * ������Ʈ�� �ٱ� ������ ������ �����Ѵ�.
	 * 
	 * @param outterMarginRight
	 *            ������Ʈ�� �ٱ� ������ ����
	 */
	public void setOutterMarginRight(int outterMarginRight) {
		this.outterMarginRight = outterMarginRight;
	}

	/**
	 * ������Ʈ�� �ٱ� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� �ٱ� ���� ����
	 */
	public int getOutterMarginTop() {
		return outterMarginTop;
	}

	/**
	 * ������Ʈ�� �ٱ� ���� ������ �����Ѵ�.
	 * 
	 * @param outterMarginTop
	 *            ������Ʈ�� �ٱ� ���� ����
	 */
	public void setOutterMarginTop(int outterMarginTop) {
		this.outterMarginTop = outterMarginTop;
	}

	/**
	 * ������Ʈ�� �ٱ� �Ʒ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������Ʈ�� �ٱ� �Ʒ��� ����
	 */
	public int getOutterMarginBottom() {
		return OutterMarginBottom;
	}

	/**
	 * ������Ʈ�� �ٱ� �Ʒ��� ������ �����Ѵ�.
	 * 
	 * @param outterMarginBottom
	 *            ������Ʈ�� �ٱ� �Ʒ��� ����
	 */
	public void setOutterMarginBottom(int outterMarginBottom) {
		OutterMarginBottom = outterMarginBottom;
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
	 * �ʳ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ʳ��� ����
	 */
	public boolean isPreventPageDivide() {
		return preventPageDivide;
	}

	/**
	 * �ʳ��� ������ �����Ѵ�.
	 * 
	 * @param preventPageDivide
	 *            �ʳ��� ����
	 */
	public void setPreventPageDivide(boolean preventPageDivide) {
		this.preventPageDivide = preventPageDivide;
	}

	/**
	 * ��ü ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ü ����
	 */
	public String getExplanation() {
		return explanation;
	}

	/**
	 * ��ü ������ �����Ѵ�.
	 * 
	 * @param explanation
	 *            ��ü ����
	 */
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
}
