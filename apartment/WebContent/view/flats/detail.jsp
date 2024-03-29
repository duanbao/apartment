<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息详情查看</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/lib/font-awesome/css/font-awesome.css">
</head>
<body>
<div class="box">
	<h3>房屋信息详情</h3>
	<form action="${pageContext.request.contextPath}/house/detail" method="post">
		<table class="form-table">
			<tr>
				<td class="label">地区</td>
				<td class="detail">
					${House.h_area}
				</td>
			</tr>
			<tr>
				<td class="label">小区</td>
				<td colspan="3" class="detail">
					${House.h_estate}
				</td>
			</tr>
			<tr>
				<td class="label">单元号</td>
				<td colspan="3" class="detail">
					${House.h_unitNumber}
				</td>
			</tr>
			<tr>
				<td class="label">楼层</td>
				<td colspan="3" class="detail">
					${H_floor}
				</td>
			</tr>
			<tr>
				<td class="label">房间号</td>
				<td colspan="3" class="detail">
					${H_roomNo}
				</td>
			</tr>
			<tr>
				<td class="label">面积(平米)</td>
				<td colspan="3" class="detail">
					${House.h_acreage}
				</td>
			</tr>
			<tr>
				<td class="label">朝向</td>
				<td colspan="3" class="detail">
					${H_direction}
				</td>
			</tr>
			<tr>
				<td class="label">装修</td>
				<td colspan="3" class="detail">
					${House.h_fitment}
				</td>
			</tr>
			<tr>
				<td class="label">是否双气</td>
				<td colspan="3" class="detail">
					${House.h_isDoubleAir }
				</td>
			</tr>
			<tr>
				<td class="label">限住人数</td>
				<td colspan="3" class="detail">
					${House.h_limit}
				</td>
			</tr>
			<tr>
				<td class="label">配套设施</td>
				<td colspan="3" class="detail">
					${House.h_facility}
				</td>
			</tr>
			<tr>
				<td class="label">出租价格(元/月)</td>
				<td colspan="3" class="detail">
					${House.h_price}
				</td>
			</tr>
			<tr>
				<td class="label">出租状态</td>
				<td colspan="3" class="detail">
					${House.h_status}
				</td>
			</tr>
			<tr>
				<td class="label">房屋图片</td>
				<td colspan="3" class="detail">
					${House.h_img}
				</td>
			</tr>
			<tr>
				<td class="label">完整地址信息</td>
				<td colspan="3" class="detail">
					${House.h_address}
				</td>
			</tr>
			<tr>
				<td class="label">备注说明</td>
				<td colspan="3" class="detail">
				
				</td>
			</tr>
			<tr>
				<td class="label">添加时间</td>
				<td colspan="3" class="detail">
					${House.h_addtime}
				</td>
			</tr>
			<tr>
				<td class="label">更新时间</td>
				<td colspan="3" class="detail">
					${House.h_updateTime}
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