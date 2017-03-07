<%-- 
    Document   : changinforadm
    Created on : Aug 16, 2016, 11:36:21 AM
    Author     : Hiep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Index - KhanhSpring.com</title>
	<script type="text/javascript" src="E:/đề tài thực tập/news-website/js/jquery-2.0.2.min.js"></script>
	<link href="E:/đề tài thực tập/news-website/css/admin-style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div id="header">
	<div id="logo">
		<a href="#">DANH MỤC</a>
	</div>
	<div id="user-bar">
		<div id="user-option">
			<a id="user-info" href="#">
				<img src="E:/đề tài thực tập/news-website/upload/avatar/user.jpg">
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
					<li><a href="#"><em>1</em>Thêm </a></li>
					<li><a href="#"><em>2</em>Xóa </a></li>
					<li><a href="#"><em>3</em>Sửa</a></li>
				</ul>
			</li>
			<li><a class="super-menu" href="#">Sinh Viên</a>
				<ul>
					<li><a href="#"><em>1</em>Thêm</a></li>
					<li><a href="#"><em>2</em>Xóa</a></li>
                                        <li><a href="#"><em>2</em>Sữat</a></li>
				</ul>
			</li>
			<li><a class="super-menu" href="#">Môn Học</a>
				<ul>
					<li><a href="#"><em>1</em>Thêm</a></li>
					<li><a href="#"><em>2</em>Xóa</a></li>
                                        <li><a href="#"><em>2</em>Sửa</a></li>
				</ul>
			</li>
                        <li><a class="super-menu" href="#">Lớp Học</a>
				<ul>
					<li><a href="#"><em>1</em>Thêm </a></li>
					<li><a href="#"><em>2</em>Xóa</a></li>
                                        <li><a href="#"><em>2</em>Sửa</a></li>
				</ul>
			</li>
		</ul>
	</div><!--end #sidebar-menu-->

	<div id="admin-content">
		<h2 class="admin-title">Tiêu đề trang admin</h2>

		<div class="main-content-wrap">
			<div class="main-content">

				<div class="list-wrap">
					<h3 class="form-title">Danh sách đối tượng</h3>
					<form>
					<table class="list-table">
						<tr>
							<th>Thuộc tính 1</th>
							<th>Thuộc tính 2</th>
							<th>Thuộc tính 3</th>
							<th>Thuộc tính 4</th>
							<th>Thuộc tính 5</th>
							<th>Chức Năng 1</th>
							<th>Chức Năng 2</th>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 1.1</td>
							<td>Giá trị 1.2</td>
							<td>Giá trị 1.3</td>
							<td>Giá trị 1.4</td>
							<td>Giá trị 1.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 2.1</td>
							<td>Giá trị 2.2</td>
							<td>Giá trị 2.3</td>
							<td>Giá trị 2.4</td>
							<td>Giá trị 2.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 3.1</td>
							<td>Giá trị 3.2</td>
							<td>Giá trị 3.3</td>
							<td>Giá trị 3.4</td>
							<td>Giá trị 3.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 4.1</td>
							<td>Giá trị 4.2</td>
							<td>Giá trị 4.3</td>
							<td>Giá trị 4.4</td>
							<td>Giá trị 4.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 5.1</td>
							<td>Giá trị 5.2</td>
							<td>Giá trị 5.3</td>
							<td>Giá trị 5.4</td>
							<td>Giá trị 5.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 6.1</td>
							<td>Giá trị 6.2</td>
							<td>Giá trị 6.3</td>
							<td>Giá trị 6.4</td>
							<td>Giá trị 6.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
						<tr>
							<td class="cell-center">Giá trị 7.1</td>
							<td>Giá trị 7.2</td>
							<td>Giá trị 7.3</td>
							<td>Giá trị 7.4</td>
							<td>Giá trị 7.5</td>
							<td class="edit-cell"><a class="btn-edit" href="#">Sửa</a></td>
							<td class="delete-cell"><a class="btn-del" href="#">Xóa</a></td>
						</tr>
					</table>
					</form>
				</div><!--end .list-wrap-->


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
