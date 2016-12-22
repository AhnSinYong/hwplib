package kr.dogfoot.hwplib.object.bodytext.paragraph.charshape;

import java.util.ArrayList;

/**
 * ������ ���� ��翡 ���� ���ڵ�. ex) (��ġ:0, ���ڸ��:1), (��ġ:5, ���ڸ��:3), (��ġ:9, ���ڸ��:2) �̷� ���,
 * 1�� ���ڸ������ �����ؼ�, 5��° ���ں��� 3������ ���ڸ������ ����Ǵٰ�, 9��° ���� ���� ������ 2�� ���ڸ������ ����ȴ�.
 * 
 * @author neolord
 */
public class ParaCharShape {
	/**
	 * ��ġ�� ���� ����� �ֿ� ���� ����Ʈ
	 */
	private ArrayList<CharPositonShapeIdPair> positionShapeIdPairList;

	/**
	 * ������
	 */
	public ParaCharShape() {
		positionShapeIdPairList = new ArrayList<CharPositonShapeIdPair>();
	}

	/**
	 * 
	 * position ��ġ�� charShapeId ���� ����� �ֿ� ���� ��ü�� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param position
	 *            ���ڸ���� charShapeId�� �ٲ����� ������ ��ġ
	 * @param charShapeId
	 *            ������ ���ڸ�� id
	 */
	public void addParaCharShape(long position, long charShapeId) {
		CharPositonShapeIdPair cpsp = new CharPositonShapeIdPair(position,
				charShapeId);
		positionShapeIdPairList.add(cpsp);
	}

	/**
	 * ��ġ�� ���� ����� �ֿ� ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��ġ�� ���� ����� �ֿ� ���� ����Ʈ
	 */
	public ArrayList<CharPositonShapeIdPair> getPositonShapeIdPairList() {
		return positionShapeIdPairList;
	}
}
