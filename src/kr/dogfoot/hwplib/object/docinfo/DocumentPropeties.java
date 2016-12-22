package kr.dogfoot.hwplib.object.docinfo;

import kr.dogfoot.hwplib.object.docinfo.documentproperties.CaretPosition;
import kr.dogfoot.hwplib.object.docinfo.documentproperties.StartNumber;

/**
 * ���� �Ӽ��� ��Ÿ���� ���ڵ�
 * 
 * @author neolord
 */
public class DocumentPropeties {
	/**
	 * ���� ����
	 */
	private int sectionCount;
	/**
	 * ���� �� ���� ���۹�ȣ�� ���� ����
	 */
	private StartNumber startNumber;
	/**
	 * ���� �� ĳ���� ��ġ ����
	 */
	private CaretPosition currentPosition;

	/**
	 * ������
	 */
	public DocumentPropeties() {
		startNumber = new StartNumber();
		currentPosition = new CaretPosition();
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public int getSectionCount() {
		return sectionCount;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param sectionCount
	 *            ���� ����
	 */
	public void setSectionCount(int sectionCount) {
		this.sectionCount = sectionCount;
	}

	/**
	 * ���� �� ���� ���۹�ȣ�� ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ���� ���۹�ȣ�� ���� ���� ��ü
	 */
	public StartNumber getStartNumber() {
		return startNumber;
	}

	/**
	 * ���� �� ĳ���� ��ġ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ĳ���� ��ġ ���� ��ü
	 */
	public CaretPosition getCurrentPosition() {
		return currentPosition;
	}
}
