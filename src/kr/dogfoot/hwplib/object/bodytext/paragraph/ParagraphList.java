package kr.dogfoot.hwplib.object.bodytext.paragraph;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.ParagraphListInterface;

/**
 * ���� ����Ʈ�� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class ParagraphList implements ParagraphListInterface {
	/**
	 * ���� ����Ʈ
	 */
	private ArrayList<Paragraph> paragraphList;

	/**
	 * ������
	 */
	public ParagraphList() {
		paragraphList = new ArrayList<Paragraph>();
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
}
