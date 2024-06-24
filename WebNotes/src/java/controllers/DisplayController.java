package controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.notesFetchModel;

/**
 *
 * @author Prasad
 */

@WebServlet("/YourNotes")
public class DisplayController extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
               HttpSession session = request.getSession(true);
               String userId = session.getAttribute("userId").toString();
           
        
        try{
               try (ResultSet result = notesFetchModel.fetchNotes(userId))
               {
                   
                   request.setAttribute("notesResult", result);
                   
                   request.getRequestDispatcher("/View/display.jsp").forward(request, response);
                   
                   result.close();
                   
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(DisplayController.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage() + " - Display Controller ResultSet");
        }  

    }

    }

