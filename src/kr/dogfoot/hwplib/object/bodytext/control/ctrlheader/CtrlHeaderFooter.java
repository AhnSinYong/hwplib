package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.header.HeaderFooterApplyPage;

/**
 * ������ ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderFooter extends CtrlHeader {
	/**
	 * �������� ����� ����(������ ����)
	 */
	private HeaderFooterApplyPage applyPage;
	/**
	 * ���� ���� (??)
	 */
	private int createIndex;
	
	/**
	 * ������
	 */
	public CtrlHeaderFooter() {
		super(ControlType.Footer.getCtrlId());
	}

	/**"
	 * �������� ����� ������ ��ȯ�Ѵ�.
	 * @return �������� ����� ����
	 */
	public HeaderFooterApplyPage getApplyPage() {
		return applyPage;
	}

	/**
	 * �������� ����� ������ �����Ѵ�.
	 * @param applyPage �������� ����� ����
	 */
	public void setApplyPage(HeaderFooterApplyPage applyPage) {
		this.applyPage = applyPage;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
 	 * @return ���� ����
 	 */
	public int getCreateIndex() {
		return createIndex;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * @param createIndex ���� ����
	 */
	public void setCreateIndex(int createIndex) {
		this.createIndex = createIndex;
	}
}
