<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


-->
<html>
<head>
    <title>List</title>
</head>
<body>

<form>
    <p><button formaction="/">Выход</button></p>
</form>

<%--<% String message = (String) request.getAttribute("value");%>--%>
<%--<h1>--%>
    <%--<%=message%>--%>
<%--</h1>--%>
<%@ page isELIgnored="false" %>

<table>

    <form>
        <text>id:     </text>
        <text>Имя:    </text>
        <text> Телефон:      </text>
    </form>

    <c:forEach items="${requestScope.buyers}" var="buyer">
        <tr>
            <td><c:out value="${buyer.id}"></c:out></td>
            <td><c:out value="${buyer.user_name}"></c:out></td>
            <td><c:out value="${buyer.phone}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
