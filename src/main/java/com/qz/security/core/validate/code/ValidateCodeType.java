/**
 * 
 */
package com.qz.security.core.validate.code;
import com.qz.security.core.properties.SecurityConstants;

/**
 * @author yb
 *
 */
public enum ValidateCodeType {
	
	/**
	 * ������֤��
	 */
	SMS {
		@Override
		public String getParamNameOnValidate() {
			return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_SMS;
		}
	},
	/**
	 * ͼƬ��֤��
	 */
	IMAGE {
		@Override
		public String getParamNameOnValidate() {
			return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_IMAGE;
		}
	};

	/**
	 * У��ʱ�������л�ȡ�Ĳ���������
	 * @return
	 */
	public abstract String getParamNameOnValidate();

}
