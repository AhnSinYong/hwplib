package kr.dogfoot.hwplib.reader;

import java.io.IOException;
import java.util.Arrays;

import kr.dogfoot.hwplib.object.fileheader.FileHeader;
import kr.dogfoot.hwplib.object.fileheader.FileVersion;
import kr.dogfoot.hwplib.util.binary.BitFlag;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ����� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForFileHeader {
	/**
	 * File Header ��Ʈ���� �д´�.
	 * 
	 * @param fh
	 *            ���� ��� ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(FileHeader fh, StreamReader sr)
			throws Exception {
		signature(sr);
		fileVersion(fh.getVersion(), sr);
		properties(fh, sr);
	}

	/**
	 * �ѱ� ���� �ñ״�ó(�� ������ �ѱ� �������� Ȯ���ϴ� �κ�)�� �д´�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	private static void signature(StreamReader sr) throws Exception {
		byte[] sign = new byte[32];
		sr.readBytes(sign);

		if (Arrays.equals(FileHeader.getFileSignature(), sign) == false) {
			throw new Exception("this is not hwp file.");
		}
	}

	/**
	 * ���� ���� �κ��� �д´�.
	 * 
	 * @param fv
	 *            ���� ������ ������ ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void fileVersion(FileVersion fv, StreamReader sr)
			throws IOException {
		fv.setVersion(sr.readUInt4());
	}

	/**
	 * �Ӽ� �κ��� �д´�.
	 * 
	 * @param fh
	 *            ���� ������ ������ ��ü
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void properties(FileHeader fh, StreamReader sr)
			throws IOException {
		long flag = sr.readUInt4();
		fh.setCompressed(BitFlag.get(flag, 0));
		fh.setHasPassword(BitFlag.get(flag, 1));
		fh.setDeploymentDocument(BitFlag.get(flag, 2));
		fh.setSaveScript(BitFlag.get(flag, 3));
		fh.setDRMDocument(BitFlag.get(flag, 4));
		fh.setHasXMLTemplate(BitFlag.get(flag, 5));
		fh.setHasDocumentHistory(BitFlag.get(flag, 6));
		fh.setHasSignature(BitFlag.get(flag, 7));
		fh.setEncryptPublicCertification(BitFlag.get(flag, 8));
		fh.setSavePrepareSignature(BitFlag.get(flag, 9));
		fh.setPublicCertificationDRMDocument(BitFlag.get(flag, 10));
		fh.setCCLDocument(BitFlag.get(flag, 11));
	}
}
