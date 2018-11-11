<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--obligatorio ponerlo--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<form action="Formatos" method="post">
	    <c:set var="locales" value="${sessionScope.locales}"/>
	    <select name="seleccionPais">
	    <c:forEach var="locale" items="${locales}">
		<option value="${locale.value}-${locale.key}">${locale.key}</option>
	    </c:forEach>
	    <input type="submit" value="Continuar">
	</select>
	</form>
	<a href="<c:url value = "/index.html"/>">Volver</a>
    </body>
</html>
