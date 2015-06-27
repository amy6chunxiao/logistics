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
    <title>chengyun物流信息网</title>

    <link rel="stylesheet" href="./ref/bootstrap.min.css">
    <link rel="stylesheet" href="./css/index.css">
</head>
<body>
    <%@ include file="../tpl/manager-top.jsp"%>

    <!--巨幕-->
    <div class="jumbotron">
        <h1>欢迎登陆承运物流信息网后台</h1>
        <p>提供高质量服务，打造优秀物流品牌</p>
    </div>

    <%@ include file="../tpl/footer.jsp"%>
    

    

    <script src="../ref/jquery-1.10.2.min.js"></script>
    <script src="../ref/bootstrap.min.js"></script>
    <script src="../js/index.js"></script>
</body>
</html>