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
        <!--  <meta http-equiv="content-type" content="text/html" charset="utf-8"/>-->
        <title>Index - Hiep.com</title>
        <script type="text/javascript" src="js.js"></script>
        <link href="admincss.css" rel="stylesheet" type="text/css">
    </head>
    <body>
                  <%
         HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            //String masv = (String) ss.getAttribute("masv");     
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sql="SELECT * from giangvien where magv='"+username+"'" ;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            rs.next();
    %>
        ${error}
        <div id="header">
            <div id="logo">
                <a href="#">DANH MỤC</a>
            </div>
            <div id="user-bar">
                <div id="user-option">
                    <a id="user-info" href="#">
                        <img src="user.jpg">
                        <span>Giảng viên</span>
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
                    <li><a class="super-menu" href="${pageContext.request.contextPath}/themcauhoi.jsp">Soạn Câu Hỏi</a>
                    </li>
                    <li><a class="super-menu" href="${pageContext.request.contextPath}/dangky.jsp">Đăng ký thi</a>
                    </li>
                    <li><a class="super-menu" href="${pageContext.request.contextPath}/danhsachsv.jsp">Sinh Viên</a></li>
                        <li><a class="super-menu" href="${pageContext.request.contextPath}/diemthisinhvien.jsp">Điểm Thi</a></li>
                </ul>
            </div><!--end #sidebar-menu-->
            <div id="admin-content">
                <h2 class="admin-title"> Trang Giáo Viên</h2>

                <div class="main-content-wrap">
                    <div class="main-content">
                        <div class="add-new-wrap">
                            <table>
                                <tr>
                                    <td bgcolor="#7ab6de" ><font color="#ffffff">Thông tin Giáo Viên</<font></td>
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
                                        <label><b>Email :</b></label> 
                                    </td>
                                    <td>
                                        <%=rs.getString("email")%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>SDT : </b></label>
                                    </td>
                                    <td>
                                        <%=rs.getString("sdt")%>
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

       <!-- <script type="text/javascript">
                $(document).ready(function(){
                        $(".super-menu").click(function(){
                                $(this).parent().find("ul").slideToggle(100);
                                $(this).toggleClass("menu-item-opened");
                                return false;
                        });
                });
        </script>-->
    </body>
</html>
