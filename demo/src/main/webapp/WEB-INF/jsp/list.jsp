<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="list" method="post">
	<select>
		<option>请选择</option>
		<c:forEach items="${ty }" var="t">
			<option value="${t.tid }">${t.tname }</option>
		</c:forEach>
	</select>
	<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>地址</td>
		<td>班级</td>
		<td>操作</td>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.name }</td>
				<td>${l.sex }</td>
				<td>${l.age }</td>
				<td>${l.addr }</td>
				<td>${l.tname }</td>
				<td></td>
			</tr>
		</c:forEach>
	</tr>
</table>
</body>
</html>