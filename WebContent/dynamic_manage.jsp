<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>简历管理</title>
</head>
<!-- 验证动态方法调用,此方法有SQL注入的风险 -->
<body>
	<jsp:include page="head.jsp" />
	<h1>第一步method通配符：简历管理</h1>
	<!-- target定义文档在何处显示，新窗口或本页面 -->
	<a href="Resume!list" target="_blank">简历信息查询</a>&nbsp;
	<a href="Resume!add" target="_blank">简历信息增加</a>&nbsp;
	<a href="Resume!update" target="_blank">简历信息修改</a>&nbsp;
	<a href="Resume!delete" target="_blank">简历信息删除</a>&nbsp;
	<br>
	<br>
	<h1>第二步Action和method通配符：求职信管理</h1>
	<!-- target定义文档在何处显示，新窗口或本页面 -->
	<a href="ApplicationLetter!list" target="_blank">求职信查询</a>&nbsp;
	<a href="ApplicationLetter!add" target="_blank">求职信增加</a>&nbsp;
	<a href="ApplicationLetter!update" target="_blank">求职信修改</a>&nbsp;
	<a href="ApplicationLetter!delete" target="_blank">求职信删除</a>&nbsp;
</body>
</html>