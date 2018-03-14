<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Bootstrap Admin Theme</title>

    <!-- Bootstrap Core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="vendor/datatables-plugins/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="vendor/datatables-responsive/dataTables.responsive.css" rel="stylesheet">

    <link href="plugins/bootstrap-table/bootstrap-table.css" rel="stylesheet">
    <link href="plugins/layui/css/layui.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style>
        #boards {
            padding: 0px 10px 0px 10px
            /*边界样式*/
            /*margin: 200px auto 0px;*/
            /*background-color: rgba(255,255,255, 0.7);*/
        }
    </style>

</head>

<body>


<div id="boards">
    <div class="row">
        <div class="col-lg-12">
            <h1 class="page-header">餐桌管理</h1>
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-12">
            <div class="panel panel-default">
                <div class="panel-heading">
                    餐桌表
                </div>
                <!-- /.panel-heading -->
                <div class="panel-body">
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
                        <table id="table" data-classes="table table-hover table-condensed"></table>
                    </div>
                    <!-- /.table-responsive -->
                </div>
                <!-- /.panel-body -->
            </div>
            <!-- /.panel -->
        </div>
        <!-- /.col-lg-12 -->
    </div>
    <!-- /.row -->
</div>
<!-- /#page-wrapper -->


<!-- jQuery -->
<script src="vendor/jquery/jquery.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="vendor/bootstrap/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="vendor/metisMenu/metisMenu.min.js"></script>

<!-- DataTables JavaScript -->
<script src="vendor/datatables/js/jquery.dataTables.min.js"></script>
<script src="vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
<script src="vendor/datatables-responsive/dataTables.responsive.js"></script>
<script src="plugins/bootstrap-table/bootstrap-table.js"></script>
<script src="plugins/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
<script src="plugins/layui/layui.js"></script>
<!-- Custom Theme JavaScript -->
<script src="dist/js/sb-admin-2.js"></script>
<!--数据格式-->
<script src="js/boards.js"></script>

<!-- Page-Level Demo Scripts - Tables - Use for reference -->
<!--<script>
$(document).ready(function() {
    $('#dataTables-example').DataTable({
        responsive: true
    });
});
</script>-->

</body>

</html>
