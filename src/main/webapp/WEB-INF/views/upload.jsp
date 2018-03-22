<%--
  Created by IntelliJ IDEA.
  User: YLM
  Date: 2018/3/22
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- 上传图片是需要指定属性 enctype="multipart/form-data" -->
<form id="userForm" action="${pageContext.request.contextPath }/uploadFoodImg" method="post" enctype="multipart/form-data">
    <table width="100%" class="gridtable">
        <tr>
            <td>
                <input type="text" name="id"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="file" name="pictureFile" onchange="imgPreview(this)"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>

</form>
</body>
<script type="text/javascript">

    <!-- 实现上传图片预览功能 -->
    function imgPreview(fileDom){
        //判断是否支持FileReader
        if (window.FileReader) {
            var reader = new FileReader();
        } else {
            alert("您的设备不支持图片预览功能，如需该功能请升级您的设备！");
        }

        //获取文件
        var file = fileDom.files[0];
        var imageType = /^image\//;
        //是否是图片
        if (!imageType.test(file.type)) {
            alert("请选择图片！");
            return;
        }
        //读取完成
        reader.onload = function(e) {
            //获取图片dom
            var img = document.getElementById("preview");
            //图片路径设置为读取的图片
            img.src = e.target.result;
        };
        reader.readAsDataURL(file);
    }
</script>
</html>
