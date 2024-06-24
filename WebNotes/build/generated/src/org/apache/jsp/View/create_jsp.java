package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.LocalDate;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    LocalDate currentDate = LocalDate.now();
    String date = currentDate.toString();        

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebNotes/View/Style/create.css\">\r\n");
      out.write("        <title>Create Note</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"backDiv\" onmouseover=\"backOver()\" onmouseout=\"backOut()\" onclick=\"backClick()\">\r\n");
      out.write("            <img class=\"icon\" id=\"backIcon\" src=\"/WebNotes/View/Assets/Arrow.png\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <form id=\"form\" action=\"/WebNotes/CreateNote\" method=\"POST\">\r\n");
      out.write("            <div class=\"noteDiv\">\r\n");
      out.write("                <div class=\"topicBarDiv\">\r\n");
      out.write("                    <div class=\"titleDiv\">\r\n");
      out.write("                        <input type=\"text\" class=\"title\" name=\"title\" placeholder=\"TITLE...\">   \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"dateDiv\">\r\n");
      out.write("                        <input type=\"hidden\" name=\"date\" value=\"");
      out.print( date );
      out.write("\"> \r\n");
      out.write("                        <p class=\"date\">");
      out.print( date );
      out.write("</p>\r\n");
      out.write("                    </div>          \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"contentDiv\">\r\n");
      out.write("                    <textarea class=\"content\" name=\"content\" placeholder=\"Note...\"></textarea>\r\n");
      out.write("                </div>       \r\n");
      out.write("            </div>   \r\n");
      out.write("            <div class=\"saveDiv\" onmouseover=\"saveOver()\" onmouseout=\"saveOut()\" onclick=\"document.getElementById('form').submit()\">\r\n");
      out.write("                <img class=\"icon\" id=\"saveIcon\" src=\"/WebNotes/View/Assets/Save.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("            //Back button functions\r\n");
      out.write("\r\n");
      out.write("            function backOver() \r\n");
      out.write("                {\r\n");
      out.write("                    var back = document.getElementById(\"backIcon\");\r\n");
      out.write("                    back.src = \"/WebNotes/View/Assets/Arrow 1.png\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            function backOut() \r\n");
      out.write("                {\r\n");
      out.write("                    var back = document.getElementById(\"backIcon\");\r\n");
      out.write("                    back.src = \"/WebNotes/View/Assets/Arrow.png\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            function backClick() \r\n");
      out.write("                {\r\n");
      out.write("                    window.location.href = 'display.jsp';\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("            //Save button functions\r\n");
      out.write("\r\n");
      out.write("            function saveOver() \r\n");
      out.write("                {\r\n");
      out.write("                    var save = document.getElementById(\"saveIcon\");\r\n");
      out.write("                    save.src = \"/WebNotes/View/Assets/Save 1.png\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            function saveOut() \r\n");
      out.write("                {\r\n");
      out.write("                    var save = document.getElementById(\"saveIcon\");\r\n");
      out.write("                    save.src = \"/WebNotes/View/Assets/Save.png\";\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
