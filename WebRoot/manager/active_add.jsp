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
    <title>物流动态发布 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
	<%@ include file="../tpl/manager-top.jsp"%>

    <div class="center-box">
        <form action="./logisticDynamic/add.action" method="POST">
            <h1>物流动态信息发布</h1>

            <div class="form-group">
                <label for="active-topic">标题：</label>
                <input type="text" class="form-control" id="active-topic" name="active-topic" placeholder="标题">
            </div>
            <div class="form-group">
                <label for="active-cont">内容：</label>
                <textarea type="text" class="form-control" id="active-cont" name="active-cont" placeholder="物流动态.."></textarea>
            </div>
            <div class="form-group">
                <label for="active-author">作者：</label>
                <input type="text" class="form-control" id="active-author" name="active-author" placeholder="作者..">
            </div>

            <div class="form-btns">
                <button class="btn btn-success" type="submit">发布</button>
                <button class="btn btn-default" type="reset">重置</button>
                <a href="./manager/active_select.jsp">返回</a>
            </div>
        </form>
    </div>
    
    <%@ include file="../tpl/footer.jsp"%>
    
</body>
</html>