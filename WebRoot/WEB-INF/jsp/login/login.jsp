<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登陆</title>
</head>
<body>
	<form action="/jfinal_demo/login/login"  method="post">
		<div lable="username">用户名：</div><input type="text" id="username" name="user.user_name"/>
		<div lable="password">密码：</div><input type="password" id="password" name="user.user_psw">
		<input type="submit" value="提交">
	</form>
</body>
</html>