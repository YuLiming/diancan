<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改信息</title>

</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath }/editFoodSubmit" method="post" >
    修改商品信息：
    <table width="100%" border=1>
        <tr>
            <td>菜品ID</td>
            <td><input type="text" name="foodId" value="${food.foodId}"/></td>
        </tr>
        <tr>
            <td>菜品名称</td>
            <td><input type="text" name="foodName" value="${food.foodName}"/></td>
        </tr>
        <tr>
            <td>菜系ID</td>
            <td>
                <input type="text" name="foodTypeId"value="${food.foodTypeId}"/>
            </td>
        </tr>
        <tr>
            <td>菜品简介</td>
            <td>
                <input type="text" name="foodRemark"value="${food.foodRemark}"/>
            </td>
        </tr>
        <tr>
            <td>菜品价格</td>
            <td>
                <input type="text" name="foodPrice"value="${food.foodPrice}"/>
            </td>
        </tr>
        <tr>
            <td>菜品上架</td>
            <td>
                <input type="text" name="foodGrounding"value="${food.foodGrounding}"/>
            </td>
        </tr>
        <tr>
            <td>菜品销售量</td>
            <td>
                <input type="text" name="foodMonthlysales"value="${food.foodMonthlysales}"/>
            </td>
        </tr>
        <tr>
            <td>VIP价格</td>
            <td>
                <input type="text" name="foodVipPrice"value="${food.foodVipPrice}"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>

    </table>
</form>
</body>
</html>