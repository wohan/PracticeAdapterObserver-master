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
        </tr>
    </c:forEach>
</table>


<button accesskey="Редактировать">...</button>
<button accesskey="Удалить">...</button>
</body>
</html>

HTML 4.01IECrOpSaFx
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Frameset//EN"
"http://www.w3.org/TR/html4/frameset.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Тег FRAME, атрибут frameborder</title>
</head>

<frameset cols="100,*,20%">
    <frame src="left.html" name="leftFrame" frameborder="0">
    <frame src="main.html" name="mainFrame" frameborder="0">
    <frame src="right.html" name="rightFrame" frameborder="0">
</frameset>

</html>
