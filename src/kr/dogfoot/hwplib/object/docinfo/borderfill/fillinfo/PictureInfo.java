package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * �׸� ���� ��ü
 * 
 * @author neolord
 */
public class PictureInfo {
	/**
	 * ���
	 */
	private byte brightness;
	/**
	 * ���
	 */
	private byte contrast;
	/**
	 * �׸� ȿ��
	 */
	private PictureEffect effect;
	/**
	 * BinItem�� ���̵� ������ - �̹����� ����� ���̳ʸ� �������� id
	 */
	private int binItemID;

	/**
	 * ������
	 */
	public PictureInfo() {
	}

	/**
	 * ��⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���
	 */
	public byte getBrightness() {
		return brightness;
	}

	/**
	 * ��⸦ �����Ѵ�.
	 * 
	 * @param brightness
	 *            ���
	 */
	public void setBrightness(byte brightness) {
		this.brightness = brightness;
	}

	/**
	 * ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���
	 */
	public byte getContrast() {
		return contrast;
	}

	/**
	 * ��ϸ� �����Ѵ�.
	 * 
	 * @param contrast
	 *            ���
	 */
	public void setContrast(byte contrast) {
		this.contrast = contrast;
	}

	/**
	 * �׸� ȿ���� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ȿ��
	 */
	public PictureEffect getEffect() {
		return effect;
	}

	/**
	 * �׸� ȿ���� �����Ѵ�.
	 * 
	 * @param effect
	 *            �׸� ȿ��
	 */
	public void setEffect(PictureEffect effect) {
		this.effect = effect;
	}

	/**
	 * BinItem�� ���̵� �������� ��ȯ�Ѵ�.
	 * 
	 * @return BinItem�� ���̵� ������
	 */
	public int getBinItemID() {
		return binItemID;
	}

	/**
	 * BinItem�� ���̵� �������� �����Ѵ�.
	 * 
	 * @param binItemID
	 *            BinItem�� ���̵� ������
	 */
	public void setBinItemID(int binItemID) {
		this.binItemID = binItemID;
	}
}
