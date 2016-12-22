package kr.dogfoot.hwplib.object;

import kr.dogfoot.hwplib.object.bindata.BinData;
import kr.dogfoot.hwplib.object.bodytext.BodyText;
import kr.dogfoot.hwplib.object.docinfo.DocInfo;
import kr.dogfoot.hwplib.object.fileheader.FileHeader;

/**
 * HWP File�� ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class HWPFile {
	/**
	 * ���� �ν� ������ ��Ÿ���� ��ü. "FileHeader" stream�� ����ȴ�.
	 */
	private FileHeader fileHeader;
	/**
	 * ���� ������ ��Ÿ���� ��ü. "DocInfo" stream�� ����ȴ�.
	 */
	private DocInfo docInfo;
	/**
	 * ������ ��Ÿ���� ��ü. "BodyText" storage�� ����ȴ�.
	 */
	private BodyText bodyText;
	/**
	 * ���̳ʸ� �����͸� ��Ÿ���� ��ü. "BinData" storage�� ����ȴ�.
	 */
	private BinData binData;

	/**
	 * ������
	 */
	public HWPFile() {
		fileHeader = new FileHeader();
		docInfo = new DocInfo();
		bodyText = new BodyText();
		binData = new BinData();
	}

	/**
	 * ���� �ν� ������ ��Ÿ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �ν� ������ ��Ÿ���� ��ü
	 */
	public FileHeader getFileHeader() {
		return fileHeader;
	}

	/**
	 * ���� ������ ��Ÿ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��Ÿ���� ��ü
	 */
	public DocInfo getDocInfo() {
		return docInfo;
	}

	/**
	 * ������ ��Ÿ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ��Ÿ���� ��ü
	 */
	public BodyText getBodyText() {
		return bodyText;
	}

	/**
	 * ���̳ʸ� �����͸� ��Ÿ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���̳ʸ� �����͸� ��Ÿ���� ��ü
	 */
	public BinData getBinData() {
		return binData;
	}
}
