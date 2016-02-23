package com.demo.user.controller;

import com.demo.common.model.User;
import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

/**
 * BlogValidator.
 */
public class LoginValidator extends Validator {
	
	protected void validate(Controller controller) {
		validateRequiredString("user.userName", "nameMsg", "请输入用户名！");
		validateRequiredString("user.userPsw", "pswMsg", "请输入密码！"); 
	}
	
	protected void handleError(Controller controller) {
		controller.keepModel(User.class);
		controller.render("/login");
	}
}
