package kr.dogfoot.hwplib.object.bodytext.control.gso;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponentContainer;

/**
 * ���� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class ControlContainer extends GsoControl {
	/**
	 * ���ϵ� ��Ʈ�� ����Ʈ
	 */
	private ArrayList<GsoControl> childControlList;

	/**
	 * ������
	 */
	public ControlContainer() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public ControlContainer(CtrlHeaderGso header) {
		super(header);
		setGsoId(GsoControlType.Container.getId());
		shapeComponent = new ShapeComponentContainer();

		childControlList = new ArrayList<GsoControl>();
	}

	/**
	 * ���ϵ� ��Ʈ���� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param childControl
	 *            ���ϵ� ��Ʈ��
	 */
	public void addChildControl(GsoControl childControl) {
		childControlList.add(childControl);
	}

	/**
	 * ���ϵ� ��Ʈ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���ϵ� ��Ʈ���� ����Ʈ
	 */
	public ArrayList<GsoControl> getChildControlList() {
		return childControlList;
	}
}
