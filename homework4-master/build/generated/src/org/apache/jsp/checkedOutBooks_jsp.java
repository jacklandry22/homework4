package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkedOutBooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/includes/header.html");
    _jspx_dependants.add("/includes/footer.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("Copyright Jack Landry and Lexa Grasz 2015\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>CSC330 Homework 4</title>\n");
      out.write("        \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"styles/index.css\">  \n");
      out.write("         </head>\n");
      out.write("           <img src=\"images/belk.jpg\" alt=\"Belk Library\">\n");
      out.write("            <h1>Belk Library</h1>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div>\n");
      out.write("<h2>Currently checked out books</h2>\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("    <th>Patron Name</th>\n");
      out.write("    <th>Email Address</th>\n");
      out.write("    <th>Book Title</th>\n");
      out.write("    <th>Due Date</th>\n");
      out.write("    <th>Overdue</th>\n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write("  \n");
      out.write(" ");
      out.write("\n");
      out.write("  <tr>\n");
      out.write("<!--    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" + ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.book}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.dueDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.overdue}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</td>-->\n");
      out.write("      <td>a</td>\n");
      out.write("       <td>a</td>\n");
      out.write("        <td>a</td>\n");
      out.write("         <td>a</td>\n");
      out.write("         <td>a</td>\n");
      out.write("    <td><label class=\"spacer\">&nbsp;</label>\n");
      out.write("      <input type=\"submit\" value=\"Checkout\" class=\"button\"></td>\n");
      out.write("  </tr>\n");
      out.write(" ");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><a href=\"index.jsp\">Return to front page</a></p>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<!--Copyright Lexa Grasz and Jack Landry 2015-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <footer class=\"footer\">&copy; 2015, Lexa Grasz & Jack Landry</footer>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write('\n');
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
