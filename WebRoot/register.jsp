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
    <title>注册 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
    <%@ include file="tpl/top.jsp"%>

    <!--register-->
    <form action="" id="register" class="center-box">
        <h2 class="section-topic">用户注册</h2>

        <div class="form-group">
            <label for="reg-name">请输入用户名：</label>
            <input type="text" class="form-control" id="reg-name" name="reg-name" placeholder="用户名">
        </div>
        <div class="form-group">
            <label for="reg-password">请输入密码：</label>
            <input type="text" class="form-control" id="reg-password" name="reg-password" placeholder="密码">
        </div>
        <div class="form-group">
            <label for="confirm-password">请确认密码：</label>
            <input type="text" class="form-control" id="confirm-password" name="confirm-password" placeholder="确认密码">
        </div>

        <div class="form-group">
            <label for="gender">请选择性别：</label>
            <label class="radio-inline">
                <input type="radio" name="gender" id="gender-male" value="male"> 男
            </label>
            <label class="radio-inline">
                <input type="radio" name="gender" id="gender-female" value="female"> 女
            </label>
        </div>

        <div class="form-group">
            <label for="reg-phone">请输入手机号码：</label>
            <input type="text" class="form-control" id="reg-phone" name="reg-phone" placeholder="手机号码">
        </div>
        <div class="form-group">
            <label for="reg-email">请输入邮箱：</label>
            <input type="text" class="form-control" id="reg-email" name="reg-email" placeholder="邮箱">
        </div>

        <div class="form-group">
            <label for="reg-find-password">找回密码问题：</label>
            <input type="text" class="form-control" id="reg-find-password" name="reg-find-password" placeholder="问题">
        </div>
        <div class="form-group">
            <label for="reg-find-answer">问题的答案：</label>
            <input type="text" class="form-control" id="reg-find-answer" name="reg-find-answer" placeholder="答案">
        </div>

        <div class="form-btns">
            <button class="btn btn-success" type="subsmit">注册</button>
            <button class="btn btn-default" type="reset">重置</button>
            <a href="./index.jsp">返回</a>
        </div>

        

    </form>

    <%@ include file="tpl/footer.jsp"%>

    

    

    <script src="ref/jquery-1.10.2.min.js"></script>
    <script src="ref/bootstrap.min.js"></script>
</body>
</html>