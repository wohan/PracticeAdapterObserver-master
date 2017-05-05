<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Add new student</title>
</head>
<body>

<form method="POST" action='student'>
    student id : <input type="text" name="id" readonly value="<c:out value="${student.id}" />" /> <br />
    student name : <input type="text" name="name" value="<c:out value="${student.name}" />" /> <br />
    student age : <input type="number" name="age" value="<c:out value="${student.age}" />" /> <br />
    <input type="submit" value="Submit" />
</form>
</body>
</html>