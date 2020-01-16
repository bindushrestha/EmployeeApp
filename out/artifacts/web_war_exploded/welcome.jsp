<%@ page import="model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 31-12-2019
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome </title>
</head>
<body>

<%@ include file="header.html" %>
<div  style=" padding-top: 10px; width: 100%">
<div style="background-color: #4CAF50; padding-left: 10px; height: 25px; color: white; font-size: 25px"> ${username} welcome!</div></div>
<div style="padding-top: 10px; width: 100%">
    <table>
        <tr><td>
            First name:</td>
            <td> ${employee.firstName}<br></td></tr>
        <tr><td>
            Last name:</td>
            <td>${employee.lastName}<br></td></tr>
        <tr><td>
            Contact:</td>
            <td>${employee.contact}<br></td></tr>
        <tr>
            <td>
                Email:</td><td> ${employee.email}<br></td></tr>

        <tr>
            <td>
                <input type="submit" value="Edit"></td></tr>
    </table>

</div>

</body>
</html>
