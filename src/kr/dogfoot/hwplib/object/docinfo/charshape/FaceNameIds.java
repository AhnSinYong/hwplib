package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �� ������ �۲� ID(FaceID)
 * 
 * @author neolord
 */
public class FaceNameIds {
	/**
	 * �� ������ �۲� ID ���� ����� �迭
	 */
	private int[] array;

	/**
	 * ������
	 */
	public FaceNameIds() {
		array = new int[7];
	}

	/**
	 * �� ������ �۲� ID ���� ����� �迭�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ������ �۲� ID ���� ����� �迭
	 */
	public int[] getArray() {
		return array;
	}

	/**
	 * �� ������ �۲� ID ���� ����� �迭�� �����Ѵ�.
	 * 
	 * @param array
	 *            �� ������ �۲� ID ���� ����� �迭
	 * @throws Exception
	 *             array ũ�Ⱑ 7�� �ƴҶ� �߻�
	 */
	public void setArray(int[] array) throws Exception {
		if (array.length != 7) {
			throw new Exception("array length must be 7");
		}
		this.array = array;
	}

	/**
	 * �ѱۿ� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱۿ� ���� ������ �۲� Id
	 */
	public int getHangul() {
		return array[0];
	}

	/**
	 * �ѱۿ� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            �ѱۿ� ���� ������ �۲� Id
	 */
	public void setHangul(int faceNameID) {
		array[0] = faceNameID;
	}

	/**
	 * ��� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���� ������ �۲� Id
	 */
	public int getLatin() {
		return array[1];
	}

	/**
	 * ��� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            ��� ���� ������ �۲� Id
	 */
	public void setLatin(int faceNameID) {
		array[1] = faceNameID;
	}

	/**
	 * ���ڿ� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڿ� ���� ������ �۲� Id
	 */
	public int getHanja() {
		return array[2];
	}

	/**
	 * ���ڿ� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            ���ڿ� ���� ������ �۲� Id
	 */
	public void setHanja(int faceNameID) {
		array[2] = faceNameID;
	}

	/**
	 * �Ϻ�� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ�� ���� ������ �۲� Id
	 */
	public int getJapanese() {
		return array[3];
	}

	/**
	 * �Ϻ�� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            �Ϻ�� ���� ������ �۲� Id
	 */
	public void setJapanese(int faceNameID) {
		array[3] = faceNameID;
	}

	/**
	 * ��Ÿ �� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �� ���� ������ �۲� Id
	 */
	public int getOther() {
		return array[4];
	}

	/**
	 * ��Ÿ �� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            ��Ÿ �� ���� ������ �۲� Id
	 */
	public void setOther(int faceNameID) {
		array[4] = faceNameID;
	}

	/**
	 * ��ȣ�� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ�� ���� ������ �۲� Id
	 */
	public int getSymbol() {
		return array[5];
	}

	/**
	 * ��ȣ�� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            ��ȣ�� ���� ������ �۲� Id
	 */
	public void setSymbol(int faceNameID) {
		array[5] = faceNameID;
	}

	/**
	 * ����� ���ǿ� ���� ������ �۲� Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ���ǿ� ���� ������ �۲� Id
	 */
	public int getUser() {
		return array[6];
	}

	/**
	 * ����� ���ǿ� ���� ������ �۲� Id�� �����Ѵ�.
	 * 
	 * @param faceNameID
	 *            ����� ���ǿ� ���� ������ �۲� Id
	 */
	public void setUser(int faceNameID) {
		array[6] = faceNameID;
	}
}
