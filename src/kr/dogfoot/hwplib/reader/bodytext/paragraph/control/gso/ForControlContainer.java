package kr.dogfoot.hwplib.reader.bodytext.paragraph.control.gso;

import kr.dogfoot.hwplib.object.bodytext.control.gso.ControlContainer;
import kr.dogfoot.hwplib.object.bodytext.control.gso.GsoControl;
import kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.ShapeComponentContainer;
import kr.dogfoot.hwplib.util.compoundFile.StreamReader;

/**
 * ���� ��Ʈ���� �б� ���� ��ü
 * 
 * @author neolord
 */
public class ForControlContainer {
	/**
	 * ���� ��Ʈ���� �д´�.
	 * 
	 * @param container
	 *            ���� ��Ʈ��
	 * @param sr
	 *            ��Ʈ�� ����
	 * @throws Exception
	 */
	public static void read(ControlContainer container, StreamReader sr)
			throws Exception {
		ShapeComponentContainer scc = (ShapeComponentContainer) container
				.getShapeComponent();
		int childCount = scc.getChildControlIdList().size();
		for (int i = 0; i < childCount; i++) {
			ForControlGso fgc = new ForControlGso();
			GsoControl gc = fgc.readInContainer(sr);
			container.addChildControl(gc);
		}
	}
}
