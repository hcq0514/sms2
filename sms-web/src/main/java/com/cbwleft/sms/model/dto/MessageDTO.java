package com.cbwleft.sms.model.dto;

import java.util.Map;

import com.cbwleft.sms.model.validation.Mobile;
import com.cbwleft.sms.model.validation.TemplateId;


public class MessageDTO {

	/**
	 * 手机号码
	 */
	@Mobile
	private String mobile;

	/**
	 * 模板id
	 */
	@TemplateId
	private String templateId;

	/**
	 * 短信参数，不超过200个字符
	 */
	private Map<String, Object> params;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	@Override
	public String toString() {
		return "MessageDTO [mobile=" + mobile + ", templateId=" + templateId + ", params=" + params + "]";
	}

}
