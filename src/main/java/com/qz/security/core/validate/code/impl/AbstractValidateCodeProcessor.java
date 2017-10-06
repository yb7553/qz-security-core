/**
 * 
 */
package com.qz.security.core.validate.code.impl;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;

import com.qz.security.core.validate.code.ValidateCode;
import com.qz.security.core.validate.code.ValidateCodeException;
import com.qz.security.core.validate.code.ValidateCodeGenerator;
import com.qz.security.core.validate.code.ValidateCodeProcessor;
import com.qz.security.core.validate.code.ValidateCodeRepository;
import com.qz.security.core.validate.code.ValidateCodeType;

/**
 * @author yb
 *
 */
public abstract class AbstractValidateCodeProcessor<C extends ValidateCode> implements ValidateCodeProcessor {

	/**
	 * �ռ�ϵͳ�����е� {@link ValidateCodeGenerator} �ӿڵ�ʵ�֡�
	 */
	@Autowired
	private Map<String, ValidateCodeGenerator> validateCodeGenerators;
	
	@Autowired
	private ValidateCodeRepository validateCodeRepository;
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imooc.security.core.validate.code.ValidateCodeProcessor#create(org.
	 * springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public void create(ServletWebRequest request) throws Exception {
		C validateCode = generate(request);
		save(request, validateCode);
		send(request, validateCode);
	}

	/**
	 * ����У����
	 * 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private C generate(ServletWebRequest request) {
		String type = getValidateCodeType(request).toString().toLowerCase();
		String generatorName = type + ValidateCodeGenerator.class.getSimpleName();
		ValidateCodeGenerator validateCodeGenerator = validateCodeGenerators.get(generatorName);
		if (validateCodeGenerator == null) {
			throw new ValidateCodeException("��֤��������" + generatorName + "������");
		}
		return (C) validateCodeGenerator.generate(request);
	}

	/**
	 * ����У����
	 * 
	 * @param request
	 * @param validateCode
	 */
	private void save(ServletWebRequest request, C validateCode) {
		ValidateCode code = new ValidateCode(validateCode.getCode(), validateCode.getExpireTime());
		validateCodeRepository.save(request, code, getValidateCodeType(request));
	}

	/**
	 * ����У���룬������ʵ��
	 * 
	 * @param request
	 * @param validateCode
	 * @throws Exception
	 */
	protected abstract void send(ServletWebRequest request, C validateCode) throws Exception;

	/**
	 * ���������url��ȡУ���������
	 * 
	 * @param request
	 * @return
	 */
	private ValidateCodeType getValidateCodeType(ServletWebRequest request) {
		String type = StringUtils.substringBefore(getClass().getSimpleName(), "CodeProcessor");
		return ValidateCodeType.valueOf(type.toUpperCase());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void validate(ServletWebRequest request) {

		ValidateCodeType codeType = getValidateCodeType(request);

		C codeInSession = (C) validateCodeRepository.get(request, codeType);

		String codeInRequest;
		try {
			codeInRequest = ServletRequestUtils.getStringParameter(request.getRequest(),
					codeType.getParamNameOnValidate());
		} catch (ServletRequestBindingException e) {
			throw new ValidateCodeException("��ȡ��֤���ֵʧ��");
		}

		if (StringUtils.isBlank(codeInRequest)) {
			throw new ValidateCodeException(codeType + "��֤���ֵ����Ϊ��");
		}

		if (codeInSession == null) {
			throw new ValidateCodeException(codeType + "��֤�벻����");
		}

		if (codeInSession.isExpried()) {
			validateCodeRepository.remove(request, codeType);
			throw new ValidateCodeException(codeType + "��֤���ѹ���");
		}

		if (!StringUtils.equals(codeInSession.getCode(), codeInRequest)) {
			throw new ValidateCodeException(codeType + "��֤�벻ƥ��");
		}
		
		validateCodeRepository.remove(request, codeType);
		
	}

}