/**
 * 
 */
package com.qz.security.core.properties;

public class SessionProperties {
	
	/**
	 * ͬһ���û���ϵͳ�е����session����Ĭ��1
	 */
	private int maximumSessions = 1;
	/**
	 * �ﵽ���sessionʱ�Ƿ���ֹ�µĵ�¼����Ĭ��Ϊfalse������ֹ���µĵ�¼�Ὣ�ϵĵ�¼ʧЧ��
	 */
	private boolean maxSessionsPreventsLogin;
	/**
	 * sessionʧЧʱ��ת�ĵ�ַ
	 */
	private String sessionInvalidUrl = SecurityConstants.DEFAULT_SESSION_INVALID_URL;

	public int getMaximumSessions() {
		return maximumSessions;
	}

	public void setMaximumSessions(int maximumSessions) {
		this.maximumSessions = maximumSessions;
	}

	public boolean isMaxSessionsPreventsLogin() {
		return maxSessionsPreventsLogin;
	}

	public void setMaxSessionsPreventsLogin(boolean maxSessionsPreventsLogin) {
		this.maxSessionsPreventsLogin = maxSessionsPreventsLogin;
	}

	public String getSessionInvalidUrl() {
		return sessionInvalidUrl;
	}

	public void setSessionInvalidUrl(String sessionInvalidUrl) {
		this.sessionInvalidUrl = sessionInvalidUrl;
	}
	
}
