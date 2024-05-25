<%-- 
    Document   : employees_outcome
    Created on : 25 May 2024, 2:14:17 PM
    Author     : Ladzani_fabian
--%>

<%@page import="java.util.Date"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entities.Employees"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String value = (String) request.getAttribute("value");
            List<Employees> employees = (List<Employees>)request.getAttribute("emps");
        %>
        <h1>Result for employee with <%=value%> Temperatures</h1>
        
        <table>
            <%
                for(Employees e: employees) {
                    Long id = e.getId();
                    String name = e.getName();
                    Double temp = e.getTemperature();
                    Date date = e.getCreationDate();
                    String outcome = temp <= 38.0 ? "Acceptable" : "High";
            %>
            
            <tr>
                <td>id</td>
                <td><%=id%></td>
            </tr>
            <tr>
                <td>name</td>
                <td><%=name%></td>
            </tr>
            <tr>
                <td>temperature</td>
                <td><%=temp%></td>
            </tr>
            <tr>
                <td>creation date</td>
                <td><%=date%></td>
            </tr>
            <tr>
                <td>final verdict</td>
                <td><%=outcome%></td>
            </tr>
            <%
                }
            %>
        </table>
        <p>actions</p>
        <ul>
            <li><a href="menu.html">menu</a></li>
            <li><a href="LogoutServlet.do">logout</a></li>
        </ul>
    </body>
</html>
