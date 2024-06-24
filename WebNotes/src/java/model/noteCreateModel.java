/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ashan
 */
@WebServlet(name = "noteCreate", urlPatterns = {"/noteCreate"})

public class noteCreateModel 
    {
        public static void createNote(String title, String date, String content, String userId) throws SQLException, ClassNotFoundException 
            {
                String sql = "INSERT INTO notes (title, date, content, user_id) VALUES (?, ?, ?, ?)";

            try 
                {
                
                    Connection connection = DBConnection.getConnection();

                    PreparedStatement stmt = connection.prepareStatement(sql);

                    stmt.setString(1, title);
                    stmt.setString(2, date);
                    stmt.setString(3, content);
                    stmt.setString(4, userId);
                    
                    int set = stmt.executeUpdate();

                    connection.close();
                    stmt.close();
                } 
            
            catch (SQLException | ClassNotFoundException e) 
                { 
                    System.out.println(e.getMessage()); 
                }
            }
    }
