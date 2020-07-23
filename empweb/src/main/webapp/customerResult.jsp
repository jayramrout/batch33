<%@ page import="jrout.tutorial.servlet.domain.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: jrout
  Date: 7/20/20
  Time: 9:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jrout.tutorial.servlet.domain.Customer" %>
<%@ page import="java.util.List" %>

<html>
<head>
    <title>Final Page</title>
    <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<%
    List<Customer> customers = (List<Customer>)request.getAttribute("customerResult");
%>
<table>
    <tr>
        <th>Customer Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>StoreId</th>
    </tr>
    <%
        for(Customer customer : customers){
    %>
       <tr>
        <td><%=customer.getCustomerId()%></td>
        <td><%=customer.getFirstName()%></td>
        <td><%=customer.getLastName()%></td>
        <td><%=customer.getEmail()%></td>
        <td><%=customer.getStoreId()%></td>
        </tr>
      <%
        }
    %>
</table>
</body>
</html>
