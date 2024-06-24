package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class userRegistation {
    
    
    public static int insertData(String username, String password)throws SQLException, ClassNotFoundException{
        
//      
        String sql = "INSERT INTO users (username, password)VALUES (?, ?)";
        
        Connection connection = DBConnection.getConnection();
        
        PreparedStatement  stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, username);
        stmt.setString(2, password);
        
        int insertData = stmt.executeUpdate();
        
        
        return insertData;
}
}
