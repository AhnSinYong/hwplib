package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �� ���� ��ġ�� ���� ��ü
 * 
 * @author neolord
 */
public class CharOffsets {
	/**
	 * �� ���� ��ġ�� ���� ����� �迭
	 */
	private byte[] array;

	/**
	 * ������
	 */
	public CharOffsets() {
		array = new byte[7];
	}

	/**
	 * �� ���� ��ġ�� ���� ����� �迭�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ġ�� ���� ����� �迭
	 */
	public byte[] getArray() {
		return array;
	}

	/**
	 * �� ���� ��ġ�� ���� ����� �迭�� �����Ѵ�.
	 * 
	 * @param array
	 *            �� ���� ��ġ�� ���� ����� �迭
	 * @throws Exception
	 *             array ũ�Ⱑ 7�� �ƴҶ� �߻�
	 */
	public void setArray(byte[] array) throws Exception {
		if (array.length != 7) {
			throw new Exception("array length must be 7");
		}
		this.array = array;
	}

	/**
	 * �ѱۿ� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱۿ� ���� ���� ��ġ ��
	 */
	public byte getHangul() {
		return array[0];
	}

	/**
	 * �ѱۿ� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            �ѱۿ� ���� ���� ��ġ ��
	 */
	public void setHangul(byte charOffset) {
		array[0] = charOffset;
	}

	/**
	 * ��� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���� ���� ��ġ ��
	 */
	public byte getLatin() {
		return array[1];
	}

	/**
	 * ��� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            ��� ���� ���� ��ġ ��
	 */
	public void setLatin(byte charOffset) {
		array[1] = charOffset;
	}

	/**
	 * ���ڿ� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� ���� ���� ��ġ ��
	 */
	public byte getHanja() {
		return array[2];
	}

	/**
	 * ���ڿ� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            ���ڿ� ���� ���� ��ġ ��
	 */
	public void setHanja(byte charOffset) {
		array[2] = charOffset;
	}

	/**
	 * �Ϻ�� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ�� ���� ���� ��ġ ��
	 */
	public byte getJapanese() {
		return array[3];
	}

	/**
	 * �Ϻ�� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            �Ϻ�� ���� ���� ��ġ ��
	 */
	public void setJapanese(byte charOffset) {
		array[3] = charOffset;
	}

	/**
	 * ��Ÿ �� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �� ���� ���� ��ġ ��
	 */
	public byte getOther() {
		return array[4];
	}

	/**
	 * ��Ÿ �� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @param charOffset
	 *            ��Ÿ �� ���� ���� ��ġ ��
	 */
	public void setOther(byte charOffset) {
		array[4] = charOffset;
	}

	/**
	 * ��ȣ�� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ�� ���� ���� ��ġ ��
	 */
	public byte getSymbol() {
		return array[5];
	}

	/**
	 * ��ȣ�� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            ��ȣ�� ���� ���� ��ġ ��
	 */
	public void setSymbol(byte charOffset) {
		array[5] = charOffset;
	}

	/**
	 * ����� ���� ���� ��ġ ���� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ���� ���� ��ġ ��
	 */
	public byte getUser() {
		return array[6];
	}

	/**
	 * ����� ���� ���� ��ġ ���� �����Ѵ�.
	 * 
	 * @param charOffset
	 *            ����� ���� ���� ��ġ ��
	 */
	public void setUser(byte charOffset) {
		array[6] = charOffset;
	}
}
