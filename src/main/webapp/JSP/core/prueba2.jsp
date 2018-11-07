<%-- 
    Document   : prueba2
    Created on : Nov 6, 2018, 8:12:13 PM
    Author     : atomsk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:set var="a" value="2"></c:set>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Variable = <c:out value="a"></c:out></h1>
    </body>
</html>
