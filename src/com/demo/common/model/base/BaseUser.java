package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setUserId(java.lang.Integer userId) {
		set("user_id", userId);
	}

	public java.lang.Integer getUserId() {
		return get("user_id");
	}

	public void setUserName(java.lang.String userName) {
		set("user_name", userName);
	}

	public java.lang.String getUserName() {
		return get("user_name");
	}

	public void setUserPsw(java.lang.String userPsw) {
		set("user_psw", userPsw);
	}

	public java.lang.String getUserPsw() {
		return get("user_psw");
	}

	public void setUserSex(java.lang.String userSex) {
		set("user_sex", userSex);
	}

	public java.lang.String getUserSex() {
		return get("user_sex");
	}

	public void setUserPhone(java.lang.String userPhone) {
		set("user_phone", userPhone);
	}

	public java.lang.String getUserPhone() {
		return get("user_phone");
	}

	public void setUserLoginName(java.lang.String userLoginName) {
		set("user_login_name", userLoginName);
	}

	public java.lang.String getUserLoginName() {
		return get("user_login_name");
	}

}
