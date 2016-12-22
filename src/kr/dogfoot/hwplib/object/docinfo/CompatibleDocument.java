package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.compatibledocument.CompatibleDocumentSort;

/**
 * ȣȯ ������ ���� ���ڵ�
 * 
 * @author neolord
 */
public class CompatibleDocument {
	/**
	 * ��� ���α׷��� ����
	 */
	private CompatibleDocumentSort targetProgream;

	public CompatibleDocument() {
	}

	/**
	 * ��� ���α׷��� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��� ���α׷��� ����
	 */
	public CompatibleDocumentSort getTargetProgream() {
		return targetProgream;
	}

	/**
	 * ��� ���α׷��� ������ �����Ѵ�.
	 * 
	 * @param targetProgream
	 *            ��� ���α׷��� ����
	 */
	public void setTargetProgream(CompatibleDocumentSort targetProgream) {
		this.targetProgream = targetProgream;
	}
}
