<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 房屋信息管理</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>房屋信息管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="${pageContext.request.contextPath}/house/add">添加房屋信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>房屋ID</th>
			<th>所属地区</th>
			<th>所属小区</th>
			<th>单元号</th>
			<th>所属楼层</th>
			<th>房间号</th>
			<th>面积</th>
			<th>朝向</th>
			<th>装修</th>
			<th>是否双气</th>
			<th>限住人数</th>
			<th>配套设施</th>
			<th>出租价格(元)</th>
			<th>出租状态</th>
			<th>房屋图片</th>
			<th>完整地址信息</th>
			<th>加入时间</th>
			<th>结束时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${house1}" var="h">
		<tr>
			<td>${h.h_id}</td>
			<td>${h.h_area}</td>
			<td>${h.h_estate}</td>
			<td>${h.h_unitNumber}</td>
			<td>${h.h_floor}</td>
			<td>${h.h_roomNo}</td>
			<td>${h.h_acreage}</td>
			<td>${h.h_direction}</td>
			<td>${h.h_fitment}</td>
			<td>${h.h_isDoubleAir}</td>
			<td>${h.h_limit}</td>
			<td>${h.h_facility}</td>
			<td>${h.h_price}</td>
			<td>${h.h_status}</td>
			<td>${h.h_img}</td>
			<td>${h.h_address}</td>
			<td>${h.h_addtime}</td>
			<td>${h.h_updateTime}</td>
			<td>
				<a class="fa fa-info" title="详情" href="${pageContext.request.contextPath}/house/detail?h_id=${h.h_id}"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="<c:url value="/house/update?h_id=${h.h_id}"/>" ></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="<c:url value="/house/del?h_id=${h.h_id}"/>" onclick="confirmDelete(1)"></a>
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