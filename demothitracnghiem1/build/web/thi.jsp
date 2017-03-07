<%-- 
    Document   : thi
    Created on : Aug 20, 2016, 3:22:50 PM
    Author     : Hiep
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thi</title>
    </head>
    <body  bgcolor="#E6E6FF">
        <%HttpSession ss=request.getSession();
                String username=(String)ss.getAttribute("username1");
                String pass=(String)ss.getAttribute("password1");
                String masv=(String)ss.getAttribute("masv");%>
        <form>
           <center><h3>DANH SÁCH CÁC MÔN THI</h3>
           <sql:setDataSource
        var="myDS"
        driver="com.microsoft.sqlserver.jdbc.SQLServerDriver"
        url="jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM"
        user="<%=username%>" password="<%=pass%>"
        />

    <sql:query var="listbaithi"   dataSource="${myDS}">
        select idthi,mamh,(select tenmh from Monhoc where mamh=dkthi.mamh) as tenmh, trinhdo,ngaythi,lan,socauhoi,thoigian from DKthi where malop=(select malop from Sinhvien where masv='<%=masv%>')and DATEDIFF(DAY,GETDATE(),ngaythi)>=0;
    </sql:query>
                    <c:forEach var="baithi" items="${listbaithi.rows}">
                        <table border="1" ><tr><td>Tên Môn Học</td><td>Trình độ</td><td>Lần Thi</td><td>số câu hỏi</td><td>Ngày Thi</td><td>Thời gian</td></tr>  
                       <tr> <td> <a href="chuanbithi.jsp?idthi=${baithi.idthi}&mamh=${baithi.mamh}&lan=${baithi.lan}&thoigian=${baithi.thoigian}&trinhdo=${baithi.trinhdo}">${baithi.tenmh}</a></td> <td><a href="#">${baithi.trinhdo}</a></td>
                    <td>    ${baithi.lan} </td> <td>${baithi.socauhoi}</td>  <td>  ${baithi.ngaythi}</td>  <td>  ${baithi.thoigian} phút</td> </tr>
                        
                        </table>
            </c:forEach>
                        </center> 
        </form>
        
    </body>
</html>
