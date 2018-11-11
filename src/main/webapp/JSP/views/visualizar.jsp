<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
	<h1>Ejemplos de traducción de textos mediante fmt</h1>
	<h2>Has elegido <c:out value="${pais}"></c:out></h2>
	<fmt:setLocale value="${localeString}"/>
	
        <fmt:bundle basename = "${localeString}">
	    <p>Hola = <fmt:message key="strings.hola"/></p>
	    <p>Adios = <fmt:message key="strings.adios"/></p>
        </fmt:bundle>
	
	
        <fmt:bundle basename = "gmt">
            <fmt:message var="gmt" key = "${localeString}"/>
        </fmt:bundle>
	<h3>Horas</h3>
	<span>Hora formato corto: <fmt:formatDate type="time" timeStyle="short" timeZone="${gmt}"  value="${fecha}" /></span><br>
	<span>Hora formato medio: <fmt:formatDate type="time" timeStyle="medium" timeZone="${gmt}"  value="${fecha}" /></span><br>
	<span>Hora formato largo: <fmt:formatDate type="time" timeStyle="long" timeZone="${gmt}"  value="${fecha}" /></span><br>
	
        <h3>Números</h3>
	<span><fmt:formatNumber type="currency" value="${numero}" /></span><br>
	<span><fmt:formatNumber type="number" groupingUsed="true" value="${numero}" /></span><br>
	<span><fmt:formatNumber type="number" maxIntegerDigits="3" value="${numero}" /></span><br>
	<span><fmt:formatNumber type="number" maxFractionDigits="6" value="${numero}" /></span><br>
	<span><fmt:formatNumber type="percent" maxIntegerDigits="4" value="${numero}" /></span><br>
	<span><fmt:formatNumber type="number" pattern="####.###" value="${numero}" /></span><br>
	
	<a href="<c:url value = "index.html"/>">Volver</a>
    </body>
</html>
