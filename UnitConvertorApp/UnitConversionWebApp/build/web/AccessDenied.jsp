<%-- 
    Document   : AccessDenied
    Created on : 24 May 2024, 7:22:20 PM
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Access Denied</h1>
        <%
            session.invalidate();
        %>
        <p>your are not allowed to access the requested resource.</p>
        <p>Please click <a href="index.html">here</a> to go back.</p>
    </body>
</html>
