package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"/WebNotes/View/Style/display.css\" />\r\n");
      out.write("        <title>Display Note</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"topSpaceDiv\"></div>\r\n");
      out.write("        ");
 
                ResultSet result = (ResultSet) request.getAttribute("notesResult");
                
                 String month = "";
                 String date = "";
                 String year = "";
                 String monthNumber = "";
                 
                 String content =  "";
                 
                 if(result != null){
                     
                    while(result.next()){
                        
                        String[] fullDate = result.getString("date").split("-");
                        
                       if(result.getString("content").length() > 200)
                       {
                            content  = result.getString("content").substring(0, 200);
                       }
                       else
                       {
                            content  = result.getString("content");
                       }
                        
                        monthNumber = fullDate[1];

                        if ("01".equals(monthNumber)) {
                            month = "Jan";
                        } else if ("02".equals(monthNumber)) {
                            month = "Feb";
                        } else if ("03".equals(monthNumber)) {
                            month = "Mar";
                        } else if ("04".equals(monthNumber)) {
                            month = "April";
                        } else if ("05".equals(monthNumber)) {
                            month = "May";
                        } else if ("06".equals(monthNumber)) {
                            month = "June";
                        } else if ("07".equals(monthNumber)) {
                            month = "July";
                        } else if ("08".equals(monthNumber)) {
                            month = "Aug";
                        } else if ("09".equals(monthNumber)) {
                            month = "Sep";
                        } else if ("10".equals(monthNumber)) {
                            month = "Oct";
                        } else if ("11".equals(monthNumber)) {
                            month = "Nov";
                        } else if ("12".equals(monthNumber)) {
                            month = "Dec";
                        } else {
                            month = "Invalid month";
                        }
                        
                                date = fullDate[2];
                                year = fullDate[0];
                                
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            <div class=\"noteDivision\">\r\n");
      out.write("                <a href=\"UpdateNote?noteId=");
      out.print(  result.getString("id"));
      out.write("\">\r\n");
      out.write("                    <div class=\"noteContentDivision\">\r\n");
      out.write("                        <div class=\"noteContentDateDivision\">\r\n");
      out.write("                            <h4 class=\"noteContentDateText\">");
      out.print( date );
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"noteContentDateText\">");
      out.print( month );
      out.write("</h4>\r\n");
      out.write("                            <h4 class=\"noteContentDateText\">");
      out.print( year );
      out.write("</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"noteContentTextDivision\">\r\n");
      out.write("                            <h2 class=\"noteContentTitle\">");
      out.print( result.getString("title"));
      out.write("</h2>\r\n");
      out.write("                            <p class=\"noteContentText\">\r\n");
      out.write("                                ");
      out.print(  content  + "...");
      out.write("\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"noteDeleteDivision\">\r\n");
      out.write("                        <form action=\"NoteDelete\" method=\"POST\" >\r\n");
      out.write("                            <button class=\"noteDeleteButton\" type=\"submit\" name=\"noteId\" value=\"");
      out.print( result.getString("id") );
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this Note?');\">\r\n");
      out.write("                                Delete\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                 </a>\r\n");
      out.write("            </div>\r\n");
      out.write("   \r\n");
      out.write("        ");
 } }
      out.write("\r\n");
      out.write("        <a class=\"addNewButton\" href=\"NewNote\">+</a>\r\n");
      out.write("          <div class=\"noteDeleteDivision\">\r\n");
      out.write("                        <form action=\"NoteDelete\" method=\"POST\" >\r\n");
      out.write("                            <button class=\"noteDeleteButton\" type=\"submit\" name=\"noteId\" value=\"");
      out.print( result.getString("id") );
      out.write("\" onclick=\"return confirm('Are you sure you want to delete this Note?');\">\r\n");
      out.write("                                Delete\r\n");
      out.write("                            </button>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
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
