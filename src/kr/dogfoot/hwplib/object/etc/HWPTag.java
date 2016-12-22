package kr.dogfoot.hwplib.object.etc;

/**
 * Record�� �ױ� ����Ʈ
 * 
 * @author neolord
 */
public class HWPTag {
	/**
	 * tag ���� ��
	 */
	private final static short BEGIN = 0x10;

	// for "DocInfo" stream
	/**
	 * ���� �Ӽ� tag
	 */
	public final static short DOCUMENT_PROPERTIES = BEGIN;
	/**
	 * ���̵� ���� ��� tag
	 */
	public final static short ID_MAPPINGS = BEGIN + 1;
	/**
	 * BinData tag
	 */
	public final static short BIN_DATA = BEGIN + 2;
	/**
	 * Typeface Name tag
	 */
	public final static short FACE_NAME = BEGIN + 3;
	/**
	 * �׵θ�/��� tag
	 */
	public final static short BORDER_FILL = BEGIN + 4;
	/**
	 * ���� ��� tag
	 */
	public final static short CHAR_SHAPE = BEGIN + 5;
	/**
	 * �� ���� tag
	 */
	public final static short TAB_DEF = BEGIN + 6;
	/**
	 * ��ȣ ���� tag
	 */
	public final static short NUMBERING = BEGIN + 7;
	/**
	 * �۸Ӹ�ǥ tag
	 */
	public final static short BULLET = BEGIN + 8;
	/**
	 * ���� ��� tag
	 */
	public final static short PARA_SHAPE = BEGIN + 9;
	/**
	 * ��Ÿ�� tag
	 */
	public final static short STYLE = BEGIN + 10;
	/**
	 * ������ ������ ������ tag
	 */
	public final static short DOC_DATA = BEGIN + 11;
	/**
	 * ������ ���� ������ tag
	 */
	public final static short DISTRIBUTE_DOC_DATA = BEGIN + 12;
	/**
	 * ȣȯ ���� tag
	 */
	public final static short COMPATIBLE_DOCUMENT = BEGIN + 14;
	/**
	 * ���̾ƿ� ȣȯ�� tag
	 */
	public final static short LAYOUT_COMPATIBILITY = BEGIN + 15;
	/**
	 * ���� ���� ���� tag
	 */
	public final static short TRACKCHANGE = BEGIN + 16;
	/**
	 * �޸� ��� tag
	 */
	public final static short MEMO_SHAPE = BEGIN + 76;
	/**
	 * ��Ģó�� ���� tag
	 */
	public final static short FORBIDDEN_CHAR = BEGIN + 78;
	/**
	 * ���� ���� ���� �� ��� tag
	 */
	public final static short TRACK_CHANGE = BEGIN + 80;
	/**
	 * ���� ���� �ۼ��� tag
	 */
	public final static short TRACK_CHANGE_AUTHOR = BEGIN + 81;

	// for "BodyText" storages
	/**
	 * ���� ��� tag
	 */
	public final static short PARA_HEADER = BEGIN + 50;
	/**
	 * ������ �ؽ�Ʈ tag
	 */
	public final static short PARA_TEXT = BEGIN + 51;
	/**
	 * ������ ���� ��� tag
	 */
	public final static short PARA_CHAR_SHAPE = BEGIN + 52;
	/**
	 * ������ ���̾ƿ� tag
	 */
	public final static short PARA_LINE_SEG = BEGIN + 53;
	/**
	 * ������ ���� �±� tag
	 */
	public final static short PARA_RANGE_TAG = BEGIN + 54;
	/**
	 * ��Ʈ�� ��� tag
	 */
	public final static short CTRL_HEADER = BEGIN + 55;
	/**
	 * ���� ����Ʈ ��� tag
	 */
	public final static short LIST_HEADER = BEGIN + 56;
	/**
	 * ���� ���� tag
	 */
	public final static short PAGE_DEF = BEGIN + 57;
	/**
	 * ����/���� ��� tag
	 */
	public final static short FOOTNOTE_SHAPE = BEGIN + 58;
	/**
	 * �� �׵θ�/��� tag
	 */
	public final static short PAGE_BORDER_FILL = BEGIN + 59;
	/**
	 * ��ü tag
	 */
	public final static short SHAPE_COMPONENT = BEGIN + 60;
	/**
	 * ǥ ��ü tag
	 */
	public final static short TABLE = BEGIN + 61;
	/**
	 * ���� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_LINE = BEGIN + 62;
	/**
	 * �簢�� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_RECTANGLE = BEGIN + 63;
	/**
	 * Ÿ�� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_ELLIPSE = BEGIN + 64;
	/**
	 * ȣ ��ü tag
	 */
	public final static short SHAPE_COMPONENT_ARC = BEGIN + 65;
	/**
	 * �ٰ��� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_POLYGON = BEGIN + 66;
	/**
	 * � ��ü tag
	 */
	public final static short SHAPE_COMPONENT_CURVE = BEGIN + 67;
	/**
	 * OLE ��ü tag
	 */
	public final static short SHAPE_COMPONENT_OLE = BEGIN + 68;
	/**
	 * �׸� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_PICTURE = BEGIN + 69;
	/**
	 * �����̳� ��ü tag
	 */
	public final static short SHAPE_COMPONENT_CONTAINER = BEGIN + 70;
	/**
	 * ��Ʈ�� ������ ������ tag
	 */
	public final static short CTRL_DATA = BEGIN + 71;
	/**
	 * ���� ��ü tag
	 */
	public final static short EQEDIT = BEGIN + 72;
	/**
	 * �۸ʽ� tag
	 */
	public final static short SHAPE_COMPONENT_TEXTART = BEGIN + 74;
	/**
	 * ��� ��ü tag
	 */
	public final static short FORM_OBJECT = BEGIN + 75;
	/**
	 * �޸� ����Ʈ ��� tag
	 */
	public final static short MEMO_LIST = BEGIN + 77;
	/**
	 * ��Ʈ ������ tag
	 */
	public final static short CHART_DATA = BEGIN + 79;
	/**
	 * ���� ������ tag
	 */
	public final static short VIDEO_DATA = BEGIN + 82;
	/**
	 * Unknown tag
	 */
	public final static short SHAPE_COMPONENT_UNKNOWN = BEGIN + 99;
}
