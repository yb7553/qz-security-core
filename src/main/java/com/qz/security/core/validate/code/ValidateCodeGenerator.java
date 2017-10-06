/**
 * 
 */
package com.qz.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author yb
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
