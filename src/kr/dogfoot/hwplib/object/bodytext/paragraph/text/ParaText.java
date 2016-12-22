package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

import java.util.ArrayList;

/**
 * ������ �ؽ�Ʈ ���ڵ�
 * 
 * @author neolord
 */
public class ParaText {
	/**
	 * ����(Character) ����Ʈ
	 */
	private ArrayList<HWPChar> charList;

	/**
	 * ������
	 */
	public ParaText() {
		charList = new ArrayList<HWPChar>();
	}

	/**
	 * ���ο� [�Ϲ� Character]�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ [�Ϲ� Character]
	 */
	public HWPCharNormal addNewNormalChar() {
		HWPCharNormal nc = new HWPCharNormal();
		charList.add(nc);
		return nc;
	}

	/**
	 * ���ο� [���� ��Ʈ�� Character]�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ [���� ��Ʈ�� Character]
	 */
	public HWPCharControlChar addNewCharControlChar() {
		HWPCharControlChar ccc = new HWPCharControlChar();
		charList.add(ccc);
		return ccc;
	}

	/**
	 * ���ο� [�ζ��� ��Ʈ�� Character]�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ [�ζ��� ��Ʈ�� Character]
	 */
	public HWPCharControlInline addNewInlineControlChar() {
		HWPCharControlInline icc = new HWPCharControlInline();
		charList.add(icc);
		return icc;
	}

	/**
	 * ���ο� [Ȯ�� ��Ʈ�� Character]�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ [Ȯ�� ��Ʈ�� Character]
	 */
	public HWPCharControlExtend addNewExtendControlChar() {
		HWPCharControlExtend ecc = new HWPCharControlExtend();
		charList.add(ecc);
		return ecc;
	}

	/**
	 * ����(Character) ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ����(Character) ����Ʈ
	 */
	public ArrayList<HWPChar> getCharList() {
		return charList;
	}
}
