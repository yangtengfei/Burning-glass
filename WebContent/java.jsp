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
职业分析<br>
您感兴趣的职业为：<br>
<form action="/analysereport/java" method="post">
	<input type="checkbox" name="options" value="A"/>A Java
	<input type="checkbox" name="options" value="B"/> B 大数据
	<input type="submit" value="提交"/>
</form>
</body>
</html>