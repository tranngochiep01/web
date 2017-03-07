package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class themcauhoi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"js.js\"></script>\n");
      out.write("        <link href=\"admincss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function kiemtra(){\n");
      out.write("                \n");
      out.write("                if(document.getElementById(\"noidung\").value==''){\n");
      out.write("                    document.getElementById(\"thongbao\").innerHTML=\"Không để trống ô nội dung!\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(document.getElementById(\"noidung1\").value==\"\"){\n");
      out.write("                    document.getElementById(\"thongbao\").innerHTML=\"Không để trống ô nội dung của phương án\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(document.getElementById(\"noidung2\").value==\"\"){\n");
      out.write("                    document.getElementById(\"thongbao\").innerHTML=\"Không để trống ô nội dung của phương án!\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(document.getElementById(\"noidung3\").value==\"\"){\n");
      out.write("                    document.getElementById(\"thongbao\").innerHTML=\"Không để trống ô nội dung của phương án!\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                  if(document.getElementById(\"noidung4\").value==\"\"){\n");
      out.write("                    document.getElementById(\"thongbao\").innerHTML=\"Không để trống ô nội dung của phương án!\";\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                 document.getElementById(\"thongbao\").innerHTML=\"Thêm câu hỏi thành công!\";\n");
      out.write("                 return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <title> Soạn câu hỏi </title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body  bgcolor=\"#E6E6FF\">\n");
      out.write("            ");

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
    
      out.write("\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("            <div id=\"logo\">\n");
      out.write("                <a href=\"#\">THI TRẮC NGHIỆM</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"user-bar\">\n");
      out.write("                <div id=\"user-option\">\n");
      out.write("                    <a id=\"user-info\" href=\"#\">\n");
      out.write("                        <img src=\"user.jpg\">\n");
      out.write("                        <span>Giảng viên</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><!--end #header-->\n");
      out.write("\n");
      out.write("        <div id=\"container\">\n");
      out.write("            <div id=\"sidebar-menu\">\n");
      out.write("                <ul id=\"menu\">\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div><!--end #sidebar-menu-->\n");
      out.write("\n");
      out.write("            <div id=\"admin-content\">\n");
      out.write("                <h2 class=\"admin-title\"> Trang Giáo Viên</h2>\n");
      out.write("\n");
      out.write("                <div class=\"main-content-wrap\">\n");
      out.write("                    <div class=\"main-content\">\n");
      out.write("                        <div class=\"add-new-wrap\">\n");
      out.write("                            <form  method = \"POST\" action = \"Controller\" onsubmit=\"return kiemtra()\">\n");
      out.write("                               \n");
      out.write("                                <center>\n");
      out.write("                                    <h1 style = \"color: blue\">Thông tin câu hỏi</h1><br/>\n");
      out.write("                                </center>\n");
      out.write("                                <table cellspacing=\"10px\" bgcolor=\"#E6E6FF\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td id=\"thongbao\" colspan=\"2\"></td> \n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr> <td><label>Loại : </label> </td> \n");
      out.write("                                       \n");
      out.write("                                        <td><select id = \"loai\" name = \"loai\">\n");
      out.write("                                        <option>Chọn 1 trong 4 câu </option></select></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                                    <tr> <td><label> Tên môn học : </label> </td> \n");
      out.write("                                        <td><select id=\"lop\" name=\"monhoc\">\n");
      out.write("                                            ");
 while(rs.next()){
      out.write("\n");
      out.write("                                            <option>");
      out.print(rs.getString("tenmh"));
      out.write("\n");
      out.write("                                             ");
}
      out.write("\n");
      out.write("                                            </select></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr> <td><label> Trình độ :  </label> </td> \n");
      out.write("                                        <td><select id = \"trinhdo\" name = \"trinhdo\">\n");
      out.write("                                    <option>A </option>\n");
      out.write("                                    <option>B </option>\n");
      out.write("                                    <option>C </option>\n");
      out.write("                                    </select></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr> <td><label>Nội dung : </label> </td> \n");
      out.write("                                        <td><textarea rows=\"5\" cols=\"40\" id=\"noidung\" name=\"noidung\"></textarea></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    \n");
      out.write("                         \n");
      out.write("                <tr>\n");
      out.write("                 \n");
      out.write("                    <th>Tên phương án</th>\n");
      out.write("                    <th> Nội dung</th>\n");
      out.write("                </tr>\n");
      out.write("          \n");
      out.write("                <tr>\n");
      out.write("              \n");
      out.write("                    <td><input type=\"text\" readonly name=\"tenpa1\"  value=\"A\"/></td>\n");
      out.write("                    <td><input type=\"text\" name=\"noidung1\" id=\"noidung1\" value=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("               \n");
      out.write("                    <td><input type=\"text\" readonly name=\"tenpa2\"  value=\"B\"/></td>\n");
      out.write("                    <td><input type=\"text\" name=\"noidung2\" id=\"noidung2\" value=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  \n");
      out.write("                    <td><input type=\"text\" readonly name=\"tenpa3\"  value=\"C\"/></td>\n");
      out.write("                    <td><input type=\"text\" name=\"noidung3\" id=\"noidung3\" value=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                  \n");
      out.write("                    <td><input type=\"text\" readonly name=\"tenpa4\" value=\"D\"/></td>\n");
      out.write("                    <td><input type=\"text\" name=\"noidung4\" id=\"noidung4\" value=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("          \n");
      out.write("                                    \n");
      out.write("                                     <tr> <td><label>Đáp án : </label> </td> \n");
      out.write("                                        <td><select id = \"dapan\" name = \"dapan\">\n");
      out.write("                                        <option>A </option>\n");
      out.write("                                        <option>B </option>\n");
      out.write("                                        <option>C </option>\n");
      out.write("                                        <option>D </option>\n");
      out.write("                                        </select></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                   <tr> <td> <pre> <input type=\"submit\" value=\"Thêm câu hỏi\" name=\"submit\"></td>   <td> <center> <input type=\"reset\" value = \"Nhập lại\" /></center></td>\n");
      out.write("                                    <tr> <td><u><a href=\"displaygiangvien.jsp\">Quay về trang giảng viên</a></u></td> </tr>\n");
      out.write("                                   \n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                </table>\n");
      out.write("                            </form>\n");
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
