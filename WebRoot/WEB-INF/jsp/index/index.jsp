<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link
	href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${ pageContext.request.contextPath }/static/common/js/jquery-1.4.4.min.js"
	type="text/javascript"></script>
<script
	src="${ pageContext.request.contextPath }/static/bootstrap/js/bootstrap.min.js"></script>
<title>首页</title>
</head>
<body>
	<div style="width:200px;margin:0 auto;">
	<h2>填写信息</h2>
		<form action="/jfinal_demo/updateForm" method="post" class="form-group">
			<label for="name">姓名</label>
			<input type="text" class="form-control"  id="name" name="form.form_name">
			
			<label for="gender">性别</label>
			<div class="radio">
			  <label>
			    <input type="radio" name="form.form_gender" value="m" checked>男
			  </label>
			  <label>
			    <input type="radio" name="form.form_gender" value="f">女
			  </label>
			</div>
			
			<label for="year">年龄</label>
			<input type="text" class="form-control"  id="year" name="form.form_year">
			
			<label for="info">信息</label>
			<textarea class="form-control" id="info" name="form.form_info"></textarea>
			
			<input type="submit" class="btn btn-primary" value="提交">
		</form>
	</div>
</body>
</html>