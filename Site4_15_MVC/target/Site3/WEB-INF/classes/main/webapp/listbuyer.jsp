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
<table>

    <form>
        <text>id:     </text>
        <text>Дата:    </text>
        <text>  Описание:    </text>
    </form>

    <c:forEach items="${requestScope.orderings}" var="ordering">
        <tr>
            <td><c:out value="${ordering.id}"></c:out></td>
            <td><c:out value="${ordering.data}"></c:out></td>
            <td><c:out value="${ordering.description}"></c:out></td>
        </tr>
    </c:forEach>
</table>
<table>

    <form>
        <text>id:     </text>
        <text>Название:    </text>
        <text>  Цена:    </text>
        <text>  Количество:    </text>
    </form>
    <c:forEach items="${requestScope.products}" var="product">
        <tr>
            <td><c:out value="${product.id}"></c:out></td>
            <td><c:out value="${product.name}"></c:out></td>
            <td><c:out value="${product.price}"></c:out></td>
            <td><c:out value="${product.quantity}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

