package kr.dogfoot.hwplib.reader;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.object.fileheader.FileVersion;
import kr.dogfoot.hwplib.reader.bodytext.ForSection;
import kr.dogfoot.hwplib.reader.docinfo.ForDocInfo;
import kr.dogfoot.hwplib.util.compoundFile.CompoundFileReader;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �ѱ� ������ �д� ��ü
 * 
 * @author neolord
 */
public class HWPReader {
	/**
	 * hwp ������ �д´�.
	 * 
	 * @param filepath
	 *            hwp������ ���
	 * @return HWPFile ��ü
	 * @throws Exception
	 */
	public static HWPFile fromFile(String filepath) throws Exception {
		HWPReader r = new HWPReader();
		r.hwpFile = new HWPFile();
		r.cfr = new CompoundFileReader(new File(filepath));

		r.fileHeader();
		if (r.hasPassword()) {
			throw new Exception("Files with passwords are not supported.");
		}
		r.docInfo();
		r.bodyText();
		r.binData();

		r.cfr.close();
		return r.hwpFile;
	}

	/**
	 * HWP������ ��Ÿ���� ��ü
	 */
	private HWPFile hwpFile;
	/**
	 * MS Compound ������ �б� ���� ���� ��ü
	 */
	private CompoundFileReader cfr;

	/**
	 * ������
	 */
	private HWPReader() {
	}

	/**
	 * FileHeader ��Ʈ���� �д´�.
	 * 
	 * @throws Exception
	 */
	private void fileHeader() throws Exception {
		StreamReader sr = cfr.getChildStreamReader("FileHeader", false, null);
		ForFileHeader.read(hwpFile.getFileHeader(), sr);
		sr.close();
	}

	/**
	 * ��ȣȭ�� �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣȭ�� �������� ����
	 */
	private boolean hasPassword() {
		return hwpFile.getFileHeader().hasPassword();
	}

	/**
	 * DocInfo ��Ʈ���� �д´�.
	 * 
	 * @throws Exception
	 */
	private void docInfo() throws Exception {
		StreamReader sr = cfr.getChildStreamReader("DocInfo", isCompressed(), getVersion());
		ForDocInfo forDocInfo = new ForDocInfo();
		forDocInfo.read(hwpFile.getDocInfo(), sr);
		sr.close();
	}

	/**
	 * ����� �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ����� �������� ����
	 */
	private boolean isCompressed() {
		return hwpFile.getFileHeader().isCompressed();
	}

	/**
	 * ������ ������ ��ȯ�Ѵ�.
	 * 
	 * @return ������ ����
	 */
	private FileVersion getVersion() {
		return hwpFile.getFileHeader().getVersion();
	}

	/**
	 * BodyText ���丮���� �д´�.
	 * 
	 * @throws Exception
	 */
	private void bodyText() throws Exception {
		cfr.moveChildStorage("BodyText");
		int sectionCount = hwpFile.getDocInfo().getDocumentProperties()
				.getSectionCount();
		for (int i = 0; i < sectionCount; i++) {
			section(i);
		}
		cfr.moveParentStorage();
	}

	/**
	 * Section ��Ʈ���� �д´�.
	 * 
	 * @param sectionIndex
	 *            ���� �ε���
	 * @throws Exception
	 */
	private void section(int sectionIndex) throws Exception {
		StreamReader sr = cfr.getChildStreamReader("Section" + sectionIndex,
				isCompressed(), getVersion());
		ForSection
				.read(hwpFile.getBodyText().addNewSection(), sr);
		sr.close();
	}

	/**
	 * BinData ���丮���� �д´�.
	 * 
	 * @throws Exception
	 */
	private void binData() throws Exception {
		if (cfr.isChildStorage("BinData")) {
			cfr.moveChildStorage("BinData");
			Set<String> ss = cfr.listChildNames();
			Iterator<String> it = ss.iterator();
			while (it.hasNext()) {
				String name = it.next();
				hwpFile.getBinData().addNewEmbeddedBinaryData(name,
						readEmbededBinaryData(name));
			}
			cfr.moveParentStorage();
		}
	}

	/**
	 * BinData ���丮�� �Ʒ��� ��Ʈ���� �д´�.
	 * 
	 * @param name
	 *            ��Ʈ�� �̸�
	 * @return ��Ʈ���� ����� ����Ÿ
	 * @throws Exception
	 */
	private byte[] readEmbededBinaryData(String name) throws Exception {
		StreamReader sr = cfr.getChildStreamReader(name, false, null);
		byte[] binaryData = new byte[(int) sr.getSize()];
		sr.readBytes(binaryData);
		sr.close();
		return binaryData;
	}
}
