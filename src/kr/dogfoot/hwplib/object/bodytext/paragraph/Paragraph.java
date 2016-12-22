package kr.dogfoot.hwplib.object.bodytext.paragraph;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.bodytext.control.Control;
import kr.dogfoot.hwplib.object.bodytext.control.FactoryForControl;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.CtrlHeaderGso;
import kr.dogfoot.hwplib.object.bodytext.control.gso.GsoControl;
import kr.dogfoot.hwplib.object.bodytext.paragraph.charshape.ParaCharShape;
import kr.dogfoot.hwplib.object.bodytext.paragraph.header.ParaHeader;
import kr.dogfoot.hwplib.object.bodytext.paragraph.lineseg.ParaLineSeg;
import kr.dogfoot.hwplib.object.bodytext.paragraph.rangetag.ParaRangeTag;
import kr.dogfoot.hwplib.object.bodytext.paragraph.text.ParaText;

/**
 * �ϳ��� ������ ��Ÿ���� ��ü
 * 
 * @author neolord
 */
public class Paragraph {
	/**
	 * ���
	 */
	private ParaHeader header;
	/**
	 * �ؽ�Ʈ
	 */
	private ParaText text;
	/**
	 * ���� ���
	 */
	private ParaCharShape charShape;
	/**
	 * ���̾ƿ�
	 */
	private ParaLineSeg lineSeg;
	/**
	 * ���� �±�
	 */
	private ParaRangeTag rangeTag;

	/**
	 * ��Ʈ�� ����Ʈ
	 */
	private ArrayList<Control> controlList;

	/**
	 * ������
	 */
	public Paragraph() {
		header = new ParaHeader();
	}

	/**
	 * ����� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ����� ���� ��ü
	 */
	public ParaHeader getHeader() {
		return header;
	}

	/**
	 * ���� �ؽ�Ʈ�� ���� ��ü�� �����Ѵ�.
	 */
	public void createText() {
		text = new ParaText();
	}

	/**
	 * ���� �ؽ�Ʈ�� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteText() {
		text = null;
	}

	/**
	 * ���� �ؽ�Ʈ�� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �ؽ�Ʈ�� ���� ��ü
	 */
	public ParaText getText() {
		return text;
	}

	/**
	 * ������ ���� ��翡 ���� ��ü�� �����Ѵ�.
	 */
	public void createCharShape() {
		charShape = new ParaCharShape();
	}

	/**
	 * ������ ���� ��翡 ���� ��ü�� �����Ѵ�.
	 */
	public void deleteCharShape() {
		charShape = null;
	}

	/**
	 * ������ ���� ��翡 ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ��翡 ���� ��ü
	 */
	public ParaCharShape getCharShape() {
		return charShape;
	}

	/**
	 * ������ ���̾ƿ��� ���� ��ü�� �����Ѵ�.
	 */
	public void createLineSeg() {
		lineSeg = new ParaLineSeg();
	}

	/**
	 * ������ ���̾ƿ��� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteLineSeg() {
		lineSeg = null;
	}

	/**
	 * ������ ���̾ƿ��� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���̾ƿ��� ���� ��ü
	 */
	public ParaLineSeg getLineSeg() {
		return lineSeg;
	}

	/**
	 * ������ ���� �±׿� ���� ��ü�� �����Ѵ�.
	 */
	public void createRangeTag() {
		rangeTag = new ParaRangeTag();
	}

	/**
	 * ������ ���� �±׿� ���� ��ü�� �����Ѵ�.
	 */
	public void deleteRangeTag() {
		rangeTag = null;
	}

	/**
	 * ������ ���� �±׿� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� �±׿� ���� ��ü
	 */
	public ParaRangeTag getRangeTag() {
		return rangeTag;
	}

	/**
	 * id�� �ش��ϴ� ���ο� ��Ʈ���� �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @param id
	 *            ��Ʈ�� id��
	 * @return ���� ������ ��Ʈ�� ��ü
	 */
	public Control addNewControl(long id) {
		if (controlList == null) {
			controlList = new ArrayList<Control>();
		}
		Control c = FactoryForControl.create(id);
		controlList.add(c);
		return c;
	}

	/**
	 * gsoid�� �ش��ϴ� ���ο� GSO ��Ʈ��(�׸��� ��ü)�� �����ϰ� ����Ʈ�� �߰��Ѵ�. ���� ������ GSO ��Ʈ���� �����
	 * header�� �����Ѵ�.
	 * 
	 * @param gsoId
	 *            GSO ��Ʈ��(�׸��� ��ü)�� id
	 * @param header
	 *            ��Ʈ�� ��� ��ü
	 * @return ���� ������ GSO ��Ʈ��
	 */
	public GsoControl addNewGsoControl(long gsoId, CtrlHeaderGso header) {
		if (controlList == null) {
			controlList = new ArrayList<Control>();
		}
		GsoControl gc = FactoryForControl.createGso(gsoId, header);
		controlList.add(gc);
		return gc;
	}

	/**
	 * ��Ʈ�� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ����Ʈ
	 */
	public ArrayList<Control> getControlList() {
		return controlList;
	}
}
