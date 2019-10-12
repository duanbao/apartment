<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 后勤人员信息更新</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>更新后勤信息</h3>
	<form action="${pageContext.request.contextPath}/logistics/update" method="post">
	<table class="form-table">
	<input type="hidden" name="lo_id" value="${log.lo_id}" />
		<tr>
			<td>后勤人员名字</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_name" placeholder="填写名字" value="${log.lo_name}">
			</td>
		</tr>
		<tr>
			<td>身份证号</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_idcard" placeholder="身份证号" value="${log.lo_idcard}">
			</td>
		</tr>
		<tr>
			<td>手机号码</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_tel" placeholder="手机号码" value="${log.lo_tel}">
			</td>
		</tr>
		<tr>
			<td>时间</td>
			<td colspan="3" class="control">
				<input type="text" name="lo_time" placeholder="时间" value="${log.lo_time}">
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