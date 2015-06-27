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
    <title>物流动态查看 - chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
	<%@ include file="../tpl/manager-top.jsp"%>

    <div class="center-box">
            <h1>物流动态信息查看</h1>

            <div class="form-group">
                <label for="active-topic">id：</label>
                <input type="text" disabled class="form-control" id="active-id" name="active-id">
            </div>

            <div class="form-group">
                <label for="active-topic">作者：</label>
                <input type="text" disabled class="form-control" id="active-author" name="active-author">
            </div>
            
            

            <div class="form-group">
                <label for="active-topic">标题：</label>
                <input type="text" disabled class="form-control" id="active-topic" name="active-topic" placeholder="标题">
            </div>
            <div class="form-group">
                <label for="active-cont">内容：</label>
                <textarea type="text" disabled class="form-control" id="active-cont" name="active-cont" placeholder="物流动态.."></textarea>
            </div>

            <div class="form-btns">
                <a href="./active_select.jsp">返回</a>
            </div>
        </form>
        
    </div>
    
    <%@ include file="../tpl/footer.jsp"%>

    <script src="ref/jquery-1.10.2.min.js"></script>
    <script src="ref/bootstrap.min.js"></script>
    <script src="js/manager/active_show.js"></script>
    
</body>
</html>