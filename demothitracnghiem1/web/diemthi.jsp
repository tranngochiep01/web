<%-- 
    Document   : diemthi.jsp
    Created on : Aug 28, 2016, 10:50:05 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
            HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            String masv = (String) ss.getAttribute("masv");
            int i = 1;
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sql = "select mamh,lan,diem,idthi,(select tenmh from monhoc where mamh=diemthi.mamh) as tenmh from diemthi where masv='"+masv+"'";
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            %>
        <table cellspacing="50px">
            <tr>
                <th>tên môn học</th>
                <th>lần thi</th>
                <th>điểm</th>
                <th>xem chi tiết</th>
            </tr>
            <%
            while(rs.next()){%>
            <tr>
                <td><%=rs.getString("tenmh") %></td>
                <td><%=rs.getInt("lan") %></td>
                <td><%=rs.getInt("diem") %></td>
                <td><a href="chitietbaithi.jsp?idthi=<%=rs.getInt("idthi") %>">Chi tiết bài thi trước</a></td>
            </tr>
            <%}
            %>
        </table>
    </body>
</html>
