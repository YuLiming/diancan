<%--
  Created by IntelliJ IDEA.
  User: hyy
  Date: 2018/3/12
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>用户管理</title>
    <link rel="stylesheet" href="/vendor/bootstrap/css/bootstrap.min.css"/>
    <link href="/vendor/plugins/bootstrap-table/bootstrap-table.css" rel="stylesheet">
    <link href="/vendor/plugins/layui/css/layui.css" rel="stylesheet">
    <link href="/vendor/css/table.css" rel="stylesheet"/>
</head>
<body>
<form id="toolbar" class="form-inline">
    <div class="form-group">
        <button class="btn btn-danger delete-selected btn-sm" disabled="disabled" type="button">
            <i class="glyphicon glyphicon-trash"></i> 删除所选
        </button>
        <button class="btn btn-primary add-btn btn-sm" type="button">
            <i class="glyphicon glyphicon-plus"></i> 新增
        </button>
        <button class="btn btn-warning export-btn btn-sm" type="button">
            <i class="glyphicon glyphicon-floppy-open"></i> 导出
        </button>
        <button class="btn btn-info import-btn btn-sm" type="button">
            <i class="glyphicon glyphicon-floppy-save"></i> 导入
        </button>
    </div>
    <div class="form-group form-group-sm">
        <input id="userName" type="text" class="form-control" placeholder="请输入查询内容">
    </div>
    <div class="form-group form-group-sm">
        <label>角色:</label>
        <select name="roleId" id="roleId" class="form-control">
            <option value="">全部</option>
            <c:forEach items="${roleList}" var="role">
                <option value="${role.roleId }">${role.roleName }
                </option>
            </c:forEach>
        </select>
    </div>
    <div class="form-group form-group-sm">
        <input id="lastLoginStart" class="form-control date-input-start" placeholder="开始时期"
               onclick="layui.laydate({elem: this, festival: true})">
    </div>
    <div class="form-group form-group-sm">
        <input id="lastLoginEnd" class="form-control date-input-start" placeholder="结束时期"
               onclick="layui.laydate({elem: this, festival: true})">
    </div>
    <div class="form-group form-group-sm">
        <button id="btnRefresh" type='button' class="btn btn-success btn-sm">
            <i class="glyphicon glyphicon-search"></i> 搜索
        </button>
    </div>
</form>
<div class="container-fluid">
    <table id="table" data-toolbar="#toolbar"/>
</div>
<script src="/vendor/js/jquery-2.1.4.min.js"></script>
<script src="/vendor/js/bootstrap.min.js?v=3.3.6"></script>
<script src="/vendor/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
<script src="/vendor/plugins/layui/layui.js"></script>
<script src="/vendor/js/common-style.js"></script>
<script src="/vendor/js/user.js"></script>
</body>
</html>
