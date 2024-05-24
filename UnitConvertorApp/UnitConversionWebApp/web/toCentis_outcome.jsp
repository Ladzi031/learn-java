<%-- 
    Document   : toCentis_outcome
    Created on : 24 May 2024, 4:24:08 PM
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Meters To Centimeters Outcome Page</title>
    </head>
    <body>
        <h1>Meters to centimeters outcome</h1>
        <%
            Float meters = (Float) request.getAttribute("meters");
            Float centis = (Float) request.getAttribute("centis");
        %>
        <p>     
            <b><%=meters%></b> meters is equivalent to <b><%=centis%></b> centimeters.</br>
            Please click <a href="index.html">here</a> to go back
        </p>
    </body>
</html>
