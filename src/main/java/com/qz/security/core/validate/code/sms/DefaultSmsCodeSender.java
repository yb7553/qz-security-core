/**
 * 
 */
package com.qz.security.core.validate.code.sms;

/**
 * @author Administrator
 *
 */
public class DefaultSmsCodeSender implements SmsCodeSender {

	/* (non-Javadoc)
	 * @see com.imooc.security.core.validate.code.sms.SmsCodeSender#send(java.lang.String, java.lang.String)
	 */
	@Override
	public void send(String mobile, String code) {
		System.out.println("���ֻ�"+mobile+"���Ͷ�����֤��"+code);
	}

}
