<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 租客信息详情查看</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>租客信息详情</h3>
	<form action="${pageContext.request.contextPath}/lessee/detail" method="post">
		<table class="form-table">
			<tr>
				<td class="label">名字</td>
				<td class="detail">
					${lessee1.l_name}
				</td>
			</tr>
			<tr>
				<td class="label">手机号</td>
				<td colspan="3" class="detail">
					${lessee1.l_tel}
				</td>
			</tr>
			<tr>
				<td class="label">性别</td>
				<td colspan="3" class="detail">
					${lessee1.l_sex}
				</td>
			</tr>
			<tr>
				<td class="label">籍贯</td>
				<td colspan="3" class="detail">
					${lessee1.l_nativeplace}
				</td>
			</tr>
			<tr>
				<td class="label">身份证号</td>
				<td colspan="3" class="detail">
					${lessee1.l_idcard}
				</td>
			</tr>
			<tr>
				<td class="label">加入时间</td>
				<td colspan="3" class="detail">
					${lessee1.l_addtime}
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