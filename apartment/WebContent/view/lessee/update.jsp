<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 租客信息更新</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>更新租客信息</h3>
	<form action="${pageContext.request.contextPath}/lessee/update" method="post">
	<table class="form-table">
	<input type="hidden" name="l_id" value="${lessee1.l_id}" />
		<tr>
			<td>租客名字</td>
			<td colspan="3" class="control">
				<input type="text" name="l_name" placeholder="填写名字" value="${lessee1.l_name}">
			</td>
		</tr>
		<tr>
			<td>手机号码</td>
			<td colspan="3" class="control">
				<input type="text" name="l_tel" placeholder="手机号码" value="${lessee1.l_tel}">
			</td>
		</tr>
		<tr>
			<td>性别</td>
			<td colspan="3" class="control">
				<input type="text" name="l_sex" placeholder="性别" value="${lessee1.l_sex}">
			</td>
		</tr>
		<tr>
			<td>籍贯</td>
			<td colspan="3" class="control">
				<input type="text" name="l_nativeplace" placeholder="籍贯" value="${lessee1.l_nativeplace}">
			</td>
		</tr>
		<tr>
			<td>身份证号</td>
			<td colspan="3" class="control">
				<input type="text" name="l_idcard" placeholder="身份证号" value="${lessee1.l_idcard}">
			</td>
		</tr>
		<tr>
			<td>加入时间</td>
			<td colspan="3" class="control">
				<input type="text" name="l_addtime" placeholder="加入时间" value="${lessee1.l_addtime}">
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