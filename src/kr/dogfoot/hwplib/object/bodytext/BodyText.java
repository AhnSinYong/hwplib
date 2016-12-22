package kr.dogfoot.hwplib.object.bodytext;

import java.util.ArrayList;

/**
 * ������ ��Ÿ���� ��ü. HWP���� ���� "BodyText" storage�� ����ȴ�.
 * 
 * @author neolord
 */

public class BodyText {
	/**
	 * ���� ����(����) ����Ʈ
	 */
	private ArrayList<Section> sectionList;

	/**
	 * ������
	 */
	public BodyText() {
		sectionList = new ArrayList<Section>();
	}

	/**
	 * ���ο� ���� ����(����)�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ����(����)
	 */
	public Section addNewSection() {
		Section s = new Section();
		sectionList.add(s);
		return s;
	}

	/**
	 * ���� ����(����) ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����(����) ����Ʈ
	 */
	public ArrayList<Section> getSectionList() {
		return sectionList;
	}
}
