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
    <title>货物信息 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
    <%@ include file="tpl/top.jsp"%>

    <div class="center-box">
        <table class="table table-striped table-hover">
            <caption class="h2">货物信息</caption>
            <thead>
                <tr>
                    <td>货物类型</td>
                    <td>货物名称</td>
                    <td>货物数量</td>
                    <td>数量单位</td>
                    <td>起始省份</td>
                    <td>起始城市</td>
                    <td>抵达省份</td>
                    <td>抵达城市</td>
                    <td>操作</td>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>电脑</td>
                    <td>mac</td>
                    <td>10</td>
                    <td>台</td>
                    <td>广东</td>
                    <td>深圳</td>
                    <td>福建</td>
                    <td>厦门</td>
                    <td><a href="javascript:">操作</a></td>
                </tr>
                <tr>
                    <td>电脑</td>
                    <td>mac</td>
                    <td>10</td>
                    <td>台</td>
                    <td>广东</td>
                    <td>深圳</td>
                    <td>福建</td>
                    <td>厦门</td>
                    <td><a href="javascript:">操作</a></td>
                </tr>
                <tr>
                    <td>电脑</td>
                    <td>mac</td>
                    <td>10</td>
                    <td>台</td>
                    <td>广东</td>
                    <td>深圳</td>
                    <td>福建</td>
                    <td>厦门</td>
                    <td><a href="javascript:">操作</a></td>
                </tr>
                <tr>
                    <td>电脑</td>
                    <td>mac</td>
                    <td>10</td>
                    <td>台</td>
                    <td>广东</td>
                    <td>深圳</td>
                    <td>福建</td>
                    <td>厦门</td>
                    <td><a href="javascript:">操作</a></td>
                </tr>
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
    <script src="js/index.js"></script>
</body>
</html>