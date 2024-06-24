/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author adipasith
 */
public class noteEdit {
    
     public static int updateNote(String noteId, String updatedTitle, String updatedDate, String updatedContent) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE notes SET title=?, date=?, content = ? WHERE id = ?";
        int row = 0;

        try (Connection connection = DBConnection.getConnection();
                PreparedStatement stmt = connection.prepareStatement(sql)) {

           stmt.setString(1, updatedTitle);
            stmt.setString(2, updatedDate);  
            stmt.setString(3, updatedContent);
            stmt.setString(4, noteId);
            row = stmt.executeUpdate();

            return row; 
        }
    }
}
