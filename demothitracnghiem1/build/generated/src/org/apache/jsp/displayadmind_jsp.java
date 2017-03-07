package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class displayadmind_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Index - Hiep.com</title>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js.js\"></script>\n");
      out.write("\t<link href=\"admincss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<a href=\"#\">DANH MỤC</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"user-bar\">\n");
      out.write("\t\t<div id=\"user-option\">\n");
      out.write("\t\t\t<a id=\"user-info\" href=\"#\">\n");
      out.write("\t\t\t\t<img src=\"user.jpg\">\n");
      out.write("\t\t\t\t<span>Administrator</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Đăng xuất</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div><!--end #header-->\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div id=\"sidebar-menu\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Giảng Viên</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"themgiangvien.jsp\"><em>1</em>Thêm </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Danh sách giảng viên </a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Sinh Viên</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"themsinhvien.jsp\"><em>1</em>Thêm</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Thông Tin</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Môn Học</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"themmonhoc.jsp\"><em>1</em>Thêm</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Thông Tin</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li><a class=\"super-menu\" href=\"#\">Lớp Học</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"themlop.jsp\"><em>1</em>Thêm </a></li>\n");
      out.write("                                        <li><a href=\"#\"><em>2</em>Sửa</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t</div><!--end #sidebar-menu-->\n");
      out.write("\n");
      out.write("\t<div id=\"admin-content\">\n");
      out.write("\t\t<h2 class=\"admin-title\">Tiêu đề trang admin</h2>\n");
      out.write("\n");
      out.write("\t\t<div class=\"main-content-wrap\">\n");
      out.write("\t\t\t<div class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"add-new-wrap\">\n");
      out.write("\t\t\t\t\t<h3 class=\"form-title\">Thông tin Admin</h3>\n");
      out.write("                                        <p> Username : Admin</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div id=\"footer\">\n");
      out.write("\t<h1>Design by: <a href=\"http://hiep.com\">hiep.com</a></h1>\n");
      out.write("</div><!--end #footer-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\t$(\".super-menu\").click(function(){\n");
      out.write("\t\t\t$(this).parent().find(\"ul\").slideToggle(100);\n");
      out.write("\t\t\t$(this).toggleClass(\"menu-item-opened\");\n");
      out.write("\t\t\treturn false;\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
