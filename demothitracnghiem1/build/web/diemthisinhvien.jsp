<%-- 
    Document   : danhsachsv
    Created on : Aug 24, 2016, 10:43:21 AM
    Author     : Hiep
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách điểm thi</title>
    </head>
    <body   bgcolor="#E6E6FF">
             <%
         HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            //String masv = (String) ss.getAttribute("masv");   
    %>
    <sql:setDataSource
        var="myDS"
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
        url="jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM"
        user="<%=username %>" password="<%=pass %>"
        />

    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT masv,mamh,lan,diem FROM Diemthi;
    </sql:query>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption>Danh sách điểm thi</caption>
            <tr>
                <th>Mã Sinh viên</th>
                <th>Mã môn học</th>
                <th>Lần</th>
                <th>Điểm</th>
                
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                 <td><c:out value="${user.masv}" /></td>
                <td><c:out value="${user.mamh}" /></td>
                <td><c:out value="${user.lan}" /></td>
                <td><c:out value="${user.diem}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
