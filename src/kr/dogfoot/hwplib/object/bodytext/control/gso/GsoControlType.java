package kr.dogfoot.hwplib.object.bodytext.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlID;

/**
 * �׸��� ��ü Ÿ��
 * 
 * @author neolord
 */
public enum GsoControlType {
	/**
	 * ��
	 */
	Line(CtrlID.make('$', 'l', 'i', 'n')),
	/**
	 * �簢��
	 */
	Rectangle(CtrlID.make('$', 'r', 'e', 'c')),
	/**
	 * Ÿ��
	 */
	Ellipse(CtrlID.make('$', 'e', 'l', 'l')),
	/**
	 * ȣ
	 */
	Arc(CtrlID.make('$', 'a', 'r', 'c')),
	/**
	 * �ٰ���
	 */
	Polygon(CtrlID.make('$', 'p', 'o', 'l')),
	/**
	 * �
	 */
	Curve(CtrlID.make('$', 'c', 'u', 'r')),
	/**
	 * �׸�
	 */
	Picture(CtrlID.make('$', 'p', 'i', 'c')),
	/**
	 * OLE
	 */
	OLE(CtrlID.make('$', 'o', 'l', 'e')),
	/**
	 * ���� ��ü
	 */
	Container(CtrlID.make('$', 'c', 'o', 'n'));

	/**
	 * �ƾƵ�
	 */
	private long id;

	/**
	 * ������
	 * 
	 * @param id
	 *            ���̵�
	 */
	private GsoControlType(long id) {
		this.id = id;
	}

	/**
	 * ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���̵�
	 */
	public long getId() {
		return id;
	}

	/**
	 * ���̵� �ش��ϴ� �׸��� ��ü Ÿ�Ը� ��ȯ�Ѵ�.
	 * 
	 * @param id
	 *            ���̵�
	 * @return �׸��� ��ü Ÿ��
	 */
	public static GsoControlType idOf(long id) {
		for (GsoControlType gct : values()) {
			if (gct.id == id) {
				return gct;
			}
		}
		return Line;
	}
}