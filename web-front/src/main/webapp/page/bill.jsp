<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>bill</title>
</head>
<body>

<table border="1">
    <c:forEach items="${billList}" var="b">
        <tr>
            <td>${b.billcode}</td>
            <td>${b.createdby}</td>
            <td>${b.creationdate}</td>
            <td>${b.id}</td>
            <td>${b.productdesc}</td>

        </tr>


    </c:forEach>


</table>

</body>
</html>
