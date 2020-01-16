<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 09-01-2020
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        button {
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
        }
    </style>
</head>
<body>
<%@ include file="header.html" %>
<div style="padding-top: 10px; width: 100%; height: 100%;">
    <form action="/SignUp" method="post">
        <table>
            <tr><td>
        First name:</td>
                <td> <input type="text" name="fname"><br></td></tr>
            <tr><td>
        Last name:</td>
                <td><input type="text" name="lname"><br></td></tr>
            <tr><td>
        Contact:</td>
                <td><input type="text" name="contact"><br></td></tr>
            <tr>
                <td>
        Email:</td><td> <input type="text" name="email"><br></td></tr>
            <tr>
                <td>
                    UserName:</td><td> <input type="text" name="username"><br></td></tr>
            <tr>
                <td>
                    Password:</td><td> <input type="password" name="password"><br></td></tr>
            <tr>
                <td>
        <input type="submit" value="Submit"></td></tr>
        </table>
    </form>
</div>
</body>
</html>
