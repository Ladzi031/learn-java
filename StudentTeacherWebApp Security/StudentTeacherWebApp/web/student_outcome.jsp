<%-- 
    Document   : student_outcome
    Created on : 24 May 2024, 9:53:55 PM
    Author     : Ladzani_fabian
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Find student outcome</h1>
        <%
            Student student = (Student) request.getAttribute("student");
            String name = student.getName();
            Long studentNum = student.getStudentNum();
            Integer age = student.getAge();
        %>
        <p>The student has beeb found. below are the details of the student.</p>
        <table>
            <tr>
                <td>name</td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>Age</td>
                <td><%=age%></td>
            </tr>
            <tr>
                <td>student Number</td>
                <td><%=studentNum%></td>
            </tr>
        </table>
            
            <p>click <a href="menu.html">here</a> to go back the menu page.</p>
            <p>click <a href="LogoutServlet.do">here</a> to logout.</p>
    </body>
</html>
