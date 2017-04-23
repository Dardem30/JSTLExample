<%--
  Created by IntelliJ IDEA.
  User: УВД
  Date: 21.04.2017
  Time: 19:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    if(((request.getParameter("login")).equals("admin"))&&((request.getParameter("password")).equals("12345"))){
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("nextTo.jsp");
        requestDispatcher.forward(request,response);
}else {
        RequestDispatcher requestDispatcher2=request.getRequestDispatcher("index.jsp");
        requestDispatcher2.forward(request,response);
    }
    %>
</body>
</html>
