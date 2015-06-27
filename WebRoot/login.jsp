<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cmn-Hans">
<head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>登录 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
    <%@ include file="tpl/top.jsp"%>

    <form id="login" class="center-box" action="./user/login.action" method="POST">
        <h2 class="section-topic">用户登录</h2>

        <div class="form-group">
            <label class="control-label" for="user-name">请输入用户名：</label>
            <input type="text" class="form-control" id="user-name" name="user-name" placeholder="用户名">
        </div>

        <div class="form-group">
            <label class="control-label" for="user-password">请输入密码：</label>
            <input type="password" class="form-control" id="user-password" name="user-password" placeholder="密码">
        </div>

        <button id="log-btn" class="btn btn-success" type="submit">登录</button>
        <a href="./register.jsp" class="btn btn-default" role="btn">注册</a>
        <a href="javascript:" class="find-password">忘记密码？</a>
    </form>

    <%@ include file="tpl/footer.jsp"%>

    

    

    <script src="ref/jquery-1.10.2.min.js"></script>
    <script src="ref/bootstrap.min.js"></script>
</body>
</html>