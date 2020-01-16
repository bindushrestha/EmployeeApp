<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Web App Sample</title>
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
  <div style="padding-top: 10px">
    <div style="background-color: #4CAF50; width: 100%; height: 25px; color: white"> ${message}</div>
    <div style="padding-top: 10px">
      <form>
    <button value="sign in" type="submit" formaction="signin.jsp"> sign in</button>
    <button value ="sign up" type="submit" formaction="signup.jsp">sign up</button>
    </tr>
    </table>
  </form></div>
  </div>
  </body>
</html>