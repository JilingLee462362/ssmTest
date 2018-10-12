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
            <td>${b}</td>
            <td></td>
            <td></td>
            <td></td>
        </tr>




    </c:forEach>



</table>

</body>
</html>
