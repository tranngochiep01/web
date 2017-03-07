<%-- 
    Document   : displayadmind
    Created on : Aug 15, 2016, 12:20:32 PM
    Author     : Hiep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index - Hiep.com</title>
	<script type="text/javascript" src="js.js"></script>
	<link href="admincss.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="header">
	<div id="logo">
		<a href="#">DANH MỤC</a>
	</div>
	<div id="user-bar">
		<div id="user-option">
			<a id="user-info" href="#">
				<img src="user.jpg">
				<span>Administrator</span>
			</a>
			<ul>
				<li><a href="#">Đăng xuất</a></li>
			</ul>
		</div>
	</div>
</div><!--end #header-->
<div id="container">
	<div id="sidebar-menu">
		<ul id="menu">
			<li><a class="super-menu" href="#">Giảng Viên</a>
				<ul>
					<li><a href="themgiangvien.jsp"><em>1</em>Thêm </a></li>
					
				</ul>
			</li>
			<li><a class="super-menu" href="#">Sinh Viên</a>
				<ul>
					<li><a href="themsinhvien.jsp"><em>1</em>Thêm</a></li>
					
				</ul>
			</li>
			<li><a class="super-menu" href="#">Môn Học</a>
				<ul>
					<li><a href="themmonhoc.jsp"><em>1</em>Thêm</a></li>
					
				</ul>
			</li>
                        <li><a class="super-menu" href="#">Lớp Học</a>
				<ul>
					<li><a href="themlop.jsp"><em>1</em>Thêm </a></li>
                                        
				</ul>
			</li>
		</ul>
	</div><!--end #sidebar-menu-->

	<div id="admin-content">
		<h2 class="admin-title">Thêm giáo viên</h2>

		<div class="main-content-wrap">
			<div class="main-content">
				<div class="add-new-wrap">
					<h3 class="form-title">Thông tin cần thêm</h3>
                                        <form action="${pageContext.request.contextPath}/Controller" method="post">
					<table class="list-table">
                                <tr>
                                    <td>
                                        <label><b>Mã giảng viên :</b></label> 
                                    </td>
                                    <td><input type="text" name="magv"></td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Mật khẩu :</b></label> 
                                    </td>
                                    <td><input type="text" name="matkhau"></td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Họ :</b></label> 
                                    </td>
                                    <td><input type="text" name="hogv"></td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Tên :</b></label> 
                                    </td>
                                    <td><input type="text" name="tengv"></td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Email :</b></label> 
                                    </td>
                                    <td>
                                        <input type="text" name="emailgv">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label><b>Số điện thoại : </b></label>
                                    </td>
                                    <td> <input type="text" name="sdtgv">
                                    </td>
                                </tr>
                              <tr>
                                        <td>
                                        <label><b>Nam/Nữ (*)</b></label>    
                                        </td>
                                        <td>                             
                                                <span>Nam</span><input checked="checked" type="radio" name="gioitinh" value="nam">
                                                <span>Nữ</span><input   type="radio" name="gioitinh" value="nu"> 
                                        </td>
                              </tr>
                              <tr>
                                  <td> <input type="submit" value="Thêm giảng viên" name="submit">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                               <input type="reset" value = "Nhập lại" /></td><td><input type="submit" value = "Thoát" /></td>
                              </tr>	
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

<script type="text/javascript">
	$(document).ready(function(){
		$(".super-menu").click(function(){
			$(this).parent().find("ul").slideToggle(100);
			$(this).toggleClass("menu-item-opened");
			return false;
		});
	});
</script>
</body>
</html>
