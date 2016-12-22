package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;

/**
 * ã�ƺ��� ǥ�� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderIndexMark extends CtrlHeader {
	/**
	 * Ű���� 1
	 */
	private String keyword1;
	/**
	 * Ű���� 2
	 */
	private String keyword2;

	/**
	 * ������
	 */
	public CtrlHeaderIndexMark() {
		super(ControlType.IndexMark.getCtrlId());
	}

	/**
	 * Ű���� 1�� ��ȯ�Ѵ�.
	 * 
	 * @return Ű���� 1
	 */
	public String getKeyword1() {
		return keyword1;
	}

	/**
	 * Ű���� 1�� �����Ѵ�.
	 * 
	 * @param keyword1
	 *            Ű���� 1
	 */
	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}

	/**
	 * Ű���� 2�� ��ȯ�Ѵ�.
	 * 
	 * @return Ű���� 2
	 */
	public String getKeyword2() {
		return keyword2;
	}

	/**
	 * Ű���� 2�� �����Ѵ�.
	 * 
	 * @param keyword2
	 *            Ű���� 2
	 */
	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}
}
