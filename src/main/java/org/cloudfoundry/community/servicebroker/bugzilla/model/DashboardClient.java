package org.cloudfoundry.community.servicebroker.bugzilla.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonAutoDetect(getterVisibility = JsonAutoDetect.Visibility.NONE)
public class DashboardClient {

	@JsonSerialize
	@JsonProperty("id")
	private String id;
	
	@JsonSerialize
	@JsonProperty("secret")
	private String secret;
	
	@JsonSerialize
	@JsonProperty("redirect_uri")
	private String redirectUri;
	
	public DashboardClient(String id, String secret, String redirectUri) {
		this.id = id;
		this.secret = secret;
		this.redirectUri = redirectUri;
	}

	public String getId() {
		return id;
	}

	public String getSecret() {
		return secret;
	}

	public String getRedirectUri() {
		return redirectUri;
	}
	
}
