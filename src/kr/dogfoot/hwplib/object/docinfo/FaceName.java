package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.facename.FaceNameProperty;
import kr.dogfoot.hwplib.object.docinfo.facename.FontType;
import kr.dogfoot.hwplib.object.docinfo.facename.FontTypeInfo;

/**
 * �۲� ���ڵ�
 * 
 * @author neolord
 */
public class FaceName {
	/**
	 * �Ӽ�
	 */
	private FaceNameProperty property;
	/**
	 * �۲� �̸�
	 */
	private String name;
	/**
	 * ��ü �۲� ����
	 */
	private FontType substituteFontType;
	/**
	 * ��ü �۲� �̸�
	 */
	private String substituteFontName;
	/**
	 * �۲� ���� ����
	 */
	private FontTypeInfo fontTypeInfo;
	/**
	 * �⺻ �۲� �̸�
	 */
	private String baseFontName;

	/**
	 * ������
	 */
	public FaceName() {
		property = new FaceNameProperty();
		fontTypeInfo = new FontTypeInfo();
	}

	/**
	 * �۲� �Ӽ��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �۲� �Ӽ��� ���� ��ü
	 */
	public FaceNameProperty getProperty() {
		return property;
	}

	/**
	 * �۲� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return �۲� �̸�
	 */
	public String getName() {
		return name;
	}

	/**
	 * �۲� �̸��� �����Ѵ�.
	 * 
	 * @param name
	 *            �۲� �̸�
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��ü �۲� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ü �۲� ����
	 */
	public FontType getSubstituteFontType() {
		return substituteFontType;
	}

	/**
	 * ��ü �۲� ������ �����Ѵ�.
	 * 
	 * @param substituteFontType
	 *            ��ü �۲� ����
	 */
	public void setSubstituteFontType(FontType substituteFontType) {
		this.substituteFontType = substituteFontType;
	}

	/**
	 * ��ü �۲� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return ��ü �۲� �̸�
	 */
	public String getSubstituteFontName() {
		return substituteFontName;
	}

	/**
	 * ��ü �۲� �̸��� �����Ѵ�.
	 * 
	 * @param substituteFontName
	 *            ��ü �۲� �̸�
	 */
	public void setSubstituteFontName(String substituteFontName) {
		this.substituteFontName = substituteFontName;
	}

	/**
	 * �۲� ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �۲� ���� ���� ��ü
	 */
	public FontTypeInfo getFontTypeInfo() {
		return fontTypeInfo;
	}

	/**
	 * �⺻ �۲� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return �⺻ �۲� �̸�
	 */
	public String getBaseFontName() {
		return baseFontName;
	}

	/**
	 * �⺻ �۲� �̸��� �����Ѵ�.
	 * 
	 * @param baseFontName
	 *            �⺻ �۲� �̸�
	 */
	public void setBaseFontName(String baseFontName) {
		this.baseFontName = baseFontName;
	}

}
