<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
<h2>All User in System</h2>

<table border="1">
    <tr>
        <th>User Id</th>
        <th>User Name</th>
        <th>User Phone</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.userName}</td>
            <td>${user.userPhone}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>