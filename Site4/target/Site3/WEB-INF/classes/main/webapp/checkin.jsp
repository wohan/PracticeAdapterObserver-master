<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

-->
<html>
<head>
    <title>CheckIn</title>
</head>
<body>
<form>
    <jsp:text>Заполните поля для регистрации</jsp:text>
</form>
<form method="post" action="/checkin">
    <jsp:text>Ваш логин</jsp:text>
    <p><input type="text" name="login"/></p>
    <p><jsp:text>Пароль</jsp:text></p>
    <p><input type="text" name="pass"/></p>
    <p><jsp:text>Номер телефона</jsp:text></p>
    <p><input type="number" name="phone"/></p>
    <p><input type = "submit" value="Зарегистрироваться"></p>
</form>
<form>
<%--<p><button formaction="/login">Зарегистрироваться</button></p>--%>
<%--<p><input type="submit" formaction="/login" value="Зарегистрироваться"/></p>--%>
</form>
</body>
</html>

