<%--
    Document   : thi1
    Created on : Aug 24, 2016, 11:55:39 AM
    Author     : Hiep
--%>
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
        <script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js" type="text/javascript"></script>
        <script type="text/javascript">
          setInterval(function(){
              var thoigian=$("#thoigian").val()-1;
              var id=$("#id").val();
              if(thoigian>0){
              $("#thoigian").val(thoigian)
              $.post('${pageContext.request.contextPath}/Controller?submit=thaydoithoigian',{'id':id,'thoigian':thoigian},function(data){
                     
                });
            }
          }, 60000);
            function changechoose(id,macauhoi,luachon){
             
                $.post('${pageContext.request.contextPath}/Controller?submit=thaydoiluachon',{'id':id,'macauhoi':macauhoi,'luachon':luachon},function(data){
                     
                });
            }
        </script>
        <title>JSP Page</title>
    </head>
    <body>  
        <%
            int idthi = Integer.parseInt(request.getParameter("idthi"));
             int id = Integer.parseInt(request.getParameter("id"));
            int lan = Integer.parseInt(request.getParameter("lan"));
            String mamh = request.getParameter("mamh");
            String thoigian = request.getParameter("thoigian");
            String xong = request.getParameter("xong");
            HttpSession ss = request.getSession();
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            String masv = (String) ss.getAttribute("masv");
            
            int i = 1;
            String traloi = "";
            String dapan = "";
            int caudung = 0;
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection conn = DriverManager.getConnection(url, username, pass);
            String sql = "select * from thitam where id="+id;
         
            Statement statement = (Statement) conn.createStatement();
       
            ResultSet rs = statement.executeQuery(sql);
             //ResultSet rs;
    
           
              %>
    <center><h2>Bài Thi</h2></center> 
          <form name="cd">
              <input id="txt" readonly="readonly" type="text" value=""  name="disp" style="border: none;font-weight: bold;font-size: 16pt"/>
       <!-- <input id="txt" readonly="true" type="text" value="10:00" border="0" name="disp"/>-->
</form>
    <form name="form" action="thi1.jsp" method="post">
        <%
                   while (rs.next()) {%>
        Câu:<%=i%>:<%=rs.getString("noidung")%>:<br>
        <%
            traloi = request.getParameter("cau" + i);
            if (traloi == null) {
                traloi = "e";
            }
            if (xong != null) {
                dapan = rs.getString("dapan");
                if (dapan.equals(traloi.trim())) {
                    caudung++;
                }
                  Statement statement2 = (Statement) conn.createStatement();
                String insertthi="insert into thi(masv,macauhoi,idthi,luachonsv) values('"+masv+"',"+rs.getInt("macauhoi")+","+idthi+",'"+traloi+"')";
                    if(statement2.executeUpdate(insertthi)>0){           
            }
            }
            String sql1 = "select * from phuongan where macauhoi=" + rs.getInt("macauhoi");
            Statement statement1 = (Statement) conn.createStatement();
            ResultSet rs1 = statement1.executeQuery(sql1);
            while (rs1.next()) {
             if (rs.getString("luachonsv").equals(rs1.getString("tenluachon"))) {%>
        <input checked="checked" type="radio" name="cau<%=i%>" value="<%=rs1.getString("tenluachon")%>"><%=rs1.getString("noidung")%><br>
        <%} else {%>
        <input type="radio" name="cau<%=i%>" value="<%=rs1.getString("tenluachon")%>" onclick="changechoose('<%=id%>','<%=rs.getInt("macauhoi")%>',this.value)"><%=rs1.getString("noidung")%> <br>
        <%}
                }
                i = i + 1;
            }
        %>
     
       <input type="hidden" name="thoigian" id= "thoigian" value="<%=thoigian%>">
         <input type="hidden" name="id" id="id" value="<%=id%>">
        <input type="hidden" name="idthi" value="<%=idthi%>">
         <input type="hidden" name="mamh" value="<%=mamh%>">
         <input type="hidden" name="lan" value="<%=lan%>">
        <%
            if (xong != null) {
                out.println("Số câu đúng của bạn là: " + caudung);
                int diem=(int)(caudung * 10f/ (i - 1));
                out.println("Điểm của bạn là: " + diem);
                String deletethitam="delete thitam where id="+id+"";
                statement.executeUpdate(deletethitam);
                 String deletedkthitam="delete dkthitam where id="+id+"";
               statement.executeUpdate(deletedkthitam);
                String insertdiem="insert into diemthi(masv,mamh,lan,diem,idthi) values('"+masv+"','"+mamh+"',"+lan+","+diem+","+idthi+")";
                if(statement.executeUpdate(insertdiem)>0){%>
     
                <script type="text/javascript">alert("Đã lưu điểm");</script>
                <u><a href="displaysinhvien.jsp">Quay về trang sinh viên để xem lại điểm</a></u>
                
            <%}
                else{%>
                     <script type="text/javascript">alert("bạn đã làm bài rồi, không thể cập nhật điểm mới");</script>
               <% }
                } else {%>
        <input id="Button" type="submit" name="xong" value="Hoàn thành">
        <% }
        %>
    </form>
    <% if(xong==null){%>
         <script language="javascript">
var mins
var secs;
//obj input = document.getElementById("txt");
function cd() {
        mins = 1 * m("<%=thoigian %>"); // change minutes here
 	secs = 0 + s(":01"); // change seconds here (always add an additional second to your total)
 	redo();
}

function m(obj) {
 	for(var i = 0; i < obj.length; i++) {
  		if(obj.substring(i, i + 1) == ":")
  		break;
 	}
 	return(obj.substring(0, i));
}

function s(obj) {
 	for(var i = 0; i < obj.length; i++) {
  		if(obj.substring(i, i + 1) == ":")
  		break;
 	}
 	return(obj.substring(i + 1, obj.length));
}

function dis(mins,secs) {
 	var disp;
 	if(mins <= 9) {
  		disp = " 0";
 	} else {
  		disp = " ";
 	}
 	disp += mins + ":";
 	if(secs <= 9) {
  		disp += "0" + secs;
 	} else {
  		disp += secs;
 	}
 	return(disp);
}

function redo() {
 	secs--;
 	if(secs == -1) {
  		secs = 59;
  		mins--;
 	}
 	document.cd.disp.value = dis(mins,secs); 
 	if((mins == 0) && (secs == 0)) {
  		
  document.getElementById('Button').click();

     
 	} else {
 		cd = setTimeout("redo()",1000);
 	}
}

function init() {
  cd();
}
window.onload = init;
</script>
    <%}%>
   
</body>
</html>
