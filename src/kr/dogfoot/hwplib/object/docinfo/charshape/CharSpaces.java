package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �� �ڰ��� ���� ��ü
 * 
 * @author neolord
 */
public class CharSpaces {
	/**
	 * �� ���� �ڰ��� ���� ����� �迭
	 */
	private byte[] array;

	/**
	 * ������
	 */
	public CharSpaces() {
		array = new byte[7];
	}

	/**
	 * �� ���� �ڰ��� ���� ����� �迭�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� �ڰ��� ���� ����� �迭
	 */
	public byte[] getArray() {
		return array;
	}

	/**
	 * �� ���� �ڰ��� ���� ����� �迭�� �����Ѵ�.
	 * 
	 * @param array
	 *            �� ���� �ڰ��� ���� ����� �迭
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
	 * �ѱۿ� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱۿ� ���� �ڰ� ��
	 */
	public byte getHangul() {
		return array[0];
	}

	/**
	 * �ѱۿ� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            �ѱۿ� ���� �ڰ� ��
	 */
	public void setHangul(byte charSpace) {
		array[0] = charSpace;
	}

	/**
	 * ��� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���� �ڰ� ��
	 */
	public byte getLatin() {
		return array[1];
	}

	/**
	 * ��� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            ��� ���� �ڰ� ��
	 */
	public void setLatin(byte charSpace) {
		array[1] = charSpace;
	}

	/**
	 * ���ڿ� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� ���� �ڰ� ��
	 */
	public byte getHanja() {
		return array[2];
	}

	/**
	 * ���ڿ� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            ���ڿ� ���� �ڰ� ��
	 */
	public void setHanja(byte charSpace) {
		array[2] = charSpace;
	}

	/**
	 * �Ϻ�� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ�� ���� �ڰ� ��
	 */
	public byte getJapanese() {
		return array[3];
	}

	/**
	 * �Ϻ�� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            �Ϻ�� ���� �ڰ� ��
	 */
	public void setJapanese(byte charSpace) {
		array[3] = charSpace;
	}

	/**
	 * ��Ÿ �� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �� ���� �ڰ� ��
	 */
	public byte getOther() {
		return array[4];
	}

	/**
	 * ��Ÿ �� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            ��Ÿ �� ���� �ڰ� ��
	 */
	public void setOther(byte charSpace) {
		array[4] = charSpace;
	}

	/**
	 * ��ȣ�� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ�� ���� �ڰ� ��
	 */
	public byte getSymbol() {
		return array[5];
	}

	/**
	 * ��ȣ�� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            ��ȣ�� ���� �ڰ� ��
	 */
	public void setSymbol(byte charSpace) {
		array[5] = charSpace;
	}

	/**
	 * ����� ���� �ڰ� ���� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ���� �ڰ� ��
	 */
	public byte getUser() {
		return array[6];
	}

	/**
	 * ����� ���� �ڰ� ���� �����Ѵ�.
	 * 
	 * @param charSpace
	 *            ����� ���� �ڰ� ��
	 */
	public void setUser(byte charSpace) {
		array[6] = charSpace;
	}
}
