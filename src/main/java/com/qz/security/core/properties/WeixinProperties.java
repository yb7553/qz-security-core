/**
 * 
 */
package com.qz.security.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * @author yb
 *
 */
public class WeixinProperties extends SocialProperties {
	
	/**
	 * ������id���������������������¼��url��Ĭ���� weixin��
	 */
	private String providerId = "weixin";

	/**
	 * @return the providerId
	 */
	public String getProviderId() {
		return providerId;
	}

	/**
	 * @param providerId the providerId to set
	 */
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	

}