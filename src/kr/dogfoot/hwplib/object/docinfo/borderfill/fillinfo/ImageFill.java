package kr.dogfoot.hwplib.object.docinfo.borderfill.fillinfo;

/**
 * �̹��� ä��� ��ü
 * 
 * @author neolord
 */
public class ImageFill {
	/**
	 * �̹��� ä��� ����
	 */
	private ImageFillType imageFillType;
	/**
	 * �׸� ����
	 */
	private PictureInfo pictureInfo;

	/**
	 * ������
	 */
	public ImageFill() {
		pictureInfo = new PictureInfo();
	}

	/**
	 * �̹��� ä��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �̹��� ä��� ����
	 */
	public ImageFillType getImageFillType() {
		return imageFillType;
	}

	/**
	 * �̹��� ä��� ������ �����Ѵ�.
	 * 
	 * @param imageFillType
	 *            �̹��� ä��� ����
	 */
	public void setImageFillType(ImageFillType imageFillType) {
		this.imageFillType = imageFillType;
	}

	/**
	 * �׸� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �׸� ���� ��ü
	 */
	public PictureInfo getPictureInfo() {
		return pictureInfo;
	}
}
