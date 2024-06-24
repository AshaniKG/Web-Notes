package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class notesFetchModel {

    public static ResultSet fetchNotesByUserId(String userId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM notes WHERE user_id = ?";
        Connection connection = DBConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, userId);
        ResultSet result = stmt.executeQuery();
        return result; 
    }

    public static ResultSet fetchNoteByNoteId(String noteId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM notes WHERE id = ?";
        Connection connection = DBConnection.getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, noteId);
        ResultSet result = stmt.executeQuery();
        return result;
    }
}