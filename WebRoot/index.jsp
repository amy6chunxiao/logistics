<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html lang="zh-cmn-Hans">
<head>
    <base href="<%=basePath%>">
    
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>chengyun物流信息网</title>

    <link rel="stylesheet" href="ref/bootstrap.min.css">
    <link rel="stylesheet" href="css/index.css">

</head>

<body>
   <%@ include file="tpl/top.jsp"%>

   <%
   String username=(String)session.getAttribute("username");
   boolean isLogin = false;
   if(username != null) isLogin = true;
   %>

   <!-- 主体部分 -->

   <div class="container">
    <div class="row">

        <!--body-msg-->
        <div class="col-md-8">
            <div id="goods-msg" class="section msg-section">
                <h2 class="section-topic">货物信息 <small><a href="javascript:">&gt;&gt;more</a></small></h2>
                <ul>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                    <li><a href="javascript:">电脑-你家-我家</a></li>
                </ul>
            </div>

            <div id="cars-msg" class="section msg-section">
                <h2 class="section-topic">车辆信息 <small><a href="javascript:">&gt;&gt;more</a></small></h2>
                <ul>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                    <li><a href="javascript:">Σ( ° △ °|||)︴-你家-我家</a></li>
                </ul>
            </div>

            <div id="coms-msg" class="section msg-section">
                <h2 class="section-topic">企业信息 <small><a href="javascript:">&gt;&gt;more</a></small></h2>
                <ul>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                    <li><a href="javascript:">百度</a></li>
                </ul>
            </div>

        </div>

        <!--body-msg end-->

        <!-- 用户登录、公告部分 -->
        <div class="col-md-4">

            <!--登录-->
            <%if(!isLogin){%>
            <form id="user-log" class="" action="./user/login.action" method="POST">
                
                <h2 class="section-topic">用户登录</h2>

                <div class="form-group">
                    <label for="user-name">请输入用户名：</label>
                    <input type="text" class="form-control" id="user-name" name="user-name" placeholder="用户名">
                </div>

                <div class="form-group">
                    <label for="user-password">请输入密码：</label>
                    <input type="password" class="form-control" id="user-password" name="user-password" placeholder="密码">
                </div>

                <button class="btn btn-success" type="submit">登录</button>
                <a href="javascript:" class="btn btn-default" role="btn">注册</a>
                <a href="javascript:" class="find-password">忘记密码？</a>
            </form>
            <%}else{%>
            <h2 class="section-topic login-topic">欢迎，<%=username%> <button id="log-out" class="btn btn-danger" data-name="<%=username%>">登出</button></h2>
            
            <%}%>


            <!--公告-->
            <div id="notice" class="section">
                <h2 class="section-topic">本地公告</h2>
                <ul>
                    <li><a href="javascript:">网站公告</a></li>
                    <li><a href="javascript:">我们需要你的支持</a></li>
                    <li><a href="javascript:">学习百度</a></li>
                    <li><a href="javascript:">技术之后吃</a></li>
                    <li><a href="javascript:">招聘经理</a></li>
                    <li><a href="javascript:">下一步计划</a></li>
                </ul>
            </div>
            <!--notice end-->

            <!--friend-link-->
            <div id="friend-link" class="section">
                <h2 class="section-topic">友情链接</h2>
                <ul>
                    <li><a href="javascript:">一个神奇的网站</a></li>
                    <li><a href="javascript:">一个神奇的网站</a></li>
                    <li><a href="javascript:">一个神奇的网站</a></li>
                    <li><a href="javascript:">一个神奇的网站</a></li>
                </ul>
            </div>
            <!--friend-link end-->
        </div>  
    </div>
</div>

<%@ include file="tpl/footer.jsp"%>

<script src="ref/jquery-1.10.2.min.js"></script>
<script src="ref/bootstrap.min.js"></script>
<script src="js/index.js"></script>
</body>
</html>
