package kr.dogfoot.hwplib.object.fileheader;

/**
 * ���� ������ ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class FileVersion {
	/**
	 * ���� ���� - MM
	 */
	private short mm;
	/**
	 * ���� ���� - nn
	 */
	private short nn;
	/**
	 * ���� ���� - PP
	 */
	private short pp;
	/**
	 * ���� ���� - rr
	 */
	private short rr;

	/**
	 * ������
	 */
	public FileVersion() {
	}

	/**
	 * ������ �����Ѵ�.
	 * 
	 * @param version
	 *            ����(unsigned 4 bytes)
	 */
	public void setVersion(long version) {
		mm = (short) ((version & 0xff000000) >> 24);
		nn = (short) ((version & 0xff0000) >> 16);
		pp = (short) ((version & 0xff00) >> 8);
		rr = (short) (version & 0xff);
	}

	/**
	 * ���� ���� - MM�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� - MM(0~255)
	 */
	public short getMM() {
		return mm;
	}

	/**
	 * ���� ���� - nn�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� - nn(0~255)
	 */
	public short getNN() {
		return nn;
	}

	/**
	 * ���� ���� - PP�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� - PP(0~255)
	 */
	public short getPP() {
		return pp;
	}

	/**
	 * ���� ���� - rr�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� - rr(0~255)
	 */
	public short getRR() {
		return rr;
	}

	/**
	 * ���� ������ �� ����(mm2,nn2,pp2,rr2)���� ���� �������� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @param mm2
	 *            �� ���� - MM
	 * @param nn2
	 *            �� ���� - nn
	 * @param pp2
	 *            �� ���� - PP
	 * @param rr2
	 *            �� ���� - rr
	 * @return ���� ������ �� ����(mm2,nn2,pp2,rr2)���� ���� �������� ����
	 */
	public boolean isOver(int mm2, int nn2, int pp2, int rr2) {
		if ((mm > mm2) || (mm == mm2 && nn > nn2)
				|| (mm == mm2 && nn == nn2 && pp > pp2)
				|| (mm == mm2 && nn == nn2 && pp == pp2 && rr > rr2)) {
			return true;
		}
		return false;
	}
}
