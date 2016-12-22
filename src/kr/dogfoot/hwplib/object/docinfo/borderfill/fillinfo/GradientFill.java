package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �׷����̼� ä��� ��ü
 * 
 * @author neolord
 */
public class GradientFill {
	/**
	 * �׷����̼� ����
	 */
	private GradientType gradientType;
	/**
	 * �׷����̼��� ����� (���� ���� : 4byte)
	 */
	private long startAngle;
	/**
	 * �׷����̼��� ���� �߽� (���� ���� : 4byte)
	 */
	private long centerX;
	/**
	 * �׷����̼��� ���� �߽� (���� ���� : 4byte)
	 */
	private long centerY;
	/**
	 * �׷����̼� ���� ����(0 -100) (���� ���� : 4byte)
	 */
	private long blurringDegree;
	/**
	 * ������ �ٲ�� ���� ��ġ ����Ʈ (num > 2 �� ��쿡��)
	 */
	private ArrayList<Integer> changePointList;
	/**
	 * ���� ����Ʈ
	 */
	private ArrayList<Color4Byte> colorList;
	/**
	 * ���� �߽� (�߰� �Ӽ�)
	 */
	private short blurringCenter;

	/**
	 * ������
	 */
	public GradientFill() {
		changePointList = new ArrayList<Integer>();
		colorList = new ArrayList<Color4Byte>();
	}

	/**
	 * �׷����̼� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׷����̼� ����
	 */
	public GradientType getGradientType() {
		return gradientType;
	}

	/**
	 * �׷����̼� ������ �����Ѵ�.
	 * 
	 * @param gradientType
	 *            �׷����̼� ����
	 */
	public void setGradientType(GradientType gradientType) {
		this.gradientType = gradientType;
	}

	/**
	 * �׷����̼��� ������� ��ȯ�Ѵ�.
	 * 
	 * @return �׷����̼��� �����
	 */
	public long getStartAngle() {
		return startAngle;
	}

	/**
	 * �׷����̼��� ����Ӹ� �����Ѵ�.
	 * 
	 * @param startAngle
	 *            �׷����̼��� �����
	 */
	public void setStartAngle(long startAngle) {
		this.startAngle = startAngle;
	}

	/**
	 * �׷����̼��� ���� �߽ɸ� ��Ȳ�Ѵ�.
	 * 
	 * @return �׷����̼��� ���� �߽�
	 */
	public long getCenterX() {
		return centerX;
	}

	/**
	 * �׷����̼��� ���� �߽ɸ� �����Ѵ�.
	 * 
	 * @param centerX
	 *            �׷����̼��� ���� �߽�
	 */
	public void setCenterX(long centerX) {
		this.centerX = centerX;
	}

	/**
	 * �׷����̼��� ���� �߽��� ��ȯ�Ѵ�.
	 * 
	 * @return �׷����̼��� ���� �߽�
	 */
	public long getCenterY() {
		return centerY;
	}

	/**
	 * �׷����̼��� ���� �߽��� �����Ѵ�.
	 * 
	 * @param centerY
	 *            �׷����̼��� ���� �߽�
	 */
	public void setCenterY(long centerY) {
		this.centerY = centerY;
	}

	/**
	 * �׷����̼� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �׷����̼� ���� ����
	 */
	public long getBlurringDegree() {
		return blurringDegree;
	}

	/**
	 * �׷����̼� ���� ������ �����Ѵ�.
	 * 
	 * @param blurringDegree
	 *            �׷����̼� ���� ����
	 */
	public void setBlurringDegree(long blurringDegree) {
		this.blurringDegree = blurringDegree;
	}

	/**
	 * ������ �ٲ�� ���� ��ġ�� �߰��Ѵ�.
	 * 
	 * @param changePoint
	 *            ������ �ٲ�� ���� ��ġ
	 */
	public void addChangePoint(int changePoint) {
		changePointList.add(changePoint);
	}

	/**
	 * ������ �ٲ�� ���� ��ġ ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ �ٲ�� ���� ��ġ ����Ʈ
	 */
	public ArrayList<Integer> getChangePointList() {
		return changePointList;
	}

	/**
	 * ���ο� ���� ��ü�� �����ϰ� ���� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ��ü
	 */
	public Color4Byte addNewColor() {
		Color4Byte c = new Color4Byte();
		colorList.add(c);
		return c;
	}

	/**
	 * ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ
	 */
	public ArrayList<Color4Byte> getColorList() {
		return colorList;
	}

	/**
	 * ���� �߽��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �߽�
	 */
	public short getBlurringCenter() {
		return blurringCenter;
	}

	/**
	 * ���� �߽��� �����Ѵ�.
	 * 
	 * @param blurringCenter
	 *            ���� �߽�
	 */
	public void setBlurringCenter(short blurringCenter) {
		this.blurringCenter = blurringCenter;
	}
}
