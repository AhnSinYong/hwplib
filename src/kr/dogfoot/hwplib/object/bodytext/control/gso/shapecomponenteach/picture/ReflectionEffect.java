package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

/**
 * �ݻ� ȿ�� �Ӽ�
 * 
 * @author neolord
 */
public class ReflectionEffect {
	/**
	 * �ݻ� ��Ÿ�� (���� ����)
	 */
	private int style;
	/**
	 * �ݰ�
	 */
	private float radius;
	/**
	 * ����
	 */
	private float direction;
	/**
	 * �Ÿ�
	 */
	private float distance;
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
	 * ȸ�� ��Ÿ�� (���� ����)
	 */
	private int rotationStyle;
	/**
	 * ���� ����
	 */
	private float startTransparency;
	/**
	 * ���� ��ġ
	 */
	private float startPosition;
	/**
	 * �� ����
	 */
	private float endTransparency;
	/**
	 * �� ��ġ
	 */
	private float endPosition;
	/**
	 * ������ ����
	 */
	private float offsetDirection;

	/**
	 * ������
	 */
	public ReflectionEffect() {
	}

	/**
	 * �ݻ� ��Ÿ���� ��ȯ�Ѵ�. (���� ����)
	 * 
	 * @return �ݻ� ��Ÿ��
	 */
	public int getStyle() {
		return style;
	}

	/**
	 * �ݻ� ��Ÿ�ϸ� �����Ѵ�. (���� ����)
	 * 
	 * @param style
	 *            �ݻ� ��Ÿ��
	 */
	public void setStyle(int style) {
		this.style = style;
	}

	/**
	 * �ݰ��� ��ȯ�Ѵ�.
	 * 
	 * @return �ݰ�
	 */
	public float getRadius() {
		return radius;
	}

	/**
	 * �ݰ��� �����Ѵ�.
	 * 
	 * @param radius
	 *            �ݰ�
	 */
	public void setRadius(float radius) {
		this.radius = radius;
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
	 * ȸ�� ��Ÿ���� ��ȯ�Ѵ�. (���� ����)
	 * 
	 * @return ȸ�� ��Ÿ��
	 */
	public int getRotationStyle() {
		return rotationStyle;
	}

	/**
	 * ȸ�� ��Ÿ���� �����Ѵ�. (���� ����)
	 * 
	 * @param rotationStyle
	 *            ȸ�� ��Ÿ��
	 */
	public void setRotationStyle(int rotationStyle) {
		this.rotationStyle = rotationStyle;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public float getStartTransparency() {
		return startTransparency;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param startTransparency
	 *            ���� ����
	 */
	public void setStartTransparency(float startTransparency) {
		this.startTransparency = startTransparency;
	}

	/**
	 * ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ġ
	 */
	public float getStartPosition() {
		return startPosition;
	}

	/**
	 * ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param startPosition
	 *            ���� ��ġ
	 */
	public void setStartPosition(float startPosition) {
		this.startPosition = startPosition;
	}

	/**
	 * �� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �� ����
	 */
	public float getEndTransparency() {
		return endTransparency;
	}

	/**
	 * �� ������ �����Ѵ�.
	 * 
	 * @param endTransparency
	 *            �� ����
	 */
	public void setEndTransparency(float endTransparency) {
		this.endTransparency = endTransparency;
	}

	/**
	 * �� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ��ġ
	 */
	public float getEndPosition() {
		return endPosition;
	}

	/**
	 * �� ��ġ�� �����Ѵ�.
	 * 
	 * @param endPosition
	 *            �� ��ġ
	 */
	public void setEndPosition(float endPosition) {
		this.endPosition = endPosition;
	}

	/**
	 * ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ����
	 */
	public float getOffsetDirection() {
		return offsetDirection;
	}

	/**
	 * ������ ������ �����Ѵ�.
	 * 
	 * @param offsetDirection
	 *            ������ ����
	 */
	public void setOffsetDirection(float offsetDirection) {
		this.offsetDirection = offsetDirection;
	}
}
