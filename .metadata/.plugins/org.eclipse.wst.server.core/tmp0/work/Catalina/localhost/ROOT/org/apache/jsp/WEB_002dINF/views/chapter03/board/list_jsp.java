/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.12
 * Generated at: 2019-04-16 10:33:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.chapter03.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t.wrap {\r\n");
      out.write("\t\tmargin: 0 auto;\r\n");
      out.write("\t\twidth: 800px;\r\n");
      out.write("\t\theight: 800px;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.header {\r\n");
      out.write("\t\tmargin: 5px 5px 2px 5px;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tline-height: 100px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.title1, .title2 {\r\n");
      out.write("\t\tmargin: 0px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.nav {\r\n");
      out.write("\t\tmargin: 5px 5px 2px 5px;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tline-height: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.menu {\r\n");
      out.write("\t\tmargin 0px;\r\n");
      out.write("\t\tdisplay: inline-block;\r\n");
      out.write("\t\twidth: 100px; \r\n");
      out.write("\t\theight: 30px; \r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\tline-height: 30px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.content_wrap {\r\n");
      out.write("\t\tmargin: 5px 5px 2px 5px;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\theight: 575px;\r\n");
      out.write("\t\toverflow: hidden;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.content {\r\n");
      out.write("\t\tmargin: 5px 5px 2px 5px;\r\n");
      out.write("\t\twidth: 700px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\theight: 563px;\r\n");
      out.write("\t\tborder: 1px solid black; \r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.banner { \r\n");
      out.write("\t\tmargin: 5px 5px 2px 5px;\r\n");
      out.write("\t\twidth: 60px;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\theight: 563px;\r\n");
      out.write("\t\tborder: 1px solid black;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tline-height: 563px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t.login_form {\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<p class=\"title1\">header</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div class=\"title2\">navigation</div>\r\n");
      out.write("\t\t\t<div class=\"menu menu1\" onclick=\"menuChange('posts')\">Posts</div>\r\n");
      out.write("\t\t\t<div class=\"menu menu2\" onclick=\"menuChange('register')\">회원가입</div>\r\n");
      out.write("\t\t\t<div class=\"menu menu3\" onclick=\"menuChange('login')\">로그인</div>\r\n");
      out.write("\t\t\t<div class=\"menu menu4\" onclick=\"menuChange('logout')\">로그아웃</div>\r\n");
      out.write("\t\t\t<div class=\"menu menu5\" onclick=\"menuChange('info')\">개인정보수정</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"content_wrap\">\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"banner\">\r\n");
      out.write("\t\t\t\t광고\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tmenuChange('posts');\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction menuChange(type) {\r\n");
      out.write("\t\talert(\"type: \" + type);\r\n");
      out.write("\t\t$(\".content\").empty();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: 'get',\r\n");
      out.write("\t\t\turl: type,\r\n");
      out.write("\t\t\tdataType: 'html',\r\n");
      out.write("\t\t\tsuccess: function(html) {\r\n");
      out.write("\t\t\t\t$(\".content\").append(html);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
