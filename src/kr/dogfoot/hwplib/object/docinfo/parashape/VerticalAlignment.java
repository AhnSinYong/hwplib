package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * ���� ����
 * 
 * @author neolord
 */
public enum VerticalAlignment {
	/**
	 * �۲ñ���
	 */
	ByFont((byte) 0),
	/**
	 * ����
	 */
	Top((byte) 1),
	/**
	 * ���
	 */
	Center((byte) 2),
	/**
	 * �Ʒ�
	 */
	Bottom((byte) 3);
	
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
    private VerticalAlignment(byte value) {
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
    public static VerticalAlignment valueOf(byte value) {
        for (VerticalAlignment va : values()) {
            if (va.value == value) {
                return va;
            }
        }
        return ByFont;
    }
}
