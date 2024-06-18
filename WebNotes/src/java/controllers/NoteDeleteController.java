/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.noteDelete;

/**
 *
 * @author Prasad
 */
@WebServlet(name = "NoteDeleteController", urlPatterns = {"/NoteDeleteController"})
public class NoteDeleteController extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        
                String noteId = request.getParameter("noteId");

                int row = noteDelete.Delete(noteId);

                if(row > 0)
                {
                    System.out.println("Delete Success");
                }
                
                request.getRequestDispatcher("YourNotes").forward(request, response);
    }
    
    
    
    @Override
    protected void doGet(HttpServletRequest request , HttpServletResponse response)
            throws ServletException, IOException {

        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NoteDeleteController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(NoteDeleteController.class.getName()).log(Level.SEVERE, null, ex);
        }
 
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
