package kr.dogfoot.hwplib.test;

import kr.dogfoot.hwplib.object.HWPFile;
import kr.dogfoot.hwplib.reader.HWPReader;

public class TestReadingHWPFile {
	public static void main(String[] args) throws Exception {
		test("sample_hwp\\test-blank.hwp");
		test("sample_hwp\\test-etc.hwp");
		test("sample_hwp\\test-ole.hwp");
		test("sample_hwp\\test-���ֹ���.hwp");
		test("sample_hwp\\test-�׸�.hwp");
		test("sample_hwp\\test-�ۻ���.hwp");
		test("sample_hwp\\test-�ۻ���-����.hwp");
		test("sample_hwp\\test-���ڰ�ħ.hwp");
		test("sample_hwp\\test-����.hwp");
		test("sample_hwp\\test-�Ӹ��۲�����.hwp");
		test("sample_hwp\\test-����.hwp");
		test("sample_hwp\\test-������.hwp");
		test("sample_hwp\\test-����ȣ����.hwp");
		test("sample_hwp\\test-��-�簢��.hwp");
		test("sample_hwp\\test-����.hwp");
		test("sample_hwp\\test-��������.hwp");
		test("sample_hwp\\test-�̹����߰�.hwp");
		test("sample_hwp\\test-��Ʈ.hwp");
		test("sample_hwp\\test-å����.hwp");
		test("sample_hwp\\test-����������.hwp");
		test("sample_hwp\\test-�ʵ�.hwp");
	}

	private static void test(String filename) throws Exception {
		HWPFile hwpfile = HWPReader.fromFile(filename);
		System.out.println(filename + "  �б� ���� !!");
	}
}
