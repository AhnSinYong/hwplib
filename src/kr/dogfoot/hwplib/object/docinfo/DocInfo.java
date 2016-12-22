package kr.dogfoot.hwplib.object.docinfo;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.etc.UnknownRecord;
import kr.dogfoot.hwplib.reader.RecordHeader;

/**
 * ���� ������ ��Ÿ���� ��ü. HWP���� ���� "DocInfo" stream�� ����ȴ�.
 * 
 * @author neolord
 */
public class DocInfo {
	/**
	 * ���� �Ӽ�
	 */
	private DocumentPropeties documentProperties;
	/**
	 * ���̵� ���� ���
	 */
	private IDMappings idMappings;
	/**
	 * ���̳ʸ� ������ ����Ʈ
	 */
	private ArrayList<BinData> binDataList;
	/**
	 * �ѱ� �۲� ����Ʈ
	 */
	private ArrayList<FaceName> hangulFaceNameList;
	/**
	 * ���� �۲� ����Ʈ
	 */
	private ArrayList<FaceName> englishFaceNameList;
	/**
	 * ���� ��� ����Ʈ
	 */
	private ArrayList<FaceName> hanjaFaceNameList;
	/**
	 * �Ͼ� �۲� ����Ʈ
	 */
	private ArrayList<FaceName> japaneseFaceNameList;
	/**
	 * ��Ÿ �۲� ����Ʈ
	 */
	private ArrayList<FaceName> etcFaceNameList;
	/**
	 * ��ȣ �۲� ����Ʈ
	 */
	private ArrayList<FaceName> symbolFaceNameList;
	/**
	 * ����� �۲� ����Ʈ
	 */
	private ArrayList<FaceName> userFaceNameList;
	/**
	 * �׵θ�/��� ����Ʈ
	 */
	private ArrayList<BorderFill> borderFillList;
	/**
	 * ���� ��� ����Ʈ
	 */
	private ArrayList<CharShape> charShapeList;
	/**
	 * �� ���� ����Ʈ
	 */
	private ArrayList<TabDef> tabDefList;
	/**
	 * ���� ��ȣ ����Ʈ
	 */
	private ArrayList<Numbering> numberingList;
	/**
	 * �۸Ӹ�ǥ ����Ʈ
	 */
	private ArrayList<Bullet> bulletList;
	/**
	 * ���� ��� ����Ʈ
	 */
	private ArrayList<ParaShape> paraShapeList;
	/**
	 * ��Ÿ�� ����Ʈ
	 */
	private ArrayList<Style> styleList;
	/**
	 * ���� ������ ������
	 */
	private UnknownRecord docData;
	/**
	 * ������ ���� ������
	 */
	private UnknownRecord distributeDocData;
	/**
	 * ȣȯ ����
	 */
	private CompatibleDocument compatibleDocument;
	/**
	 * ���̾ƿ� ȣȯ��
	 */
	private LayoutCompatibility layoutCompatibility;
	/**
	 * ���� ���� ����
	 */
	private UnknownRecord trackChange;
	/**
	 * �޸� ��� ����Ʈ
	 */
	private ArrayList<UnknownRecord> memoShapeList;
	/**
	 * ��Ģó�� ����
	 */
	private UnknownRecord forbiddenChar;
	/**
	 * ���� ���� ���� �� ���
	 */
	private ArrayList<UnknownRecord> trackChange2List;
	/**
	 * ���� ���� �ۼ���
	 */
	private ArrayList<UnknownRecord> trackChangeAuthorList;

