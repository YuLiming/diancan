<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<ul class="nav nav-pills nav-stacked side-menu">
    <li class="navbar-header">
        <img src="/resource/system/img/logo.png" class="img-responsive logo"/>
    </li>
    <li>
        <a href="javascript:parent.location.reload(); " class="site-btn-active" data-type="tabAdd"><i
                class="glyphicon glyphicon-home" target="frameH"></i>首页</a>
    </li>

    <c:forEach var="menu" items="${menuList}">
        <c:if test="${menu.hasMenu}">
            <li>
                <a href="#"><i class="glyphicon ${menu.menuIcon}"></i>${menu.menuName}<span
                        class="glyphicon glyphicon-menu-left arrow"></span></a>

                <ul class="nav">
                    <c:forEach var="sub" items="${menu.subMenu}">
                        <c:choose>
                            <c:when test="${not empty sub.menuUrl}">
                                <li><a href="${sub.menuUrl}" target="frameH" class="site-btn-active"
                                       data-type="tabAdd">${sub.menuName}</a></li>

                            </c:when>
                            <c:otherwise>
                                <li><a href="javascript:void(0)" target="frameH" class="site-btn-active"
                                       data-type="tabAdd">${sub.menuName}</a></li>

                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </ul>
            </li>
        </c:if>
    </c:forEach>
</ul>
