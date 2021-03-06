<%--
  Created by IntelliJ IDEA.
  User: zhangchf
  Date: 26/12/2017
  Time: 12:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        <br/><br/>
        First name:
        <form:input path="firstName"/>

        <br/><br/>
        Last name:
        <form:input path="lastName"/>

        <br/><br/>
        Country:
        <form:select path="country">
            <%--Hard-coded options--%>
            <form:option value="CN" label="China"/>
            <form:option value="RU" label="Russia"/>
            <%--Options passed from model--%>
            <form:options items="${student.countryOptions}"/>
            <%--Property country options--%>
            <form:options items="${propertyCountryOptions}"/>
        </form:select>

        <br/><br/>
        Favorite Language:
        <form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"/>
        <form:radiobutton path="favoriteLanguage" label="Other" value="Other"/>

        <br/><br/>

        Operating Systems:
        <form:checkbox path="operatingSystems" value="Linux"/>Linux
        <form:checkbox path="operatingSystems" value="Mac OS" label="Mac OS"/>
        <form:checkbox path="operatingSystems" value="MS Windows" label="MS Windows"/>
        <br/><br/>

        <input type="submit" value="Submit"/>

    </form:form>
</body>
</html>
