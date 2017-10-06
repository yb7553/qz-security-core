/**
 * 
 */
package com.qz.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * У���봦��������װ��ͬУ����Ĵ����߼�
 * 
 * @author yb
 *
 */
public interface ValidateCodeProcessor {

	/**
	 * ����У����
	 * 
	 * @param request
	 * @throws Exception
	 */
	void create(ServletWebRequest request) throws Exception;

	/**
	 * У����֤��
	 * 
	 * @param servletWebRequest
	 * @throws Exception
	 */
	void validate(ServletWebRequest servletWebRequest);

}
