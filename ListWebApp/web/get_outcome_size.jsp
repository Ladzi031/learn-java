<%-- 
    Document   : get_outcome_size
    Created on : 15 Apr 2024, 12:51:34
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>size outcome</title>
    </head>
    <body>
        <h1>size outcome</h1>
        <%
            Integer size = (Integer) request.getAttribute("size");
            
        %>
        <p>
            The are <b><%=size %></b> numbers in the list.
        </p>
        <p>Please click <a href="menu.html">here</a> to go back to the menu or <a href="index.html">here</a> to go to the main page.</p>
    </body>
</html>
