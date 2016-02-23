package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseForm<M extends BaseForm<M>> extends Model<M> implements IBean {

	public void setFormId(java.lang.Integer formId) {
		set("form_id", formId);
	}

	public java.lang.Integer getFormId() {
		return get("form_id");
	}

	public void setFormName(java.lang.String formName) {
		set("form_name", formName);
	}

	public java.lang.String getFormName() {
		return get("form_name");
	}

	public void setFormGender(java.lang.String formGender) {
		set("form_gender", formGender);
	}

	public java.lang.String getFormGender() {
		return get("form_gender");
	}

	public void setFormYear(java.lang.String formYear) {
		set("form_year", formYear);
	}

	public java.lang.String getFormYear() {
		return get("form_year");
	}

	public void setFormInfo(java.lang.String formInfo) {
		set("form_info", formInfo);
	}

	public java.lang.String getFormInfo() {
		return get("form_info");
	}

	public void setFormCity(java.lang.String formCity) {
		set("form_city", formCity);
	}

	public java.lang.String getFormCity() {
		return get("form_city");
	}

}
