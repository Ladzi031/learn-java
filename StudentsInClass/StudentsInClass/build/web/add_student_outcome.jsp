<%-- 
    Document   : add_student_outcome
    Created on : 15 Apr 2024, 16:11:27
    Author     : Ladzani_fabian
--%>
<%@page import="com.practice.domain.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>add student outcome</title>
    </head>
    <body>
        <h1>add student result</h1>

        <%
            Student student = (Student)request.getAttribute("student");
            String name = student.getName();
            String surname = student.getSurname();
            String studentNumber = student.getStudentNumber();
        %>

        <p>The student <b><%=name %> <%=surname %></b>, with student number: <b><%=studentNumber%></b> has be saved to the class list</p>

        <p>click <a href="index.html">here</a> to go back to the main menu page.</p>
    </body>

</html>
