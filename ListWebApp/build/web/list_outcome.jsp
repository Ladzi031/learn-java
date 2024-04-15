<%-- 
    Document   : list_outcome
    Created on : 15 Apr 2024, 13:12:07
    Author     : Ladzani_fabian
--%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get List outcome</title>
    </head>
    <body>
        <h1>Get List Outcome</h1>
        <%
            List<Integer> list = (List<Integer>)request.getAttribute("numbers");
        %>
        <p>below are the list of numbers</p>
        <table>
            <%
                for(Integer num: list) {
                   
            %>
            <tr>
                <td><%=num %></td>
            </tr>
            <%
                } 
            %>
        </table>
        <p>Please click <a href="menu.html">here</a> to go back to the menu or <a href="index.html">here</a> to go to the main page.</p>
    </body>
</html>
