/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.86
 * Generated at: 2018-05-15 13:16:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.inc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inc_005fclient_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/taglibs.jsp", Long.valueOf(1526376865534L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<label for=\"nomClient\">Nom <span class=\"requis\">*</span></label>\r\n");
      out.write("<input type=\"text\" id=\"nomClient\" name=\"nomClient\" value=\"\" size=\"30\" maxlength=\"30\" />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<label for=\"prenomClient\">Prénom </label>\r\n");
      out.write("<input type=\"text\" id=\"prenomClient\" name=\"prenomClient\" value=\"\" size=\"30\" maxlength=\"30\" />\r\n");
      out.write("<br />\r\n");
      out.write("    \r\n");
      out.write("<label for=\"adresseClient\">Adresse de livraison <span class=\"requis\">*</span></label>\r\n");
      out.write("<input type=\"text\" id=\"adresseClient\" name=\"adresseClient\" value=\"\" size=\"30\" maxlength=\"60\" />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<label for=\"telephoneClient\">Numéro de téléphone <span class=\"requis\">*</span></label>\r\n");
      out.write("<input type=\"text\" id=\"telephoneClient\" name=\"telephoneClient\" value=\"\" size=\"30\" maxlength=\"30\" />\r\n");
      out.write("<br />\r\n");
      out.write("\r\n");
      out.write("<label for=\"emailClient\">Adresse email</label>\r\n");
      out.write("<input type=\"email\" id=\"emailClient\" name=\"emailClient\" value=\"\" size=\"30\" maxlength=\"60\" />\r\n");
      out.write("<br />\r\n");
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
