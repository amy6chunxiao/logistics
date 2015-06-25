<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
</head>

<body>
	<form action="servlet/GetCarMessageServlet" method="post">
		<h1>登 录</h1>
		<p>
			<label for="username" class="uname" data-icon="u"> 用户名 ：</label> <input
				id="username" name="username" required="required" type="text"
				placeholder="请输入用户名" />
		</p>
		<p>
			<label for="password" class="youpasswd" data-icon="p"> 密 码 ：</label>
			<input id="password" name="password" required="required"
				type="password" placeholder="请输入密码" />
		</p>
		<p>
			<input type="submit" value="登 录" />
		</p>
	</form>
</body>
</html>
