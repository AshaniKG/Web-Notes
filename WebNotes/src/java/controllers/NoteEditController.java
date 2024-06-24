package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.noteEdit;

@WebServlet("/UpdateNote")
public class NoteEditController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.getRequestDispatcher("/View/edit.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String noteId = request.getParameter("noteId");
        String updatedTitle = request.getParameter("title");
        String updatedDate = request.getParameter("date"); 
        String updatedContent = request.getParameter("content");

        try {
            int row = noteEdit.updateNote(noteId, updatedTitle, updatedDate, updatedContent);
            if (row > 0) {
                System.out.println("Note Updated Successfully!");
            } else {
                System.out.println("Failed to Update Note.");
            }
            response.sendRedirect("YourNotes"); 
        } catch (Exception e) {
            // Handle any errors during the update process
            System.out.println("Error: " + e.getMessage());
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}