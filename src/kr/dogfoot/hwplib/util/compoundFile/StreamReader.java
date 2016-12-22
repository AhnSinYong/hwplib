package kr.dogfoot.hwplib.util.compoundFile;

import java.io.IOException;

import kr.dogfoot.hwplib.object.fileheader.FileVersion;
import kr.dogfoot.hwplib.reader.RecordHeader;
import kr.dogfoot.hwplib.util.binary.BitFlag;

/**
 * MS Compound ������ ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public abstract class StreamReader {
	/**
	 * ��Ʈ�� ũ��
	 */
	private long size;
	/**
	 * ������� ���� byte ��.
	 */
	private long read;

	/**
	 * �ѱ� ���ڵ� ���
	 */
	private RecordHeader header;
	/**
	 * ����� ���� �ĺ��� ������� ���� byte ��
	 */
	private long readAfterHeader;

	/**
	 * �ѱ� ���� ����
	 */
	private FileVersion fileVersion;

	/**
	 * byte �迭�� ũ�� ��ŭ byte �迭�� ������.
	 * 
	 * @param buffer
	 *            byte �迭
	 * @throws IOException
	 */
	public abstract void readBytes(byte[] buffer) throws IOException;

	/**
	 * signed 1 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return signed 1 byte ������
	 * @throws IOException
	 */
	public abstract byte readSInt1() throws IOException;

	/**
	 * signed 2 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return signed 2 byte ������
	 * @throws IOException
	 */
	public abstract short readSInt2() throws IOException;

	/**
	 * signed 4 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return signed 4 byte ������
	 * @throws IOException
	 */
	public abstract int readSInt4() throws IOException;

	/**
	 * unsigned 1 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return unsigned 1 byte ������
	 * @throws IOException
	 */
	public abstract short readUInt1() throws IOException;

	/**
	 * unsigned 2 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return unsigned 2 byte ������
	 * @throws IOException
	 */
	public abstract int readUInt2() throws IOException;

	/**
	 * unsigned 4 byte �������� �о ��ȯ�Ѵ�.
	 * 
	 * @return unsigned 4 byte ������
	 * @throws IOException
	 */
	public abstract long readUInt4() throws IOException;

	/**
	 * double ���� �о ��ȯ�Ѵ�.
	 * 
	 * @return double ��
	 * @throws IOException
	 */
	public abstract double readDouble() throws IOException;

	/**
	 * float ���� �о ��ȯ�Ѵ�.
	 * 
	 * @return float ��
	 * @throws IOException
	 */
	public abstract float readFloat() throws IOException;

	/**
	 * n ����Ʈ ��ŭ �ǳʶڴ�.
	 * 
	 * @param n
	 *            �ǳʶ� ����Ʈ ��
	 * @throws IOException
	 */
	public abstract void skip(long n) throws IOException;

	/**
	 * ��Ʈ���� �б� ���� ��ü�� �ݴ´�.
	 * 
	 * @throws IOException
	 */
	public abstract void close() throws IOException;

	/**
	 * ������
	 */
	protected StreamReader() {
		size = 0;
		read = 0;
		header = new RecordHeader();
		readAfterHeader = 0;
	}

	/**
	 * ������� ���� byte ��, ����� ���� �ĺ��� ������� ���� byte ���� ���� n��ŭ �߰��Ѵ�.
	 * 
	 * @param n
	 *            byte ��
	 */
	protected void forwardPosition(long n) {
		read += n;
		readAfterHeader += n;
	}

	/**
	 * �ѱ� ���ڵ� ����� �о ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� ���ڵ� ���
	 * @throws IOException
	 */
	public RecordHeader readRecordHeder() throws IOException {
		long value = readUInt4();
		header.setTagID((short) BitFlag.get(value, 0, 9));
		header.setLevel((short) BitFlag.get(value, 10, 19));
		header.setSize((short) BitFlag.get(value, 20, 31));
		readAfterHeader = 0;
		return header;
	}

	/**
	 * �ѱ� ���ڿ��� �о ��ȯ�Ѵ�. �ѱ� ���ڿ��� 2 byte�� ���ڿ� ���̰� ����� �κ� �ڿ� UTF-16LE ������ byte�� ��
	 * ���ڿ� �κ��� ������.
	 * 
	 * @return ���ڿ�
	 * @throws IOException
	 */
	public String readUTF16LEString() throws IOException {
		int len = readUInt2();
		if (len > 0) {
			byte[] arr = new byte[len * 2];
			readBytes(arr);
			return new String(arr, 0, arr.length, "UTF-16LE");
		} else {
			return null;
		}
	}

	/**
	 * �� ���ڸ� �о ��ȯ�Ѵ�.
	 * 
	 * @return �� ����
	 * @throws IOException
	 */
	public String readWChar() throws IOException {
		byte[] arr = new byte[2];
		readBytes(arr);
		return new String(arr, 0, arr.length, "UTF-16LE");
	}

	/**
	 * ��Ʈ�� ũ�⸦ ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ũ��
	 */
	public long getSize() {
		return size;
	}

	/**
	 * ��Ʈ�� ũ�⸦ �����Ѵ�.
	 * 
	 * @param size
	 *            ��Ʈ�� ũ��
	 */
	protected void setSize(long size) {
		this.size = size;
	}

	/**
	 * ��Ʈ�� ���� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ���� ���� ��ġ
	 */
	public long getCurrentPosition() {
		return read;
	}

	/**
	 * ���� ��ġ�� ��Ʈ�� ������ ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ġ�� ��Ʈ�� ������ ����
	 */
	public boolean isEndOfStream() {
		if (read >= size) {
			return true;
		}
		return false;
	}

	/**
	 * ���� ���ڵ� ����� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���ڵ� ���
	 */
	public RecordHeader getCurrentRecordHeader() {
		return header;
	}

	/**
	 * ���ڵ� ���� ���� ��ġ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڵ� ���� ���� ��ġ
	 */
	public long getCurrentPositionAfterHeader() {
		return readAfterHeader;
	}

	/**
	 * �ѱ� ���� ������ ��ȯ�Ѵ�.
	 * 
	 * @return �ѱ� ���� ����
	 */
	public FileVersion getFileVersion() {
		return fileVersion;
	}

	/**
	 * �ѱ� ���� ������ �����Ѵ�.
	 * 
	 * @param fileVersion
	 */
	public void setFileVersion(FileVersion fileVersion) {
		this.fileVersion = fileVersion;
	}

	/**
	 * ���� ��ġ�� ���ڵ� ������ ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ġ�� ���ڵ� ������ ����
	 */
	public boolean isEndOfRecord() {
		if (readAfterHeader < header.getSize()) {
			return false;
		}
		return true;
	}

	/**
	 * ���ڵ� ����� ���� ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���ڵ� ����� ���� ���� ���� ����
	 */
	public boolean isImmediatelyAfterReadingHeader() {
		return (readAfterHeader == 0);
	}

	/**
	 * ���ڵ� ������ �ǳʶڴ�.
	 * 
	 * @throws IOException
	 */
	public void skipToEndRecord() throws IOException {
		long n = getCurrentRecordHeader().getSize()
				- getCurrentPositionAfterHeader();
		skip(n);
	}
}
