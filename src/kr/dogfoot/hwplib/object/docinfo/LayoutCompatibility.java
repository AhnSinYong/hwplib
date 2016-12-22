package kr.dogfoot.hwplib.object.docinfo;

/**
 * ���̾ƿ� ȣȯ���� ����  ���ڵ�
 * 
 * @author neolord
 */
public class LayoutCompatibility {
	/**
	 * ���� ���� ����
	 */
	private long letterLevelFormat;
	/**
	 * ���� ���� ����
	 */
	private long paragraphLevelFormat;
	/**
	 * ���� ���� ����
	 */
	private long sectionLevelFormat;
	/**
	 * ��ü ���� ����
	 */
	private long objectLevelFormat;
	/**
	 * �ʵ� ���� ����
	 */
	private long fieldLevelFormat;

	/**
	 * ������
	 */
	public LayoutCompatibility() {
	}

	/**
	 * ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ����
	 */
	public long getLetterLevelFormat() {
		return letterLevelFormat;
	}

	/**
	 * ���� ���� ������ �����Ѵ�.
	 * 
	 * @param letterLevelFormat
	 *            ���� ���� ����
	 */
	public void setLetterLevelFormat(long letterLevelFormat) {
		this.letterLevelFormat = letterLevelFormat;
	}

	/**
	 * ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ����
	 */
	public long getParagraphLevelFormat() {
		return paragraphLevelFormat;
	}

	/**
	 * ���� ���� ������ �����Ѵ�.
	 * 
	 * @param paragraphLevelFormat
	 *            ���� ���� ����
	 */
	public void setParagraphLevelFormat(long paragraphLevelFormat) {
		this.paragraphLevelFormat = paragraphLevelFormat;
	}

	/**
	 * ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ����
	 */
	public long getSectionLevelFormat() {
		return sectionLevelFormat;
	}

	/**
	 * ���� ���� ������ �����Ѵ�.
	 * 
	 * @param sectionLevelFormat
	 *            ���� ���� ����
	 */
	public void setSectionLevelFormat(long sectionLevelFormat) {
		this.sectionLevelFormat = sectionLevelFormat;
	}

	/**
	 * ��ü ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ü ���� ����
	 */
	public long getObjectLevelFormat() {
		return objectLevelFormat;
	}

	/**
	 * ��ü ���� ������ �����Ѵ�.
	 * 
	 * @param objectLevelFormat
	 *            ��ü ���� ����
	 */
	public void setObjectLevelFormat(long objectLevelFormat) {
		this.objectLevelFormat = objectLevelFormat;
	}

	/**
	 * �ʵ� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ʵ� ���� ����
	 */
	public long getFieldLevelFormat() {
		return fieldLevelFormat;
	}

	/**
	 * �ʵ� ���� ������ �����Ѵ�.
	 * 
	 * @param fieldLevelFormat
	 *            �ʵ� ���� ����
	 */
	public void setFieldLevelFormat(long fieldLevelFormat) {
		this.fieldLevelFormat = fieldLevelFormat;
	}
}
