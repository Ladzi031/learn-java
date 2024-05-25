<%-- 
    Document   : getallstudents_outcome
    Created on : 24 May 2024, 10:06:45 PM
    Author     : Ladzani_fabian
--%>

<%@page import="za.ac.tut.entities.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Class List</h1>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
        %>
        <table>
            <%
                for(Student student: students) {
                   String name = student.getName();
                   Integer age = student.getAge();
                   Long studentNum = student.getStudentNum();
            %>
            <tr>
                <td>name</td>
                <td><%=name%></td>
                
            </tr>
             <tr>
                <td>Age</td>
                <td><%=age%></td>
                
            </tr>
             <tr>
                <td>student number</td>
                <td><%=studentNum%></td>
                
            </tr>
            <%
                }
            %>
        </table>
        
        <p><a href="menu.html">menu</a></p>
        <p><a href="LogoutServlet.do">Logout</a></p>
    </body>
</html>
