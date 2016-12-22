package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �� ��� ũ��
 * 
 * @author neolord
 */
public class RelativeSizes {
	/**
	 * �� ���� ������ ���� ����� �迭
	 */
	private short[] array;

	/**
	 * ������
	 */
	public RelativeSizes() {
		array = new short[7];
	}

	/**
	 * �� ���� ������ ���� ����� �迭�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ������ ���� ����� �迭
	 */
	public short[] getArray() {
		return array;
	}

	/**
	 * �� ���� ������ ���� ����� �迭�� �����Ѵ�.
	 * 
	 * @param array
	 *            �� ���� ������ ���� ����� �迭
	 * @throws Exception
	 *             array ũ�Ⱑ 7�� �ƴҶ� �߻�
	 */
	public void setArray(short[] array) throws Exception {
		if (array.length != 7) {
			throw new Exception("array length must be 7");
		}
		this.array = array;
	}

	/**
	 * �ѱۿ� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ѱۿ� ���� ���� ����
	 */
	public short getHangul() {
		return array[0];
	}

	/**
	 * �ѱۿ� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            �ѱۿ� ���� ���� ����
	 */
	public void setHangul(short relativeSize) {
		array[0] = relativeSize;
	}

	/**
	 * ��� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���� ���� ����
	 */
	public short getLatin() {
		return array[1];
	}

	/**
	 * ��� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            ��� ���� ���� ����
	 */
	public void setLatin(short relativeSize) {
		array[1] = relativeSize;
	}

	/**
	 * ���ڿ� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� ���� ���� ����
	 */
	public short getHanja() {
		return array[2];
	}

	/**
	 * ���ڿ� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            ���ڿ� ���� ���� ����
	 */
	public void setHanja(short relativeSize) {
		array[2] = relativeSize;
	}

	/**
	 * �Ϻ�� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ�� ���� ���� ����
	 */
	public short getJapanese() {
		return array[3];
	}

	/**
	 * �Ϻ�� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            �Ϻ�� ���� ���� ����
	 */
	public void setJapanese(short relativeSize) {
		array[3] = relativeSize;
	}

	/**
	 * ��Ÿ �� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �� ���� ���� ����
	 */
	public short getOther() {
		return array[4];
	}

	/**
	 * ��Ÿ �� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            ��Ÿ �� ���� ���� ����
	 */
	public void setOther(short relativeSize) {
		array[4] = relativeSize;
	}

	/**
	 * ��ȣ�� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ�� ���� ���� ����
	 */
	public short getSymbol() {
		return array[5];
	}

	/**
	 * ��ȣ�� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            ��ȣ�� ���� ���� ����
	 */
	public void setSymbol(short relativeSize) {
		array[5] = relativeSize;
	}

	/**
	 * ����� ���� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ����� ���� ���� ����
	 */
	public int getUser() {
		return array[6];
	}

	/**
	 * ����� ���� ���� ������ �����Ѵ�.
	 * 
	 * @param relativeSize
	 *            ����� ���� ���� ����
	 */
	public void setUser(short relativeSize) {
		array[6] = relativeSize;
	}
}
