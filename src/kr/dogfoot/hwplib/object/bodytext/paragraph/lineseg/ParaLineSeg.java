package kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg;

import java.util.ArrayList;

/**
 * ������ ���̾ƿ� ���ڵ�
 * 
 * @author neolord
 */
public class ParaLineSeg {
	/**
	 * �� ���� align ������ ����Ʈ
	 */
	private ArrayList<LineSegItem> lineSegItemList;

	/**
	 * ������
	 */
	public ParaLineSeg() {
		lineSegItemList = new ArrayList<LineSegItem>();
	}

	/**
	 * �� ���� align ������ ���� ��ü�� ���� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ���� align ������ ���� ��ü
	 */
	public LineSegItem addNewLineSegItem() {
		LineSegItem plsi = new LineSegItem();
		lineSegItemList.add(plsi);
		return plsi;
	}

	/**
	 * �� ���� align ������ ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� align ������ ����Ʈ
	 */
	public ArrayList<LineSegItem> getLineSegItemList() {
		return lineSegItemList;
	}
}
