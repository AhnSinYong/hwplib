package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.pagehide;

import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * ���߱� ��Ʈ���� �Ӽ��� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class PagehideHeaderProperty {
	/**
	 * ���Ͽ� ����Ǵ� ������(unsigned 4 byte)
	 */
	private long value;

	/**
	 * ������
	 */
	public PagehideHeaderProperty() {
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
	 * �Ӹ��� ���� ���θ� ��ȯ�Ѵ�. (0 bit)
	 * 
	 * @return �Ӹ��� ���� ����
	 */
	public boolean isHideHeader() {
		return BitFlag.get(value, 0);
	}

	/**
	 * �Ӹ��� ���� ���θ� �����Ѵ�. (0 bit)
	 * 
	 * @param hideHeader
	 *            �Ӹ��� ���� ����
	 */
	public void setHideHeader(boolean hideHeader) {
		value = BitFlag.set(value, 0, hideHeader);
	}

	/**
	 * ������ ���� ���θ� ��ȯ�Ѵ�. (1 bit)
	 * 
	 * @return ������ ���� ����
	 */
	public boolean isHideFooter() {
		return BitFlag.get(value, 1);
	}

	/**
	 * ������ ���� ���θ� �����Ѵ�. (1 bit)
	 * 
	 * @param hideFooter
	 *            ������ ���� ����
	 */
	public void setHideFooter(boolean hideFooter) {
		value = BitFlag.set(value, 1, hideFooter);
	}

	/**
	 * ���� �� ���� ���θ� ��ȯ�Ѵ�. (2 bit)
	 * 
	 * @return ���� �� ���� ����
	 */
	public boolean isHideBatangPage() {
		return BitFlag.get(value, 2);
	}

	/**
	 * ���� �� ���� ���θ� �����Ѵ�. (2 bit)
	 * 
	 * @param hideBatangPage
	 *            ���� �� ���� ����
	 */
	public void setHideBatangPage(boolean hideBatangPage) {
		value = BitFlag.set(value, 2, hideBatangPage);
	}

	/**
	 * �׵θ� ���� ���θ� ��ȯ�ϴ�. (3 bit)
	 * 
	 * @return �׵θ� ���� ����
	 */
	public boolean isHideBorder() {
		return BitFlag.get(value, 3);
	}

	/**
	 * �׵θ� ���� ���θ� �����Ѵ�. (3 bit)
	 * 
	 * @param hideBorder
	 *            �׵θ� ���� ����
	 */
	public void setHideBorder(boolean hideBorder) {
		value = BitFlag.set(value, 3, hideBorder);
	}

	/**
	 * ������ ��ȣ ���� ���θ� ��ȯ�Ѵ�. (4 bit)
	 * 
	 * @return ������ ��ȣ ���� ����
	 */
	public boolean isHidePageNumber() {
		return BitFlag.get(value, 4);
	}

	/**
	 * ������ ��ȣ ���� ���θ� �����Ѵ�. (4 bit)
	 * 
	 * @param hidePageNumber
	 *            ������ ��ȣ ���� ����
	 */
	public void setHidePageNumber(boolean hidePageNumber) {
		value = BitFlag.set(value, 4, hidePageNumber);
	}
}
