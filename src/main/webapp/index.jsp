
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Task 3.3 by Barbara Talakh</title>
</head>
<body>

<p style="margin: 50px 20px">
<form action="${pageContext.request.contextPath}/controller" method="get">
    <input type="hidden" name="command" value="DOM">
    <input type="submit" value="DOM">
</form>
<form action="${pageContext.request.contextPath}/controller" method="get">
    <input type="hidden" name="command" value="SAX">
    <input type="submit" value="SAX">
</form>
<form action="${pageContext.request.contextPath}/controller" method="get">
    <input type="hidden" name="command" value="STAX">
    <input type="submit" value="STAX">
</form>
</p>
</body>
</html>
