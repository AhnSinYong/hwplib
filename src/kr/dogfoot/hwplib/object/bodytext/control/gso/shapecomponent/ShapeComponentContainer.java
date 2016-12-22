package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent;

import java.util.ArrayList;

/**
 * �����̳� ��Ʈ���� ���� ��ü ���� �Ӽ� ���ڵ�
 * 
 * @author neolord
 */
public class ShapeComponentContainer extends ShapeComponent {
	/**
	 * �����̳ʿ� ���Ե� ��Ʈ���� id ����Ʈ
	 */
	private ArrayList<Long> childControlIdList;

	/**
	 * ������
	 */
	public ShapeComponentContainer() {
		childControlIdList = new ArrayList<Long>();
	}

	/**
	 * �����̳ʿ� ���Ե� ��Ʈ���� id�� ����Ʈ �߰��Ѵ�.
	 * 
	 * @param id
	 *            �����̳ʿ� ���Ե� ��Ʈ���� id
	 */
	public void addChildControlId(long id) {
		childControlIdList.add(id);
	}

	/**
	 * �����̳ʿ� ���Ե� ��Ʈ���� id ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �����̳ʿ� ���Ե� ��Ʈ���� id ����Ʈ
	 */
	public ArrayList<Long> getChildControlIdList() {
		return childControlIdList;
	}
}
