<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="base.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Burning-Glass</title>
</head>
<body>
	<div class="head1">
	<jsp:include page="head.jsp"  />
	</div>
	<br>
	<br>
	<br>
	<div class="h1">
	<h1 align="center">欢迎来到本网站,请先登录或注册~</h1>
	</div>
	<br>
	<br>
	<br>
	<div class="zhuce" align="center">
		用户登录
		<s:form action="login" method="post">
			<s:textfield name="user.userName" label="用户名"></s:textfield>
			<s:textfield type="password" name="user.password" label="密码"></s:textfield>
			<s:submit value="登录"></s:submit>
			<s:submit value="注册" name="action:register"></s:submit>
		</s:form>
	</div>
</body>
</html>