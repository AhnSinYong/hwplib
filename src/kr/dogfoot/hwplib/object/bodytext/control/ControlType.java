package kr.dogfoot.hwplib.object.bodytext.control;

import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlID;

/**
 * ��Ʈ�� Ÿ��
 * 
 * @author neolord
 */
public enum ControlType {
	/**
	 * ǥ
	 */
	Table(CtrlID.make('t', 'b', 'l', ' ')),
	/**
	 * �׸��� ��ü(??)
	 */
	Gso(CtrlID.make('g', 's', 'o', ' ')),
	/**
	 * �ѱ� ���� ��ü
	 */
	Equation(CtrlID.make('e', 'q', 'e', 'd')),

	/**
	 * ���� ����
	 */
	SectionDefine(CtrlID.make('s', 'e', 'c', 'd')),
	/**
	 * �� ����
	 */
	ColumnDefine(CtrlID.make('c', 'o', 'l', 'd')),
	/**
	 * �Ӹ���
	 */
	Header(CtrlID.make('h', 'e', 'a', 'd')),
	/**
	 * ������
	 */
	Footer(CtrlID.make('f', 'o', 'o', 't')),
	/**
	 * ����
	 */
	Footnote(CtrlID.make('f', 'n', ' ', ' ')),
	/**
	 * ����
	 */
	Endnote(CtrlID.make('e', 'n', ' ', ' ')),
	/**
	 * �ڵ���ȣ
	 */
	AutoNumber(CtrlID.make('a', 't', 'n', 'o')),
	/**
	 * �� ��ȣ ����
	 */
	NewNumber(CtrlID.make('n', 'w', 'n', 'o')),
	/**
	 * ���߱�
	 */
	PageHide(CtrlID.make('p', 'g', 'h', 'd')),
	/**
	 * Ȧ/¦�� ����
	 */
	PageOddEvenAdjust(CtrlID.make('p', 'g', 'c', 't')),
	/**
	 * �� ��ȣ ��ġ
	 */
	PageNumberPositon(CtrlID.make('p', 'g', 'n', 'p')),
	/**
	 * ã�ƺ��� ǥ��
	 */
	IndexMark(CtrlID.make('i', 'd', 'x', 'm')),
	/**
	 * å����
	 */
	Bookmark(CtrlID.make('b', 'o', 'k', 'm')),
	/**
	 * ���� ��ħ
	 */
	OverlappingLetter(CtrlID.make('t', 'c', 'p', 's')),
	/**
	 * ����
	 */
	AdditionalText(CtrlID.make('t', 'd', 'u', 't')),
	/**
	 * ���� ����
	 */
	HiddenComment(CtrlID.make('t', 'c', 'm', 't')),

	FIELD_UNKNOWN(CtrlID.make('%', 'u', 'n', 'k')), 
	FIELD_DATE(CtrlID.make('%', 'd', 't', 'e')), 
	FIELD_DOCDATE(CtrlID.make('%', 'd', 'd', 't')), 
	FIELD_PATH(CtrlID.make('%', 'p', 'a', 't')), 
	FIELD_BOOKMARK(CtrlID.make('%',	'b', 'm', 'k')), 
	FIELD_MAILMERGE(CtrlID.make('%', 'm', 'm', 'g')), 
	FIELD_CROSSREF(CtrlID.make('%', 'x', 'r', 'f')), 
	FIELD_FORMULA(CtrlID.make('%', 'f', 'm', 'u')), 
	FIELD_CLICKHERE(CtrlID.make('%', 'c', 'l', 'k')), 
	FIELD_SUMMARY(CtrlID.make('%', 's', 'm', 'r')), 
	FIELD_USERINFO(CtrlID.make('%', 'u', 's', 'r')), 
	FIELD_HYPERLINK(CtrlID.make('%', 'h', 'l', 'k')), 
	FIELD_REVISION_SIGN(CtrlID.make('%', 's', 'i', 'g')), 
	FIELD_REVISION_DELETE(CtrlID.make('%', '%', '*', 'd')), 
	FIELD_REVISION_ATTACH(CtrlID.make('%', '%', '*', 'a')), 
	FIELD_REVISION_CLIPPING(CtrlID.make('%', '%', '*','C')), 
	FIELD_REVISION_THINKING(CtrlID.make('%', '%', '*', 'T')), 
	FIELD_REVISION_PRAISE(CtrlID.make('%', '%', '*', 'P')), 
	FIELD_REVISION_LINE(CtrlID.make('%', '%', '*', 'L')),
	FIELD_REVISION_SIMPLECHANGE(CtrlID.make('%', '%', '*', 'c')), 
	FIELD_REVISION_HYPERLINK(CtrlID.make('%', '%', '*', 'h')), 
	FIELD_REVISION_LINEATTACH(CtrlID.make('%', '%', '*', 'A')), 
	FIELD_REVISION_LINELINK(CtrlID.make('%', '%', '*', 'i')), 
	FIELD_REVISION_LINETRANSFER(CtrlID.make('%', '%', '*', 't')), 
	FIELD_REVISION_RIGHTMOVE(CtrlID.make('%', '%', '*', 'r')), 
	FIELD_REVISION_LEFTMOVE(CtrlID.make('%', '%', '*', 'l')), 
	FIELD_REVISION_TRANSFER(CtrlID.make('%', '%', '*', 'n')), 
	FIELD_REVISION_SIMPLEINSERT(CtrlID.make('%', '%', '*', 'e')), 
	FIELD_REVISION_SPLIT(CtrlID.make('%', 's', 'p', 'l')), 
	FIELD_REVISION_CHANGE(CtrlID.make('%', '%', 'm', 'r')), 
	FIELD_MEMO(CtrlID.make('%', '%', 'm', 'e')), 
	FIELD_PRIVATE_INFO_SECURITY(CtrlID.make('%', 'c', 'p', 'r'));

