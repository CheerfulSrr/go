<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: cheer
  Date: 8/10/2020
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>GO</title>

  <spring:url value="/resources/js/" var="js"/>

</head>
<body>
<p>index</p>
<div id="root"></div>
<script src="${pageContext.request.contextPath}${js}bundle.js"></script>

</body>
</html>
