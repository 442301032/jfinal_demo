package com.demo.common.interceptor;

import com.demo.common.model.User;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * 登陆拦截器
 * 
 */
public class LoginInterceptor implements Interceptor {
	
	public void intercept(Invocation inv) {
		//System.out.println("登陆拦截器验证登陆信息。");
        //获取session中的userId
        User user = inv.getController().getSessionAttr("user");
        if (user != null) {
        	inv.invoke();
        }else{
            //登陆失败返回登陆页面
        	inv.getController().redirect("/login");
        }
	}
}