	/**
	 * ��Ʈ�� id
	 */
	private long ctrlId;

	/**
	 * ������
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� id
	 */
	private ControlType(long ctrlId) {
		this.ctrlId = ctrlId;
	}

	/**
	 * ��Ʈ�� id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� id
	 */
	public long getCtrlId() {
		return ctrlId;
	}

	/**
	 * ��Ʈ�� id�� �ش�Ǵ� ControlType�� ��ȯ�Ѵ�.
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� id
	 * @return ��Ʈ�� Ÿ��
	 */
	public static ControlType ctrlIdOf(long ctrlId) {
		for (ControlType ct : values()) {
			if (ct.ctrlId == ctrlId) {
				return ct;
			}
		}
		return Table;
	}

	/**
	 * ��Ʈ�� id�� �ʵ����� �ƴ��� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� id
	 * @return ��Ʈ�� id�� �ʵ����� �ƴ��� ����
	 */
	public static boolean isField(long ctrlId) {
		if (ctrlId == FIELD_UNKNOWN.ctrlId || ctrlId == FIELD_DATE.ctrlId
				|| ctrlId == FIELD_DOCDATE.ctrlId
				|| ctrlId == FIELD_PATH.ctrlId
				|| ctrlId == FIELD_BOOKMARK.ctrlId
				|| ctrlId == FIELD_MAILMERGE.ctrlId
				|| ctrlId == FIELD_CROSSREF.ctrlId
				|| ctrlId == FIELD_FORMULA.ctrlId
				|| ctrlId == FIELD_CLICKHERE.ctrlId
				|| ctrlId == FIELD_SUMMARY.ctrlId
				|| ctrlId == FIELD_USERINFO.ctrlId
				|| ctrlId == FIELD_HYPERLINK.ctrlId
				|| ctrlId == FIELD_REVISION_SIGN.ctrlId
				|| ctrlId == FIELD_REVISION_DELETE.ctrlId
				|| ctrlId == FIELD_REVISION_ATTACH.ctrlId
				|| ctrlId == FIELD_REVISION_CLIPPING.ctrlId
				|| ctrlId == FIELD_REVISION_THINKING.ctrlId
				|| ctrlId == FIELD_REVISION_PRAISE.ctrlId
				|| ctrlId == FIELD_REVISION_LINE.ctrlId
				|| ctrlId == FIELD_REVISION_SIMPLECHANGE.ctrlId
				|| ctrlId == FIELD_REVISION_HYPERLINK.ctrlId
				|| ctrlId == FIELD_REVISION_LINEATTACH.ctrlId
				|| ctrlId == FIELD_REVISION_LINELINK.ctrlId
				|| ctrlId == FIELD_REVISION_LINETRANSFER.ctrlId
				|| ctrlId == FIELD_REVISION_RIGHTMOVE.ctrlId
				|| ctrlId == FIELD_REVISION_LEFTMOVE.ctrlId
				|| ctrlId == FIELD_REVISION_TRANSFER.ctrlId
				|| ctrlId == FIELD_REVISION_SIMPLEINSERT.ctrlId
				|| ctrlId == FIELD_REVISION_SPLIT.ctrlId
				|| ctrlId == FIELD_REVISION_CHANGE.ctrlId
				|| ctrlId == FIELD_MEMO.ctrlId
				|| ctrlId == FIELD_PRIVATE_INFO_SECURITY.ctrlId) {
			return true;
		}
		return false;
	}
}
