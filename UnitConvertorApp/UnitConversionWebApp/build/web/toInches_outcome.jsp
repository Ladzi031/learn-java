<%-- 
    Document   : toInches_outcome
    Created on : 24 May 2024, 3:55:18 PM
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meters To Inches Outcome Page</title>
    </head>
    <body>
        <h1>Meters to inches outcome</h1>
        <%
            Float meters = (Float) request.getAttribute("meters");
            Float inches = (Float) request.getAttribute("inches");
        %>
        <p>
            <b><%=meters%></b> meters is equivalent to <b><%=inches%></b> inches.<br>
            Please click <a href="index.html">here</a> to go back to the menus or <a href="LogoutServlet.do">here</a> to logout
        </p>
    </body>
</html>
