<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <spring:url value="resources/js/" var="js"/>

</head>
<body>
    <h1>welcome</h1>
    <div id="root"></div>
    <script type="text/javascript" src="${js}bundle.js"></script>
</body>
</html>
