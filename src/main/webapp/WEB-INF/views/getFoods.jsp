<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询菜品列表</title>
</head>
<body>
    <table width="100%" border=1>
        <tr>
            <td>菜品ID</td>
            <td>菜品名字</td>
            <td>菜品价格</td>
            <td>菜品简介</td>
            <td>操作</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${foods}" var="food">
            <tr>
                <td>${food.foodId}</td>
                <td>${food.foodName}</td>
                <td>${food.foodPrice}</td>
                <td>${food.foodRemark}</td>
                <td><a href="${pageContext.request.contextPath }/selectFood?id=${food.foodId}">修改</a></td>
                <td><a href="${pageContext.request.contextPath }/deleteFood?id=${food.foodId}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
    <h3><a href="${pageContext.request.contextPath }/addFood">增加菜品</a></h3>
</body>
</html>
