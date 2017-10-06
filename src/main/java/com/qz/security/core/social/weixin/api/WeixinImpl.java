/**
 * 
 */
package com.qz.security.core.social.weixin.api;

import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Weixin API����ģ�壬 scopeΪRequest��Spring bean, ���ݵ�ǰ�û���accessToken������
 * 
 * @author yb
 *
 */
public class WeixinImpl extends AbstractOAuth2ApiBinding implements Weixin {
	
	/**
	 * 
	 */
	private ObjectMapper objectMapper = new ObjectMapper();
	/**
	 * ��ȡ�û���Ϣ��url
	 */
	private static final String URL_GET_USER_INFO = "https://api.weixin.qq.com/sns/userinfo?openid=";
	
	/**
	 * @param accessToken
	 */
	public WeixinImpl(String accessToken) {
		super(accessToken, TokenStrategy.ACCESS_TOKEN_PARAMETER);
	}
	
	/**
	 * Ĭ��ע���StringHttpMessageConverter�ַ���ΪISO-8859-1����΢�ŷ��ص���UTF-8�ģ����Ը�����ԭ���ķ�����
	 */
	protected List<HttpMessageConverter<?>> getMessageConverters() {
		List<HttpMessageConverter<?>> messageConverters = super.getMessageConverters();
		messageConverters.remove(0);
		messageConverters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
		return messageConverters;
	}

	/**
	 * ��ȡ΢���û���Ϣ��
	 */
	@Override
	public WeixinUserInfo getUserInfo(String openId) {
		String url = URL_GET_USER_INFO + openId;
		String response = getRestTemplate().getForObject(url, String.class);
		if(StringUtils.contains(response, "errcode")) {
			return null;
		}
		WeixinUserInfo profile = null;
		try {
			profile = objectMapper.readValue(response, WeixinUserInfo.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return profile;
	}

}