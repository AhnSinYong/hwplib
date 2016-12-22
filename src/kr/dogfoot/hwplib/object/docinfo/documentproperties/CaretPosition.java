package kr.dogfoot.hwplib.object.docinfo.documentproperties;

/**
 * ĳ���� ��ġ ����
 * 
 * @author neolord
 */
public class CaretPosition {
	/**
	 * ����Ʈ ���̵� - (���� ??)
	 */
	private long listID;
	/**
	 * ���� ���̵�
	 */
	private long paragraphID;
	/**
	 * ���� �������� ���� ���� ��ġ
	 */
	private long positionInParagraph;

	/**
	 * ������
	 */
	public CaretPosition() {
	}

	/**
	 * ����Ʈ ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ����Ʈ ���̵�
	 */
	public long getListID() {
		return listID;
	}

	/**
	 * ����Ʈ ���̵� �����Ѵ�.
	 * 
	 * @param listID
	 *            ����Ʈ ���̵�
	 */
	public void setListID(long listID) {
		this.listID = listID;
	}

	/**
	 * ���� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���̵�
	 */
	public long getParagraphID() {
		return paragraphID;
	}

	/**
	 * ���� ���̵� �����Ѵ�.
	 * 
	 * @param paragraphID
	 *            ���� ���̵�
	 */
	public void setParagraphID(long paragraphID) {
		this.paragraphID = paragraphID;
	}

	/**
	 * ���� �������� ���� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �������� ���� ���� ��ġ
	 */
	public long getPositionInParagraph() {
		return positionInParagraph;
	}

	/**
	 * ���� �������� ���� ���� ��ġ�� �����Ѵ�.
	 * 
	 * @param positionInParagraph
	 *            ���� �������� ���� ���� ��ġ
	 */
	public void setPositionInParagraph(long positionInParagraph) {
		this.positionInParagraph = positionInParagraph;
	}
}
