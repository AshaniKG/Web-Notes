package model;

import controllers.NoteDeleteController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Prasad
 */
public class noteDelete {
    
    public static int Delete(String noteId) throws SQLException{
        
         String sql = "DELETE  FROM notes WHERE id = ?";
         int row  = 0;
        
        try {
            
                Connection connection = DBConnection.getConnection();

                PreparedStatement stmt = connection.prepareStatement(sql);

                stmt.setString(1, noteId);

                row = stmt.executeUpdate();
                
                stmt.close();
                connection.close();
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NoteDeleteController.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return row;
    }
    }
    
