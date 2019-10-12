<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 合同更新</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>更新合同信息</h3>
	<form action="${pageContext.request.contextPath}/contract/update" method="post">
	<table class="form-table">
	<input type="hidden" name="c_id" value="${contract.c_id}" />
		
		<tr>
			<td>房屋ID</td>
			<td colspan="3" class="control">
				<input type="text" name="h_id" placeholder="房屋ID" value="${contract.h_id}">
			</td>
		</tr>
		<tr>
			<td>租客ID</td>
			<td colspan="3" class="control">
				<input type="text" name="l_id" placeholder="租客ID" value="${contract.l_id}">
			</td>
		</tr>
		<tr>
			<td>租赁时间</td>
			<td colspan="3" class="control">
				<input type="text" name="c_time" placeholder="租赁时间" value="${contract.c_starttime}">
			</td>
		</tr>
		<tr>
			<td>开始时间</td>
			<td colspan="3" class="control">
				<input type="text" name="c_starttime" placeholder="开始时间" value="${contract.c_starttime}">
			</td>
		</tr>
		<tr>
			<td>结束时间</td>
			<td colspan="3" class="control">
				<input type="text" name="c_endtime" placeholder="结束时间" value="${contract.c_endtime}">
			</td>
		</tr>
		<tr>
			<td>押金</td>
			<td colspan="3" class="control">
				<input type="text" name="c_rental" placeholder="押金" value="${contract.c_rental}">
			</td>
		</tr>
		  <tr>
			<td>租金</td>
			<td colspan="3" class="control">
				<input type="text" name="c_cash" placeholder="租金" value="${contract.c_cash}">
			</td>
		</tr>
		<tr>
			<td>租客名字</td>
			<td colspan="3" class="control">
				<input type="text" name="c_name" placeholder="租客名字" value="${contract.c_name}">
			</td>
		</tr>
		<tr>
			<td>合同状态</td>
			<td colspan="3" class="control">
				<input type="text" name="c_status" placeholder="合同状态" value="${contract.c_status}">
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