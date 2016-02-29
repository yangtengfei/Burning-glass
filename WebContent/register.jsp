<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="base.css">
<title>Burning-Glass</title>
</head>
<body>
	<div class="head1">
	<jsp:include page="head.jsp"  />
	</div>
	<br>
	<br>
	<br>
	<div class="h1" align="center">
		<h1>用户注册</h1>
	</div>
	<br>
	<br>
	<br>
	<div class="register" align="center">
		<s:form action="register" method="post">
			<s:textfield name="user.userName" label="用户名"></s:textfield>
			<s:textfield type="password" name="user.password" label="密码"></s:textfield>
			<s:textfield name="user.email" label="电子邮件"></s:textfield>
			<s:submit value="注册"></s:submit>
		</s:form>
	</div>
</body>
</html>