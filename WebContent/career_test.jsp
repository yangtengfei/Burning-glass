<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Burning-Glass</title>
</head>
<body>
	<jsp:include page="head.jsp" />
<!-- 绝对路径：￥{pageContext.request.contextPath}/ -->
职业测试<br>
朋友评价你是下者中的：<br>
<form action="career_test" method="post">
	<input type="radio" name="options" value="A"/>A 热情和敏感
	<input type="radio" name="options" value="B"/> B 逻辑和明确
	<input type="submit" value="提交"/>
</form>
</body>
</html>