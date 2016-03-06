<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/base.css">
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
	<div class="h1" align="center" style="height: 361px; width: 985px; ">
	<h1>职业分析</h1>
	<h1 class="welcome"></h1>
	<h3 >请输入想要搜索的职业名称</h3>
	<s:form action="login" method="post">
			<s:textfield size="150" name="user.userName" label="待选职业"></s:textfield>
	</s:form>
	<!-- 这里有个跳转到result.jsp -->
	</div>
</body>
</html>