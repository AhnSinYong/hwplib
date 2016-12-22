package kr.dogfoot.hwplib.object.docinfo;

/**
 * ���̵� ���� ����� ��Ÿ����  ���ڵ�. "DocInfo" stream �ȿ� �ִ� �ٸ� ��ü���� ������ �����Ѵ�.
 * 
 * @author neolord
 */
public class IDMappings {
	/**
	 * ���̳ʸ� �������� ����
	 */
	private int binDataCount;
	/**
	 * �ѱ� �۲��� ����
	 */
	private int hangulFaceNameCount;
	/**
	 * ���� �۲��� ����
	 */
	private int englishFaceNameCount;
	/**
	 * ���� �۲��� ����
	 */
	private int hanjaFaceNameCount;
	/**
	 * �Ϻ��� �۲��� ����
	 */
	private int japaneseFaceNameCount;
	/**
	 * ��Ÿ �۲��� ����
	 */
	private int etcFaceNameCount;
	/**
	 * ��ȣ �۲��� ����
	 */
	private int symbolFaceNameCount;
	/**
	 * ����� �۲��� ����
	 */
	private int userFaceNameCount;
	/**
	 * �׵θ�/����� ����
	 */
	private int borderFillCount;
	/**
	 * ���� ����� ����
	 */
	private int charShapeCount;
	/**
	 * �� ������ ����
	 */
	private int tabDefCount;
	/**
	 * ���� ��ȣ�� ����
	 */
	private int numberingCount;
	/**
	 * �۸Ӹ�ǥ�� ����
	 */
	private int bulletCount;
	/**
	 * ���� ����� ����
	 */
	private int paraShapeCount;
	/**
	 * ��Ÿ���� ����
	 */
	private int styleCount;
	/**
	 * �޸� ����� ����(5.0.2.1 �̻�)
	 */
	private int memoShapeCount;
	/**
	 * ���� ������ ����(5.0.3.2 �̻�)
	 */
	private int trackChangeCount;
	/**
	 * �������� ������� ���� (5.0.3.2 �̻�)
	 */
	private int trackChangeAuthorCount;

	/**
	 * ������
	 */
	public IDMappings() {
	}

	/**
	 * ���̳ʸ� ������ ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� ������ ��ü�� ����
	 */
	public int getBinDataCount() {
		return binDataCount;
	}

	/**
	 * ���̳ʸ� ������ ��ü�� ������ �����Ѵ�.
	 * 
	 * @param binDataCount
	 *            ���̳ʸ� ������ ��ü�� ����
	 */
	public void setBinDataCount(int binDataCount) {
		this.binDataCount = binDataCount;
	}

	/**
	 * �ѱ� �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� �۲� ��ü�� ����
	 */
	public int getHangulFaceNameCount() {
		return hangulFaceNameCount;
	}

	/**
	 * �ѱ� �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param hangulFaceNameCount
	 *            �ѱ� �۲� ��ü�� ����
	 */
	public void setHangulFaceNameCount(int hangulFaceNameCount) {
		this.hangulFaceNameCount = hangulFaceNameCount;
	}

	/**
	 * ���� �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �۲� ��ü�� ����
	 */
	public int getEnglishFaceNameCount() {
		return englishFaceNameCount;
	}

	/**
	 * ���� �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param englishFaceNameCount
	 *            ���� �۲� ��ü�� ����
	 */
	public void setEnglishFaceNameCount(int englishFaceNameCount) {
		this.englishFaceNameCount = englishFaceNameCount;
	}

	/**
	 * ���� �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� �۲� ��ü�� ����
	 */
	public int getHanjaFaceNameCount() {
		return hanjaFaceNameCount;
	}

	/**
	 * ���� �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param hanjaFaceNameCount
	 *            ���� �۲� ��ü�� ����
	 */
	public void setHanjaFaceNameCount(int hanjaFaceNameCount) {
		this.hanjaFaceNameCount = hanjaFaceNameCount;
	}

	/**
	 * �Ϻ��� �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �Ϻ��� �۲� ��ü�� ����
	 */
	public int getJapaneseFaceNameCount() {
		return japaneseFaceNameCount;
	}

	/**
	 * �Ϻ��� �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param japaneseFaceNameCount
	 *            �Ϻ��� �۲� ��ü�� ����
	 */
	public void setJapaneseFaceNameCount(int japaneseFaceNameCount) {
		this.japaneseFaceNameCount = japaneseFaceNameCount;
	}

	/**
	 * ��Ÿ �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �۲� ��ü�� ����
	 */
	public int getEtcFaceNameCount() {
		return etcFaceNameCount;
	}

	/**
	 * ��Ÿ �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param etcFaceNameCount
	 *            ��Ÿ �۲� ��ü�� ����
	 */
	public void setEtcFaceNameCount(int etcFaceNameCount) {
		this.etcFaceNameCount = etcFaceNameCount;
	}

	/**
	 * ��ȣ �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ �۲� ��ü�� ����
	 */
	public int getSymbolFaceNameCount() {
		return symbolFaceNameCount;
	}

	/**
	 * ��ȣ �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param symbolFaceNameCount
	 *            ��ȣ �۲� ��ü�� ����
	 */
	public void setSymbolFaceNameCount(int symbolFaceNameCount) {
		this.symbolFaceNameCount = symbolFaceNameCount;
	}

