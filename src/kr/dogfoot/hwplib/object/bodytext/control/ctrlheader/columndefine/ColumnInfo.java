package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.columndefine;

/**
 * �ϳ��� �ܿ� ���� ������ ���³��� ��ü
 * 
 * @author neolord
 */
public class ColumnInfo {
	/**
	 * �ٴ��� ��
	 */
	private int width;
	/**
	 * ���� �ܰ��� ����
	 */
	private int gap;

	/**
	 * ������
	 */
	public ColumnInfo() {
	}

	/**
	 * �ٴ��� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ٴ��� ��
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * �ٴ��� ���� �����Ѵ�.
	 * 
	 * @param width
	 *            �ٴ��� ��
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * ���� �ܰ��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �ܰ��� ����
	 */
	public int getGap() {
		return gap;
	}

	/**
	 * ���� �ܰ��� ������ �����Ѵ�.
	 * 
	 * @param gap
	 *            ���� �ܰ��� ����
	 */
	public void setGap(int gap) {
		this.gap = gap;
	}
}
