<%-- 
    Document   : add_outcome
    Created on : 15 Apr 2024, 12:27:07
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add outcome</title>
    </head>
    <body>
        <h1>Add outcome</h1>
        <%
            Integer num = (Integer) request.getAttribute("numStr");
        %>
        <p>
            The number <b><%=num %></b> has been added to the list.
        </p>
        <p>Please click <a href="menu.html">here</a> to go back to the menu or <a href="index.html">here</a> to go to the main page.</p>
    </body>
</html>
