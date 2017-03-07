package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class dangky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Đăng Ký</title>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body  bgcolor=\"#E6E6FF\">\n");
      out.write("       \n");
      out.write("    <center>\n");
      out.write("        <h2 style=\"color: blue\">Thông tin đăng ký</h2>\n");
      out.write("    </center>\n");
      out.write("        ");

         HttpSession ss = request.getSession();
         String thongbao=request.getParameter("thongbao");
         if(thongbao!=null){
      out.write("\n");
      out.write("              <script type=\"text/javascript\">alert(\"Đã lưu đăng ký thành công\");</script>\n");
      out.write("        ");
 }
            String username = (String) ss.getAttribute("username1");
            String pass = (String) ss.getAttribute("password1");
            //String masv = (String) ss.getAttribute("masv");     
            String url = "jdbc:sqlserver://localhost:1433;databaseName=THITRACNGHIEM";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, username, pass);
      out.write("\n");
      out.write("              <form  method = \"post\" action = \"Controller\">\n");
      out.write("           ");
 String sql="SELECT tenlop from lop" ;
            Statement statement = (Statement) conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
      out.write("\n");
      out.write("            <center>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>&nbsp Tên Lớp : </td>\n");
      out.write("                    \n");
      out.write("                    <td>  <select id=\"lop\" name=\"lop\">\n");
      out.write("                        ");
 while(rs.next()){
      out.write("\n");
      out.write("                     \n");
      out.write("                        <option>");
      out.print(rs.getString("tenlop"));
      out.write("\n");
      out.write("                        ");
}
      out.write(" \n");
      out.write("                            </select>\n");
      out.write("                       \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("               ");
 String sql1="SELECT tenmh from monhoc" ;
            Statement statement1 = (Statement) conn.createStatement();
            ResultSet rs1 = statement1.executeQuery(sql1);
            
      out.write("     \n");
      out.write("                <tr>\n");
      out.write("                    <td>&nbsp Tên Môn Học: </td>\n");
      out.write("                    \n");
      out.write("                    <td>  <select id =\"mon\" name = \"mon\">\n");
      out.write("                            ");
 while(rs1.next()){
      out.write("\n");
      out.write("                            <option>");
      out.print(rs1.getString("tenmh"));
      out.write("</option>\n");
      out.write("                             ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>       \n");
      out.write("                 <tr>\n");
      out.write("                    <td> &nbsp Ngày thi : </td>\n");
      out.write("                    \n");
      out.write("                    <td>  <input type=\"date\" name=\"ngay\" min=\"2016-12-12\">\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("              <tr>\n");
      out.write("                    <td>  &nbsp Lần thi : </td>\n");
      out.write("                    \n");
      out.write("                    <td>  <select id = \"lanthi\" name = \"lanthi\">\n");
      out.write("                        <option>1 <option>\n");
      out.write("                        <option>2 <option>\n");
      out.write("                      \n");
      out.write("                    </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("               <tr>\n");
      out.write("                    <td>  &nbsp Trình độ </td>\n");
      out.write("                    \n");
      out.write("                    <td>  <select id = \"trinhdo\" name = \"trinhdo\">\n");
      out.write("                        <option>A <option>\n");
      out.write("                        <option>B <option>\n");
      out.write("                        <option>C <option>\n");
      out.write("                    </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("                  <tr>\n");
      out.write("                    <td> &nbsp Số câu hỏi:</td>\n");
      out.write("                    \n");
      out.write("                    <td>  <input type=\"number\" name=\"socauhoi\" min=\"0\">\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("                   <tr>\n");
      out.write("                    <td> &nbsp Thời Gian:</td>\n");
      out.write("                    \n");
      out.write("                    <td>   <input type=\"number\" name=\"thoigian\" min=\"0\">\n");
      out.write("                    </td>\n");
      out.write("                </tr> \n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" value=\"Đăng ký\" name=\"submit\"> </td>\n");
      out.write("                     <td><input type=\"reset\" value = \"Nhập lại\" /> </td>\n");
      out.write("                     <td> <a href=\"homeView.jsp\">Đăng xuất</a></td>\n");
      out.write("                     <td> <a href=\"displaygiangvien.jsp\">back</a></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
