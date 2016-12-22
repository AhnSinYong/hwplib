package kr.dogfoot.hwplib.object.bodytext;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.paragraph.Paragraph;

/**
 * ���� ����Ʈ �������̽�
 * 
 * @author neolord
 */
public interface ParagraphListInterface {
	/**
	 * ���ο� ���ܸ� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ����
	 */
	public Paragraph addNewParagraph();

	/**
	 * ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����Ʈ
	 */
	public ArrayList<Paragraph> getParagraphList();
}
