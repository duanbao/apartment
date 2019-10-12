<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 合同信息详情查看</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>合同信息详情</h3>
	<form action="${pageContext.request.contextPath}/contract/detail" method="post">
		<table class="form-table">
			<tr>
				<td class="label">合同id</td>
				<td class="detail">
					${Contract.c_id}
				</td>
			</tr>
			<tr>
				<td class="label">房屋ID</td>
				<td colspan="3" class="detail">
					${Contract.h_id}
				</td>
			</tr>
			<tr>
				<td class="label">租客ID</td>
				<td colspan="3" class="detail">
					${Contract.l_id}
				</td>
			</tr>
			<tr>
				<td class="label">租赁时间</td>
				<td colspan="3" class="detail">
					${Contract.c_time}
				</td>
			</tr>
			<tr>
				<td class="label">开始时间</td>
				<td colspan="3" class="detail">
					${Contract.c_starttime}
				</td>
			</tr>
			<tr>
				<td class="label">结束时间</td>
				<td colspan="3" class="detail">
					${Contract.c_endtime}
				</td>
			</tr>
			<tr>
				<td class="label">押金</td>
				<td colspan="3" class="detail">
					${Contract.c_rental}
				</td>
			</tr>
			<tr>
				<td class="label">租金</td>
				<td colspan="3" class="detail">
					${Contract.c_cash}
				</td>
			</tr>
			<tr>
				<td class="label">名字</td>
				<td colspan="3" class="detail">
					${Contract.c_name}
				</td>
			</tr>
			<tr>
				<td class="label">合同状态</td>
				<td colspan="3" class="detail">
					${Contract.c_status}
				</td>
			</tr>
			
		</table>
		<div class="buttons">
			<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
		</div>
	</form>
</div>
</body>
</html>