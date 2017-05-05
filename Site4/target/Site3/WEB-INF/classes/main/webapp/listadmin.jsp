
<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
-->
<html>
<head>
    <title>List</title>
</head>
<body>

<form>
    <p><button formaction="/login">Выход</button></p>
</form>

<%--<% String message = (String) request.getAttribute("value");%>--%>
<%--<h1>--%>
    <%--<%=message%>--%>
<%--</h1>--%>
<table>
    <c:forEach items="${requestScope.buyers}" var="buyers">
        <tr>
            <td><c:out value="${buyers.id}"></c:out></td>
            <td><c:out value="${buyers.user_name}"></c:out></td>
            <td><c:out value="${buyers.phone}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
