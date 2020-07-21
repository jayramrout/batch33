<%--
  Created by IntelliJ IDEA.
  User: jrout
  Date: 7/20/20
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Final Page</title>
</head>
<body>
<%
    String firstName = request.getParameter("firstName");
    String lastName = request.getParameter("lastName");
    String password = request.getParameter("password");
%>
<p>I am normal</p>
<p style="color:red;"><%=new java.util.Date()%></p>
<p style="color:blue;"><%=firstName%></p>
<p style="font-size:50px;"><%=lastName%></p>
</body>
</html>
