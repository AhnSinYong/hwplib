package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.field;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * �ʵ� ��Ʈ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class FieldHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public FieldHeaderProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �ݷ��Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public long getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * �б� ���� ���¿����� ���� �������� ������ ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �б� ���� ���¿����� ���� �������� ����
	 */
	public boolean canModifyInReadOnlyState() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �б� ���� ���¿����� ���� �������� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param canModifyInReadOnlyState
	 *            �б� ���� ���¿����� ���� �������� ����
	 */
	public void setCanModifyInReadOnlyState(boolean canModifyInReadOnlyState) {
		value = BitFlag.set(value, 0, canModifyInReadOnlyState);
	}

	/**
	 * ����� ���� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� ��ȯ�Ѵ�. (11 bit)
	 * 
	 * @return ����� ���� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ����
	 */
	public boolean isUpdateTextPropertyAtUpdatingHyperlinkNotOpened() {
		return BitFlag.get(value, 11);
	}

	/**
	 * ����� ���� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� �����Ѵ�. (11 bit)
	 * 
	 * @param updateTextPropertyAtUpdatingHyperlinkNotOpened
	 *            ����� ���� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ����
	 */
	public void setUpdateTextPropertyAtUpdatingHyperlinkNotOpened(
			boolean updateTextPropertyAtUpdatingHyperlinkNotOpened) {
		value = BitFlag.set(value, 11,
				updateTextPropertyAtUpdatingHyperlinkNotOpened);
	}

	/**
	 * ��� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� ��ȯ�Ѵ�. (12 bit)
	 * 
	 * @return ��� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ����
	 */
	public boolean isUpdateTextPropertyAtUpdatingHyperlinkOpened() {
		return BitFlag.get(value, 12);
	}

	/**
	 * ��� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� �����Ѵ�. (12 bit)
	 * 
	 * @param updateTextPropertyAtUpdatingHyperlinkOpened
	 *            ��� �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ����
	 */
	public void setUpdateTextPropertyAtUpdatingHyperlinkOpened(
			boolean updateTextPropertyAtUpdatingHyperlinkOpened) {
		value = BitFlag.set(value, 12,
				updateTextPropertyAtUpdatingHyperlinkOpened);
	}

	/**
	 * ������ �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� ��ȯ�Ѵ�. (13 bit)
	 * 
	 * @return ������ �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ����
	 */
	public boolean isUpdateTextPropertyAtUpdatingHyperlinkCreating() {
		return BitFlag.get(value, 13);
	}

	/**
	 * ������ �����۸�ũ �ʵ� ������Ʈ �� ���� �Ӽ� ������Ʈ ���θ� �����Ѵ�. (13 bit)
	 * 
	 * @param updateTextPropertyAtUpdatingHyperlinkCreating
	 */
	public void setUpdateTextPropertyAtUpdatingHyperlinkCreating(
			boolean updateTextPropertyAtUpdatingHyperlinkCreating) {
		value = BitFlag.set(value, 13,
				updateTextPropertyAtUpdatingHyperlinkCreating);
	}

	/**
	 * �ʵ� ������ �����Ǿ����� ���θ� ��ȯ�Ѵ�. (15 bit)
	 * 
	 * @return �ʵ� ������ �����Ǿ����� ����
	 */
	public boolean isModifiedContent() {
		return BitFlag.get(value, 15);
	}

	/**
	 * �ʵ� ������ �����Ǿ����� ���θ� �����Ѵ�. (15 bit)
	 * 
	 * @param modifiedContent
	 *            �ʵ� ������ �����Ǿ����� ����
	 */
	public void setModifiedContent(boolean modifiedContent) {
		value = BitFlag.set(value, 15, modifiedContent);
	}
}
