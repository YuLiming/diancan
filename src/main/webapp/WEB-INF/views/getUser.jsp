<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询用户列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/selectUser" method="post">
    查询条件：
    <table width="100%" border=1>
        <tr>
            <td><input type="submit" value="查询"/></td>
        </tr>
    </table>
    用户列表：
    <table width="100%" border=1>
        <tr>
            <td>用户ID</td>
            <td>用户姓名</td>
            <td>用户联系方式</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${users}" var="u">
            <tr>
                <td>${u.userId }</td>
                <td>${u.userName }</td>
                <td>${u.userPhone }</td>
                <td><a href="${pageContext.request.contextPath }/selectUser?id=${u.userId}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>


