<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<c:forEach var="msq" items="${messages}">
    <h1>${msq}</h1>
</c:forEach>

<form method="get" action="/cars">
    <table>
        <tr>
            <td><label for="loginField">locale</label></td>
            <td><input id="loginField" type="text" name="locale"></td>
        </tr>
    </table>
</form>

</body>
</html>
