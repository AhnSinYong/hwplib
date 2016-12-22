package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.additionaltext.AdditionalTextPosition;
import kr.dogfoot.hwplib.object.docinfo.parashape.Alignment;

/**
 * ���� ��Ʈ���� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderAdditionalText extends CtrlHeader {
	/**
	 * main text
	 */
	private String mainText;
	/**
	 * sub text
	 */
	private String subText;
	/**
	 * ���� ��ġ
	 */
	private AdditionalTextPosition position;
	/**
	 * ��Ʈ ũ�� ����(??)
	 */
	private long fsizeratio;
	/**
	 * �ɼ�(??)
	 */
	private long option;
	/**
	 * Style Number
	 */
	private long styleId;
	/**
	 * ���� ����
	 */
	private Alignment alignment;

	/**
	 * ������
	 */
	public CtrlHeaderAdditionalText() {
		super(ControlType.AdditionalText.getCtrlId());
	}

	/**
	 * main text�� ��ȯ�Ѵ�.
	 * 
	 * @return main text
	 */
	public String getMainText() {
		return mainText;
	}

	/**
	 * main text�� �����Ѵ�.
	 * 
	 * @param mainText
	 *            main text
	 */
	public void setMainText(String mainText) {
		this.mainText = mainText;
	}

	/**
	 * sub text�� ��ȯ�Ѵ�.
	 * 
	 * @return sub text
	 */
	public String getSubText() {
		return subText;
	}

	/**
	 * sub text�� �����Ѵ�.
	 * 
	 * @param subText
	 *            sub text
	 */
	public void setSubText(String subText) {
		this.subText = subText;
	}

	/**
	 * ���� ��ġ �� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ġ
	 */
	public AdditionalTextPosition getPosition() {
		return position;
	}

	/**
	 * ���� ��ġ �� �����Ѵ�.
	 * 
	 * @param position
	 *            ���� ��ġ
	 */
	public void setPosition(AdditionalTextPosition position) {
		this.position = position;
	}

	/**
	 * ��Ʈ ũ�� ����(??)�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ ũ�� ����(??)
	 */
	public long getFsizeratio() {
		return fsizeratio;
	}

	/**
	 * ��Ʈ ũ�� ����(??)�� �����Ѵ�.
	 * 
	 * @param fsizeratio
	 *            ��Ʈ ũ�� ����(??)
	 */
	public void setFsizeratio(long fsizeratio) {
		this.fsizeratio = fsizeratio;
	}

	/**
	 * �ɼ�(??)�� ��ȯ�Ѵ�.
	 * 
	 * @return �ɼ�(??)
	 */
	public long getOption() {
		return option;
	}

	/**
	 * �ɼ�(??)�� �����Ѵ�.
	 * 
	 * @param option
	 */
	public void setOption(long option) {
		this.option = option;
	}

	/**
	 * Style Number�� ��ȯ�Ѵ�.
	 * 
	 * @return Style Number
	 */
	public long getStyleId() {
		return styleId;
	}

	/**
	 * Style Number�� �����Ѵ�.
	 * 
	 * @param styleId
	 *            Style Number
	 */
	public void setStyleId(long styleId) {
		this.styleId = styleId;
	}

	/**
	 * ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public Alignment getAlignment() {
		return alignment;
	}

	/**
	 * ���� ������ �����Ѵ�.
	 * 
	 * @param alignment
	 *            ���� ����
	 */
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
}
