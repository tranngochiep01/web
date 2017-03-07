<%-- 
    Document   : login
    Created on : Aug 3, 2016, 9:49:09 AM
    Author     : Hiep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor="#E6E6FF">
        ${error}
        <center><h1>Login</h1></center>
        <form action="Controller" method="POST" >
           <center> <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="txtUsername" value="" required/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="txtPassword" value="" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><INPUT TYPE="submit" value="login" name="submit"></td>
                </tr>
            </table></center>
        </form>
        
    </body>
</html>
