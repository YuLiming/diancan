/**
 * Created by orange on 2017-04-25.
 */

$(function () {


    //表格  - 操作 - 事件
    window.operateEvents = {
        'click .edit': function (e, value, row, index) {
            //修改操作
            layer.open({
                type: 2,
                title: '修改用户',
                skin: 'alert-lay',
                content: '/user/toEdit?userId=' + row['userId'],
                area: ['50%', '80%']
            });
        },

        'click .password-init': function (e, value, row, index) {
            //询问框
            layer.confirm('确定要重置 ' + row['userName'] + ' 用户密码为123456吗?', {
                btn: ['确定', '取消'] //按钮
            }, function (index) {
                var json = "{\"userId\":'" + row['userId']
                    + "',\"password\":'123456',\"tm\":'" + new Date().getDate() + "'}";
                $.ajax({
                    url: "/user/edit.do",
                    data: json,
                    dataType: "json",
                    type: 'POST',
                    async: true,    //或false,是否异步
                    timeout: 10000,    //超时时间
                    cache: false,
                    error: function (data) {
                        alert(data.message);
                    },
                    success: function (data) {
                        if (data.success) {
                            layer.msg(data.message, {
                                time: 2000, //2s后自动关闭
                                icon: 1
                            });
                        } else {
                            layer.msg(data.message, {
                                time: 2000, //2s后自动关闭
                                icon: 2
                            });
                        }
                    }
                });
            });
        },

        'click .delete': function (e, value, row, index) {
            //询问框
            layer.confirm('确定要删除用户 [' + row['userName'] + '] 吗?', {
                btn: ['确定', '取消'] //按钮
            }, function (index) {
                var url = "/user/delete.do?userId=" + row['userId'] + "&guid=" + new Date().getTime();
                $.get(url, function (data) {
                    if (data.success) {
                        $("#table").bootstrapTable('refresh');
                    } else {
                        layer.msg(data.message, {
                            time: 2000, //2s后自动关闭
                            icon: 2
                        });
                    }
                    layer.close(index);
                });
            });
        },

        'click .isDisabled': function (e, value, row, index) {
            var flag = row['isDisabled'];
            var strMsg = '确定要开启 [' + row['userName'] + '] 用户吗?';
            if (!flag) {
                strMsg = '确定要禁用 [' + row['userName'] + '] 用户吗?';
            }
            flag = (flag ? false : true);

            //询问框
            layer.confirm(strMsg, {
                btn: ['确定', '取消'] //按钮
            }, function (index) {
                var url = "/user/disabled.do?userId=" + row['userId'] + "&value=" + flag + "&guid=" + new Date().getTime();
                $.get(url, function (data) {
                    if (data.success) {
                        $("#table").bootstrapTable('refresh');
                    } else {
                        layer.msg(data.message, {
                            time: 2000, //2s后自动关闭
                            icon: 2
                        });
                    }
                    layer.close(index);
                });
            }, function () {
                // 取消事件
                $("#table").bootstrapTable('refresh');
            });
        }
    };

    /*定义table*/
    var $table = $('#table');
    var columns = /*列参数 表格.*/
        [{
            title: '选择',
            checkbox: true,
            align: 'center',
            valign: 'middle'
        }, {
            title: '序号',
            align: 'center',
            formatter: function (value, row, index) {
                return index + 1;
            }
        }, {
            field: 'boardId',
            title: 'ID',
            visible: false
        }, {
            field: 'boardName',
            title: '桌名'
        }, {
            field: 'boardPeopleNumber',
            title: '可坐人数'
        }, {
            field: 'boardType',
            title: '餐桌类型'
        }, {
            title: '操作',
            field: 'opreate',
            align: 'center',
            formatter: function (value, row, index) {
                var e = '<a title="编辑" class="edit btn btn-xs btn-info" style="margin-left: 10px"><i class="glyphicon glyphicon-edit"></i></a>';
                if (row['userName'] != "admin") {
                    e += '<a  title="初始化密码" class="password-init btn btn-xs btn-success" style="margin-left: 10px"><i class="glyphicon glyphicon-tree-conifer"></i></a>';
                    e += '<a title="删除" class="delete btn btn-xs btn-danger" style="margin-left: 10px"><i class="glyphicon glyphicon-trash"></i></a>';
                }
                return [e].join('');
            }, events: operateEvents
        }
        ];

        // 参数请求
    myPueryParams = function (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            showCount: params.pageSize,  //每页的数量
            currentPage: params.pageNumber,  //当前页
            userName: $("#userName").val(),
            roleId: $("#roleId").val(),
            lastLoginStart: $("#lastLoginStart").val(),
            lastLoginEnd: $("#lastLoginEnd").val()
        };
        return temp;
    };

    /*初始化表格*/
    $table.bootstrapTable({
        url: '/user/getList.do',
        method: 'get',                      //请求方式（*）
        toolbar: '#toolbar',                //工具按钮用哪个容器
        idField: 'boardId',      // 指定主键列
        showRefresh: true,                  //是否显示 刷新按钮
        columns: columns, /*列参数 表格.*/
        dataType: "json",
        singleSelect: false,                // 设置True 将禁止多选
        showPaginationSwitch: true,    //是否显示 数据条数选择框
        minimumCountColumns: 2,         // 当列数小于此值时，将隐藏内容列下拉框。
        striped: true,                      //是否显示行间隔色
        search: false,                      //显示搜索框
        pagination: true,                   //是否显示分页（*）
        showColumns: true,                   //是否显示 内容列下拉框
        sortable: false,                     //是否启用排序
        sortOrder: "desc",                   //排序方式
        queryParamsType: "",
        queryParams: myPueryParams,//传递参数（*）
        sidePagination: "server", //服务端处理分页
        showFooter: false,         // 是否显示列脚
        onLoadSuccess: function (data) {

        },
        onLoadError: function () {  //加载失败时执行
            layer.msg("加载数据失败", {time: 1500, icon: 2});
        }
    });


    $("#btnRefresh").click(function () {
        $("#table").bootstrapTable('refresh');
    });

    /*点击添加按钮显示表单*/
    $(".add-btn").on("click", function () {
        /*$(".form-hidden").removeClass("hidden");*/
        layer.open({
            type: 2,
            title: '添加用户',
            skin: 'alert-lay',
            content: '/user/toAdd.html', //这里content是一个普通的String
            area: ['50%', '80%']
        });
    });

    /*选择复选框使删除所选按钮可点*/
    $table.on('check.bs.table uncheck.bs.table ' +
        'check-all.bs.table uncheck-all.bs.table', function () {
        if ($(".delete-selected"))
            $(".delete-selected").prop('disabled', !$table.bootstrapTable('getSelections').length);
    });
    /*这里获取你点击的复选框，返回所选的行，当没有选择任何行的时候返回一个空数组。*/
    function getIdSelections() {
        return $.map($table.bootstrapTable('getSelections'), function (row) {
            return row.userId
        });
    }

    $(".delete-selected").click(function () {
        var ids = getIdSelections();
        //询问框
        layer.confirm('是否删除所选？', {btn: ['是', '否'], shade: 0.3}, function () {
            /*此处后台判断删除数据成功后页面变化*/
            $table.bootstrapTable('remove', {
                field: 'userId',
                values: ids
            });
            $(".delete-selected").prop('disabled', true);

            layer.closeAll();
        }, function () {
            layer.closeAll();
        });
    });

    //导出excel
    $(".export-btn").on("click", function () {
        var userName = $("#userName").val();
        var lastLoginStart = $("#lastLoginStart").val();
        var lastLoginEnd = $("#lastLoginEnd").val();
        var roleId = $("#roleId").val();

        window.location.href = '/user/excel.do?userName=' + userName + '&lastLoginStart=' + lastLoginStart + '&lastLoginEnd=' + lastLoginEnd + '&roleId=' + roleId;
    });

    $(".import-btn").on("click", function () {
        layer.msg('功能未实现', {
            time: 3000, //2s后自动关闭
            icon: 2
        });
    });

});