<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加页面</title>
<link rel="stylesheet" href="css/index2.css">
<script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript">
function bc(){
	var sid = $("[name=sid]").val();
	$.post("selectShop",{sid:sid},function(i){
		if(i>0){
			alert("添加失败")
		}else{
			var param = $("form").serialize();
				$.post("add",param,function(j){
					if(j>0){
						alert("添加成功");
						location = "list";
				}
			},"json")
		}
	},"json")

	
}
</script>
</head>
<body>
	<form action="list" method="post">
		<table>
			<tr>
				<td>编号<input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>店铺名称<input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>创建日期<input type="text" name="sdate" onclick="WdatePicker()"></td>
			</tr>
			<tr>
				<td>销售商品: <#list list as l> <input type="checkbox" name="gids"
					value="${l.gid}">${l.gname} </#list>

				</td>
			</tr>
			<tr>
				<td><input type="button" value="保存" onclick="bc()"> 
				<input type="button" value="关闭" onclick="location = 'list'">
				<td>
			</tr>
		</table>
	</form>

</body>
</html>