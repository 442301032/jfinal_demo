package com.demo.user.controller;


import com.demo.common.model.User;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.core.Controller;

public class LoginController extends Controller{

	@Clear
	public void index() {
		render("login.jsp");
	}

	/**
	 * 登陆方法
	 */
	@Clear
	//@Before(LoginValidator.class)
	public void login(){
		//判断用户名密码是否存在
        User user = User.dao.validatorUser(getModel(User.class));
        if (user != null) {
            setSessionAttr("user",user);
            this.redirect("/");
        } else {
            this.redirect("/login");
        }
	}
}
