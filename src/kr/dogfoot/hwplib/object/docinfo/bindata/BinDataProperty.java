package kr.dogfoot.hwplib.object.docinfo.bindata;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���̳ʸ� �������� �Ӽ�
 * 
 * @author neolord
 */
public class BinDataProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 2 byte)
	 */
	private int value;

	/**
	 * ������
	 */
	public BinDataProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public int getValue() {
		return value;
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * ���̳ʸ� �������� Ÿ���� ��ȯ�Ѵ�. (0~3 BitFlag)
	 * 
	 * @return ���̳ʸ� �������� Ÿ��
	 */
	public BinDataType getType() {
		return BinDataType.valueOf((byte) BitFlag.get(value, 0, 3));
	}

	/**
	 * ���̳ʸ� �������� Ÿ���� �����Ѵ�. (0~3 BitFlag)
	 * 
	 * @param type
	 *            ���̳ʸ� �������� Ÿ��
	 */
	public void setType(BinDataType type) {
		value = BitFlag.set(value, 0, 3, type.getValue());
	}

	/**
	 * ���̳ʸ� �������� ���� ����� ��ȯ�Ѵ�. (4~5 BitFlag)
	 * 
	 * @return ���̳ʸ� �������� ���� ���
	 */
	public BinDataCompress getCompress() {
		return BinDataCompress.valueOf((byte) BitFlag.get(value, 4, 5));
	}

	/**
	 * ���̳ʸ� �������� ���� ����� �����Ѵ�. (4~5 BitFlag)
	 * 
	 * @param compress
	 *            ���̳ʸ� �������� ���� ���
	 */
	public void setCompress(BinDataCompress compress) {
		value = BitFlag.set(value, 4, 5, compress.getValue());
	}

	/**
	 * ���̳ʸ� �������� ���¸� ��ȯ�Ѵ�. (8~9 BitFlag)
	 * 
	 * @return ���̳ʸ� �������� ����
	 */
	public BinDataState getState() {
		return BinDataState.valueOf((byte) BitFlag.get(value, 8, 9));
	}

	/**
	 * ���̳ʸ� �������� ���¸� �����Ѵ�. (8~9 BitFlag)
	 * 
	 * @param state
	 *            ���̳ʸ� �������� ����
	 */
	public void setState(BinDataState state) {
		value = BitFlag.set(value, 8, 9, state.getValue());
	}
}
