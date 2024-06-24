/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.noteCreateModel;

/**
 *
 * @author ashan
 */
@WebServlet(name = "createController", urlPatterns = {"/CreateNote"})

public class createController extends HttpServlet 
{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
            doPost(request,response);
        }
    
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
            String title = request.getParameter("title");
            String date = request.getParameter("date");
            String content = request.getParameter("content");
            
            //HttpSession session = request.getSession(true);
            //String userId = session.getAttribute("userId").toString();
            String userId = "2";
            
            try 
                {
                    noteCreateModel.createNote (title, date, content, userId);
                } 
            catch (SQLException ex) 
                {
                    Logger.getLogger(createController.class.getName()).log(Level.SEVERE, null, ex);
                } 
            catch (ClassNotFoundException ex) 
                {
                    Logger.getLogger(createController.class.getName()).log(Level.SEVERE, null, ex);
                }
                    
            response.sendRedirect("/WebNotes/YourNotes");
        }

}
