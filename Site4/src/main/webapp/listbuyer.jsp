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
    <p><button formaction="/login">Выход</button></p>
</form>

<% String message = (String) request.getAttribute("value");%>
<h1>
    <%=message%>
</h1>
<table>
    <c:forEach items="${requestScope.ordering}" var="ordering">
        <tr>
            <td><c:out value="${ordering.id}"></c:out></td>
            <td><c:out value="${ordering.name}"></c:out></td>
            <td><c:out value="${ordering.description}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

