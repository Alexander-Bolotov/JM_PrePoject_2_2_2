<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
${title}
    </title>
</head>
<body>
<a href="${pageContext.request.contextPath}/hello"> Перейти на hello</a>
<p>CARS PAGE!</p>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>
</body>
</html>
