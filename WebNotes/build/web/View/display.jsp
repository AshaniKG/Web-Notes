<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" href="/WebNotes/View/Style/display.css" />
        <title>Display Note</title>
    </head>
    <body>
        <div class="topSpaceDiv"></div>
        <% 
                ResultSet result = (ResultSet) request.getAttribute("notesResult");
                
                 String month = "";
                 String date = "";
                 String year = "";
                 String monthNumber = "";
                 
                 String content =  "";
                 
                 if(result != null){
                     
                    while(result.next()){
                        
                        String[] fullDate = result.getString("date").split("-");
                        
                       if(result.getString("content").length() > 200)
                       {
                            content  = result.getString("content").substring(0, 200);
                       }
                       else
                       {
                            content  = result.getString("content");
                       }
                        
                        monthNumber = fullDate[1];

                        if ("01".equals(monthNumber)) {
                            month = "Jan";
                        } else if ("02".equals(monthNumber)) {
                            month = "Feb";
                        } else if ("03".equals(monthNumber)) {
                            month = "Mar";
                        } else if ("04".equals(monthNumber)) {
                            month = "April";
                        } else if ("05".equals(monthNumber)) {
                            month = "May";
                        } else if ("06".equals(monthNumber)) {
                            month = "June";
                        } else if ("07".equals(monthNumber)) {
                            month = "July";
                        } else if ("08".equals(monthNumber)) {
                            month = "Aug";
                        } else if ("09".equals(monthNumber)) {
                            month = "Sep";
                        } else if ("10".equals(monthNumber)) {
                            month = "Oct";
                        } else if ("11".equals(monthNumber)) {
                            month = "Nov";
                        } else if ("12".equals(monthNumber)) {
                            month = "Dec";
                        } else {
                            month = "Invalid month";
                        }
                        
                                date = fullDate[2];
                                year = fullDate[0];
                                
        %>
        
            <div class="noteDivision">
                <a href="UpdateNote?noteId=<%=  result.getString("id")%>">
                    <div class="noteContentDivision">
                        <div class="noteContentDateDivision">
                            <h4 class="noteContentDateText"><%= date %></h4>
                            <h4 class="noteContentDateText"><%= month %></h4>
                            <h4 class="noteContentDateText"><%= year %></h4>
                        </div>
                        <div class="noteContentTextDivision">
                            <h2 class="noteContentTitle"><%= result.getString("title")%></h2>
                            <p class="noteContentText">
                                <%=  content  + "..."%>
                            </p>
                        </div>
                    </div>
                    <div class="noteDeleteDivision">
                        <form action="NoteDelete" method="POST" >
                            <button class="noteDeleteButton" type="submit" name="noteId" value="<%= result.getString("id") %>" onclick="return confirm('Are you sure you want to delete this Note?');">
                                Delete
                            </button>
                        </form>
                    </div>
                 </a>
            </div>
   
        <% } }%>
        <a class="addNewButton" href="NewNote">+</a>
    </body>
</html>
