<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>智游系统 - 房屋信息更新</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>更新房屋信息</h3>
	<form action="${pageContext.request.contextPath}/house/update" method="post">
	<table class="form-table">
	<input type="hidden" name="h_id" value="${house.h_id}" />
		<tr>
			<td>地区</td>
			<td colspan="3" class="control">
				<input type="text" name="h_area" placeholder="填写地区" value="${house.h_area}">
			</td>
		</tr>
		<tr>
			<td>小区名字</td>
			<td colspan="3" class="control">
				<input type="text" name="h_estate" placeholder="小区名字" value="${house.h_estate}">
			</td>
		</tr>
		<tr>
			<td>单元号</td>
			<td colspan="3" class="control">
				<input type="text" name="h_unitNumber" placeholder="单元号" value="${house.h_unitNumber}">
			</td>
		</tr>
		<tr>
			<td>楼层</td>
			<td colspan="3" class="control">
				<input type="text" name="h_floor" placeholder="楼层" value="${house.h_floor}">
			</td>
		</tr>
		<tr>
			<td>房间号</td>
			<td colspan="3" class="control">
				<input type="text" name="h_roomNo" placeholder="房间号" value="${house.h_roomNo}">
			</td>
		</tr>
		<tr>
			<td>面积（平米）</td>
			<td colspan="3" class="control">
				<input type="text" name="h_acreage" placeholder="面积" value="${house.h_acreage}">
			</td>
		</tr>
		<tr>
			<td>朝向</td>
			<td colspan="3" class="control">
				<input type="text" name="h_direction" placeholder="朝向" value="${house.h_direction}">
			</td>
		</tr>
		  <tr>
			<td>装修</td>
			<td colspan="3" class="control">
				<input type="text" name="h_fitment" placeholder="装修" value="${house.h_fitment}">
			</td>
		</tr>
		<tr>
			<td>是否双气</td>
			<td colspan="3" class="control">
				<input type="text" name="h_isDoubleAir" placeholder="是否双气" value="${house.h_isDoubleAir}">
			</td>
		</tr>
		<tr>
			<td>限住人数</td>
			<td colspan="3" class="control">
				<input type="text" name="h_limit" placeholder="限住人数" value="${house.h_limit}">
			</td>
		</tr>
		 <tr>
			<td>配套设施</td>
			<td colspan="3" class="control">
				<input type="text" name="h_facility" placeholder="配套设施" value="${house.h_facility}">
			</td>
		</tr> 
		<tr>
			<td>出租价格（元/月）</td>
			<td colspan="3" class="control">
				<input type="text" name="h_price" placeholder="出租价格" value="${house.h_price}">
			</td>
		</tr>
		 <tr>
			<td>出租状态</td>
			<td colspan="3" class="control">
				<select>
					<option>出租状态</option>
					<option>已出租</option>
					<option>未出租</option>
				</select>
			</td>
		</tr>
		<tr>
			<td>房屋图片</td>
			<td colspan="3" class="control">
				<input type="file" name="" placeholder="">
			</td>
		</tr>
		<tr>
			<td>完整地址信息</td>
			<td colspan="3" class="control">
				<input type="text" name="h_address" placeholder="完整地址信息" value="${house.h_address}">
			</td>
		</tr>
        <tr>
			<td>加入时间</td>
			<td colspan="3" class="control">
				<textarea class="p100" name="h_addtime" placeholder="加入时间" value="${house.h_addtime}"></textarea>
			</td>
		</tr> 
		<tr>
			<td>结束时间</td>
			<td colspan="3" class="control">
				<textarea class="p100" name="h_updateTime" placeholder="结束时间" value="${house.h_updateTime}"></textarea>
			</td>
		</tr> 
		<tr>
			<td>备注说明</td>
			<td colspan="3" class="control">
				<textarea class="p100" name="" placeholder="备注说明信息""></textarea>
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