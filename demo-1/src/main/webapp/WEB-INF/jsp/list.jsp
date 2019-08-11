<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
<link rel="stylesheet" href="css/index2.css">
<script type="text/javascript">
	var i = 3;
	var temp = setInterval("setTime()", 1000);
	function setTime() {
		$("#h2").text(i);
		$("#h1").text("秒之后开始秒杀");
		if (i == 0) {
			// 取消定时
			clearInterval(temp);
			$("#h1").text("秒杀开始");
			$("#h2").text("");
			// 显示秒杀按钮
			$(".miaosha").removeAttr("disabled");
		}
		i = i - 1;
	}
	function ms(id){
		$.post(
				"redismiaosha",
				{id:id},
				function(flag){
					if(flag){
						alert("秒杀成功");
					}else{
						alert("秒杀失败");
					}
				},
				"json");
	}
	$(function(){
		setInterval("setPcount()",1000);
	})
	function setPcount(){
		$.post("getCount",function(arr){
			for (var i = 0; i < arr.length; i++) {
				$("#num"+arr[i].id).text(arr[i].num);
				if(arr[i].num<=0){
					$("#btn"+arr[i].id).attr("disabled",true);
					$("#btn"+arr[i].id).val("抢光了");
					
				}
			}
			
		},"json")
		
	}
</script>
</head>
<body>
	<center>
		<p style="font-weight: bolder;">
			<span id="h2" style="color: red"></span><span id="h1"></span>
		</p>
	</center>
	<span s></span>
	<table>
		<tr>
			<td>编号</td>
			<td>品牌</td>
			<td>价格</td>
			<td>数量</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.name }</td>
				<td>${l.price }</td>
				<td id="num${l.id }">${l.num }</td>
				<td><input type="button" class="miaosha" value="秒杀"
					id="btn${l.id }"  disabled="disabled" onclick="ms(${l.id })"></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>