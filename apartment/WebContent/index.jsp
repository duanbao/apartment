<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 登录页面</title>
	<link rel="stylesheet" href="css/index.css">
</head>
<body>
<div class="login">
	<img src="image/logo.png" alt="智游">
	<p>XX系统</p>
	<form action="${pageContext.request.contextPath}/user/login" method="post">
	<div>
		<input type="text" id="username" name="username" value="" placeholder="请输入用户名">
	</div>
	<div>
		<input type="password" id="password" name="password" value="" placeholder="请输入密码">
	</div>
	<div>
		<p class="error-message">${msg}</p>
		<input type="submit" value="登录">
	</div>
	</form>
</div>
<script>
	if (window.top !== window) {
		window.top.location.reload();
	}
</script>
</body>
</html>