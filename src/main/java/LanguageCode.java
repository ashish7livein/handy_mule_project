

public enum LanguageCode {
	ENGLISH ("EN"),
	FRANCIS ("FR");
	
	String languageCode;
	private LanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	
}
