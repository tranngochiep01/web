<%-- 
    Document   : chuanbith
    Created on : Aug 24, 2016, 11:37:13 AM
    Author     : Hiep
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="control.SQLServerConnUtils_SQLJDBC"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>chuan bi thi</title>
    </head>
    <body>
        <% String idthi=request.getParameter("idthi");
        int id=0;
        String mamh=request.getParameter("mamh");
        int lan=Integer.parseInt(request.getParameter("lan"));
        String trinhdo=request.getParameter("trinhdo");
            int thoigian=Integer.parseInt(request.getParameter("thoigian"));
        HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
              String masv = (String) ss.getAttribute("masv");
            
            //SQLServerConnUtils_SQLJDBC sqlconn=new SQLServerConnUtils_SQLJDBC();
             //Connection conn=sqlconn.getSQLServerConnUtils_SQLJDBC(username, pass);
         String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sqlkt="select * from diemthi where masv='"+masv+"' and mamh='"+mamh+"' and lan="+lan+" and idthi="+idthi;
            PreparedStatement stmkt=conn.prepareStatement(sqlkt);
            ResultSet rskt=stmkt.executeQuery();
            
            if(!rskt.next()){
                      String sql="select * from Dkthitam where masv=? and mamh=? and lan=?";
            PreparedStatement stm=conn.prepareStatement(sql);
            stm.setString(1,masv);
            stm.setString(2,mamh);
            stm.setInt(3,lan);
            ResultSet rs=stm.executeQuery();
            if(!rs.next()){
                String sql1="insert into Dkthitam values(?,?,?,?,?)";
                stm=conn.prepareStatement(sql1);
                stm.setString(1,mamh);
                stm.setString(2,masv);
                stm.setString(3,trinhdo);
                stm.setInt(4,thoigian);
                stm.setInt(5,lan);
                stm.executeUpdate();
                String sql2="select max(id) as id from Dkthitam ";
                 stm=conn.prepareStatement(sql2);
                 rs=stm.executeQuery();
                 while(rs.next()){
                     id=rs.getInt("id");
                 }
               String sql3 = "select * from cauhoi where macauhoi in (select macauhoi from ctdethi where idthi=" + idthi + ") ORDER BY newid()";
               stm=conn.prepareStatement(sql3);
               rs=stm.executeQuery();
               while(rs.next()){
                   String sql4="insert into thitam values(?,?,?,'z',?)";
                   stm=conn.prepareStatement(sql4);
                   stm.setInt(1,id);
                   stm.setString(2,rs.getString("macauhoi"));
                   stm.setString(3,rs.getString("noidung"));
                   stm.setString(4,rs.getString("dapan") );
                   stm.executeUpdate();
               }
            }
            String sql5="select id,thoigian from dkthitam where masv=? and mamh=? and lan=?";
                 stm=conn.prepareStatement(sql5);
                 stm.setString(1,masv);
                 stm.setString(2,mamh);
                 stm.setInt(3,lan);
                 rs=stm.executeQuery();
                 while(rs.next()){
                     id=rs.getInt("id");
                     thoigian=rs.getInt("thoigian");
                     
                 }
        %>
            Thời gian làm bài là:<h3> <%=thoigian %> Phút</h3> kể từ khi bấm vào nút thi.
        Chúc các em thi tốt.
        <form action="thi1.jsp">
            <input type="hidden" name="idthi" value="<%=idthi%>"/>
             <input type="hidden" name="id" value="<%=id%>"/>
             <input type="hidden" name="mamh" value="<%=mamh%>"/>
              <input type="hidden" name="lan" value="<%=lan%>"/>
              <input type="hidden" name="thoigian" value="<%=thoigian%>"/>
            <input type="submit" name="submit" value="thi"/>
        </form>
              <%
              
            }
            else{
                %>
                     <script type="text/javascript">alert("bạn đã làm bài rồi, không thể làm nữa");</script>
                     
               <%
                
                    response.sendRedirect("diemthi.jsp");
            }%>
      
    
    </body>
</html>
