<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 后勤人员信息添加</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>添加后勤人员信息</h3>
	<form action="${pageContext.request.contextPath}/logistics/add" method="post">
	<table class="form-table">
		<tr>
			<td>后勤人员名字</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_name" placeholder="填写名字">
			</td>
		</tr>
		<tr>
			<td>身份证</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_idcard" placeholder="身份证">
			</td>
		</tr>
		<tr>
			<td>手机号</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_tel" placeholder="手机号">
			</td>
		</tr>
		<tr>
			<td>时间</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_time" placeholder="时间">
			</td>
		</tr>
		
	</table>
	<div class="buttons">
		<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
		<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
	</div>
	</form>
</div>
</body>
</html>