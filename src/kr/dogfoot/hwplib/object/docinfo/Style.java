package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.style.StyleProperty;

/**
 * ��Ÿ�Ͽ� ����  ���ڵ�
 * 
 * @author neolord
 */
public class Style {
	/**
	 * �ѱ� �̸�
	 */
	private String hangulName;
	/**
	 * ���� �̸�
	 */
	private String englishName;
	/**
	 * �Ӽ�
	 */
	private StyleProperty proeprty;
	/**
	 * ���� ��Ÿ�� ���̵�
	 */
	private short nextStyleId;
	/**
	 * ��� ���̵�
	 */
	private short languageId;
	/**
	 * ������ ���� ��� ���̵�
	 */
	private int paraShapeId;
	/**
	 * ������ ���� ��� ���̵�
	 */
	private int charShapeId;

	/**
	 * ������
	 */
	public Style() {
		proeprty = new StyleProperty();
	}

	/**
	 * �ѱ� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� �̸�
	 */
	public String getHangulName() {
		return hangulName;
	}

	/**
	 * �ѱ� �̸��� �����Ѵ�.
	 * 
	 * @param hangulName
	 *            �ѱ� �̸�
	 */
	public void setHangulName(String hangulName) {
		this.hangulName = hangulName;
	}

	/**
	 * ���� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �̸�
	 */
	public String getEnglishName() {
		return englishName;
	}

	/**
	 * ���� �̸��� �����Ѵ�.
	 * 
	 * @param englishName
	 *            ���� �̸�
	 */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	/**
	 * ��Ÿ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ���� �Ӽ� ��ü
	 */
	public StyleProperty getProeprty() {
		return proeprty;
	}

	/**
	 * ���� ��Ÿ�� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��Ÿ�� ���̵�
	 */
	public short getNextStyleId() {
		return nextStyleId;
	}

	/**
	 * ���� ��Ÿ�� ���̵� �����Ѵ�.
	 * 
	 * @param nextStyleId
	 *            ���� ��Ÿ�� ���̵�
	 */
	public void setNextStyleId(short nextStyleId) {
		this.nextStyleId = nextStyleId;
	}

	/**
	 * ��� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���̵�
	 */
	public short getLanguageId() {
		return languageId;
	}

	/**
	 * ��� ���̵� �����Ѵ�.
	 * 
	 * @param languageId
	 */
	public void setLanguageId(short languageId) {
		this.languageId = languageId;
	}

	/**
	 * ������ ���� ��� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��� ���̵�
	 */
	public int getParaShapeId() {
		return paraShapeId;
	}

	/**
	 * ������ ���� ��� ���̵� �����Ѵ�.
	 * 
	 * @param paraShapeId
	 *            ������ ���� ��� ���̵�
	 */
	public void setParaShapeId(int paraShapeId) {
		this.paraShapeId = paraShapeId;
	}

	/**
	 * ������ ���� ��� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��� ���̵�
	 */
	public int getCharShapeId() {
		return charShapeId;
	}

	/**
	 * ������ ���� ��� ���̵� �����Ѵ�.
	 * 
	 * @param charShapeId
	 *            ������ ���� ��� ���̵�
	 */
	public void setCharShapeId(int charShapeId) {
		this.charShapeId = charShapeId;
	}
}
