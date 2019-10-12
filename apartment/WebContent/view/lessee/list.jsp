<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 租客信息管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>租客信息管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/lessee/add">添加租客信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>租客ID</th>
			<th>租客名字</th>
			<th>手机号</th>
			<th>性别</th>
			<th>籍贯</th>
			<th>身份证号</th>
			<th>开始时间</th>
			
		</tr>
		<c:forEach items="${lessee1}" var="l">
		<tr>
			<td>${l.l_id}</td>
			<td>${l.l_name}</td>
			<td>${l.l_tel}</td>
			<td>${l.l_sex}</td>
			<td>${l.l_nativeplace}</td>
			<td>${l.l_idcard}</td>
			<td>${l.l_addtime}</td>
			<td>
				<a class="fa fa-info" title="详情" href="${pageContext.request.contextPath}/lessee/detail?l_id=${l.l_id}"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="<c:url value="/lessee/update?l_id=${l.l_id}"/>" ></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="<c:url value="/lessee/del?l_id=${l.l_id}"/>" onclick="confirmDelete(1)"></a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<div class="pager-info">
		<div>共有 1 条记录，第 1/1 页 </div>
		<div>
			<ul class="pagination">
				<li class="paginate_button previous disabled }">
				<a href="#">上一页</a>
				</li>
				<li class="paginate_button active"><a href="#">1</a></li>
				<li class="paginate_button next disabled">
				<a href="#">下一页</a>
				</li>
			</ul>
		</div>
	</div>
</div>
<script src="${pageContext.request.contextPath}/lib/jquery/jquery.js"></script>
<script>
function confirmDelete(id){
	if (confirm("确定要删除码？")) {
		alert('发送删除请求，刷新页面（不要异步）');
	}
	return false;
}
</script>
</body>
</html>