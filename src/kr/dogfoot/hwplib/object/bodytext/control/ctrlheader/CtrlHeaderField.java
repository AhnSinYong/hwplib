package kr.dogfoot.hwplib.object.bodytext.control.ctrlheader;

import kr.dogfoot.hwplib.object.bodytext.control.ControlType;
import kr.dogfoot.hwplib.object.bodytext.control.ctrlheader.field.FieldHeaderProperty;

/**
 * �ʵ� ��Ʈ�Ѹ� ���� ��Ʈ�� ��� ���ڵ�
 * 
 * @author neolord
 */
public class CtrlHeaderField extends CtrlHeader {
	/**
	 * �Ӽ�
	 */
	private FieldHeaderProperty property;
	/**
	 * ��Ÿ �Ӽ�
	 */
	private short etcProperty;
	/**
	 * command
	 */
	private String command;
	/**
	 * id(���� �� ���� ���̵�)
	 */
	private long instanceId;

	/**
	 * ������
	 */
	public CtrlHeaderField() {
		this(ControlType.FIELD_UNKNOWN.getCtrlId());
	}

	/**
	 * ������
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� ���̵�(�ʵ� ���̵�)
	 */
	public CtrlHeaderField(long ctrlId) {
		super(ctrlId);

		property = new FieldHeaderProperty();
	}

	/**
	 * ��Ʈ�� ���̵�(�ʵ� ���̵�)�� �����Ѵ�.
	 * 
	 * @param ctrlId
	 *            ��Ʈ�� ���̵�
	 */
	public void setCtrlId(long ctrlId) {
		this.ctrlId = ctrlId;
	}

	/**
	 * �ʵ� ��Ʈ���� �Ӽ� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return �ʵ� ��Ʈ���� �Ӽ� ��ü
	 */
	public FieldHeaderProperty getProperty() {
		return property;
	}

	/**
	 * ��Ÿ �Ӽ��� ��ȯ�Ѵ�.
	 * 
	 * @return ��Ÿ �Ӽ�
	 */
	public short getEtcProperty() {
		return etcProperty;
	}

	/**
	 * ��Ÿ �Ӽ��� �����Ѵ�.
	 * 
	 * @param etcProperty
	 *            ��Ÿ �Ӽ�
	 */
	public void setEtcProperty(short etcProperty) {
		this.etcProperty = etcProperty;
	}

	/**
	 * �ʵ� command�� ��ȯ�Ѵ�.
	 * 
	 * @return �ʵ� command
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * �ʵ� command�� �����Ѵ�.
	 * 
	 * @param command
	 *            �ʵ� command
	 */
	public void setCommand(String command) {
		this.command = command;
	}

	/**
	 * ���� �� ���� ���̵� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �� ���� ���̵�
	 */
	public long getInstanceId() {
		return instanceId;
	}

	/**
	 * ���� �� ���� ���̵� �����Ѵ�.
	 * 
	 * @param instanceId
	 *            ���� �� ���� ���̵�
	 */
	public void setInstanceId(long instanceId) {
		this.instanceId = instanceId;
	}
}