	/**
	 * ������
	 */
	public DocInfo() {
		documentProperties = new DocumentPropeties();
		idMappings = new IDMappings();
		binDataList = new ArrayList<BinData>();
		hangulFaceNameList = new ArrayList<FaceName>();
		englishFaceNameList = new ArrayList<FaceName>();
		hanjaFaceNameList = new ArrayList<FaceName>();
		japaneseFaceNameList = new ArrayList<FaceName>();
		etcFaceNameList = new ArrayList<FaceName>();
		symbolFaceNameList = new ArrayList<FaceName>();
		userFaceNameList = new ArrayList<FaceName>();
		borderFillList = new ArrayList<BorderFill>();
		charShapeList = new ArrayList<CharShape>();
		tabDefList = new ArrayList<TabDef>();
		numberingList = new ArrayList<Numbering>();
		bulletList = new ArrayList<Bullet>();
		paraShapeList = new ArrayList<ParaShape>();
		styleList = new ArrayList<Style>();
		docData = null;
		distributeDocData = null;
		compatibleDocument = null;
		layoutCompatibility = null;
		trackChange = null;
		memoShapeList = new ArrayList<UnknownRecord>();
		forbiddenChar = null;
		trackChange2List = new ArrayList<UnknownRecord>();
		trackChangeAuthorList = new ArrayList<UnknownRecord>();
	}

	/**
	 * ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �Ӽ� ��ü
	 */
	public DocumentPropeties getDocumentProperties() {
		return documentProperties;
	}

	/**
	 * ���̵� ���� ��� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̵� ���� ��� ��ü
	 */
	public IDMappings getIDMappings() {
		return idMappings;
	}

	/**
	 * ���ο� ���̳ʸ� ������ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���̳ʸ� ������ ��ü
	 */
	public BinData addNewBinData() {
		BinData bd = new BinData();
		binDataList.add(bd);
		return bd;
	}

	/**
	 * ���̳ʸ� ������ ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� ������ ��ü ����Ʈ
	 */
	public ArrayList<BinData> getBinDataList() {
		return binDataList;
	}

	/**
	 * ���ο� �ѱ� �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �ѱ� �۲� ��ü
	 */
	public FaceName addNewHangulFaceName() {
		FaceName fn = new FaceName();
		hangulFaceNameList.add(fn);
		return fn;
	}

	/**
	 * �ѱ� �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getHangulFaceNameList() {
		return hangulFaceNameList;
	}

	/**
	 * ���ο� ���� �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� �۲� ��ü
	 */
	public FaceName addNewEnglishFaceName() {
		FaceName fn = new FaceName();
		englishFaceNameList.add(fn);
		return fn;
	}

	/**
	 * ���� �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getEnglishFaceNameList() {
		return englishFaceNameList;
	}

	/**
	 * ���ο� ���� �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� �۲� ��ü
	 */
	public FaceName addNewHanjaFaceName() {
		FaceName fn = new FaceName();
		hanjaFaceNameList.add(fn);
		return fn;
	}

	/**
	 * ���� �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getHanjaFaceNameList() {
		return hanjaFaceNameList;
	}

	/**
	 * ���ο� �Ϻ��� �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �Ͼ� �۲� ��ü
	 */
	public FaceName addNewJapaneseFaceName() {
		FaceName fn = new FaceName();
		japaneseFaceNameList.add(fn);
		return fn;
	}

	/**
	 * �Ϻ��� �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ��� �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getJapaneseFaceNameList() {
		return japaneseFaceNameList;
	}

	/**
	 * ���ο� ��Ÿ �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ��Ÿ �۲� ��ü
	 */
	public FaceName addNewEtcFaceName() {
		FaceName fn = new FaceName();
		etcFaceNameList.add(fn);
		return fn;
	}

	/**
	 * ��Ÿ �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getEtcFaceNameList() {
		return etcFaceNameList;
	}

	/**
	 * ���ο� ��ȣ �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ��ȣ �۲� ��ü
	 */
	public FaceName addNewSymbolFaceName() {
		FaceName fn = new FaceName();
		symbolFaceNameList.add(fn);
		return fn;
	}

	/**
	 * ��ȣ �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getSymbolFaceNameList() {
		return symbolFaceNameList;
	}

	/**
	 * ���ο� ����� �۲� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ����� �۲� ��ü
	 */
	public FaceName addNewUserFaceName() {
		FaceName fn = new FaceName();
		userFaceNameList.add(fn);
		return fn;
	}

