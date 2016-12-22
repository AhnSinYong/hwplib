package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.picture;

import java.util.ArrayList;

/**
 * ���� ȿ���� ���Ե� ����
 * 
 * @author neolord
 */
public class ColorWithEffect {
	/**
	 * ���� Ÿ�� (���� ����)
	 */
	private int type;
	/**
	 * Ÿ�Կ� ���� ���� �� (���� ����)
	 */
	private byte[] color;
	/**
	 * ���� ȿ���� ����Ʈ
	 */
	private ArrayList<ColorEffect> colorEffectList;

	/**
	 * ������
	 */
	public ColorWithEffect() {
		colorEffectList = new ArrayList<ColorEffect>();
	}

	/**
	 * ���� Ÿ���� ��ȯ�Ѵ�. (���� ����)
	 * 
	 * @return ���� Ÿ��
	 */
	public int getType() {
		return type;
	}

	/**
	 * ���� Ÿ���� �����Ѵ�. (���� ����)
	 * 
	 * @param type
	 *            ���� Ÿ��
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * Ÿ�Կ� ���� ���� ���� ��ȯ�Ѵ�.(���� ����)
	 * 
	 * @return Ÿ�Կ� ���� ���� ��
	 */
	public byte[] getColor() {
		return color;
	}

	/**
	 * Ÿ�Կ� ���� ���� ���� �����Ѵ�.
	 * 
	 * @param color
	 *            Ÿ�Կ� ���� ���� ��
	 */
	public void setColor(byte[] color) {
		this.color = color;
	}

	/**
	 * ���ο� ���� ȿ�� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ȿ�� ��ü
	 */
	public ColorEffect addNewColorEffect() {
		ColorEffect ce = new ColorEffect();
		colorEffectList.add(ce);
		return ce;
	}

	/**
	 * ���� ȿ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ȿ���� ����Ʈ
	 */
	public ArrayList<ColorEffect> getColorEffectList() {
		return colorEffectList;
	}
}
