package kr.dogfoot.hwplib.object.docinfo.facename;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �۲ÿ� ���� �Ӽ� ��ü
 * 
 * @author neolord
 */
public class FaceNameProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 1 byte)
	 */
	private short value;

	/**
	 * ������
	 */
	public FaceNameProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public short getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(short value) {
		this.value = value;
	}

	/**
	 * ��ü �۲� ���� ���θ� ��ȯ�Ѵ�. (0x80)
	 * 
	 * @return ��ü �۲� ���� ����
	 */
	public boolean hasSubstituteFont() {
		return BitFlag.get(value, 7);
	}

	/**
	 * ��ü �۲� ���� ������ �����Ѵ�. (0x80)
	 * 
	 * @param hasSubstituteFontInfo
	 *            ��ü �۲� ���� ����
	 */
	public void setHasSubstituteFont(boolean hasSubstituteFontInfo) {
		value = BitFlag.set(value, 7, hasSubstituteFontInfo);
	}

	/**
	 * �۲� ���� ���� ���� ���θ� ��ȯ�Ѵ�. (0x40)
	 * 
	 * @return �۲� ���� ���� ���� ����
	 */
	public boolean hasFontInfo() {
		return BitFlag.get(value, 6);
	}

	/**
	 * �۲� ���� ���� ���� ���θ� �����Ѵ�. (0x40)
	 * 
	 * @param hasFontInfo
	 *            �۲� ���� ���� ���� ����
	 */
	public void setHasFontInfo(boolean hasFontInfo) {
		value = BitFlag.set(value, 6, hasFontInfo);
	}

	/**
	 * �⺻ �۲� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return �⺻ �۲� ���� ����
	 */
	public boolean hasBaseFont() {
		return BitFlag.get(value, 5);
	}

	/**
	 * �⺻ �۲� ���� ���θ� �����Ѵ�.
	 * 
	 * @param hasBaseFont
	 *            �⺻ �۲� ���� ����
	 */
	public void setHasBaseFont(boolean hasBaseFont) {
		value = BitFlag.set(value, 5, hasBaseFont);
	}
}
