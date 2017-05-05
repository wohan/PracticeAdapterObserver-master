<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19.04.2017
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- https://mvnrepository.com/artifact/jstl/jstl -->
<dependency>
    <groupId>jstl</groupId>
    <artifactId>jstl</artifactId>
    <version>1.2</version>
</dependency>

<html>
<head>
    <title>list</title>
</head>
<body>
<% String messange = (String) request.getAttribute( "value" );%>
<h1>
    <%=messange%>
    <%

    %>
</h1>
<c:forEach items="${requestScope.list}" var="student">
    <tr>
        <td><c:out value="${student.id}"></c:out></td>
        <td><c:out value="${student.name}"></c:out></td>
        <td><c:out value="${student.age}"></c:out></td>
        <td><c:out value="${student.group_id}"></c:out></td>
    </tr>
</c:forEach>
</body>
</html>
