<%--
  Created by IntelliJ IDEA.
  User: rodsanati
  Date: 1/23/21
  Time: 11:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Albums List</title>
</head>
<body>
<c:forEach var="albums" items="${albums}">
    <div class="ad">
        <h2>ad title: ${.title}</h2>
        <p>ad description: ${.description}</p>
    </div>
</c:forEach>
</body>
</html>
