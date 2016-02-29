<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="base.css">
</head>
<body>
	<div class="head1">
	<jsp:include page="head.jsp"  />
	</div>
	<br>
	<br>
	<br>
	<div class="success" align="center">
	<h1 class="welcome">Welcome!</h1>
	<!-- 此处最好可以加上登录人姓名 -->
	<h2>你可以...</h2>
	<a href="index.jsp">返回初始页面</a><br>
	<a href="selectjava.jsp">进入搜索页面</a><br>
	<a href="career_test.jsp">职业测试</a><br>
	<a href="fileDownload.action?fileName=Java">Java分析文档下载</a><br>
	<a href="fileDownload.action?fileName=PHP">PHP分析文档下载</a>
	</div>
</body>
</html>