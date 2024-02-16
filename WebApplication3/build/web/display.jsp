<%-- 
    Document   : display
    Created on : 16 Feb 2024, 13:14:45
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% String result = (String) request.getAttribute("answer"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>answer page</title>
    </head>
    <body>
        
        <h1>Answer: <%=result %> </h1>
    </body>
</html>
