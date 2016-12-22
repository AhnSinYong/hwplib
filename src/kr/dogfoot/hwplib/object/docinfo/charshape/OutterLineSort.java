package kr.dogfoot.hwplib.object.docinfo.charshape;

/**
 * �ܰ��� ����
 * 
 * @author neolord
 */
public enum OutterLineSort {
	/**
	 * ����
	 */
	None((byte) 0),
	/**
	 * �Ǽ�
	 */
	Solid((byte) 1),
	/**
	 * ����
	 */
	Dot((byte) 2),
	/**
	 * ���� �Ǽ�(�β��� ��)
	 */
	BoldSolid((byte) 3),
	/**
	 * �⼱(�� ����)
	 */
	Dash((byte) 4),
	/**
	 * �����⼱ (-.-.-.-.)
	 */
	DashDot((byte) 5),
	/**
	 * �����⼱ (-..-..-..)
	 */
	DashDotDot((byte) 6);

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
    private OutterLineSort(byte value) {
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
    public static OutterLineSort valueOf(byte value) {
        for (OutterLineSort ols : values()) {
            if (ols.value == value) {
                return ols;
            }
        }
        return None;
    }
}
