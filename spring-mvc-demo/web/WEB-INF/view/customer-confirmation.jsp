<%--
  Created by IntelliJ IDEA.
  User: zhangchf
  Date: 27/12/2017
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>

Customer is confirmed: ${customer.firstName} ${customer.lastName}

<br/><br/>

Free passes: ${customer.freePasses}

<br/><br/>

Postal code: ${customer.postalCode}

<br/><br/>

Course code: ${customer.courseCode}

</body>
</html>
