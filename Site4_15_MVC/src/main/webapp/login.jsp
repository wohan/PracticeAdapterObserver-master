<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

-->
<html>
<head>
    <title>Login</title>
</head>
<body>
<form>
    <jsp:text>Приветствуем Вас!</jsp:text>
</form>
<form action="${pageContext.servletContext.contextPath}/login" method="post" action="/login">
    <p><jsp:text>Введите логин</jsp:text></p>
    <p><input type="text" name="login" value="${buyer.login}"/></p>
    <p><jsp:text>Введите пароль для авторизации</jsp:text></p>
    <p><input type="text" name="pass" value="${buyer.pass}"/></p>
    <p><input type="submit" value="Вход"/></p>
</form>
<form>
    <p><button formaction="/checkin">Регистрация</button></p>
</form>
</body>
</html>

