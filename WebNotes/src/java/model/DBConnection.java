/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ashan
 */
public class DBConnection {
    
     private static final String url = "jdbc:mysql://localhost:3306/web_notes";
    private static final String username = "root";
    private static final String password = "";
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    
    return connection;
    }
}
