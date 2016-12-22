package kr.dogfoot.hwplib.object.bodytext.paragraph.header;

/**
 * ���� ��� ���ڵ�
 * 
 * @author neolord
 */
public class ParaHeader {
	/**
	 * ���� ����Ʈ���� �� ������ ������ �������� ����
	 */
	private boolean lastInList;
	/**
	 * �ؽ�Ʈ�� ������ �ִ� ������ ����
	 */
	private long characterCount;
	/**
	 * control mask
	 */
	private ControlMask controlMask;
	/**
	 * ������ ���� ��� id
	 */
	private int paraShapeId;
	/**
	 * ������ ��Ÿ�� id
	 */
	private short styleId;
	/**
	 * �� ������ ����
	 */
	private DivideSort divideSort;
	/**
	 * ���� ��� ������ ����. ParaCharShape�� ���� ��ġ-���� ��� ���� ����
	 */
	private int charShapeCount;
	/**
	 * range tag ������ ����. ParaRangeTag�� ���� �±��� ����
	 */
	private int rangeTagCount;
	/**
	 * �� �ٿ� ���� align�� ���� ������ ����. ParaLineSeg�� ������ ����
	 */
	private int lineAlignCount;
	/**
	 * ���� Instance ID (unique ID)
	 */
	private long instanceID;
	/**
	 * �������� ���� ���ܿ���. (5.0.3.2 ���� �̻�)
	 */
	private int isMergedByTrack;

	/**
	 * ������
	 */
	public ParaHeader() {
		controlMask = new ControlMask();
		divideSort = new DivideSort();
	}

	/**
	 * ���� ����Ʈ���� �� ������ ������ �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ���� �� ������ ������ �������� ����
	 */
	public boolean isLastInList() {
		return lastInList;
	}

	/**
	 * ���� ����Ʈ���� �� ������ ������ �������� ���θ� �����Ѵ�.
	 * 
	 * @param lastInList
	 *            ���� ����Ʈ���� �� ������ ������ �������� ����
	 */
	public void setLastInList(boolean lastInList) {
		this.lastInList = lastInList;
	}

	/**
	 * �ؽ�Ʈ�� ������ �ִ� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ؽ�Ʈ�� ������ �ִ� ������ ����
	 */
	public long getCharacterCount() {
		return characterCount;
	}

	/**
	 * �ؽ�Ʈ�� ������ �ִ� ������ ������ �����Ѵ�.
	 * 
	 * @param characterCount
	 *            �ؽ�Ʈ�� ������ �ִ� ������ ����
	 */
	public void setCharacterCount(long characterCount) {
		this.characterCount = characterCount;
	}

	/**
	 * control mask ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return control mask ��ü
	 */
	public ControlMask getControlMask() {
		return controlMask;
	}

	/**
	 * ������ ���� ��� ��ü�� id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��� ��ü�� id
	 */
	public int getParaShapeId() {
		return paraShapeId;
	}

	/**
	 * ������ ���� ��� ��ü�� id�� �����Ѵ�.
	 * 
	 * @param paraShapeId
	 *            ������ ���� ��� ��ü�� id
	 */
	public void setParaShapeId(int paraShapeId) {
		this.paraShapeId = paraShapeId;
	}

	/**
	 * ������ ��Ÿ�� ��ü�� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ��Ÿ�� ��ü�� Id
	 */
	public short getStyleId() {
		return styleId;
	}

	/**
	 * ������ ��Ÿ�� ��ü�� Id�� �����Ѵ�.
	 * 
	 * @param styleId
	 *            ������ ��Ÿ�� ��ü�� Id
	 */
	public void setStyleId(short styleId) {
		this.styleId = styleId;
	}

	/**
	 * �� ������ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ������ ���� ��ü
	 */
	public DivideSort getDivideSort() {
		return divideSort;
	}

	/**
	 * ���� ��� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ������ ����
	 */
	public int getCharShapeCount() {
		return charShapeCount;
	}

	/**
	 * ���� ��� ������ ������ �����Ѵ�.
	 * 
	 * @param charShapeCount
	 *            ���� ��� ������ ����
	 */
	public void setCharShapeCount(int charShapeCount) {
		this.charShapeCount = charShapeCount;
	}

	/**
	 * range tag ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return range tag ������ ����
	 */
	public int getRangeTagCount() {
		return rangeTagCount;
	}

	/**
	 * range tag ������ ������ �����Ѵ�.
	 * 
	 * @param rangeTagCount
	 *            range tag ������ ����
	 */
	public void setRangeTagCount(int rangeTagCount) {
		this.rangeTagCount = rangeTagCount;
	}

	/**
	 * �� �ٿ� ���� align�� ���� ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return �� �ٿ� ���� align�� ���� ������ ����
	 */
	public int getLineAlignCount() {
		return lineAlignCount;
	}

	/**
	 * �� �ٿ� ���� align�� ���� ������ ������ �����Ѵ�.
	 * 
	 * @param lineAlignCount
	 *            �� �ٿ� ���� align�� ���� ������ ����.
	 */
	public void setLineAlignCount(int lineAlignCount) {
		this.lineAlignCount = lineAlignCount;
	}

	/**
	 * ������ instance id�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ instance id
	 */
	public long getInstanceID() {
		return instanceID;
	}

	/**
	 * ������ instance id�� �����Ѵ�.
	 * 
	 * @param instanceID
	 *            ������ instance id
	 */
	public void setInstanceID(long instanceID) {
		this.instanceID = instanceID;
	}

	/**
	 * �������� ���� ���ܿ��θ� ��ȯ�Ѵ�. (5.0.3.2 ���� �̻�)
	 * 
	 * @return �������� ���� ���ܿ���
	 */
	public int getIsMergedByTrack() {
		return isMergedByTrack;
	}

	/**
	 * �������� ���� ���ܿ��θ� �����Ѵ�.
	 * 
	 * @param isMergedByTrack
	 *            �������� ���� ���ܿ���
	 */
	public void setIsMergedByTrack(int isMergedByTrack) {
		this.isMergedByTrack = isMergedByTrack;
	}
}
