package kr.dogfoot.hwplib.object.bodytext;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.sectiondefine.BatangPageInfo;
import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;

/**
 * ���� ����(����)�� ��Ÿ���� ��ü. HWP ���ϳ��� "BodyText" storage �ȿ� "Section[��ȣ]" stream��
 * ����ȴ�.
 * 
 * @author neolord
 */
public class Section implements ParagraphListInterface {
	/**
	 * ���� ����Ʈ
	 */
	private ArrayList<Paragraph> paragraphList;
	/**
	 * ������ ������ ����
	 */
	private BatangPageInfo lastBatangPageInfo;

	/**
	 * ������
	 */
	public Section() {
		paragraphList = new ArrayList<Paragraph>();
		lastBatangPageInfo = new BatangPageInfo();
	}

	/**
	 * ���ο� ���ܸ� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ����
	 */
	@Override
	public Paragraph addNewParagraph() {
		Paragraph p = new Paragraph();
		paragraphList.add(p);
		return p;
	}

	/**
	 * ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ
	 */
	@Override
	public ArrayList<Paragraph> getParagraphList() {
		return paragraphList;
	}

	/**
	 * ������ ������ ������ �����Ѵ�.
	 * 
	 * @return ������ ������ ����
	 */
	public BatangPageInfo getLastBatangPageInfo() {
		return lastBatangPageInfo;
	}
}
