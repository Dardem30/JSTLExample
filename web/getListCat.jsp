<%--
  Created by IntelliJ IDEA.
  User: УВД
  Date: 21.04.2017
  Time: 21:15
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
        <th>name</th>
        <th>age</th>
    </tr>
    <c:forEach items="${list}" var="cat">
        <tr>
            <td>${cat.name}</td>
            <td>${cat.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
