<%--
  Created by IntelliJ IDEA.
  User: УВД
  Date: 21.04.2017
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
    <th>login</th>
    <th>password</th>
    </tr>
<c:forEach items="${list}" var="user">
    <tr>
        <td>${user.login}</td>
    <td>${user.password}</td>
    </tr>
</c:forEach>

</table>
</body>
</html>
