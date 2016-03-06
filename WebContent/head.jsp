<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<link type="text/css" rel="stylesheet" href="css/head.css">
<link type="text/css" rel="stylesheet " href="css/bootstrap.css">
<script src="js/bootstrap.js"></script>
</head>

<body>

	<div align="center">
		<h2>基于大数据平台的软件工程</h2>
		<h1>职业分析</h1>
		<h1 class="zhiye"></h1>
		<h3>指导老师:吴桂兴</h3>
		<h3>设计人:杨腾飞,张凯文,康晓领</h3>
	</div>
	<button type="button" class="btn btn-primary">登录</button>
</body>
</html>
