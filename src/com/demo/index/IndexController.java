package com.demo.index;

import com.demo.common.model.Form;
import com.jfinal.core.Controller;

/**
 * IndexController
 */
public class IndexController extends Controller {
	public void index() {
		render("index.jsp");
	}
	
	public void error() {
		render("error.jsp");
	}
	
	
	//上传方法
	public void updateForm(){
		boolean success= Form.dao.updateForm(getModel(Form.class));
		if(success){
			redirect("/");
		}else{
			redirect("/error");
		}
	}
}





