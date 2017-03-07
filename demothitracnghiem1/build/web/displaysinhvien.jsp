<%-- 
    Document   : displaygiangvien
    Created on : Aug 15, 2016, 12:20:52 PM
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
       
	<title>Index - Hiep.com</title>
	<script type="text/javascript" src="js.js"></script>
	<link href="admincss.css" rel="stylesheet" type="text/css">
    </head>
    <body>
        <%
         HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            String masv = (String) ss.getAttribute("masv");
            //String masv = (String) ss.getAttribute("masv");     
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sql="SELECT * from sinhvien where masv='"+masv+"'" ;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
    %>

        <div id="header">
	<div id="logo">
		<a href="#">DANH MỤC</a>
	</div>
	<div id="user-bar">
		<div id="user-option">
			<a id="user-info" href="#">
				<img src="user.jpg">
				<span>Sinh viên</span>
			</a>
			<ul>
				<li><a href="login.jsp">Đăng xuất</a></li>
			</ul>
		</div>
	</div>
</div><!--end #header-->

<div id="container">
	<div id="sidebar-menu">
		<ul id="menu">
			<li><a class="super-menu" href="thi.jsp">Thi</a>
			</li>
                        <li><a class="super-menu" href="diemthi.jsp">xemdiem</a>
			</li>
		</ul>
	</div><!--end #sidebar-menu-->

	<div id="admin-content">
		<h2 class="admin-title"> Trang Sinh Viên</h2>

		<div class="main-content-wrap">
			<div class="main-content">
				<div class="add-new-wrap">
					<table>
                                <tr>
                                    <td bgcolor="#7ab6de" ><font color="#ffffff">Thông tin Sinh Viên</<font></td>
                                </tr>
                                <tr>
                                    <td height="20px"></td>
                                </tr>
                           
                                <tr>
                                    <td>
                                        <label><b>Họ tên :</b></label> 
                                    </td>
                                    <td>
                                       <%=rs.getString("ho")%> <%=rs.getString("ten")%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Ngày sinh :</b></label> 
                                    </td>
                                    <td>
                                        <%=rs.getString("ngaysinh")%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Địa chỉ : </b></label>
                                    </td>
                                    <td>
                                        <%=rs.getString("diachi")%>
                                    </td>
                                </tr>
                              <tr>
                                        <td>
                                        <label><b>Nam/Nữ (*)</b></label>    
                                        </td>
                                        <td>
                                            <% 
                                            if(rs.getString("gioitinh").equals("nam")){%>
                                            <span>Nam</span><input disabled="disabled" checked="checked" type="radio" name="customer_gender" value="nam">
                                                <span>Nữ</span><input disabled="disabled" type="radio" name="customer_gender" value="nu"> 
                                            <%}
                                            else{%>
                                                <span>Nam</span><input disabled="disabled" type="radio" name="customer_gender" value="nam">
                                                <span>Nữ</span><input disabled="disabled" checked="checked" type="radio" name="customer_gender" value="nu"> 
                                            <%}
                                            %>
                                        
                                        </td>
                              </tr>
                                <tr>
                                    <td></td>
                                    <td><a href="login.jsp">back </a></td>
                                </tr>
                            </table>
				</div><!--end .add-new-wrap-->

			</div><!--end .main-content-->
		</div><!--end .main-content-wrap-->
	</div><!--end #admin-content-->
</div><!--end #container-->

<div id="footer">
	<h1>Design by: <a href="http://hiep.com">hiep.com</a></h1>
</div><!--end #footer-->


    </body>
</html>
