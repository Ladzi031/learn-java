<%-- 
    Document   : toInches
    Created on : 24 May 2024, 3:50:00 PM
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>meters to inches conversion page</title>
    </head>
    <body>
        <h1>Meters to inches conversion</h1>
        <p>Please enter a meter value below.</p>
        <form action="MetersToInchesServlet.do" method="POST">
            <table>
                <tr>
                    <td>Meters</td>
                    <td><input type="text" name="meters" required></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="convert"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