	/**
	 * ����� �۲� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ����� �۲� ��ü ����Ʈ
	 */
	public ArrayList<FaceName> getUserFaceNameList() {
		return userFaceNameList;
	}

	/**
	 * ���ο� �׵θ�/��� ��ü�� �����ϰ� ����Ʈü�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �׵θ�/��� ��ü
	 */
	public BorderFill addNewBorderFill() {
		BorderFill bf = new BorderFill();
		borderFillList.add(bf);
		return bf;
	}

	/**
	 * �׵θ�/��� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �׵θ�/��� ��ü ����Ʈ
	 */
	public ArrayList<BorderFill> getBorderFillList() {
		return borderFillList;
	}

	/**
	 * ���ο� ���� ��� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ��� ��ü
	 */
	public CharShape addNewCharShape() {
		CharShape cs = new CharShape();
		charShapeList.add(cs);
		return cs;
	}

	/**
	 * ���� ��� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ��ü ����Ʈ
	 */
	public ArrayList<CharShape> getCharShapeList() {
		return charShapeList;
	}

	/**
	 * ���ο� �� ���� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ���� ��ü
	 */
	public TabDef addNewTabDef() {
		TabDef td = new TabDef();
		tabDefList.add(td);
		return td;
	}

	/**
	 * �� ���� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ü ����Ʈ
	 */
	public ArrayList<TabDef> getTabDefList() {
		return tabDefList;
	}

	/**
	 * ���ο� ���� ��ȣ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ��ȣ ��ü
	 */
	public Numbering addNewNumbering() {
		Numbering n = new Numbering();
		numberingList.add(n);
		return n;
	}

	/**
	 * ���� ��ȣ ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ȣ ��ü ����Ʈ
	 */
	public ArrayList<Numbering> getNumberingList() {
		return numberingList;
	}

	/**
	 * ���ο� �۸Ӹ�ǥ ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �۸Ӹ�ǥ ��ü
	 */
	public Bullet addNewBullet() {
		Bullet b = new Bullet();
		bulletList.add(b);
		return b;
	}

	/**
	 * �۸Ӹ�ǥ ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �۸Ӹ�ǥ ��ü ����Ʈ
	 */
	public ArrayList<Bullet> getBulletList() {
		return bulletList;
	}

	/**
	 * ���ο� ���� ��� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ���� ��� ��ü
	 */
	public ParaShape addNewParaShape() {
		ParaShape ps = new ParaShape();
		paraShapeList.add(ps);
		return ps;
	}

	/**
	 * ���� ��� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ��ü ����Ʈ
	 */
	public ArrayList<ParaShape> getParaShapeList() {
		return paraShapeList;
	}

	/**
	 * ���ο� ��Ÿ�� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ ��Ÿ�� ��ü
	 */
	public Style addNewStyle() {
		Style s = new Style();
		styleList.add(s);
		return s;
	}

	/**
	 * ��Ÿ�� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ�� ��ü ����Ʈ
	 */
	public ArrayList<Style> getStyleList() {
		return styleList;
	}

	/**
	 * ���� ������ ������ ��ü�� �����Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 */
	public void createDocData(RecordHeader rh) {
		docData = new UnknownRecord(rh);
	}

	/**
	 * ���� ������ ������ ��ü�� �����Ѵ�.
	 */
	public void deleteDocData() {
		docData = null;
	}

	/**
	 * ���� ������ ������ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ������ ��ü
	 */
	public UnknownRecord getDocData() {
		return docData;
	}

	/**
	 * ������ ���� ������ ��ü�� �����Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 */
	public void createDistributeDocData(RecordHeader rh) {
		distributeDocData = new UnknownRecord(rh);
	}

	/**
	 * ������ ���� ������ ��ü�� �����Ѵ�.
	 */
	public void deleteDistributeDocData() {
		distributeDocData = null;
	}

