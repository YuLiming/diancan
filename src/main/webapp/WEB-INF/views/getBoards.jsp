<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询餐桌列表</title>
</head>
<body>
    <table width="100%" border=1>
        <tr>
            <td>餐桌名字</td>
            <td>可容纳人数</td>
            <td>操作</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${boards}" var="board">
            <tr>
                <td>${board.boardName}</td>
                <td>${board.boardPeopleNumber}人</td>
                <td><a href="${pageContext.request.contextPath }/deleteBoard?id=${board.boardId}">删除</a></td>
                <td><a href="${pageContext.request.contextPath }/selectBoard?id=${board.boardId}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
    <h3><a href="${pageContext.request.contextPath }/addBoard">增加餐桌</a></h3>

</body>
</html>
