package rest.assured.examples.dto;

public class LocationRequest {
	private String at;
	private String query;
	private String lang;
	
	public LocationRequest() {}
	
	public LocationRequest(String at, String query, String lang) {
		this.at = at;
		this.query = query;
		this.lang = lang;
	}

	public String getAt() {
		return at;
	}

	public void setAt(String at) {
		this.at = at;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
}
