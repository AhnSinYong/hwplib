package kr.dogfoot.hwplib.object.fileheader;

/**
 * ���� �ν� ������ ��Ÿ���� ��ü. HWP ���ϳ��� "FileHeader" stream�� ����ȴ�.
 * 
 * @author neolord
 */
public class FileHeader {
	/**
	 * ���� ����
	 */
	private FileVersion version;
	/**
	 * ���� ����
	 */
	private boolean compressed;
	/**
	 * ��ȣ ���� ����
	 */
	private boolean hasPassword;
	/**
	 * ������ ���� ����
	 */
	private boolean isDeploymentDocument;
	/**
	 * ��ũ��Ʈ ���� ����
	 */
	private boolean saveScript;
	/**
	 * DRM ���� ���� ����
	 */
	private boolean isDRMDocument;
	/**
	 * XMLTemplate ���丮�� ���� ����
	 */
	private boolean hasXMLTemplate;
	/**
	 * ���� �̷� ���� ���� ����
	 */
	private boolean hasDocumentHistory;
	/**
	 * ���� ���� ���� ���� ����
	 */
	private boolean hasSignature;
	/**
	 * ���� ������ ��ȣȭ ����
	 */
	private boolean encryptPublicCertification;
	/**
	 * ���� ���� ���� ���� ����
	 */
	private boolean savePrepareSignature;
	/**
	 * ���� ������ DRM ���� ���� ����
	 */
	private boolean isPublicCertificationDRMDocument;
	/**
	 * CCL ���� ����
	 */
	private boolean isCCLDocument;

	/**
	 * ������
	 */
	public FileHeader() {
		version = new FileVersion();
	}

	/**
	 * HWP ������ signature�� ��ȯ�Ѵ�. signature�� ������ HWP�������� ���θ� üũ�ϴµ� ����.
	 * 
	 * @return HWP ������ signature
	 */
	public static byte[] getFileSignature() {
		byte[] array = { 0x48, 0x57, 0x50, 0x20, 0x44, 0x6f, 0x63, 0x75, 0x6d,
				0x65, 0x6e, 0x74, 0x20, 0x46, 0x69, 0x6c, 0x65, 0x00, 0x00,
				0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
				0x00, 0x00, 0x00 };
		return array;
	}

	/**
	 * ���� ���� ��ü�� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ��ü
	 */
	public FileVersion getVersion() {
		return version;
	}

	/**
	 * ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ����
	 */
	public boolean isCompressed() {
		return compressed;
	}

	/**
	 * ���� ���θ� �����Ѵ�.
	 * 
	 * @param compressed
	 *            ���� ����
	 */
	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}

	/**
	 * ��ȣ ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ��ȣ ���� ����
	 */
	public boolean hasPassword() {
		return hasPassword;
	}

	/**
	 * ��ȣ ���� ���θ� �����Ѵ�.
	 * 
	 * @param hasPassword
	 *            ��ȣ ���� ����
	 */
	public void setHasPassword(boolean hasPassword) {
		this.hasPassword = hasPassword;
	}

	/**
	 * ������ ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ������ ���� ����
	 */
	public boolean isDeploymentDocument() {
		return isDeploymentDocument;
	}

	/**
	 * ������ ���� ���θ� �����Ѵ�.
	 * 
	 * @param isDeploymentDocument
	 *            ������ ���� ����
	 */
	public void setDeploymentDocument(boolean isDeploymentDocument) {
		this.isDeploymentDocument = isDeploymentDocument;
	}

	/**
	 * ��ũ��Ʈ ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ��ũ��Ʈ ���� ����
	 */
	public boolean isSaveScript() {
		return saveScript;
	}

	/**
	 * ��ũ��Ʈ ���� ���θ� �����Ѵ�.
	 * 
	 * @param saveScript
	 *            ��ũ��Ʈ ���� ����
	 */
	public void setSaveScript(boolean saveScript) {
		this.saveScript = saveScript;
	}

	/**
	 * DRM ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return DRM ���� ���� ����
	 */
	public boolean isDRMDocument() {
		return isDRMDocument;
	}

	/**
	 * DRM ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param isDRMDocument
	 *            DRM ���� ���� ����
	 */
	public void setDRMDocument(boolean isDRMDocument) {
		this.isDRMDocument = isDRMDocument;
	}

	/**
	 * XMLTemplate ���丮�� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return XMLTemplate ���丮�� ���� ����
	 */
	public boolean hasXMLTemplate() {
		return hasXMLTemplate;
	}

	/**
	 * XMLTemplate ���丮�� ���� ���θ� �����Ѵ�.
	 * 
	 * @param hasXMLTemplate
	 *            XMLTemplate ���丮�� ���� ����
	 */
	public void setHasXMLTemplate(boolean hasXMLTemplate) {
		this.hasXMLTemplate = hasXMLTemplate;
	}

	/**
	 * ���� �̷� ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� �̷� ���� ���� ����
	 */
	public boolean hasDocumentHistory() {
		return hasDocumentHistory;
	}

	/**
	 * ���� �̷� ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param hasDocumentHistory
	 *            ���� �̷� ���� ���� ����
	 */
	public void setHasDocumentHistory(boolean hasDocumentHistory) {
		this.hasDocumentHistory = hasDocumentHistory;
	}

	/**
	 * ���� ���� ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ���� ���� ����
	 */
	public boolean hasSignature() {
		return hasSignature;
	}

	/**
	 * ���� ���� ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param hasSignature
	 *            ���� ���� ���� ���� ����
	 */
	public void setHasSignature(boolean hasSignature) {
		this.hasSignature = hasSignature;
	}

	/**
	 * ���� ������ ��ȣȭ ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ ��ȣȭ ����
	 */
	public boolean isEncryptPublicCertification() {
		return encryptPublicCertification;
	}

	/**
	 * ���� ������ ��ȣȭ ���θ� �����Ѵ�.
	 * 
	 * @param encryptPublicCertification
	 *            ���� ������ ��ȣȭ ����
	 */
	public void setEncryptPublicCertification(boolean encryptPublicCertification) {
		this.encryptPublicCertification = encryptPublicCertification;
	}

	/**
	 * ���� ���� ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ���� ���� ���� ����
	 */
	public boolean isSavePrepareSignature() {
		return savePrepareSignature;
	}

	/**
	 * ���� ���� ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param savePrepareSignature
	 *            ���� ���� ���� ���� ����
	 */
	public void setSavePrepareSignature(boolean savePrepareSignature) {
		this.savePrepareSignature = savePrepareSignature;
	}

	/**
	 * ���� ������ DRM ���� ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return ���� ������ DRM ���� ���� ����
	 */
	public boolean isPublicCertificationDRMDocument() {
		return isPublicCertificationDRMDocument;
	}

	/**
	 * ���� ������ DRM ���� ���� ���θ� �����Ѵ�.
	 * 
	 * @param isPublicCertificationDRMDocument
	 *            ���� ������ DRM ���� ���� ����
	 */
	public void setPublicCertificationDRMDocument(
			boolean isPublicCertificationDRMDocument) {
		this.isPublicCertificationDRMDocument = isPublicCertificationDRMDocument;
	}

	/**
	 * CCL ���� ���θ� ��ȯ�Ѵ�.
	 * 
	 * @return CCL ���� ����
	 */
	public boolean isCCLDocument() {
		return isCCLDocument;
	}

	/**
	 * CCL ���� ���θ� �����Ѵ�.
	 * 
	 * @param isCCLDocument
	 *            CCL ���� ����
	 */
	public void setCCLDocument(boolean isCCLDocument) {
		this.isCCLDocument = isCCLDocument;
	}
}
