package kr.dogfoot.hwplib.object.bodytext.control.equation;

import kr.dogfoot.hwplib.object.etc.Color4Byte;

/**
 * ���� ��Ʈ���� ���� ������ ��Ÿ���� ���ڵ�
 * 
 * @author neolord
 */
public class EQEdit {
	/**
	 * �Ӽ�(��ũ��Ʈ�� �����ϴ� ����. ù ��Ʈ�� ���� ������ �� ����, ���� ������ ���� ����??)
	 */
	private long property;
	/**
	 * �ѱ� ���� ��ũ��Ʈ
	 */
	private String script;
	/**
	 * ���� ���� ũ��
	 */
	private long letterSize;
	/**
	 * ���� ����
	 */
	private Color4Byte letterColor;
	/**
	 * base line
	 */
	private short baseLine;
	/**
	 * ���� ���� ??
	 */
	private String versionInfo;

	/**
	 * ������
	 */
	public EQEdit() {
		letterColor = new Color4Byte();
	}

	/**
	 * �Ӽ����� ��ȯ�Ѵ�.
	 * 
	 * @return �Ӽ���
	 */
	public long getProperty() {
		return property;
	}

	/**
	 * �Ӽ����� �����Ѵ�.
	 * 
	 * @param property
	 *            �Ӽ���
	 */
	public void setProperty(long property) {
		this.property = property;
	}

	/**
	 * �ѱ� ���� ��ũ��Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� ���� ��ũ��Ʈ
	 */
	public String getScript() {
		return script;
	}

	/**
	 * �ѱ� ���� ��ũ��Ʈ�� �����Ѵ�.
	 * 
	 * @param script
	 *            �ѱ� ���� ��ũ��Ʈ
	 */
	public void setScript(String script) {
		this.script = script;
	}

	/**
	 * ���� ���� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ũ��
	 */
	public long getLetterSize() {
		return letterSize;
	}

	/**
	 * ���� ���� ũ�⸦ �����Ѵ�.
	 * 
	 * @param letterSize
	 *            ���� ���� ũ��
	 */
	public void setLetterSize(long letterSize) {
		this.letterSize = letterSize;
	}

	/**
	 * ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ü
	 */
	public Color4Byte getLetterColor() {
		return letterColor;
	}

	/**
	 * base line�� ��ȯ�Ѵ�.
	 * 
	 * @return base line
	 */
	public short getBaseLine() {
		return baseLine;
	}

	/**
	 * base line�� �����Ѵ�.
	 * 
	 * @param baseLine
	 *            base line
	 */
	public void setBaseLine(short baseLine) {
		this.baseLine = baseLine;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public String getVersionInfo() {
		return versionInfo;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param versionInfo
	 *            ���� ����
	 */
	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
}
