<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查看页面</title>
<link rel="stylesheet" href="css/index2.css">
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript">
</script>

</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
				<td>编号<input type="text" name="sid" value="${shop.sid}"></td>
			</tr>
			<tr>
				<td>店铺名称<input type="text" name="sname" value="${shop.sname}"></td>
			</tr>
			<tr>
				<td>创建日期<input type="text" name="sdate" onclick="WdatePicker()" value="${shop.sdate}"></td>
			</tr>
			<tr>
			
				<td>销售商品: 
				<#list list as l> 
					
					<input type="checkbox" name="gids"
					 value="${l.gid}">${l.gname} 
					
				</#list>

				</td>
			</tr>
			<tr>
				<td>
					<input type="button" value="关闭" onclick="location = 'list'">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>