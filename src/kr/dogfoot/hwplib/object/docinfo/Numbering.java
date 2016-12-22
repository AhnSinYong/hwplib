package kr.dogfoot.hwplib.object.docinfo;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.docinfo.numbering.LevelNumbering;

/**
 * ���� ��ȣ  ���ڵ�
 * 
 * @author neolord
 */
public class Numbering {
	/**
	 * ����(1��7)�� �ش��ϴ� ���� ��ȣ ���� ��ü�� ����Ʈ
	 */
	private ArrayList<LevelNumbering> levelNumberingList;
	/**
	 * ���� ��ȣ
	 */
	private int startNumber;
	/**
	 * ���غ� ���۹�ȣ (5.0.2.5 �̻�)
	 */
	private long[] startNumbersForLevel;

	/**
	 * ������
	 */
	public Numbering() {
		createLevelNumberings();
		startNumbersForLevel = new long[7];
	}

	/**
	 * ����(1��7)�� �ش��ϴ� ���� ��ȣ ���� ��ü�� �����Ѵ�.
	 */
	private void createLevelNumberings() {
		levelNumberingList = new ArrayList<LevelNumbering>();
		for (int i = 0; i < 7; i++) {
			LevelNumbering ln = new LevelNumbering();
			levelNumberingList.add(ln);
		}
	}

	/**
	 * level�� �ش��ϴ� ���� ��ȣ ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @param level
	 *            ���� ��ȣ ���� ��ü�� ����� �ϴ� ����(1~7)
	 * @return level�� �ش��ϴ� ���� ��ȣ ���� ��ü
	 * @throws Exception
	 *             (level <1 || level>7) �϶� �߻��Ѵ�.
	 */
	public LevelNumbering getLevelNumbering(int level) throws Exception {
		if (level >= 1 && level <= 7) {
			return levelNumberingList.get(level - 1);
		} else {
			throw new Exception("invalid level : " + level);
		}
	}

	/**
	 * ���� ��ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ��ȣ
	 */
	public int getStartNumber() {
		return startNumber;
	}

	/**
	 * ���� ��ȣ�� �����Ѵ�.
	 * 
	 * @param startNumber ���� ��ȣ
	 */
	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	/**
	 * ���غ� ���۹�ȣ�� ��ȯ�Ѵ�.
	 * 
	 * @param level
	 *            ���۹�ȣ�� ����� �ϴ� ����
	 * @return ���۹�ȣ
	 * @throws Exception
	 *             (level <1 || level>7) �϶� �߻��Ѵ�.
	 */
	public long getStartNumberForLevel(int level) throws Exception {
		if (level >= 1 && level <= 7) {
			return startNumbersForLevel[level - 1];
		} else {
			throw new Exception("invalid level : " + level);
		}
	}

	/**
	 * ���غ� ���۹�ȣ�� �������Ѵ�.
	 * 
	 * @param startNumber
	 *            ������ ���۹�ȣ
	 * @param level
	 *            ���۹�ȣ�� �����ϰ��� �ϴ� ����
	 * @throws Exception
	 *             (level <1 || level>7) �϶� �߻��Ѵ�.
	 */
	public void setStartNumberForLevel(long startNumber, int level)
			throws Exception {
		if (level >= 1 && level <= 7) {
			startNumbersForLevel[level - 1] = startNumber;
		} else {
			throw new Exception("invalid level : " + level);
		}
	}
}
