<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>列表页面</title>
<link rel="stylesheet" href="css/index2.css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function fenye(pageNum){
	var i = '${page.pages}'
	if(pageNum>i){
		pageNum = i;
	}else if(pageNum<1){
		pageNum = 1;
	}
	$("[name=pageNum]").val(pageNum);
	$("form:eq(0)").submit();
}
function ck(sid){
	location = "ck?sid="+sid;
}
function sc(){
	$("form:eq(1)").submit();
}
</script>
</head>
<body>
<form action="list" method="post">
	<input type="hidden" name="pageNum">
	店铺名称:<input name="mh" value="${map.mh!''}">
	<input type="submit" value="查询">
	<input type="button" value="添加" onclick="location='toadd'">
	<input type="button" value="批量删除" onclick="sc()">
</form>
<form action="delete" method="post">
	<table>
		<tr>
			<td></td>
			<td>编号</td>
			<td>店铺名称</td>
			<td>创建日期</td>
			<td>销售商品</td>
			<td>操作</td>
		</tr>
		<#list list as l>
			<tr>
				<td><input type="checkbox" value="${l.sid}" name="sid"> </td>
				<td>${l.sid}</td>
				<td>${l.sname}</td>
				<td>${l.sdate}</td>
				<td>${l.ggname}</td>
				<td>
					<input type="button" value="详情" onclick="ck(${l.sid})">
				</td>
			</tr>
		</#list>
		<tr>
			<td colspan="10">
				${page.pageNum}/${page.pages}
				<input type="button" value="首页" onclick="fenye('1')">
				<input type="button" value="上一页" onclick="fenye(${page.pageNum-1})">
				<input type="button" value="下一页" onclick="fenye(${page.pageNum+1})">
				<input type="button" value="尾页" onclick="fenye(${page.pages})">
			
			</td>
		</tr>
	</table>
</form>
</body>
</html>