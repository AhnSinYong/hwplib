package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.BinData;
import kr.dogfoot.hwplib.object.docinfo.bindata.BinDataType;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���̳ʸ� ����Ÿ ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForBinData {
	/**
	 * ���̳ʸ� ����Ÿ ���ڵ带 �д´�.
	 * 
	 * @param bd
	 *            ���̳ʸ� ����Ÿ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(BinData bd, StreamReader sr)
			throws IOException {
		bd.getProperty().setValue(sr.readUInt2());
		if (bd.getProperty().getType() == BinDataType.Link) {
			bd.setAbsolutePathForLink(sr.readUTF16LEString());
			bd.setRelativePathForLink(sr.readUTF16LEString());
		}

		if (bd.getProperty().getType() == BinDataType.Embedding
				|| bd.getProperty().getType() == BinDataType.Storage) {
			bd.setBinDataID(sr.readUInt2());
		}

		if (bd.getProperty().getType() == BinDataType.Embedding) {
			bd.setExtensionForEmbedding(sr.readUTF16LEString());
		}
	}
}
