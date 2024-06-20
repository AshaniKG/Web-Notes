<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="model.noteFetchModel"%>
<%@page import="java.sql.Connection"%>
<%@page import="model.DBConnection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.util.logging.Logger"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <link rel="stylesheet" href="/WebNotes/View/Style/edit.css" />
    <title>Edit Note</title>
    <link href="https://fonts.googleapis.com/css2?family=Julee&display=swap" rel="stylesheet">
</head>
<body>
    <%
        String noteId = request.getParameter("noteId");
        try {
            ResultSet noteResult = noteFetchModel.fetchNoteById(noteId);
            if (noteResult.next()) {
                String title = noteResult.getString("title");
                String date = noteResult.getString("date");
                String content = noteResult.getString("content");

                String[] dateParts = date.split("-");
                String formattedDate = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0]; 
    %>
    <div class="noteForm">
        <div class="formHeader">
            <input type="text" id="noteTitle" name="noteTitle" value="<%= title %>" placeholder="Title">
            <input type="date" id="noteDate" name="noteDate" value="<%= date %>" placeholder="Date">
        </div>
        <hr class="titleLine">
        <div class="formContent">
            <textarea id="noteContent" name="noteContent"><%= content %></textarea>
        </div>
        <div class="ButtonSection">
            <div class="EditButton">
                <img src="/WebNotes/View/Assets/Edit.png" alt="edit">
            </div>
            <div class="DeleteButton">
                <img src="/WebNotes/View/Assets/Delete.png" alt="delete">
            </div>
            <div class="SaveButton" style="display:none;">
                <img src="/WebNotes/View/Assets/Save.png" alt="save">
            </div>
        </div>
    </div>
    <%
            } else {
                out.println("Note not found!");
            }
            noteResult.close();
        } catch (SQLException ex) {
            Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit.class.getName()).log(Level.SEVERE, null, ex);
        }
    %>
    <script src="/WebNotes/View/Style/edit.js"></script>
</body>
</html>