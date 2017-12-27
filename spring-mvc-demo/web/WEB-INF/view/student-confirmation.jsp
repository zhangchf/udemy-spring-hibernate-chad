<%--
  Created by IntelliJ IDEA.
  User: zhangchf
  Date: 26/12/2017
  Time: 12:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>

Student is confirmed: ${student.firstName} ${student.lastName}
<br/><br/>

Contry: ${student.country}
<br/><br/>

Favorite language: ${student.favoriteLanguage}
<br/><br/>

Operating system:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">

        <li> ${temp} </li>

    </c:forEach>
</ul>

</body>
</html>
