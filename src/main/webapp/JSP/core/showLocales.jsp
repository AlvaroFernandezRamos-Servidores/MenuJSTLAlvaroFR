<%-- 
    Document   : prueba
    Created on : 29 oct. 2018, 19:12:48
    Author     : paco
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--obligatorio ponerlo--%>
<%--<jsp:directive.include contentType="text/html" pageEncoding ="UTF-8"/>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<form action="Formatos" method="post">
	    <c:set var="locales" value="${sessionScope.locales}"/>
	    <select>
	    <c:forEach var="locale" items="${locales}">
		<option value="${locale.value}-${locale.key}">${locale.key}</option>
	    </c:forEach>
	    <input type="submit" value="Continuar">
	</select>
	</form>
    </body>
</html>
