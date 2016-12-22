package kr.dogfoot.hwplib.util.compoundFile;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import kr.dogfoot.hwplib.object.fileheader.FileVersion;

import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;

/**
 * �Ϲ����� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class StreamReaderForNormal extends StreamReader {
	/**
	 * ��Ʈ���� �б� ���� Apache POI InputStream ��ü
	 */
	private DocumentInputStream dis;

	/**
	 * ������
	 * 
	 * @param de
	 *            ��Ʈ���� ����Ű�� Apache POI ��ü
	 * @param fileVersion
	 * @throws IOException
	 */
	public StreamReaderForNormal(DocumentEntry de, FileVersion fileVersion)
			throws IOException {
		super();
		dis = new DocumentInputStream(de);
		setSize(de.getSize());
		setFileVersion(fileVersion);
	}

	@Override
	public void readBytes(byte[] buffer) throws IOException {
		forwardPosition(buffer.length);
		dis.read(buffer);
	}

	@Override
	public byte readSInt1() {
		forwardPosition(1);
		return dis.readByte();
	}

	@Override
	public short readSInt2() {
		forwardPosition(2);
		return dis.readShort();
	}

	@Override
	public int readSInt4() {
		forwardPosition(4);
		return dis.readInt();
	}

	@Override
	public short readUInt1() {
		forwardPosition(1);
		return (short) (dis.readByte() & 0xff);
	}

	@Override
	public int readUInt2() {
		forwardPosition(2);
		return dis.readShort() & 0xffff;
	}

	@Override
	public long readUInt4() {
		forwardPosition(4);
		return dis.readInt() & 0xffffffff;
	}

	@Override
	public double readDouble() {
		forwardPosition(8);
		return dis.readDouble();
	}

	@Override
	public float readFloat() throws IOException {
		byte[] arr = new byte[4];
		readBytes(arr);
		return ByteBuffer.wrap(arr).order(ByteOrder.LITTLE_ENDIAN).getFloat();
	}

	@Override
	public void skip(long n) throws IOException {
		forwardPosition(n);
		dis.skip(n);
	}

	@Override
	public void close() {
		dis.close();
		dis = null;
	}
}
