<%-- 
    Document   : inforsvthi
    Created on : Aug 20, 2016, 5:00:01 PM
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
        <link href="admincss.css" rel="stylesheet" type="text/css">
        <script type="text/javascript">
            function kiemtra(){
                
                if(document.getElementById("noidung").value==''){
                    document.getElementById("thongbao").innerHTML="Không để trống ô nội dung!";
                    return false;
                }
                  if(document.getElementById("noidung1").value==""){
                    document.getElementById("thongbao").innerHTML="Không để trống ô nội dung của phương án";
                    return false;
                }
                  if(document.getElementById("noidung2").value==""){
                    document.getElementById("thongbao").innerHTML="Không để trống ô nội dung của phương án!";
                    return false;
                }
                  if(document.getElementById("noidung3").value==""){
                    document.getElementById("thongbao").innerHTML="Không để trống ô nội dung của phương án!";
                    return false;
                }
                  if(document.getElementById("noidung4").value==""){
                    document.getElementById("thongbao").innerHTML="Không để trống ô nội dung của phương án!";
                    return false;
                }
                
                 document.getElementById("thongbao").innerHTML="Thêm câu hỏi thành công!";
                 return true;
            }
        </script>
        <title> Soạn câu hỏi </title>
    </head>

    <body  bgcolor="#E6E6FF">
            <%
         HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            //String masv = (String) ss.getAttribute("masv");     
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
            String sql="SELECT tenmh from monhoc" ;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
    %>
        ${error}
        <div id="header">
            <div id="logo">
                <a href="#">THI TRẮC NGHIỆM</a>
            </div>
            <div id="user-bar">
                <div id="user-option">
                    <a id="user-info" href="#">
                        <img src="user.jpg">
                        <span>Giảng viên</span>
                    </a>
                </div>
            </div>
        </div><!--end #header-->

        <div id="container">
            <div id="sidebar-menu">
                <ul id="menu">

                </ul>
            </div><!--end #sidebar-menu-->

            <div id="admin-content">
                <h2 class="admin-title"> Trang Giáo Viên</h2>

                <div class="main-content-wrap">
                    <div class="main-content">
                        <div class="add-new-wrap">
                            <form  method = "POST" action = "Controller" onsubmit="return kiemtra()">
                               
                                <center>
                                    <h1 style = "color: blue">Thông tin câu hỏi</h1><br/>
                                </center>
                                <table cellspacing="10px" bgcolor="#E6E6FF">
                                    <tr>
                                        <td id="thongbao" colspan="2"></td> 
                                    </tr>
                                    <tr> <td><label>Loại : </label> </td> 
                                       
                                        <td><select id = "loai" name = "loai">
                                        <option>Chọn 1 trong 4 câu </option></select></td>
                                    </tr>
                                    
                                    <tr> <td><label> Tên môn học : </label> </td> 
                                        <td><select id="lop" name="monhoc">
                                            <% while(rs.next()){%>
                                            <option><%=rs.getString("tenmh")%>
                                             <%}%>
                                            </select></td>
                                    </tr>
                                    <tr> <td><label> Trình độ :  </label> </td> 
                                        <td><select id = "trinhdo" name = "trinhdo">
                                    <option>A </option>
                                    <option>B </option>
                                    <option>C </option>
                                    </select></td>
                                    </tr>
                                    <tr> <td><label>Nội dung : </label> </td> 
                                        <td><textarea rows="5" cols="40" id="noidung" name="noidung"></textarea></td>
                                    </tr>
                                    
                         
                <tr>
                 
                    <th>Tên phương án</th>
                    <th> Nội dung</th>
                </tr>
          
                <tr>
              
                    <td><input type="text" readonly name="tenpa1"  value="A"/></td>
                    <td><input type="text" name="noidung1" id="noidung1" value=""/></td>
                </tr>
                <tr>
               
                    <td><input type="text" readonly name="tenpa2"  value="B"/></td>
                    <td><input type="text" name="noidung2" id="noidung2" value=""/></td>
                </tr>
                <tr>
                  
                    <td><input type="text" readonly name="tenpa3"  value="C"/></td>
                    <td><input type="text" name="noidung3" id="noidung3" value=""/></td>
                </tr>
                <tr>
                  
                    <td><input type="text" readonly name="tenpa4" value="D"/></td>
                    <td><input type="text" name="noidung4" id="noidung4" value=""/></td>
                </tr>
          
                                    
                                     <tr> <td><label>Đáp án : </label> </td> 
                                        <td><select id = "dapan" name = "dapan">
                                        <option>A </option>
                                        <option>B </option>
                                        <option>C </option>
                                        <option>D </option>
                                        </select></td>
                                    </tr>
                                   <tr> <td> <pre> <input type="submit" value="Thêm câu hỏi" name="submit"></td>   <td> <center> <input type="reset" value = "Nhập lại" /></center></td>
                                    <tr> <td><u><a href="displaygiangvien.jsp">Quay về trang giảng viên</a></u></td> </tr>
                                   
                                   
                                    
                                </table>
                            </form>
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
