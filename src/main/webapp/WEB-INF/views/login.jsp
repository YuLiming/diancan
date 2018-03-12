<%--
  Created by IntelliJ IDEA.
  User: hyy
  Date: 2018/3/12
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>登录界面</title>
    <link rel="shortcut icon" href="favicon.png">
    <link href="/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="/css/login.css" type="text/css" rel="stylesheet"/>
</head>
<body>
    <img src="/image/system/img/logo.png" class="login-logo"/>
    <div class="container-fluid login-bg"></div>
    <div class="login-main container">
        <div class="">
            <h2>登录界面</h2>
            <hr data-am-widget="divider" style="" class="divider" />
            <form method="post" id="postForm" role="form">
                <div class="form-group">
                    <input type="text" minlength="2" maxlength="16" class="form-control" name="userName"
                           id="user"
                           required="required" aria-required="true" placeholder="输入用户名"/>
                </div>
                <div class="form-group">
                    <input type="password" minlength="4" maxlength="16" class="form-control" name="password" id="password"
                           required="required" aria-required="true" placeholder="输入密码"/>
                </div>
                <div  class="checkbox">
                    <label for="remember-me">
                        <input id="remember-me" type="checkbox">
                        记住密码
                    </label>
                </div>
                <div class="form-group">
                    <input type="submit" class="btn btn-primary" id="toLogin" value="登录"/>
                    <a href="#" class="radio-inline">忘记密码 ^_^？</a>
                </div>
            </form>
            <hr data-am-widget="divider" style="" class="am-divider am-divider-default" />
        </div>
    </div>

    <script src="/js/jquery-2.1.4.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/content.min.js"></script>
    <script src="/js/jquery.form.js"></script>

    <script src="/plugins/layui/lay/modules/layer.js"></script>

    <script src="/plugins/validate/jquery.validate.min.js"></script>
    <script src="/plugins/validate/messages_zh.min.js"></script>

    <%-- 得到ip--%>
    <script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
</body>
</html>
