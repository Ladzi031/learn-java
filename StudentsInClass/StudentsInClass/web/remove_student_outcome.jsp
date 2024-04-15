<%-- 
    Document   : remove_student_outcome
    Created on : 15 Apr 2024, 16:37:43
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>remove student outcome</title>
    </head>
    <body>
        <h1>results for removing student in the class-list</h1>
        <%
            String studentNumber = (String)request.getAttribute("student");
            Boolean isRemoved = (Boolean)request.getAttribute("isRemoved");
        %>
        <table>
            <tr>
                <td>student number: </td>
                <td><%=studentNumber %></td>
            </tr>
            <tr>
                <td><b>Has the student been removed?</b></td>
                <td><%=isRemoved %></td>
            </tr>
        </table>
            <br>
            <br>
        <small>please note: when the student has not been removed means one of two things(the student did not exists in the first place or you gave a wrong student number)</small>
        <p>click <a href="index.html">here</a> to go back to the main menu page.</p>
    </body>
</html>
