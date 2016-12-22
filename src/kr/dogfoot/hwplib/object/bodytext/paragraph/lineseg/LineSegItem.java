package kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg;

/**
 * �� ���� align ������ ���� ��ü
 * 
 * @author neolord
 */
public class LineSegItem {
	/**
	 * �ؽ�Ʈ ���� ��ġ
	 */
	private long textStartPositon;
	/**
	 * ���� ���� ��ġ
	 */
	private int lineVerticalPosition;
	/**
	 * ���� ����
	 */
	private int lineHeight;
	/**
	 * �ؽ�Ʈ �κ��� ����
	 */
	private int textPartHeight;
	/**
	 * ���� ���� ��ġ���� ���̽����α��� �Ÿ�
	 */
	private int distanceBaseLineToLineVerticalPosition;
	/**
	 * �ٰ���
	 */
	private int lineSpace;
	/**
	 * �÷������� ���� ��ġ
	 */
	private int startPositionFromColumn;
	/**
	 * ���׸�Ʈ�� ��
	 */
	private int segmentWidth;
	/**
	 * tag ����
	 */
	private LineSegItemTag tag;

	/**
	 * ������
	 */
	public LineSegItem() {
		tag = new LineSegItemTag();
	}

	/**
	 * �ؽ�Ʈ ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ ���� ��ġ
	 */
	public long getTextStartPositon() {
		return textStartPositon;
	}

	/**
	 * �ؽ�Ʈ ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param textStartPositon
	 *            �ؽ�Ʈ ���� ��ġ
	 */
	public void setTextStartPositon(long textStartPositon) {
		this.textStartPositon = textStartPositon;
	}

	/**
	 * ���� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ġ
	 */
	public int getLineVerticalPosition() {
		return lineVerticalPosition;
	}

	/**
	 * ���� ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param lineVerticalPosition
	 *            ���� ���� ��ġ
	 */
	public void setLineVerticalPosition(int lineVerticalPosition) {
		this.lineVerticalPosition = lineVerticalPosition;
	}

	/**
	 * ���� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getLineHeight() {
		return lineHeight;
	}

	/**
	 * ���� ���̸� �����Ѵ�.
	 * 
	 * @param lineHeight
	 *            ���� ����
	 */
	public void setLineHeight(int lineHeight) {
		this.lineHeight = lineHeight;
	}

	/**
	 * �ؽ�Ʈ �κ��� ���̸� ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ �κ��� ����
	 */
	public int getTextPartHeight() {
		return textPartHeight;
	}

	/**
	 * �ؽ�Ʈ �κ��� ���̸� �����Ѵ�.
	 * 
	 * @param textPartHeight
	 *            �ؽ�Ʈ �κ��� ����
	 */
	public void setTextPartHeight(int textPartHeight) {
		this.textPartHeight = textPartHeight;
	}

	/**
	 * ���� ���� ��ġ���� ���̽����α��� �Ÿ��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ġ���� ���̽����α��� �Ÿ�
	 */
	public int getDistanceBaseLineToLineVerticalPosition() {
		return distanceBaseLineToLineVerticalPosition;
	}

	/**
	 * ���� ���� ��ġ���� ���̽����α��� �Ÿ��� �����Ѵ�.
	 * 
	 * @param distanceBaseLineToLineVerticalPosition
	 *            ���� ���� ��ġ���� ���̽����α��� �Ÿ�
	 */
	public void setDistanceBaseLineToLineVerticalPosition(
			int distanceBaseLineToLineVerticalPosition) {
		this.distanceBaseLineToLineVerticalPosition = distanceBaseLineToLineVerticalPosition;
	}

	/**
	 * �ٰ����� ��ȯ�Ѵ�.
	 * 
	 * @return �ٰ���
	 */
	public int getLineSpace() {
		return lineSpace;
	}

	/**
	 * �ٰ����� �����Ѵ�.
	 * 
	 * @param lineSpace
	 *            �ٰ���
	 */
	public void setLineSpace(int lineSpace) {
		this.lineSpace = lineSpace;
	}

	/**
	 * �÷������� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return �÷������� ���� ��ġ
	 */
	public int getStartPositionFromColumn() {
		return startPositionFromColumn;
	}

	/**
	 * �÷������� ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param startPositionFromColumn
	 *            �÷������� ���� ��ġ
	 */
	public void setStartPositionFromColumn(int startPositionFromColumn) {
		this.startPositionFromColumn = startPositionFromColumn;
	}

	/**
	 * ���׸�Ʈ�� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���׸�Ʈ�� ��
	 */
	public int getSegmentWidth() {
		return segmentWidth;
	}

	/**
	 * ���׸�Ʈ�� ���� �����Ѵ�.
	 * 
	 * @param segmentWidth
	 *            ���׸�Ʈ�� ��
	 */
	public void setSegmentWidth(int segmentWidth) {
		this.segmentWidth = segmentWidth;
	}

	/**
	 * tag ������ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return tag ������ ���� ��ü
	 */
	public LineSegItemTag getTag() {
		return tag;
	}
}
