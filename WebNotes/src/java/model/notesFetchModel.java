/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Prasad
 */
public class notesFetchModel {
    
    public static ResultSet fetchNotes(String userId)throws SQLException, ClassNotFoundException{
        
        String sql = "Select * FROM notes WHERE user_id = ?";
        
        Connection connection = DBConnection.getConnection();
        
        PreparedStatement  stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, userId);
        
        ResultSet result = null;
        
        result = stmt.executeQuery();
        
        // closing the connection to release Resources
//        connection.close();
//        stmt.close();
        
        return result;
        
    }
    
}
