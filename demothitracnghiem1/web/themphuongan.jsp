<%-- 
    Document   : themphuongan.jsp
    Created on : Aug 29, 2016, 9:20:15 PM
    Author     : Hiep
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="js.js"></script>
     
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm phương án</title>
    </head>
    <body bgcolor="#E6E6FF">
        <form action="Controller" method="post">
        <center><table>
            <thead>
                <tr>
                 
                    <th>Tên phương án</th>
                    <th> Nội dung</th>
                </tr>
            </thead>
            <tbody>
                <tr>
              
                    <td><input type="text" name="tenpa1" value="A"/></td>
                    <td><input type="text" name="noidung1" value=""/></td>
                </tr>
                <tr>
               
                    <td><input type="text" name="tenpa2" value="B"/></td>
                    <td><input type="text" name="noidung2" value=""/></td>
                </tr>
                <tr>
                  
                    <td><input type="text" name="tenpa3" value="C"/></td>
                    <td><input type="text" name="noidung3" value=""/></td>
                </tr>
                <tr>
                  
                    <td><input type="text" name="tenpa4" value="D"/></td>
                    <td><input type="text" name="noidung4" value=""/></td>
                </tr>
                <tr><td><input type="submit" name="submit" value="thêm phương án"/></td></tr>
            </tbody>
            </table></center>
            
        </form>
    </body>
</html>
