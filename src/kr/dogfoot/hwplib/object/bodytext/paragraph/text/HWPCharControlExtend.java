package kr.dogfoot.hwplib.object.bodytext.paragraph.text;

/**
 * Ȯ�� ��Ʈ�� Character
 * 
 * @author neolord
 */
public class HWPCharControlExtend extends HWPChar {
	/**
	 * ���� �ڵ�
	 */
	private int code;
	/**
	 * ��Ʈ�� ��ü�� Instance Id
	 */
	private String instanceId;

	/**
	 * ������
	 */
	public HWPCharControlExtend() {
	}

	@Override
	public HWPCharType getType() {
		return HWPCharType.ControlExtend;
	}

	/**
	 * ���� �ڵ带 ��ȯ�Ѵ�.
	 * 
	 * @return ���� �ڵ�
	 */
	public int getCode() {
		return code;
	}

	/**
	 * ���� �ڵ带 �����Ѵ�.
	 * 
	 * @param code
	 *            ���� �ڵ�
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * ��Ʈ�� ��ü�� Instance Id�� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ʈ�� ��ü�� Instance Id
	 */
	public String getInstanceId() {
		return instanceId;
	}

	/**
	 * ��Ʈ�� ��ü�� Instance Id�� �����Ѵ�.
	 * 
	 * @param instanceId
	 *            ��Ʈ�� ��ü�� Instance Id
	 */
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
}
