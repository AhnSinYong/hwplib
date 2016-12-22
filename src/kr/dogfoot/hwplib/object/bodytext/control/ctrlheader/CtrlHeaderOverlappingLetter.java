package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;

/**
 * ���� ��ħ ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderOverlappingLetter extends CtrlHeader {
	/**
	 * ��ħ ���� ����Ʈ
	 */
	private ArrayList<String> overlappingLetterList;
	/**
	 * �׵θ� Ÿ��
	 */
	private short borderType;
	/**
	 * ���� ���� ũ��
	 */
	private byte internalFontSize;
	/**
	 * �׵θ� ���� ���� ��ħ
	 */
	private short expendInsideLetter;
	/**
	 * �׵θ� ���� ������ ���ڸ�� id ����Ʈ
	 */
	private ArrayList<Long> charShapeIdList;

	/**
	 * ������
	 */
	public CtrlHeaderOverlappingLetter() {
		super(ControlType.OverlappingLetter.getCtrlId());

		overlappingLetterList = new ArrayList<String>();
		charShapeIdList = new ArrayList<Long>();
	}

	/**
	 * �������� ���ڸ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param overlappingLetter
	 *            �������� ����
	 */
	public void addOverlappingLetter(String overlappingLetter) {
		overlappingLetterList.add(overlappingLetter);
	}

	/**
	 * ��ħ ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ħ ���� ����Ʈ
	 */
	public ArrayList<String> getOverlappingLetterList() {
		return overlappingLetterList;
	}

	/**
	 * �׵θ� Ÿ���� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� Ÿ��
	 */
	public short getBorderType() {
		return borderType;
	}

	/**
	 * �׵θ� Ÿ�Ը� �����Ѵ�.
	 * 
	 * @param borderType
	 *            �׵θ� Ÿ��
	 */
	public void setBorderType(short borderType) {
		this.borderType = borderType;
	}

	/**
	 * ���� ���� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ũ��
	 */
	public byte getInternalFontSize() {
		return internalFontSize;
	}

	/**
	 * ���� ���� ũ�⸦ �����Ѵ�.
	 * 
	 * @param internalFontSize
	 *            ���� ���� ũ��
	 */
	public void setInternalFontSize(byte internalFontSize) {
		this.internalFontSize = internalFontSize;
	}

	/**
	 * �׵θ� ���� ���� ��ħ�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� ���� ���� ��ħ
	 */
	public short getExpendInsideLetter() {
		return expendInsideLetter;
	}

	/**
	 * �׵θ� ���� ���� ��ħ�� �����Ѵ�.
	 * 
	 * @param expendInsideLetter
	 *            �׵θ� ���� ���� ��ħ
	 */
	public void setExpendInsideLetter(short expendInsideLetter) {
		this.expendInsideLetter = expendInsideLetter;
	}

	/**
	 * �׵θ� ���� ������ ���ڸ�� id�� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param charShapeId
	 *            �׵θ� ���� ������ ���ڸ�� id
	 */
	public void addCharShapeId(long charShapeId) {
		charShapeIdList.add(charShapeId);
	}

	/**
	 * �׵θ� ���� ������ ���ڸ�� id ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ� ���� ������ ���ڸ�� id ����Ʈ
	 */
	public ArrayList<Long> getCharShapeIdList() {
		return charShapeIdList;
	}
}
