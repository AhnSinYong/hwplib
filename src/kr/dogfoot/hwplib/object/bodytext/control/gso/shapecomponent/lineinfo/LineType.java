package kr.dogfoot.hwplib.object.bodytext.control.gso.shapecomponent.lineinfo;

/**
 * �� ����
 * 
 * @author neolord
 */
public enum LineType {
	/**
	 * ����
	 */
	None((byte)0),
	/**
	 * �Ǽ�
	 */
	Solid((byte)1),	
	/**
	 * �ļ�(�⼱)
	 */
	Dash((byte)2),
	/**
	 * ����
	 */
	Dot((byte)3),
	/**
	 * �����⼱
	 */
	DashDot((byte)4),
	/**
	 * �����⼱
	 */
	DashDotDot((byte)5),
	/**
	 * ��  �ļ�
	 */
	LongDash((byte)6),
	/**
	 * ���� ����
	 */
	CircleDot((byte)7),
	/**
	 * ���߼�
	 */
	Double((byte)8),
	/**
	 * ���� ���� ���߼�
	 */
	ThinBold((byte)9),
	/**
	 * ���� ���� ���߼�
	 */
	BoldThin((byte)10),
	/**
	 * ���� ���� ���� ���߼�
	 */
	ThinBoldThin((byte)11);
	
	/**
	 * ���Ͽ� ����Ǵ� ������
	 */
    private byte value;
    
	/**
	 * ������
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 */
    private LineType(byte value) {
        this.value = value;
    }
    
	/**
	 * ���Ͽ� ����Ǵ� �������� ��ȯ�Ѵ�.
	 * 
	 * @return ���Ͽ� ����Ǵ� ������
	 */
	public byte getValue() {
		return value;
    }
    
	/**
	 * ���Ͽ� ����Ǵ� �������� �ش�Ǵ� enum ���� ��ȯ�Ѵ�.
	 * 
	 * @param value
	 *            ���Ͽ� ����Ǵ� ������
	 * @return enum ��
	 */
    public static LineType valueOf(byte value) {
        for (LineType bt2 : values()) {
            if (bt2.value == value) {
                return bt2;
            }
        }
        return None;
    }
}
