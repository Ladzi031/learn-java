<%-- 
    Document   : view_list_outcome
    Created on : 15 Apr 2024, 17:51:24
    Author     : Ladzani_fabian
--%>
<%@page import="java.util.List" %>
<%@page import="com.practice.domain.Student" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view List outcome</title>
    </head>
    <body>
        <h1>view List outcome</h1>
        <%
            List<Student> classList = (List<Student>)request.getAttribute("classList");
        %>
        <table border="1">
            <tr>
                <td><b>Name</b></td>
                <td><b>Surname</b></td>
                <td><b>Student Number</b></td>
            </tr>
            <%
                for(Student student: classList) {
            %>
            <tr>
                <td><b><%=student.getName()%></b></td>
                <td><b><%=student.getSurname()%></b></td>
                <td><b><%=student.getStudentNumber()%></b></td>
            </tr>
            <% } %>
        </table>
        
        <br>
        <br>
        <p>click <a href="index.html">here</a> to go back to the main menu page.</p>
    </body>
</html>
