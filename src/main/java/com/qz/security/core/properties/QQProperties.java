/**
 * 
 */
package com.qz.security.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author yb
 *
 */
public class QQProperties extends SocialProperties {
	
	private String providerId = "qq";

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	
}