	/**
	 * ����� �۲� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ����� �۲� ��ü�� ����
	 */
	public int getUserFaceNameCount() {
		return userFaceNameCount;
	}

	/**
	 * ����� �۲� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param userFaceNameCount
	 *            ����� �۲� ��ü�� ����
	 */
	public void setUserFaceNameCount(int userFaceNameCount) {
		this.userFaceNameCount = userFaceNameCount;
	}

	/**
	 * ���/�׵θ� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���/�׵θ� ��ü�� ����
	 */
	public int getBorderFillCount() {
		return borderFillCount;
	}

	/**
	 * ���/�׵θ� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param borderFillCount
	 *            ���/�׵θ� ��ü�� ����
	 */
	public void setBorderFillCount(int borderFillCount) {
		this.borderFillCount = borderFillCount;
	}

	/**
	 * ���� ��� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��� ��ü�� ����
	 */
	public int getCharShapeCount() {
		return charShapeCount;
	}

	/**
	 * ���� ��� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param charShapeCount
	 *            ���� ��� ��ü�� ����
	 */
	public void setCharShapeCount(int charShapeCount) {
		this.charShapeCount = charShapeCount;
	}

	/**
	 * �� ���� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ��ü�� ����
	 */
	public int getTabDefCount() {
		return tabDefCount;
	}

	/**
	 * �� ���� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param tabDefCount
	 *            �� ���� ��ü�� ����
	 */
	public void setTabDefCount(int tabDefCount) {
		this.tabDefCount = tabDefCount;
	}

	/**
	 * ���� ��ȣ ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ȣ ��ü�� ����
	 */
	public int getNumberingCount() {
		return numberingCount;
	}

	/**
	 * ���� ��ȣ ��ü�� ������ �����Ѵ�.
	 * 
	 * @param numberingCount
	 *            ���� ��ȣ ��ü�� ����
	 */
	public void setNumberingCount(int numberingCount) {
		this.numberingCount = numberingCount;
	}

	/**
	 * �۸Ӹ�ǥ ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �۸Ӹ�ǥ ��ü�� ����
	 */
	public int getBulletCount() {
		return bulletCount;
	}

	/**
	 * �۸Ӹ�ǥ ��ü�� ������ �����Ѵ�.
	 * 
	 * @param bulletCount
	 *            �۸Ӹ�ǥ ��ü�� ����
	 */
	public void setBulletCount(int bulletCount) {
		this.bulletCount = bulletCount;
	}

	/**
	 * �ȴ� ��� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ȴ� ��� ��ü�� ����
	 */
	public int getParaShapeCount() {
		return paraShapeCount;
	}

	/**
	 * �ȴ� ��� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param paraShapeCount
	 *            �ȴ� ��� ��ü�� ����
	 */
	public void setParaShapeCount(int paraShapeCount) {
		this.paraShapeCount = paraShapeCount;
	}

	/**
	 * ��Ÿ�� ��ü�� ������ ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ�� ��ü�� ����
	 */
	public int getStyleCount() {
		return styleCount;
	}

	/**
	 * ��Ÿ�� ��ü�� ������ �����Ѵ�.
	 * 
	 * @param styleCount
	 *            ��Ÿ�� ��ü�� ����
	 */
	public void setStyleCount(int styleCount) {
		this.styleCount = styleCount;
	}

	/**
	 * �޸� ��� ��ü�� ������ ��ȯ�Ѵ�. (5.0.2.1 �̻�)
	 * 
	 * @return �޸� ��� ��ü�� ����
	 */
	public int getMemoShapeCount() {
		return memoShapeCount;
	}

	/**
	 * �޸� ��� ��ü�� ������ �����Ѵ�. (5.0.2.1 �̻�)
	 * 
	 * @param memoShapeCount
	 *            �޸� ��� ��ü�� ����
	 */
	public void setMemoShapeCount(int memoShapeCount) {
		this.memoShapeCount = memoShapeCount;
	}

	/**
	 * ���� ���� ��ü�� ������ ��ȯ�Ѵ�. (5.0.3.2 �̻�)
	 * 
	 * @return ���� ���� ��ü�� ����
	 */
	public int getTrackChangeCount() {
		return trackChangeCount;
	}

	/**
	 * ���� ���� ��ü�� ������ �����Ѵ�. (5.0.3.2 �̻�)
	 * 
	 * @param trackChangeCount
	 *            ���� ���� ��ü�� ����
	 */
	public void setTrackChangeCount(int trackChangeCount) {
		this.trackChangeCount = trackChangeCount;
	}

	/**
	 * �������� ����� ��ü�� ������ ��ȯ�Ѵ�. (5.0.3.2 �̻�)
	 * 
	 * @return �������� ����� ��ü�� ����
	 */
	public int getTrackChangeAuthorCount() {
		return trackChangeAuthorCount;
	}

	/**
	 * �������� ����� ��ü�� ������ �����Ѵ�. (5.0.3.2 �̻�)
	 * 
	 * @param trackChangeAuthorCount
	 *            �������� ����� ��ü�� ����
	 */
	public void setTrackChangeAuthorCount(int trackChangeAuthorCount) {
		this.trackChangeAuthorCount = trackChangeAuthorCount;
	}
}
