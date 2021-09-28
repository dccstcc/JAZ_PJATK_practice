package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<h1 style=\"color:blue\"><b>Kalkulator kredytowy</b></h1>\n");
      out.write("<br />\n");
      out.write("<form action=\"calc\" method=\"post\">\n");
      out.write("<label><i>Wnioskowana kwota kredytu: &nbsp</i><input type=\"text\" id=\"kwota\" name=\"kwota\" /></label>\n");
      out.write("<br />\n");
      out.write("<label><i>Liczba rat miesięcznych kredytu: &nbsp</i><input type=\"text\" id=\"liczbaRat\" name=\"liczbaRat\" /></label>\n");
      out.write("<br />\n");
      out.write("<label><i>Oprocentowanie kredytu w skali roku: &nbsp</i><input type=\"text\" id=\"oprocentowanie\" name=\"oprocentowanie\" /></label>\n");
      out.write("<br />\n");
      out.write("<label><i>Opłata stała kredytu: &nbsp</i><input type=\"text\" id=\"oplata\" name=\"oplata\" /></label>\n");
      out.write("<br />\n");
      out.write("<label><i>Rodzaj rat: &nbsp</i>\n");
      out.write("<select name=\"rodzajRat\">\n");
      out.write("<option value=\"ratyStale\">Raty stałe</option>\n");
      out.write("<option value=\"ratyMalejace\">Raty malejące</option>\n");
      out.write("</select>\n");
      out.write("</label>\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<br />\n");
      out.write("<input type=\"submit\" value=\"Oblicz harmonogram kredytu\">\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
