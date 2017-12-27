<%--
  Created by IntelliJ IDEA.
  User: zhangchf
  Date: 27/12/2017
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registeration</title>

    <style>
        .cssError {
            color:red;
        }
    </style>
</head>
<body>

<i>Customer registeration, (*) Fields are required.</i>
<br/><br/>

<form:form action="processForm" modelAttribute="customer">
    First name:
    <form:input path="firstName"/>
    <br/>

    Last name:
    <form:input path="lastName"/> (*)
    <form:errors path="lastName" cssClass="cssError"/>
    <br/>

    Free passes:
    <form:input path="freePasses"/> (*)
    <form:errors path="freePasses" cssClass="cssError"/>
    <br/>

    Postal code:
    <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="cssError"/>
    <br/>

    Course code:
    <form:input path="courseCode"/>
    <form:errors path="courseCode" cssClass="cssError"/>

    <br/>
    <input type="submit">

</form:form>

</body>
</html>
