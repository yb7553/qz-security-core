/**
 * 
 */
package com.qz.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author yb
 *
 */
public interface ValidateCodeRepository {

	/**
	 * ������֤��
	 * @param request
	 * @param code
	 * @param validateCodeType
	 */
	void save(ServletWebRequest request, ValidateCode code, ValidateCodeType validateCodeType);
	/**
	 * ��ȡ��֤��
	 * @param request
	 * @param validateCodeType
	 * @return
	 */
	ValidateCode get(ServletWebRequest request, ValidateCodeType validateCodeType);
	/**
	 * �Ƴ���֤��
	 * @param request
	 * @param codeType
	 */
	void remove(ServletWebRequest request, ValidateCodeType codeType);

}
