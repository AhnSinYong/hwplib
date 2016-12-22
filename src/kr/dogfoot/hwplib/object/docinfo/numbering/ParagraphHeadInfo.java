package kr.dogfoot.hwplib.object.docinfo.numbering;

/**
 * ���� �Ӹ� ���� ��ü
 * 
 * @author neolord
 */
public class ParagraphHeadInfo {
	/**
	 * �Ӽ�
	 */
	private ParagraphHeadInfoProperty property;
	/**
	 * �ʺ� ������
	 */
	private int correctionValueForWidth;
	/**
	 * �������� �Ÿ�
	 */
	private int distanceFromBody;
	/**
	 * ������ ���� ��� ���̵�
	 */
	private long charShapeID;

	/**
	 * ������
	 */
	public ParagraphHeadInfo() {
		property = new ParagraphHeadInfoProperty();
	}

	/**
	 * ���� �Ӹ� ������ �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ӹ� ������ �Ӽ� ��ü
	 */
	public ParagraphHeadInfoProperty getProperty() {
		return property;
	}

	/**
	 * �ʺ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return �ʺ� ������
	 */
	public int getCorrectionValueForWidth() {
		return correctionValueForWidth;
	}

	/**
	 * �ʺ� �������� �����Ѵ�.
	 * 
	 * @param correctionValueForWidth
	 *            �ʺ� ������
	 */
	public void setCorrectionValueForWidth(int correctionValueForWidth) {
		this.correctionValueForWidth = correctionValueForWidth;
	}

	/**
	 * �������� �Ÿ��� ��ȯ�Ѵ�.
	 * 
	 * @return �������� �Ÿ�
	 */
	public int getDistanceFromBody() {
		return distanceFromBody;
	}

	/**
	 * �������� �Ÿ��� �����Ѵ�.
	 * 
	 * @param distanceFromBody
	 *            �������� �Ÿ�
	 */
	public void setDistanceFromBody(int distanceFromBody) {
		this.distanceFromBody = distanceFromBody;
	}

	/**
	 * ������ ���� ��� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��� ���̵�
	 */
	public long getCharShapeID() {
		return charShapeID;
	}

	/**
	 * ������ ���� ��� ���̵� �����Ѵ�.
	 * 
	 * @param charShapeID
	 *            ������ ���� ��� ���̵�
	 */
	public void setCharShapeID(long charShapeID) {
		this.charShapeID = charShapeID;
	}
}
