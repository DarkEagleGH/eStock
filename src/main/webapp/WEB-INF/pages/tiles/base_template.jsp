<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>eStock home page</title>
    <link href="<spring:url value="resources"/>/css/estock.css"
          rel="stylesheet"
          type="text/css"/>
</head>
<body>

<div id="header">
    <tiles:insertAttribute name="header"/>
</div>
<div id="container">
    <tiles:importAttribute name="pages"/>
    <c:forEach var="page" items="${pages}">
        <tiles:insertAttribute value="${page}" flush="true"/>
    </c:forEach>
</div>
</body>
</html>
