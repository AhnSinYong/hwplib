package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.header.HeaderFooterApplyPage;

/**
 * �Ӹ��� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderHeader extends CtrlHeader {
	/**
	 * �Ӹ����� ����� ����(������ ����)
	 */
	private HeaderFooterApplyPage applyPage;
	/**
	 * ���� ���� (??)
	 */
	private int createIndex;

	/**
	 * ������
	 */
	public CtrlHeaderHeader() {
		super(ControlType.Header.getCtrlId());
	}

	/**
	 * �Ӹ����� ����� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �Ӹ����� ����� ����
	 */
	public HeaderFooterApplyPage getApplyPage() {
		return applyPage;
	}

	/**
	 * �Ӹ����� ����� ������ �����Ѵ�.
	 * 
	 * @param applyPage
	 *            �Ӹ����� ����� ����
	 */
	public void setApplyPage(HeaderFooterApplyPage applyPage) {
		this.applyPage = applyPage;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getCreateIndex() {
		return createIndex;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param createIndex
	 *            ���� ����
	 */
	public void setCreateIndex(int createIndex) {
		this.createIndex = createIndex;
	}
}
