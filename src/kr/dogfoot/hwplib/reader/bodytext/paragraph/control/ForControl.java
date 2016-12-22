package kr.dogfoot.hwplib.reader.bodytext.paragraph.control;

import java.io.IOException;

import kr.dogfoot.hwplib.object.bodytext.control.Control;
import kr.dogfoot.hwplib.object.bodytext.control.ControlAdditionalText;
import kr.dogfoot.hwplib.object.bodytext.control.ControlAutoNumber;
import kr.dogfoot.hwplib.object.bodytext.control.ControlBookmark;
import kr.dogfoot.hwplib.object.bodytext.control.ControlColumnDefine;
import kr.dogfoot.hwplib.object.bodytext.control.ControlEndnote;
import kr.dogfoot.hwplib.object.bodytext.control.ControlEquation;
import kr.dogfoot.hwplib.object.bodytext.control.ControlField;
import kr.dogfoot.hwplib.object.bodytext.control.ControlFooter;
import kr.dogfoot.hwplib.object.bodytext.control.ControlFootnote;
import kr.dogfoot.hwplib.object.bodytext.control.ControlHeader;
import kr.dogfoot.hwplib.object.bodytext.control.ControlHiddenComment;
import kr.dogfoot.hwplib.object.bodytext.control.ControlIndexMark;
import kr.dogfoot.hwplib.object.bodytext.control.ControlNewNumber;
import kr.dogfoot.hwplib.object.bodytext.control.ControlOverlappingLetter;
import kr.dogfoot.hwplib.object.bodytext.control.ControlPageHide;
import kr.dogfoot.hwplib.object.bodytext.control.ControlPageNumberPosition;
import kr.dogfoot.hwplib.object.bodytext.control.ControlSectionDefine;
import kr.dogfoot.hwplib.object.bodytext.control.ControlTable;
import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControl {
	/**
	 * ��Ʈ���� ������ ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(Control c, StreamReader sr) throws Exception {
		if (ControlType.isField(c.getType().getCtrlId())) {
			field(c, sr); // �ʵ�
			return;
		}
		switch (c.getType()) {
		case Table: // ǥ
			table(c, sr);
			break;
		case Equation: // ����
			equation(c, sr);
			break;
		case SectionDefine: // ���� ����
			sectionDefine(c, sr);
			break;
		case ColumnDefine: // �� ����
			columnDefine(c, sr);
			break;
		case Header: // �Ӹ���
			header(c, sr);
			break;
		case Footer: // ������
			footer(c, sr);
			break;
		case Footnote: // ����
			footnote(c, sr);
			break;
		case Endnote: // ����
			endnote(c, sr);
			break;
		case AutoNumber: // �ڵ� ��ȣ
			autoNumber(c, sr);
			break;
		case NewNumber: // �� ��ȣ ����
			newNumber(c, sr);
			break;
		case PageHide: // ���߱�
			pageHide(c, sr);
			break;
		case PageNumberPositon: // �� ��ȣ ��ġ
			pageNumberPositon(c, sr);
			break;
		case IndexMark: // ã�ƺ��� ǥ��
			indexMark(c, sr);
			break;
		case Bookmark: // å����
			bookmark(c, sr);
			break;
		case OverlappingLetter: // ���� ��ħ
			overlappingLetter(c, sr);
			break;
		case AdditionalText: // ����
			additionalText(c, sr);
			break;
		case HiddenComment: // ���� ����
			hiddenComment(c, sr);
			break;
		}
	}

	/**
	 * �ʵ� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void field(Control c, StreamReader sr) throws IOException {
		ForControlField.read((ControlField) c, sr);
	}

	/**
	 * ǥ ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void table(Control c, StreamReader sr) throws Exception {
		ForControlTable fct = new ForControlTable();
		fct.read((ControlTable) c, sr);
	}

	/**
	 * �ѱ� ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void equation(Control c, StreamReader sr) throws Exception {
		ForControlEquation fce = new ForControlEquation();
		fce.read((ControlEquation) c, sr);
	}

	/**
	 * ���� ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void sectionDefine(Control c, StreamReader sr)
			throws Exception {
		ForControlSectionDefine fcsd = new ForControlSectionDefine();
		fcsd.read((ControlSectionDefine) c, sr);
	}

	/**
	 * �� ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void columnDefine(Control c, StreamReader sr)
			throws IOException {
		ForControlColumnDefine.read((ControlColumnDefine) c, sr);
	}

	/**
	 * �Ӹ��� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void header(Control c, StreamReader sr) throws Exception {
		ForControlHeader fch = new ForControlHeader();
		fch.read((ControlHeader) c, sr);
	}

	/**
	 * ������ ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void footer(Control c, StreamReader sr) throws Exception {
		ForControlFooter fcf = new ForControlFooter();
		fcf.read((ControlFooter) c, sr);
	}

	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void footnote(Control c, StreamReader sr) throws Exception {
		ForControlFootnote fcf = new ForControlFootnote();
		fcf.read((ControlFootnote) c, sr);
	}

	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void endnote(Control c, StreamReader sr) throws Exception {
		ForControlEndnote fce = new ForControlEndnote();
		fce.read((ControlEndnote) c, sr);
	}

	/**
	 * �ڵ� ��ȣ ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void autoNumber(Control c, StreamReader sr)
			throws IOException {
		ForControlAutoNumber.read((ControlAutoNumber) c, sr);
	}

	/**
	 * �� ��ȣ ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void newNumber(Control c, StreamReader sr)
			throws IOException {
		ForControlNewNumber.read((ControlNewNumber) c, sr);
	}

	/**
	 * ���߱� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void pageHide(Control c, StreamReader sr) throws IOException {
		ForControlPageHide.read((ControlPageHide) c, sr);
	}

	/**
	 * �� ��ȣ ��ġ ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void pageNumberPositon(Control c, StreamReader sr)
			throws IOException {
		ForControlPageNumberPosition.read((ControlPageNumberPosition) c, sr);
	}

	/**
	 * ã�ƺ��� ǥ�� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void indexMark(Control c, StreamReader sr)
			throws IOException {
		ForControlIndexMark.read((ControlIndexMark) c, sr);
	}

	/**
	 * å���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ�� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void bookmark(Control c, StreamReader sr) throws Exception {
		ForControlBookmark.read((ControlBookmark) c, sr);
	}

	/**
	 * ���� ��ħ ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void overlappingLetter(Control c, StreamReader sr)
			throws IOException {
		ForControlOverlappingLetter.read((ControlOverlappingLetter) c, sr);
	}

	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void additionalText(Control c, StreamReader sr)
			throws IOException {
		ForControlAdditionalText.read((ControlAdditionalText) c, sr);
	}

	/**
	 * ���� ���� ��Ʈ���� �д´�.
	 * 
	 * @param c
	 *            ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void hiddenComment(Control c, StreamReader sr)
			throws Exception {
		ForControlHiddenComment fchc = new ForControlHiddenComment();
		fchc.read((ControlHiddenComment) c, sr);
	}

}
