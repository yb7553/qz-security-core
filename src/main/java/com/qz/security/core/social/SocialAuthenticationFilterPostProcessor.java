/**
 * 
 */
package com.qz.security.core.social;

import org.springframework.social.security.SocialAuthenticationFilter;

/**
 * @author yb
 *
 */
public interface SocialAuthenticationFilterPostProcessor {
	
	void process(SocialAuthenticationFilter socialAuthenticationFilter);

}
