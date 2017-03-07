<%-- 
    Document   : Dang ky
    Created on : Aug 18, 2016, 11:58:21 AM
    Author     : Hiep
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đăng Ký</title>
    
    </head>
    <body  bgcolor="#E6E6FF">
       
    <center>
        <h2 style="color: blue">Thông tin đăng ký</h2>
    </center>
        <%
         HttpSession ss = request.getSession();
         String thongbao=request.getParameter("thongbao");
         if(thongbao!=null){%>
              <script type="text/javascript">alert("Đã lưu đăng ký thành công");</script>
        <% }
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            //String masv = (String) ss.getAttribute("masv");     
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);%>
              <form  method = "post" action = "Controller">
           <% String sql="SELECT tenlop from lop" ;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            %>
            <center>
            <table>
                <tr>
                    <td>&nbsp Tên Lớp : </td>
                    
                    <td>  <select id="lop" name="lop">
                        <% while(rs.next()){%>
                     
                        <option><%=rs.getString("tenlop")%>
                        <%}%> 
                            </select>
                       
                    </td>
                </tr>
                
               <% String sql1="SELECT tenmh from monhoc" ;
            Statement statement1 = (Statement) conn.createStatement();
            ResultSet rs1 = statement1.executeQuery(sql1);
            %>     
                <tr>
                    <td>&nbsp Tên Môn Học: </td>
                    
                    <td>  <select id ="mon" name = "mon">
                            <% while(rs1.next()){%>
                            <option><%=rs1.getString("tenmh")%></option>
                             <%}%>
                            </select>
                    </td>
                </tr>       
                 <tr>
                    <td> &nbsp Ngày thi : </td>
                    
                    <td>  <input type="date" name="ngay" min="2016-12-27">
                    </td>
                </tr> 
              <tr>
                    <td>  &nbsp Lần thi : </td>
                    
                    <td>  <select id = "lanthi" name = "lanthi">
                        <option>1 </option>
                        <option>2 </option>
                      
                    </select>
                    </td>
                </tr> 
               <tr>
                    <td>  &nbsp Trình độ </td>         
                    <td>  <select id = "trinhdo" name = "trinhdo">
                        <option>A </option>
                        <option>B </option>
                        <option>C </option>
                    </select>
                    </td>
                </tr> 
                  <tr>
                    <td> &nbsp Số câu hỏi:</td>
                    
                    <td>  <input type="number" name="socauhoi" min="0">
                    </td>
                </tr> 
                   <tr>
                    <td> &nbsp Thời Gian:</td>
                    
                    <td>   <input type="number" name="thoigian" min="0">
                    </td>
                </tr> 
                <tr>
                    <td><input type="submit" value="Đăng ký" name="submit"> </td>
                     <td><input type="reset" value = "Nhập lại" /> </td>
                     <td> <a href="homeView.jsp">Đăng xuất</a></td>
                     <td> <a href="displaygiangvien.jsp">back</a></td>
                </tr>
            </table>
            </center>
        
        </form>
    </body>
</html>
