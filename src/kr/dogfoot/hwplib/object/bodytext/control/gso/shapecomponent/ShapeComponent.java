package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent;

import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.renderingnfo.RenderingInfo;

/**
 * ��ü ���� �Ӽ�
 * 
 * @author neolord
 */
public class ShapeComponent {
	/**
	 * ��ü ��Ʈ�� Id
	 */
	private int gsoId;
	/**
	 * ��ü�� ���� �׷� �������� X offset
	 */
	private int offsetX;
	/**
	 * ��ü�� ���� �׷� �������� Y offset
	 */
	private int offsetY;
	/**
	 * �׷��� Ƚ��
	 */
	private int groupingCount;
	/**
	 * ��ü ����� local file version
	 */
	private int localFileVersion;
	/**
	 * ������ ��
	 */
	private long widthAtCreate;
	/**
	 * ������ ����
	 */
	private long heightAtCreate;
	/**
	 * ���� ��
	 */
	private long widthAtCurrent;
	/**
	 * ���� ����
	 */
	private long heightAtCurrent;
	/**
	 * �Ӽ�(���� ����)
	 */
	private long property;
	/**
	 * ȸ����
	 */
	private int rotateAngle;
	/**
	 * ȸ�� �߽��� x ��ǥ(��ü ��ǥ��)
	 */
	private int rotateXCenter;
	/**
	 * ȸ�� �߽��� y ��ǥ(��ü ��ǥ��)
	 */
	private int rotateYCenter;
	/**
	 * Rendering ����
	 */
	private RenderingInfo renderingInfo;

	/**
	 * ������
	 */
	protected ShapeComponent() {
		renderingInfo = new RenderingInfo();
	}

	/**
	 * ��ü ��Ʈ�� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ü ��Ʈ�� Id
	 */
	public int getGsoId() {
		return gsoId;
	}

	/**
	 * ��ü ��Ʈ�� Id�� �����Ѵ�.
	 * 
	 * @param gsoId
	 *            ��ü ��Ʈ�� Id
	 */
	public void setGsoId(int gsoId) {
		this.gsoId = gsoId;
	}

	/**
	 * ��ü�� ���� �׷� �������� X offset�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ü�� ���� �׷� �������� X offset
	 */
	public int getOffsetX() {
		return offsetX;
	}

	/**
	 * ��ü�� ���� �׷� �������� X offset�� �����Ѵ�.
	 * 
	 * @param offsetX
	 *            ��ü�� ���� �׷� �������� X offset
	 */
	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}

	/**
	 * ��ü�� ���� �׷� �������� Y offset�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ü�� ���� �׷� �������� Y offset
	 */
	public int getyOffset() {
		return offsetY;
	}

	/**
	 * ��ü�� ���� �׷� �������� Y offset�� �����Ѵ�.
	 * 
	 * @param offsetY
	 *            ��ü�� ���� �׷� �������� Y offset
	 */
	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}

	/**
	 * �׷��� Ƚ���� ��ȯ�Ѵ�.
	 * 
	 * @return �׷��� Ƚ��
	 */
	public int getGroupingCount() {
		return groupingCount;
	}

	/**
	 * �׷��� Ƚ���� �����Ѵ�.
	 * 
	 * @param groupingCount
	 *            �׷��� Ƚ��
	 */
	public void setGroupingCount(int groupingCount) {
		this.groupingCount = groupingCount;
	}

	/**
	 * ��ü ����� local file version�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ü ����� local file version
	 */
	public int getLocalFileVersion() {
		return localFileVersion;
	}

	/**
	 * ��ü ����� local file version�� �����Ѵ�.
	 * 
	 * @param localFileVersion
	 *            ��ü ����� local file version
	 */
	public void setLocalFileVersion(int localFileVersion) {
		this.localFileVersion = localFileVersion;
	}

	/**
	 * ������ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ��
	 */
	public long getWidthAtCreate() {
		return widthAtCreate;
	}

	/**
	 * ������ ���� �����Ѵ�.
	 * 
	 * @param widthAtCreate
	 *            ������ ��
	 */
	public void setWidthAtCreate(long widthAtCreate) {
		this.widthAtCreate = widthAtCreate;
	}

	/**
	 * ������ ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ����
	 */
	public long getHeightAtCreate() {
		return heightAtCreate;
	}

	/**
	 * ������ ���̸� �����Ѵ�.
	 * 
	 * @param heightAtCreate
	 *            ������ ����
	 */
	public void setHeightAtCreate(long heightAtCreate) {
		this.heightAtCreate = heightAtCreate;
	}

	/**
	 * ���� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��
	 */
	public long getWidthAtCurrent() {
		return widthAtCurrent;
	}

	/**
	 * ���� ���� �����Ѵ�.
	 * 
	 * @param widthAtCurrent
	 *            ���� ��
	 */
	public void setWidthAtCurrent(long widthAtCurrent) {
		this.widthAtCurrent = widthAtCurrent;
	}

	/**
	 * ���� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public long getHeightAtCurrent() {
		return heightAtCurrent;
	}

	/**
	 * ���� ���̸� �����Ѵ�.
	 * 
	 * @param heightAtCurrent
	 *            ���� ����
	 */
	public void setHeightAtCurrent(long heightAtCurrent) {
		this.heightAtCurrent = heightAtCurrent;
	}

	/**
	 * �Ӽ����� ��ȯ�Ѵ�.(���� ����)
	 * 
	 * @return �Ӽ���
	 */
	public long getProperty() {
		return property;
	}

	/**
	 * �Ӽ����� �����Ѵ�.
	 * 
	 * @param property
	 *            �Ӽ���
	 */
	public void setProperty(long property) {
		this.property = property;
	}

	/**
	 * ȸ������ ��ȯ�Ѵ�.
	 * 
	 * @return ȸ����
	 */
	public int getRotateAngle() {
		return rotateAngle;
	}

	/**
	 * ȸ������ �����Ѵ�.
	 * 
	 * @param rotateAngle
	 *            ȸ����
	 */
	public void setRotateAngle(int rotateAngle) {
		this.rotateAngle = rotateAngle;
	}

	/**
	 * ȸ�� �߽��� x ��ǥ�� ��ȯ�Ѵ�.(��ü ��ǥ��)
	 * 
	 * @return ȸ�� �߽��� x ��ǥ
	 */
	public int getRotateXCenter() {
		return rotateXCenter;
	}

	/**
	 * ȸ�� �߽��� x ��ǥ�� �����Ѵ�. (��ü ��ǥ��)
	 * 
	 * @param rotateXCenter
	 *            ȸ�� �߽��� x ��ǥ
	 */
	public void setRotateXCenter(int rotateXCenter) {
		this.rotateXCenter = rotateXCenter;
	}

	/**
	 * ȸ�� �߽��� y ��ǥ�� ��ȯ�Ѵ�.(��ü ��ǥ��)
	 * 
	 * @return ȸ�� �߽��� y ��ǥ
	 */
	public int getRotateYCenter() {
		return rotateYCenter;
	}

	/**
	 * ȸ�� �߽��� y ��ǥ�� �����Ѵ�.
	 * 
	 * @param rotateYCenter
	 */
	public void setRotateYCenter(int rotateYCenter) {
		this.rotateYCenter = rotateYCenter;
	}

	/**
	 * Rendering ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return Rendering ���� ��ü
	 */
	public RenderingInfo getRenderingInfo() {
		return renderingInfo;
	}
}
