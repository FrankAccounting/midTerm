<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sstan
  Date: 10/14/2019
  Time: 8:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>binding</title>
</head>
<body>
<form:form action="process-form-binding" modelAttribute="steve">

    firstname = <form:input path="firstName"/>
    lastname = <form:input path="lastName"/>
    <input type="submit">

</form:form>
</body>
</html>
