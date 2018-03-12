<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询菜系列表</title>
</head>
<body>
    <table width="100%" border=1>
        <tr>
            <td>菜系ID</td>
            <td>菜系名称</td>
            <td>操作</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${foodTypes}" var="type">
            <tr>
                <td>${type.foodtypeId}</td>
                <td>${type.foodtypeName}</td>
                <td><a href="${pageContext.request.contextPath }/selectFoodType?id=${type.foodtypeId}">修改</a></td>
                <td><a href="${pageContext.request.contextPath }/deleteFoodType?id=${type.foodtypeId}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <H3><a href="${pageContext.request.contextPath }/addFoodType">新增菜系</a> </H3>

</body>
</html>
