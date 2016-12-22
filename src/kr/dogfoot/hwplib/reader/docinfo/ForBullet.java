package kr.dogfoot.hwplib.reader.docinfo;

import java.io.IOException;

import kr.dogfoot.hwplib.object.docinfo.Bullet;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * �۸Ӹ�ǥ ���ڵ带 �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForBullet {
	/**
	 * �۸Ӹ�ǥ ���ڵ带 �д´�.
	 * 
	 * @param b
	 *            �۸Ӹ�ǥ ���ڵ�
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	public static void read(Bullet b, StreamReader sr) throws IOException {
		ForNumbering.paragraphHeadInfo(b.getParagraphHeadInfo(), sr);
		b.setBulletChar(sr.readWChar());
		unknown9Bytes(sr);
	}

	/**
	 * �˷����� ���� 9 ����Ʈ�� ó���Ѵ�.
	 * 
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws IOException
	 */
	private static void unknown9Bytes(StreamReader sr) throws IOException {
		sr.skip(9);
	}
}
