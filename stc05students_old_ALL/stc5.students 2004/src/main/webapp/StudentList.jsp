<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Students</title>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <style>
        table,th,td
        {
            /*border:1px solid black;*/
        }
    </style>
</head>
<body>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Group</th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${requestScope.students}" var="student">
                <tr>
                    <td><c:out value="${student.id}"></c:out></td>
                    <td><c:out value="${student.name}"></c:out></td>
                    <td><c:out value="${student.age}"></c:out></td>
                    <td><c:out value="${student.groupId}"></c:out></td>
                    <td><a href="${pageContext.request.contextPath}/students/?edit=${student.id}">Редактировать</a>  <a href="${pageContext.request.contextPath}/students/?delete=${student.id}" onclick="if (!confirm('Are you sure?')) return false;">Удалить</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="${pageContext.request.contextPath}/students/?add=1">Добавить</a></p>
</body>
</html>