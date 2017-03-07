package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changinforadm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t<title>Index - KhanhSpring.com</title>\n");
      out.write("\t<script type=\"text/javascript\" src=\"E:/đề tài thực tập/news-website/js/jquery-2.0.2.min.js\"></script>\n");
      out.write("\t<link href=\"E:/đề tài thực tập/news-website/css/admin-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"header\">\n");
      out.write("\t<div id=\"logo\">\n");
      out.write("\t\t<a href=\"#\">DANH MỤC</a>\n");
      out.write("\t</div>\n");
      out.write("\t<div id=\"user-bar\">\n");
      out.write("\t\t<div id=\"user-option\">\n");
      out.write("\t\t\t<a id=\"user-info\" href=\"#\">\n");
      out.write("\t\t\t\t<img src=\"E:/đề tài thực tập/news-website/upload/avatar/user.jpg\">\n");
      out.write("\t\t\t\t<span>Administrator</span>\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Đăng xuất</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div><!--end #header-->\n");
      out.write("\n");
      out.write("<div id=\"container\">\n");
      out.write("\t<div id=\"sidebar-menu\">\n");
      out.write("\t\t<ul id=\"menu\">\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Giảng Viên</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>1</em>Thêm </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Xóa </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>3</em>Sửa</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Sinh Viên</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>1</em>Thêm</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Xóa</a></li>\n");
      out.write("                                        <li><a href=\"#\"><em>2</em>Sữat</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t<li><a class=\"super-menu\" href=\"#\">Môn Học</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>1</em>Thêm</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Xóa</a></li>\n");
      out.write("                                        <li><a href=\"#\"><em>2</em>Sửa</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("                        <li><a class=\"super-menu\" href=\"#\">Lớp Học</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>1</em>Thêm </a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\"><em>2</em>Xóa</a></li>\n");
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
      out.write("\n");
      out.write("\t\t\t\t<div class=\"list-wrap\">\n");
      out.write("\t\t\t\t\t<h3 class=\"form-title\">Danh sách đối tượng</h3>\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t<table class=\"list-table\">\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<th>Thuộc tính 1</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Thuộc tính 2</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Thuộc tính 3</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Thuộc tính 4</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Thuộc tính 5</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Chức Năng 1</th>\n");
      out.write("\t\t\t\t\t\t\t<th>Chức Năng 2</th>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 1.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 1.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 1.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 1.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 1.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 2.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 2.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 2.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 2.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 2.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 3.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 3.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 3.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 3.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 3.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 4.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 4.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 4.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 4.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 4.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 5.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 5.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 5.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 5.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 5.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 6.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 6.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 6.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 6.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 6.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"cell-center\">Giá trị 7.1</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 7.2</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 7.3</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 7.4</td>\n");
      out.write("\t\t\t\t\t\t\t<td>Giá trị 7.5</td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"edit-cell\"><a class=\"btn-edit\" href=\"#\">Sửa</a></td>\n");
      out.write("\t\t\t\t\t\t\t<td class=\"delete-cell\"><a class=\"btn-del\" href=\"#\">Xóa</a></td>\n");
      out.write("\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div><!--end .list-wrap-->\n");
      out.write("\n");
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
