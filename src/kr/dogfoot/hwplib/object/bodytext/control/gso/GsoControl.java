package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.Control;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.Caption;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponent;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponentNormal;

/**
 * �׸��� ��ü ��Ʈ��
 * 
 * @author neolord
 */
public class GsoControl extends Control {
	/**
	 * �׸��� ��ü ���̵�
	 */
	private long gsoId;
	/**
	 * ĸ�� ����
	 */
	private Caption caption;
	/**
	 * �׸��� ��ü�� ���� ���
	 */
	protected ShapeComponent shapeComponent;

	/**
	 * ������
	 */
	public GsoControl() {
		this(new CtrlHeaderGso());
	}

	/**
	 * ������
	 * 
	 * @param header
	 *            �׸��� ��ü�� ���� ��Ʈ�� ���
	 */
	public GsoControl(CtrlHeaderGso header) {
		super(header);

		shapeComponent = new ShapeComponentNormal();
	}

	/**
	 * �׸��� ��ü�� ���� ��Ʈ�� ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü�� ���� ��Ʈ�� ��� ��ü
	 */
	public CtrlHeaderGso getHeader() {
		return (CtrlHeaderGso) header;
	}

	/**
	 * �׸��� ��ü ���̵� ��ȯȯ��.
	 * 
	 * @return �׸��� ��ü ���̵�
	 */
	public long getGsoId() {
		return gsoId;
	}

	/**
	 * �׸��� ��ü ���̵� �����Ѵ�.
	 * 
	 * @param gsoId
	 *            �׸��� ��ü ���̵�
	 */
	public void setGsoId(long gsoId) {
		this.gsoId = gsoId;
	}

	/**
	 * �׸��� ��ü Ÿ���� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü Ÿ��
	 */
	public GsoControlType getGsoType() {
		return GsoControlType.idOf(gsoId);
	}

	/**
	 * ĸ�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ĸ�� ���� ��ü
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * ĸ�� ���� ��ü�� �����Ѵ�.
	 * 
	 * @param caption
	 *            ĸ�� ���� ��ü
	 */
	public void setCaption(Caption caption) {
		this.caption = caption;
	}

	/**
	 * �׸��� ��ü�� ���� ����� ���³��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü�� ���� ����� ���³��� ��ü
	 */
	public ShapeComponent getShapeComponent() {
		return shapeComponent;
	}
}
