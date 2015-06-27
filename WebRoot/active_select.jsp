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
    <title>物流动态 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
    <%@ include file="tpl/top.jsp"%>

    <div class="center-box">
        <table class="table table-striped table-hover">
            <caption class="h2">动态信息</caption>
            <thead>
                <tr>
                    <td>ID</td>
                    <td>标题</td>
                    <td>发布日期</td>
                    <td>作者</td>
                    <td>操作</td>
                </tr>
            </thead>
            <tbody>
                <!-- <tr>
                    <td>12</td>
                    <td>dss</td>
                    <td>asdf</td>
                    <td>2-2</td>
                    <td><a href="javascript:">详细</a></td>
                </tr>
                <tr>
                    <td>12</td>
                    <td>dss</td>
                    <td>asdf</td>
                    <td>2-2</td>
                    <td><a href="javascript:">详细</a></td>
                </tr>
                <tr>
                    <td>12</td>
                    <td>dss</td>
                    <td>asdf</td>
                    <td>2-2</td>
                    <td><a href="javascript:">详细</a></td>
                </tr>
                <tr>
                    <td>12</td>
                    <td>dss</td>
                    <td>asdf</td>
                    <td>2-2</td>
                    <td><a href="javascript:">详细</a></td>
                </tr> -->
            </tbody>
        </table>
        <div class="table-footer">
            <label>共一页</label>
            <a href="javascript:">上一页</a>
            <a href="javascript:">下一页</a>
        </div>
    </div>
    
    <%@ include file="tpl/footer.jsp"%>
    

    

    <script src="ref/jquery-1.10.2.min.js"></script>
    <script src="ref/bootstrap.min.js"></script>
    <script src="js/active_select.js"></script>
</body>
</html>