package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.equation.EQEdit;
import kr.dogfoot.hwplib.object.bodytext.control.gso.caption.Caption;

/**
 * ���� ��Ʈ��
 * 
 * @author neolord
 */
public class ControlEquation extends Control {
	/**
	 * ĸ��
	 */
	private Caption caption;
	/**
	 * ���� ����
	 */
	private EQEdit eqEdit;

	/**
	 * ������
	 */
	public ControlEquation() {
		super(new CtrlHeaderGso(ControlType.Equation));

		eqEdit = new EQEdit();
	}

	/**
	 * �׸��� ��ü�� ��Ʈ�� ����� ��ȯ�Ѵ�.
	 * 
	 * @return �׸��� ��ü�� ��Ʈ�� ���
	 */
	public CtrlHeaderGso getHeader() {
		return (CtrlHeaderGso) header;
	}

	/**
	 * ĸ�� ��ü�� �����Ѵ�.
	 */
	public void createCaption() {
		caption = new Caption();
	}

	/**
	 * ĸ�� ��ü�� �����Ѵ�.
	 */
	public void deleteCaption() {
		caption = null;
	}

	/**
	 * ĸ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ĸ�� ��ü
	 */
	public Caption getCaption() {
		return caption;
	}

	/**
	 * ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ü
	 */
	public EQEdit getEQEdit() {
		return eqEdit;
	}
}
