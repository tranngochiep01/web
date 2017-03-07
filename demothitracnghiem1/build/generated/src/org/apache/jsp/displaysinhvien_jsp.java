package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class displaysinhvien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("       \n");
      out.write("\t<title>Index - Hiep.com</title>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js.js\"></script>\n");
      out.write("\t<link href=\"admincss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
    
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<a href=\"#\">DANH MỤC</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"user-bar\">\n");
      out.write("\t\t<div id=\"user-option\">\n");
      out.write("\t\t\t<a id=\"user-info\" href=\"#\">\n");
      out.write("\t\t\t\t<img src=\"user.jpg\">\n");
      out.write("\t\t\t\t<span>Sinh viên</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"homeView.jsp\">Đăng xuất</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div><!--end #header-->\n");
      out.write("\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div id=\"sidebar-menu\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"thi.jsp\">Thi</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li><a class=\"super-menu\" href=\"diemthi.jsp\">xemdiem</a>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div><!--end #sidebar-menu-->\n");
      out.write("\n");
      out.write("\t<div id=\"admin-content\">\n");
      out.write("\t\t<h2 class=\"admin-title\"> Trang Sinh Viên</h2>\n");
      out.write("\n");
      out.write("\t\t<div class=\"main-content-wrap\">\n");
      out.write("\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"add-new-wrap\">\n");
      out.write("\t\t\t\t\t<table>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td bgcolor=\"#7ab6de\" ><font color=\"#ffffff\">Thông tin Giáo Viên</<font></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td height=\"20px\"></td>\n");
      out.write("                                </tr>\n");
      out.write("                           \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label><b>Họ tên :</b></label> \n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                       ");
      out.print(rs.getString("ho"));
      out.write(' ');
      out.print(rs.getString("ten"));
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label><b>Ngày sinh :</b></label> \n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(rs.getString("ngaysinh"));
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label><b>Địa chỉ : </b></label>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(rs.getString("diachi"));
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                              <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                        <label><b>Nam/Nữ (*)</b></label>    \n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            ");
 
                                            if(rs.getString("gioitinh").equals("nam")){
      out.write("\n");
      out.write("                                            <span>Nam</span><input disabled=\"disabled\" checked=\"checked\" type=\"radio\" name=\"customer_gender\" value=\"nam\">\n");
      out.write("                                                <span>Nữ</span><input disabled=\"disabled\" type=\"radio\" name=\"customer_gender\" value=\"nu\"> \n");
      out.write("                                            ");
}
                                            else{
      out.write("\n");
      out.write("                                                <span>Nam</span><input disabled=\"disabled\" type=\"radio\" name=\"customer_gender\" value=\"nam\">\n");
      out.write("                                                <span>Nữ</span><input disabled=\"disabled\" checked=\"checked\" type=\"radio\" name=\"customer_gender\" value=\"nu\"> \n");
      out.write("                                            ");
}
                                            
      out.write("\n");
      out.write("                                        \n");
      out.write("                                        </td>\n");
      out.write("                              </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td><INPUT TYPE=\"submit\" value=\"Back \" ></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("\t\t\t\t</div><!--end .add-new-wrap-->\n");
      out.write("\n");
      out.write("\t\t\t</div><!--end .main-content-->\n");
      out.write("\t\t</div><!--end .main-content-wrap-->\n");
      out.write("\t</div><!--end #admin-content-->\n");
      out.write("</div><!--end #container-->\n");
      out.write("\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<h1>Design by: <a href=\"http://hiep.com\">hiep.com</a></h1>\n");
      out.write("</div><!--end #footer-->\n");
      out.write("\n");
      out.write("\n");
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
