/**
 * 
 */
package com.qz.security.core.properties;

/**
 * @author yb
 *
 */
public interface SecurityConstants {
	
	/**
	 * Ĭ�ϵĴ�����֤���urlǰ׺
	 */
	public static final String DEFAULT_VALIDATE_CODE_URL_PREFIX = "/code";
	/**
	 * ��������Ҫ�����֤ʱ��Ĭ����ת��url
	 * 
	 * @see SecurityController
	 */
	public static final String DEFAULT_UNAUTHENTICATION_URL = "/authentication/require";
	/**
	 * Ĭ�ϵ��û��������¼������url
	 */
	public static final String DEFAULT_LOGIN_PROCESSING_URL_FORM = "/authentication/form";
	/**
	 * Ĭ�ϵ��ֻ���֤���¼������url
	 */
	public static final String DEFAULT_LOGIN_PROCESSING_URL_MOBILE = "/authentication/mobile";
	
	/**
	 * Ĭ�ϵ�OPENID��¼������url
	 */
	public static final String DEFAULT_LOGIN_PROCESSING_URL_OPENID = "/authentication/openid";
	/**
	 * Ĭ�ϵ�¼ҳ��
	 * 
	 * @see SecurityController
	 */
	public static final String DEFAULT_LOGIN_PAGE_URL = "/qz-signIn.html";
	/**
	 * ��֤ͼƬ��֤��ʱ��http������Ĭ�ϵ�Я��ͼƬ��֤����Ϣ�Ĳ���������
	 */
	public static final String DEFAULT_PARAMETER_NAME_CODE_IMAGE = "imageCode";
	/**
	 * ��֤������֤��ʱ��http������Ĭ�ϵ�Я��������֤����Ϣ�Ĳ���������
	 */
	public static final String DEFAULT_PARAMETER_NAME_CODE_SMS = "smsCode";
	/**
	 * ���Ͷ�����֤�� �� ��֤������֤��ʱ�������ֻ��ŵĲ���������
	 */
	public static final String DEFAULT_PARAMETER_NAME_MOBILE = "mobile";
	/**
	 * openid������
	 */
	public static final String DEFAULT_PARAMETER_NAME_OPENID = "openId";
	/**
	 * providerId������
	 */
	public static final String DEFAULT_PARAMETER_NAME_PROVIDERID = "providerId";
	/**
	 * sessionʧЧĬ�ϵ���ת��ַ
	 */
	public static final String DEFAULT_SESSION_INVALID_URL = "/qz-session-invalid.html";

}
