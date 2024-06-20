package org.apache.jsp.View;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.noteFetchModel;
import java.sql.Connection;
import model.DBConnection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/WebNotes/View/Style/edit.css\" />\r\n");
      out.write("    <title>Edit Note</title>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Julee&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    ");

        String noteId = request.getParameter("noteId");
        try {
            ResultSet noteResult = noteFetchModel.fetchNoteById(noteId);
            if (noteResult.next()) {
                String title = noteResult.getString("title");
                String date = noteResult.getString("date");
                String content = noteResult.getString("content");

                String[] dateParts = date.split("-");
                String formattedDate = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0]; 
    
      out.write("\r\n");
      out.write("    <div class=\"noteForm\">\r\n");
      out.write("        <div class=\"formHeader\">\r\n");
      out.write("            <input type=\"text\" id=\"noteTitle\" name=\"noteTitle\" value=\"");
      out.print( title );
      out.write("\" placeholder=\"Title\">\r\n");
      out.write("            <input type=\"date\" id=\"noteDate\" name=\"noteDate\" value=\"");
      out.print( date );
      out.write("\" placeholder=\"Date\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <hr class=\"titleLine\">\r\n");
      out.write("        <div class=\"formContent\">\r\n");
      out.write("            <textarea id=\"noteContent\" name=\"noteContent\">");
      out.print( content );
      out.write("</textarea>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"ButtonSection\">\r\n");
      out.write("            <div class=\"EditButton\">\r\n");
      out.write("                <img src=\"/WebNotes/View/Assets/Edit.png\" alt=\"edit\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"DeleteButton\">\r\n");
      out.write("                <img src=\"/WebNotes/View/Assets/Delete.png\" alt=\"delete\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"SaveButton\" style=\"display:none;\">\r\n");
      out.write("                <img src=\"/WebNotes/View/Assets/Save.png\" alt=\"save\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");

            } else {
                out.println("Note not found!");
            }
            noteResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      out.write("\r\n");
      out.write("    <script src=\"/WebNotes/View/Style/edit.js\"></script>\r\n");
      out.write("</body>\r\n");
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
