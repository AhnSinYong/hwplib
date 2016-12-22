package kr.dogfoot.hwplib.object.docinfo;

import java.util.ArrayList;

import kr.dogfoot.hwplib.object.docinfo.tabdef.TabDefProperty;
import kr.dogfoot.hwplib.object.docinfo.tabdef.TabInfo;

/**
 * �� ���ǿ� ����  ���ڵ�
 * 
 * @author neolord
 */
public class TabDef {
	/**
	 * �Ӽ�
	 */
	private TabDefProperty property;
	/**
	 * �� ���� ����Ʈ
	 */
	private ArrayList<TabInfo> tabInfoList;

	/**
	 * ������
	 */
	public TabDef() {
		property = new TabDefProperty();
		tabInfoList = new ArrayList<TabInfo>();
	}

	/**
	 * �� ������ �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ������ �Ӽ� ��ü
	 */
	public TabDefProperty getProperty() {
		return property;
	}

	/**
	 * ���ο� �� ������ �����ϰ� ����Ʈ�� �߰��Ѵ�.
	 * 
	 * @return ���� ������ �� ����
	 */
	public TabInfo addNewTabInfo() {
		TabInfo ti = new TabInfo();
		tabInfoList.add(ti);
		return ti;
	}

	/**
	 * �� ���� ����Ʈ�� ��ȯ�Ѵ�.
	 * 
	 * @return �� ���� ����Ʈ
	 */
	public ArrayList<TabInfo> getTabInfoList() {
		return tabInfoList;
	}
}
