package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �� ���� ����
 * 
 * @author neolord
 */
public class Ratios {
	/**
	 * �� ���� ������ ���� ����� �迭
	 */
	private short[] array;

	/**
	 * ������
	 */
	public Ratios() {
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
	 * @param ratio
	 *            �ѱۿ� ���� ���� ����
	 */
	public void setHangul(short ratio) {
		array[0] = ratio;
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
	 * @param ratio
	 *            ��� ���� ���� ����
	 */
	public void setLatin(short ratio) {
		array[1] = ratio;
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
	 * @param ratio
	 *            ���ڿ� ���� ���� ����
	 */
	public void setHanja(short ratio) {
		array[2] = ratio;
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
	 * @param ratio
	 *            �Ϻ�� ���� ���� ����
	 */
	public void setJapanese(short ratio) {
		array[3] = ratio;
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
	 * @param ratio
	 *            ��Ÿ �� ���� ���� ����
	 */
	public void setOther(short ratio) {
		array[4] = ratio;
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
	 * @param ratio
	 *            ��ȣ�� ���� ���� ����
	 */
	public void setSymbol(short ratio) {
		array[5] = ratio;
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
	 * @param ratio
	 *            ����� ���� ���� ����
	 */
	public void setUser(short ratio) {
		array[6] = ratio;
	}
}
