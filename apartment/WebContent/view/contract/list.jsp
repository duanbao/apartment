<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 租赁合同管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>租赁合同管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/contract/add">添加合同信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>合同ID</th>
			<th>房屋ID</th>
			<th>租客ID</th>
			<th>租赁时间</th>
			<th>开始时间</th>
			<th>结束时间</th>
			<th>押金</th>
			<th>租金</th>
			<th>租客名字</th>
			<th>合同状态</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${c1}" var="c">
		<tr>
			<td>${c.c_id}</td>
			<td>${c.h_id}</td>
			<td>${c.l_id}</td>
			<td>${c.c_time}</td>
			<td>${c.c_starttime}</td>
			<td>${c.c_endtime}</td>
			<td>${c.c_rental}</td>
			<td>${c.c_cash}</td>
			<td>${c.c_name}</td>
			<td>${c.c_status}</td>
			<td>
				<a class="fa fa-info" title="详情" href="<c:url value="/contract/detail?c_id=${c.c_id}"/>"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="<c:url value="/contract/update?c_id=${c.c_id}"/>" ></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="<c:url value="/contract/del?c_id=${c.c_id}"/>" onclick="confirmDelete(1)"></a>
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