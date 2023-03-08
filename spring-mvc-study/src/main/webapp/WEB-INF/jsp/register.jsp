<%--
  Created by IntelliJ IDEA.
  User: 11857
  Date: 2023/3/7
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
    <h2>注册</h2>
<form action="${pageContext.request.contestPath}/registerUser" method="post">
    <label>用户名:
        <input type="text" name = "username"/>
    </label>
    <br>
    <label>
        密码:
        <input type="text" name="password"/>
    </label>
    <br>
    <input type = "submit" value="注册"/>
</form>
</body>
</html>
