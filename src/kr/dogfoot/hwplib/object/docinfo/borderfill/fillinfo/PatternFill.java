package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * �ܻ� ä��� ��ü
 * 
 * @author neolord
 */
public class PatternFill {
	/**
	 * ����
	 */
	private Color4Byte backColor;
	/**
	 * ���̻�
	 */
	private Color4Byte patternColor;
	/**
	 * ���� ����
	 */
	private PatternType patternType;

	/**
	 * ������
	 */
	public PatternFill() {
		backColor = new Color4Byte();
		patternColor = new Color4Byte();
	}

	/**
	 * ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ü
	 */
	public Color4Byte getBackColor() {
		return backColor;
	}

	/**
	 * ���̻� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̻� ��ü
	 */
	public Color4Byte getPatternColor() {
		return patternColor;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public PatternType getPatternType() {
		return patternType;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param patternType
	 *            ���� ����
	 */
	public void setPatternType(PatternType patternType) {
		this.patternType = patternType;
	}
}
