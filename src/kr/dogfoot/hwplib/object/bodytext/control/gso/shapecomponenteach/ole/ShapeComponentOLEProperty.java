package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponenteach.ole;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * OLE ��ü�� �Ӽ��� ���� ��ü
 * 
 * @author neolord
 */
public class ShapeComponentOLEProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public ShapeComponentOLEProperty() {
	}

	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
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
	 * DVASPECT���� ��ȯ�Ѵ�.
	 * 
	 * @return DVASPECT��
	 */
	public DVASPECT getDVASPECT() {
		return DVASPECT.valueOf((byte) BitFlag.get(value, 0, 7));
	}

	/**
	 * DVASPECT���� �����Ѵ�.
	 * 
	 * @param dvaspect
	 *            DVASPECT��
	 */
	public void setDVASPECT(DVASPECT dvaspect) {
		value = BitFlag.set(value, 0, 7, dvaspect.getValue());
	}

	/**
	 * moniker�� �����Ǿ����� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return moniker�� �����Ǿ����� ����
	 */
	public boolean isMoniker() {
		return BitFlag.get(value, 8);
	}

	/**
	 * moniker�� �����Ǿ����� ���θ� �����Ѵ�.
	 * 
	 * @param moniker
	 *            moniker�� �����Ǿ����� ����
	 */
	public void setMoniker(boolean moniker) {
		value = BitFlag.set(value, 8, moniker);
	}

	/**
	 * ���̽����� ���� ��ȯ�Ѵ�. 0�� ����Ʈ(85%)�� ���ϰ�, 1��101�� 0��100%�� ��Ÿ����. ����� ���ĸ��� ���̽������� ������
	 * ������.
	 * 
	 * @return ���̽����� ��
	 */
	public byte getBaseLine() {
		return (byte) BitFlag.get(value, 9, 15);
	}

	/**
	 * ���̽����� ���� �����Ѵ�. 0�� ����Ʈ(85%)�� ���ϰ�, 1��101�� 0��100%�� ��Ÿ����. ����� ���ĸ��� ���̽������� ������
	 * ������.
	 * 
	 * @param baseLine
	 *            ���̽����� ��
	 */
	public void setBaseLine(byte baseLine) {
		value = BitFlag.set(value, 9, 15, baseLine);
	}

	/**
	 * ��ü ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ü ����
	 */
	public ObjectSort getObjectSort() {
		return ObjectSort.valueOf((byte) BitFlag.get(value, 16, 21));
	}

	/**
	 * ��ü ������ �����Ѵ�.
	 * 
	 * @param objectSort
	 *            ��ü ����
	 */
	public void setObjectSort(ObjectSort objectSort) {
		value = BitFlag.set(value, 16, 21, objectSort.getValue());
	}
}
