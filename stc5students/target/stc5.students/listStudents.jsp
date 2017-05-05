<!--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
-->
<html>
<head>
    <title>List</title>
</head>
<body>
<% String message = (String) request.getAttribute("value");%>
<h1>
    <%=message%>
</h1>
<table>
<c:forEach items="${requestScope.students}" var="student">
    <tr>
        <td><c:out value="${student.id}"></c:out></td>
        <td><c:out value="${student.name}"></c:out></td>
        <td><c:out value="${student.age}"></c:out></td>
        <td><c:out value="${student.groupId}"></c:out></td>
    </tr>
</c:forEach>
</table>
</body>
</html>
