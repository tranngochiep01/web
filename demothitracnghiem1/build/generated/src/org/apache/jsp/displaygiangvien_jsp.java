package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class displaygiangvien_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!--  <meta http-equiv=\"content-type\" content=\"text/html\" charset=\"utf-8\"/>-->\n");
      out.write("        <title>Index - Hiep.com</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"js.js\"></script>\n");
      out.write("        <link href=\"admincss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("                  ");

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
    
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">DANH MỤC</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"user-bar\">\n");
      out.write("                <div id=\"user-option\">\n");
      out.write("                    <a id=\"user-info\" href=\"#\">\n");
      out.write("                        <img src=\"user.jpg\">\n");
      out.write("                        <span>Giảng viên</span>\n");
      out.write("                    </a>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"login.jsp\">Đăng xuất</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--end #header-->\n");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"sidebar-menu\">\n");
      out.write("                <ul id=\"menu\">\n");
      out.write("                    <li><a class=\"super-menu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/themcauhoi.jsp\">Soạn Câu Hỏi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"super-menu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/dangky.jsp\">Đăng ký thi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a class=\"super-menu\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/danhsachsv.jsp\">Sinh Viên</a>\n");
      out.write("                </ul>\n");
      out.write("            </div><!--end #sidebar-menu-->\n");
      out.write("            <div id=\"admin-content\">\n");
      out.write("                <h2 class=\"admin-title\"> Trang Giáo Viên</h2>\n");
      out.write("\n");
      out.write("                <div class=\"main-content-wrap\">\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"add-new-wrap\">\n");
      out.write("                            <table>\n");
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
      out.write("                                        <label><b>Email :</b></label> \n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(rs.getString("email"));
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>\n");
      out.write("                                        <label><b>SDT : </b></label>\n");
      out.write("                                    </td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(rs.getString("sdt"));
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
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </div><!--end .add-new-wrap-->\n");
      out.write("\n");
      out.write("                    </div><!--end .main-content-->\n");
      out.write("                </div><!--end .main-content-wrap-->\n");
      out.write("            </div><!--end #admin-content-->\n");
      out.write("        </div><!--end #container-->\n");
      out.write("\n");
      out.write("        <div id=\"footer\">\n");
      out.write("            <h1>Design by: <a href=\"http://hiep.com\">hiep.com</a></h1>\n");
      out.write("        </div><!--end #footer-->\n");
      out.write("\n");
      out.write("       <!-- <script type=\"text/javascript\">\n");
      out.write("                $(document).ready(function(){\n");
      out.write("                        $(\".super-menu\").click(function(){\n");
      out.write("                                $(this).parent().find(\"ul\").slideToggle(100);\n");
      out.write("                                $(this).toggleClass(\"menu-item-opened\");\n");
      out.write("                                return false;\n");
      out.write("                        });\n");
      out.write("                });\n");
      out.write("        </script>-->\n");
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
