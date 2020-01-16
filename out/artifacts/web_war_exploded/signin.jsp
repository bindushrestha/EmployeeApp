<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 30-12-2019
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
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
<div class="contentContainer" style="padding-top: 10px">
<form action="/signin" method="post">
    Username : <input type="text" width="30" name="name">
    <br>
    Password : <input type="password" width="30" name="password">
    <br>
    <br>
    <button value="sign in" type="submit"> sign in</button>

</form>
</div>
</body>
</html>
