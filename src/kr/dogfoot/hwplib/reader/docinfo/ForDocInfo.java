package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.BinData;
import kr.dogfoot.hwplib.object.docinfo.BorderFill;
import kr.dogfoot.hwplib.object.docinfo.Bullet;
import kr.dogfoot.hwplib.object.docinfo.CharShape;
import kr.dogfoot.hwplib.object.docinfo.DocInfo;
import kr.dogfoot.hwplib.object.docinfo.DocumentPropeties;
import kr.dogfoot.hwplib.object.docinfo.FaceName;
import kr.dogfoot.hwplib.object.docinfo.IDMappings;
import kr.dogfoot.hwplib.object.docinfo.Numbering;
import kr.dogfoot.hwplib.object.docinfo.ParaShape;
import kr.dogfoot.hwplib.object.docinfo.Style;
import kr.dogfoot.hwplib.object.docinfo.TabDef;
import kr.dogfoot.hwplib.object.etc.HWPTag;
import kr.dogfoot.hwplib.object.etc.UnknownRecord;
import kr.dogfoot.hwplib.reader.ForUnknown;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ����(DocInfo) ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForDocInfo {
	/**
	 * ���� ���� ��Ʈ���� ��Ÿ���� ��ü
	 */
	private DocInfo docInfo;
	/**
	 * ��Ʈ�� ����
	 */
	private StreamReader sr;

	/**
	 * ������
	 */
	public ForDocInfo() {
	}

	/**
	 * ���� ����(DocInfo) ��Ʈ���� �д´�.
	 * 
	 * @param di
	 *            ���� ���� ��Ʈ���� ��Ÿ���� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public void read(DocInfo di, StreamReader sr) throws Exception {
		this.sr = sr;
		this.docInfo = di;

		while (sr.isEndOfStream() == false) {
			sr.readRecordHeder();
			recordBody();
		}
	}

	/**
	 * �̹� ���� ���ڵ� ����� ���� ���ڵ� ������ �д´�.
	 * 
	 * @throws Exception
	 */
	private void recordBody() throws Exception {
		switch (sr.getCurrentRecordHeader().getTagID()) {
		case HWPTag.DOCUMENT_PROPERTIES:
			documentProerties(docInfo.getDocumentProperties());
			break;
		case HWPTag.ID_MAPPINGS:
			idMappings(docInfo.getIDMappings());
			break;
		case HWPTag.BIN_DATA:
			binData();
			break;
		case HWPTag.FACE_NAME:
			faceName();
			break;
		case HWPTag.BORDER_FILL:
			borderFill();
			break;
		case HWPTag.CHAR_SHAPE:
			charShape();
			break;
		case HWPTag.TAB_DEF:
			tabDef();
			break;
		case HWPTag.NUMBERING:
			numbering();
			break;
		case HWPTag.BULLET:
			bullet();
			break;
		case HWPTag.PARA_SHAPE:
			paraShape();
			break;
		case HWPTag.STYLE:
			style();
			break;
		case HWPTag.DOC_DATA:
			docData();
			break;
		case HWPTag.DISTRIBUTE_DOC_DATA:
			distributeDocData();
			break;
		case HWPTag.COMPATIBLE_DOCUMENT:
			compatibleDocument();
			break;
		case HWPTag.LAYOUT_COMPATIBILITY:
			layoutCompatibility();
			break;
		case HWPTag.TRACKCHANGE:
			trackChange();
			break;
		case HWPTag.MEMO_SHAPE:
			memoShape();
			break;
		case HWPTag.FORBIDDEN_CHAR:
			forbiddenChar();
			break;
		case HWPTag.TRACK_CHANGE:
			trackChange2();
			break;
		case HWPTag.TRACK_CHANGE_AUTHOR:
			trackChangeAuthor();
			break;
		}
	}

	/**
	 * ���� �Ӽ� ���ڵ带 �д´�.
	 * 
	 * @param dp
	 *            ���� ������ ������ ��ü
	 * @throws IOException
	 */
	private void documentProerties(DocumentPropeties dp) throws IOException {
		ForDocumentPropeties.read(dp, sr);
	}

	/**
	 * ���̵� ���� ��� ���ڵ带 �д´�.
	 * 
	 * @param im
	 *            ���� ������ ������ ��ü
	 * @throws IOException
	 */
	private void idMappings(IDMappings im) throws IOException {
		ForIDMappings.read(im, sr);
	}

	/**
	 * ���̳ʸ� ������ ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void binData() throws IOException {
		BinData bd = docInfo.addNewBinData();
		ForBinData.read(bd, sr);
	}

	/**
	 * �۲� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void faceName() throws Exception {
		FaceName fn = new FaceName();
		ForFaceName.read(fn, sr);
		addFaceNameByIDMappings(fn);
	}

	/**
	 * �۲� ���ڵ� ��ü�� ���̵� ���� ���ڵ��� �۲� ������ ���� �߰��Ѵ�.
	 * 
	 * @param fn
	 *            �۲� ���ڵ� ��ü
	 * @throws Exception
	 */
	private void addFaceNameByIDMappings(FaceName fn) throws Exception {
		IDMappings idm = docInfo.getIDMappings();
		if (docInfo.getHangulFaceNameList().size() < idm
				.getHangulFaceNameCount()) {
			docInfo.getHangulFaceNameList().add(fn);
		} else if (docInfo.getEnglishFaceNameList().size() < idm
				.getEnglishFaceNameCount()) {
			docInfo.getEnglishFaceNameList().add(fn);
		} else if (docInfo.getHanjaFaceNameList().size() < idm
				.getHanjaFaceNameCount()) {
			docInfo.getHanjaFaceNameList().add(fn);
		} else if (docInfo.getJapaneseFaceNameList().size() < idm
				.getJapaneseFaceNameCount()) {
			docInfo.getJapaneseFaceNameList().add(fn);
		} else if (docInfo.getEtcFaceNameList().size() < idm
				.getEtcFaceNameCount()) {
			docInfo.getEtcFaceNameList().add(fn);
		} else if (docInfo.getSymbolFaceNameList().size() < idm
				.getSymbolFaceNameCount()) {
			docInfo.getSymbolFaceNameList().add(fn);
		} else if (docInfo.getUserFaceNameList().size() < idm
				.getUserFaceNameCount()) {
			docInfo.getUserFaceNameList().add(fn);
		} else {
			throw new Exception("Count of FaceName is greater than ID Mappings");
		}
	}

	/**
	 * �׵θ�/��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void borderFill() throws IOException {
		BorderFill bf = docInfo.addNewBorderFill();
		ForBorderFill.read(bf, sr);
	}

	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void charShape() throws Exception {
		CharShape cs = docInfo.addNewCharShape();
		ForCharShape.read(cs, sr);
	}

	/**
	 * �� ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void tabDef() throws IOException {
		TabDef td = docInfo.addNewTabDef();
		ForTabDef.read(td, sr);
	}

	/**
	 * ���� ��ȣ ���ڵ带 �д´�.
	 * 
	 * @throws Exception
	 */
	private void numbering() throws Exception {
		Numbering n = docInfo.addNewNumbering();
		ForNumbering.read(n, sr);
	}

	/**
	 * �۸Ӹ�ǥ ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void bullet() throws IOException {
		Bullet b = docInfo.addNewBullet();
		ForBullet.read(b, sr);
	}

	/**
	 * ���� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void paraShape() throws IOException {
		ParaShape ps = docInfo.addNewParaShape();
		ForParaShape.read(ps, sr);
	}

	/**
	 * ��Ÿ�� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void style() throws IOException {
		Style s = docInfo.addNewStyle();
		ForStyle.read(s, sr);
	}

	/**
	 * ���� ������ ������ ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void docData() throws IOException {
		docInfo.createDocData(sr.getCurrentRecordHeader());
		ForUnknown.read(docInfo.getDocData(), sr);
	}

	/**
	 * ������ ���� ������ ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void distributeDocData() throws IOException {
		docInfo.createDistributeDocData(sr.getCurrentRecordHeader());
		ForUnknown.read(docInfo.getDistributeDocData(), sr);
	}

	/**
	 * ȣȯ ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void compatibleDocument() throws IOException {
		docInfo.createCompatibleDocument();
		ForCompatibleDocument.read(docInfo.getCompatibleDocument(), sr);
	}

	/**
	 * ���̾ƿ� ȣȯ�� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void layoutCompatibility() throws IOException {
		docInfo.createLayoutCompatibility();
		ForLayoutCompatibility.read(docInfo.getLayoutCompatibility(), sr);
	}

	/**
	 * ���� ���� ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void trackChange() throws IOException {
		docInfo.createTrackChange(sr.getCurrentRecordHeader());
		ForUnknown.read(docInfo.getTrackChange(), sr);
	}

	/**
	 * �޸� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void memoShape() throws IOException {
		UnknownRecord ur = docInfo.addNewMemoShape(sr.getCurrentRecordHeader());
		ForUnknown.read(ur, sr);
	}

	/**
	 * ��Ģó�� ���� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void forbiddenChar() throws IOException {
		docInfo.createForbiddenChar(sr.getCurrentRecordHeader());
		ForUnknown.read(docInfo.getForbiddenChar(), sr);
	}

	/**
	 * ���� ���� ���� �� ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void trackChange2() throws IOException {
		UnknownRecord ur = docInfo.addNewTrackChange2(sr
				.getCurrentRecordHeader());
		ForUnknown.read(ur, sr);
	}

	/**
	 * ���� ���� �ۼ��� ���ڵ带 �д´�.
	 * 
	 * @throws IOException
	 */
	private void trackChangeAuthor() throws IOException {
		UnknownRecord ur = docInfo.addNewTrackChangeAuthor(sr
				.getCurrentRecordHeader());
		ForUnknown.read(ur, sr);
	}
}
