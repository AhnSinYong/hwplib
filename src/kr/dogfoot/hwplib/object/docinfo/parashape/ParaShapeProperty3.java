package kr.dogfoot.hwplib.object.docinfo.parashape;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���� ����� �Ӽ�3 ��ü. (5.0.2.5 ���� �̻�)
 * 
 * @author neolord
 */
public class ParaShapeProperty3 {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;
	
	/**
	 * ������
	 */
	public ParaShapeProperty3() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public long getValue() {
		return value;
	}
	
	/**
	 * ���Ͽ� ����Ǵ� �������� �����Ѵ�.
	 * @param value ���Ͽ� ����Ǵ� ������
	 */
	public void setValue(long value) {
		this.value = value;
	}

	/**
	 * �� ���� ������ ��ȯ�Ѵ�. (0~4 bit)
	 * @return �� ���� ����
	 */
	public LineSpaceSort getLineSpaceSort() {
		return LineSpaceSort.valueOf((byte) BitFlag.get(value, 0, 4));
	}
	
	/**
	 * �� ���� ������ �����Ѵ�. (0~4 bit)
	 * @param lineSpaceSort �� ���� ����
	 */
	public void setLineSpaceSort(LineSpaceSort lineSpaceSort) {
		value = BitFlag.set(value, 0, 4, lineSpaceSort.getValue());
	}
}
