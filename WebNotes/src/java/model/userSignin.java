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
 * @author User
 */
public class userSignin {
    
     public static ResultSet checkLogin(String username, String password) throws SQLException, ClassNotFoundException {
        
         Connection connection = DBConnection.getConnection();
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
         PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
         ResultSet rs = stmt.executeQuery();
            
            return rs; 
            
        
        
    }
}
