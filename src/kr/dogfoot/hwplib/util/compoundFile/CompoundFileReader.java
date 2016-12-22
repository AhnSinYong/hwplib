package kr.dogfoot.hwplib.util.compoundFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import kr.dogfoot.hwplib.object.fileheader.FileVersion;

import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * MS Compound File�� �б� ���� ��ü. Apache POI ���̺귯���� �����
 * 
 * @author neolord
 */
public class CompoundFileReader {
	/**
	 * ���� �ý���(Apache POI ���̺귯��)
	 */
	private POIFSFileSystem fs;
	/**
	 * ���� ���丮��(���丮)
	 */
	private DirectoryEntry currentStorage;

	/**
	 * ������. MS Compound ������ ����, ���� ���丮���� ������ root ���丮���� �����Ѵ�.
	 * 
	 * @param file
	 *            ���� ����
	 * @throws IOException
	 *             ���� ����
	 */
	public CompoundFileReader(File file) throws IOException {
		fs = new POIFSFileSystem(file);
		currentStorage = fs.getRoot();
	}

	/**
	 * ���� ���丮��(���丮)�� ���Ե� �׸�(���丮���� ��Ʈ��)���� �̸��� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���丮��(���丮)�� ���Ե� �׸�(���丮���� ��Ʈ��)���� �̸��� ����Ʈ
	 */
	public Set<String> listChildNames() {
		return currentStorage.getEntryNames();
	}

	/**
	 * ���� ���丮��(���丮)�� �̸��� name�� ���丮��(���丮)�� �ִ��� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param name
	 *            ã�� ���丮�� �̸�
	 * @return ���� ���丮��(���丮)�� �̸��� name�� ���丮���� �ִ��� ����
	 * @throws FileNotFoundException
	 */
	public boolean isChildStorage(String name) throws FileNotFoundException {
		return (currentStorage.hasEntry(name) == true)
				&& (currentStorage.getEntry(name).isDirectoryEntry());
	}

	/**
	 * ���� ���丮��(���丮)�� �̸��� name�� ��Ʈ��(����)�� �ִ��� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param name
	 *            ã�� ��Ʈ�� �̸�
	 * @return ���� ���丮��(���丮)�� �̸��� name�� ��Ʈ��(����)�� �ִ��� ����
	 * @throws FileNotFoundException
	 */
	public boolean isChildStream(String name) throws FileNotFoundException {
		return (currentStorage.hasEntry(name) == true)
				&& (currentStorage.getEntry(name).isDocumentEntry());
	}

	/**
	 * �̸��� name�� ���丮��(���丮)�� �̵��Ѵ�.
	 * 
	 * @param name
	 *            �̵��� ���丮�� �̸�
	 * @throws Exception
	 */
	public void moveChildStorage(String name) throws Exception {
		Entry e = currentStorage.getEntry(name);
		if (e != null && e.isDirectoryEntry()) {
			currentStorage = (DirectoryEntry) e;
		} else {
			throw new Exception("this is not storage.");
		}
	}

	/**
	 * �θ� ���丮��(���丮)�� �̵��Ѵ�.
	 */
	public void moveParentStorage() {
		if (currentStorage != fs.getRoot()) {
			currentStorage = currentStorage.getParent();
		}
	}

	/**
	 * �̸��� name�� ��Ʈ���� ���� �� �ִ� ��Ʈ�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @param name
	 *            ã�� ��Ʈ�� �̸�
	 * @param compress
	 *            ���� ����(�ѱۿ��� ����)
	 * @param fileVersion
	 *            ���� ����
	 * @return �̸��� name�� ��Ʈ���� ���� �� �ִ� ��Ʈ�� ���� ��ü
	 * @throws Exception
	 */
	public StreamReader getChildStreamReader(String name, boolean compress,
			FileVersion fileVersion) throws Exception {
		Entry e = currentStorage.getEntry(name);
		if (e != null && e.isDocumentEntry()) {
			if (compress == true) {
				return new StreamReaderForCompress((DocumentEntry) e,
						fileVersion);
			} else {
				return new StreamReaderForNormal((DocumentEntry) e, fileVersion);
			}
		} else {
			throw new Exception("this is not stream.");
		}
	}

	/**
	 * ���� ������ MS Compound ������ �ݴ´�.
	 * 
	 * @throws IOException
	 */
	public void close() throws IOException {
		fs.close();
	}
}
