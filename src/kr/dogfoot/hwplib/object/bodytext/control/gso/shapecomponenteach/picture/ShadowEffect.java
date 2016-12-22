package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * �׸��� ȿ�� �Ӽ�
 * 
 * @author neolord
 */
public class ShadowEffect {
	/**
	 * �׸��� ��Ÿ�� (���� ����)
	 */
	private int style;
	/**
	 * �׸��� ����
	 */
	private float transparency;
	/**
	 * �׸��� �帴�ϰ�
	 */
	private float cloudy;
	/**
	 * ����
	 */
	private float direction;
	/**
	 * �Ÿ�
	 */
	private float distance;
	/**
	 * ���� (���� ����)
	 */
	private int sort;
	/**
	 * x�� ���� ����
	 */
	private float tiltAngleX;
	/**
	 * y�� ���� ����
	 */
	private float tiltAngleY;
	/**
	 * x�� Ȯ�� ����
	 */
	private float zoomRateX;
	/**
	 * y�� Ȯ�� ����
	 */
	private float zoomRateY;
	/**
	 * ������ �Բ� �׸��� ȸ��
	 */
	private int rotateWithShape;
	/**
	 * �׸��� ����
	 */
	private ColorWithEffect color;

	/**
	 * ������
	 */
	public ShadowEffect() {
		color = new ColorWithEffect();
	}

	/**
	 * �׸��� ��Ÿ���� ��ȯ�Ѵ�.(���� ����)
	 * 
	 * @return �׸��� ��Ÿ��
	 */
	public int getStyle() {
		return style;
	}

	/**
	 * �׸��� ��Ÿ���� �����Ѵ�.
	 * 
	 * @param style
	 *            �׸��� ��Ÿ��
	 */
	public void setStyle(int style) {
		this.style = style;
	}

	/**
	 * �׸��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ����
	 */
	public float getTransparency() {
		return transparency;
	}

	/**
	 * �׸��� ������ �����Ѵ�.
	 * 
	 * @param transparency
	 *            �׸��� ����
	 */
	public void setTransparency(float transparency) {
		this.transparency = transparency;
	}

	/**
	 * �׸��� �帴�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� �帴�� ����
	 */
	public float getCloudy() {
		return cloudy;
	}

	/**
	 * �׸��� �帴�� ������ �����Ѵ�.
	 * 
	 * @param cloudy
	 *            �׸��� �帴�� ����
	 */
	public void setCloudy(float cloudy) {
		this.cloudy = cloudy;
	}

	/**
	 * ������ ��ȯ�Ѵ�.
	 * 
	 * @return ����
	 */
	public float getDirection() {
		return direction;
	}

	/**
	 * ������ �����Ѵ�.
	 * 
	 * @param direction
	 *            ����
	 */
	public void setDirection(float direction) {
		this.direction = direction;
	}

	/**
	 * �Ÿ��� ��ȯ�Ѵ�.
	 * 
	 * @return �Ÿ�
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * �Ÿ��� �����Ѵ�.
	 * 
	 * @param distance
	 *            �Ÿ�
	 */
	public void setDistance(float distance) {
		this.distance = distance;
	}

	/**
	 * ���� ����� ��ȯ�Ѵ�.(���� ����)
	 * 
	 * @return ���� ���
	 */
	public int getSort() {
		return sort;
	}

	/**
	 * ���� ����� �����Ѵ�.
	 * 
	 * @param sort
	 *            ���� ���
	 */
	public void setSort(int sort) {
		this.sort = sort;
	}

	/**
	 * x�� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return x�� ���� ����
	 */
	public float getTiltAngleX() {
		return tiltAngleX;
	}

	/**
	 * x�� ���� ������ �����Ѵ�.
	 * 
	 * @param tiltAngleX
	 *            x�� ���� ����
	 */
	public void setTiltAngleX(float tiltAngleX) {
		this.tiltAngleX = tiltAngleX;
	}

	/**
	 * y�� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return y�� ���� ����
	 */
	public float getTiltAngleY() {
		return tiltAngleY;
	}

	/**
	 * y�� ���� ������ �����Ѵ�.
	 * 
	 * @param tiltAngleY
	 *            y�� ���� ����
	 */
	public void setTiltAngleY(float tiltAngleY) {
		this.tiltAngleY = tiltAngleY;
	}

	/**
	 * x�� Ȯ�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return x�� Ȯ�� ����
	 */
	public float getZoomRateX() {
		return zoomRateX;
	}

	/**
	 * x�� Ȯ�� ������ �����Ѵ�.
	 * 
	 * @param zoomRateX
	 *            x�� Ȯ�� ����
	 */
	public void setZoomRateX(float zoomRateX) {
		this.zoomRateX = zoomRateX;
	}

	/**
	 * y�� Ȯ�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return y�� Ȯ�� ����
	 */
	public float getZoomRateY() {
		return zoomRateY;
	}

	/**
	 * y�� Ȯ�� ������ �����Ѵ�.
	 * 
	 * @param zoomRateY
	 *            y�� Ȯ�� ����
	 */
	public void setZoomRateY(float zoomRateY) {
		this.zoomRateY = zoomRateY;
	}

	/**
	 * ������ �Բ� �׸��� ȸ�� ����(?)�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �Բ� �׸��� ȸ�� ����
	 */
	public int getRotateWithShape() {
		return rotateWithShape;
	}

	/**
	 * ������ �Բ� �׸��� ȸ�� ����(?)�� �����Ѵ�.
	 * 
	 * @param rotateWithShape
	 *            ������ �Բ� �׸��� ȸ�� ����
	 */
	public void setRotateWithShape(int rotateWithShape) {
		this.rotateWithShape = rotateWithShape;
	}

	/**
	 * �׸��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ���� ��ü
	 */
	public ColorWithEffect getColor() {
		return color;
	}
}
