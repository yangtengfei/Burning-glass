<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Burning-Glass</title>
</head>
<body>

用户注册
<s:form action="register" method="post">
	<s:textfield name="userName" label="用户名"></s:textfield>
	<s:textfield type="password" name="password" label="密码"></s:textfield>
	<s:textfield name="email" label="电子邮件"></s:textfield>
	<s:submit value="登录"></s:submit>
</s:form>
</body>
</html>