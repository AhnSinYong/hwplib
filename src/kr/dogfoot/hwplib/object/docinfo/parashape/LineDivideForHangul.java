package kr.dogfoot.hwplib.object.docinfo.parashape;

/**
 * �� ���� ���� �ѱ� ����
 * 
 * @author neolord
 */
public enum LineDivideForHangul {
	/**
	 * ����
	 */
	ByWord((byte) 0),
	/**
	 * ����
	 */
	ByLetter((byte) 1);

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
	private LineDivideForHangul(byte value) {
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
	public static LineDivideForHangul valueOf(byte value) {
	    for (LineDivideForHangul ldh : values()) {
	        if (ldh.value == value) {
	            return ldh;
	        }
	    }
	    return ByWord;
	}		
}
