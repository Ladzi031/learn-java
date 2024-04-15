<%-- 
    Document   : update_student_outcome
    Created on : 15 Apr 2024, 17:13:38
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>update student</title>
    </head>
    <body>
        <h1>results from updating student details: </h1>
        <%
            String studentNumber = (String)request.getAttribute("student");
            Boolean isUpdated = (Boolean)request.getAttribute("isUpdated");
        %>

        <table>
            <tr>
                <td>student number: </td>
                <td> <%=studentNumber %> </td>
            </tr>
            <tr>
                <td><b>has the student been updated? </b></td>
                <td> <%=isUpdated %> </td>
            </tr>
        </table>
        <br>
        <br>
        <small>please note: when the student has not been updated means one of two things(the student did not exists in the first place or you gave a wrong student number)</small>
        <p>click <a href="index.html">here</a> to go back to the main menu page.</p>

    </body>
</html>
