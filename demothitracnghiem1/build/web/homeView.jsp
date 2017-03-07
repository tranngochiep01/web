<%-- 
    Document   : homeView
    Created on : Aug 3, 2016, 10:37:54 AM
    Author     : Hiep
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Home Page</title>
  </head>
  <body   bgcolor="#E6E6FF">
 
     <jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
    
      <h3>Trang chủ</h3>
      
     Ứng dụng thi trắc nghiệm online trực tuyến <br><br>
      <b>Cho phép thực hiện các chức năng sau:</b>
      <ul>
         <li>Đăng nhập</li>
         <li>Thi</li>
         <li>Xem Điểm Thi</li>
         <li> Xem kết quả thi</li>
         <li> Xem chi tiết bài thi</li>
         <li> Giáo viên soạn câu hỏi </li>
      </ul>
 
     <jsp:include page="_footer.jsp"></jsp:include>
 
  </body>
</html>
