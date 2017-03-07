<%-- 
    Document   : chitietbaithi.jsp
    Created on : Aug 28, 2016, 11:20:43 AM
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
            int idthi=Integer.parseInt( request.getParameter("idthi"));
              HttpSession ss = request.getSession();
               String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            String masv = (String) ss.getAttribute("masv"); 
           int i=1;
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sql = "select macauhoi,idthi,luachonsv,(select noidung from Cauhoi where macauhoi=Thi.macauhoi) as noidung from Thi where idthi="+idthi;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            %>
             <center><h2>Bài Thi</h2></center> 
               <%
                   while (rs.next()) {%>
        Câu:<%=i%>:<%=rs.getString("noidung")%>:<br>
        <%
            String sql1 = "select * from phuongan where macauhoi=" + rs.getInt("macauhoi");
            Statement statement1 = (Statement) conn.createStatement();
            ResultSet rs1 = statement1.executeQuery(sql1);
            while (rs1.next()) {
             if (rs.getString("luachonsv").equals(rs1.getString("tenluachon"))) {%>
             <input disabled="disabled" checked="checked" type="radio" name="cau<%=i%>" value="<%=rs1.getString("tenluachon")%>"><%=rs1.getString("noidung")%><br>
        <%} else {%>
        <input disabled="disabled" type="radio" name="cau<%=i%>" value="<%=rs1.getString("tenluachon")%>"><%=rs1.getString("noidung")%><br>
        <%}

                }
                i = i + 1;
            }
        %>
    </body>
</html>
