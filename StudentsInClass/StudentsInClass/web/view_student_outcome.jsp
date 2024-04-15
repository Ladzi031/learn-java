<%-- 
    Document   : view_student_outcome
    Created on : 15 Apr 2024, 17:43:22
    Author     : Ladzani_fabian
--%>
<%@page import="com.practice.domain.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>student details</title>
    </head>
    <body>
        <h1>view Student details</h1>

        <%
            Student student = (Student)request.getAttribute("student");
            String name = student.getName();
            String surname = student.getSurname();
            String studentNumber = student.getStudentNumber();
        %>

        <table>
            <tr>
                <td>Name: </td>
                <td> <%=name %> </td>
            </tr>
            <tr>
                <td>Surname: </td>
                <td> <%=surname%> </td>
            </tr>
            <tr>
                <td>student Number: </td>
                <td> <%=studentNumber %> </td>
            </tr>
        </table>

        <br>
        <br>
        <small>please note: when the student details are null(s) it means one of two things(the student did not exists in the first place or you gave a wrong student number)</small>
        <p>click <a href="index.html">here</a> to go back to the main menu page.</p>

    </body>
</html>
