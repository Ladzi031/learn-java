<%-- 
    Document   : login
    Created on : 25 May 2024, 5:30:42 PM
    Author     : Ladzani_fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="j_security_check" method="POST">
            <table>
                <tr>
                    <td>username</td>
                    <td><input type="text" name="j_username" required></td>
                </tr>
                <tr>
                    <td>password</td>
                    <td><input type="password" name="j_password" required></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login" ></td>
                </tr>
            </table>
        </form>
    </body>
</html>