	/**
	 * ������ ���� ������ ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ������ ��ü
	 */
	public UnknownRecord getDistributeDocData() {
		return distributeDocData;
	}

	/**
	 * ȣȯ ���� ��ü�� �����Ѵ�.
	 */
	public void createCompatibleDocument() {
		compatibleDocument = new CompatibleDocument();
	}

	/**
	 * ȣȯ ���� ��ü�� �����Ѵ�.
	 */
	public void deleteCompatibleDocument() {
		compatibleDocument = null;
	}

	/**
	 * ȣȯ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ȣȯ ���� ��ü
	 */
	public CompatibleDocument getCompatibleDocument() {
		return compatibleDocument;
	}

	/**
	 * ���̾ƿ� ȣȯ�� ��ü�� �����Ѵ�.
	 */
	public void createLayoutCompatibility() {
		layoutCompatibility = new LayoutCompatibility();
	}

	/**
	 * ���̾ƿ� ȣȯ�� ��ü�� �����Ѵ�.
	 */
	public void deleteLayoutCompatibility() {
		layoutCompatibility = null;
	}

	/**
	 * ���̾ƿ� ȣȯ�� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̾ƿ� ȣȯ�� ��ü
	 */
	public LayoutCompatibility getLayoutCompatibility() {
		return layoutCompatibility;
	}

	/**
	 * ���� ���� ���� ��ü�� �����Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 */
	public void createTrackChange(RecordHeader rh) {
		trackChange = new UnknownRecord(rh);
	}

	/**
	 * ���� ���� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteTrackChange() {
		trackChange = null;
	}

	/**
	 * ���� ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ���� ��ü
	 */
	public UnknownRecord getTrackChange() {
		return trackChange;
	}

	/**
	 * ���ο� �޸� ��� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 * @return ���� ������ �޸� ��� ��ü
	 */
	public UnknownRecord addNewMemoShape(RecordHeader rh) {
		UnknownRecord ur = new UnknownRecord(rh);
		memoShapeList.add(ur);
		return ur;
	}

	/**
	 * �޸� ��� ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �޸� ��� ��ü ����Ʈ
	 */
	public ArrayList<UnknownRecord> getMemoShapeList() {
		return memoShapeList;
	}

	/**
	 * ��Ģó�� ���� ��ü�� �����Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 */
	public void createForbiddenChar(RecordHeader rh) {
		forbiddenChar = new UnknownRecord(rh);
	}

	/**
	 * ��Ģó�� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteForbiddenChar() {
		forbiddenChar = null;
	}

	/**
	 * ��Ģó�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ģó�� ���� ��ü
	 */
	public UnknownRecord getForbiddenChar() {
		return forbiddenChar;
	}

	/**
	 * ���ο� [���� ���� ���� �� ���] ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 * @return ���� ������ [���� ���� ���� �� ���] ��ü
	 */
	public UnknownRecord addNewTrackChange2(RecordHeader rh) {
		UnknownRecord ur = new UnknownRecord(rh);
		trackChange2List.add(ur);
		return ur;
	}

	/**
	 * [���� ���� ���� �� ���] ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return [���� ���� ���� �� ���] ��ü ����Ʈ
	 */
	public ArrayList<UnknownRecord> getTrackChange2List() {
		return trackChange2List;
	}

	/**
	 * ���ο� [���� ���� �ۼ���] ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param rh
	 *            ���ڵ� ���
	 * @return ���� ������ [���� ���� �ۼ���] ��ü
	 */
	public UnknownRecord addNewTrackChangeAuthor(RecordHeader rh) {
		UnknownRecord ur = new UnknownRecord(rh);
		trackChangeAuthorList.add(ur);
		return ur;
	}

	/**
	 * [���� ���� �ۼ���] ��ü ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return [���� ���� �ۼ���] ��ü ����Ʈ
	 */
	public ArrayList<UnknownRecord> getTrackChangeAuthorList() {
		return trackChangeAuthorList;
	}
}
