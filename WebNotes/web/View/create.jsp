<%-- 
    Document   : Create
    Created on : 17-Jun-2024, 19:58:41
    Author     : ashan
--%>

<%@page import="java.time.LocalDate"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    LocalDate currentDate = LocalDate.now();
    String date = currentDate.toString();        
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="/WebNotes/View/Style/create.css">
        <title>Create Note</title>
    </head>
    <body>
        
        <div class="backDiv" onmouseover="backOver()" onmouseout="backOut()" onclick="backClick()">
            <img class="icon" id="backIcon" src="/WebNotes/View/Assets/Arrow.png">
        </div>
        <form id="form" action="/WebNotes/CreateNote" method="POST">
            <div class="noteDiv">
                <div class="topicBarDiv">
                    <div class="titleDiv">
                        <input type="text" class="title" name="title" placeholder="TITLE...">   
                    </div>
                    <div class="dateDiv">
                        <input type="hidden" name="date" value="<%= date %>"> 
                        <p class="date"><%= date %></p>
                    </div>          
                </div>
                <div class="contentDiv">
                    <textarea class="content" name="content" placeholder="Note..."></textarea>
                </div>       
            </div>   
            <div class="saveDiv" onmouseover="saveOver()" onmouseout="saveOut()" onclick="document.getElementById('form').submit()">
                <img class="icon" id="saveIcon" src="/WebNotes/View/Assets/Save.png">
            </div>
        </form>
        
        <script>
            //Back button functions

            function backOver() 
                {
                    var back = document.getElementById("backIcon");
                    back.src = "/WebNotes/View/Assets/Arrow 1.png";
                }

            function backOut() 
                {
                    var back = document.getElementById("backIcon");
                    back.src = "/WebNotes/View/Assets/Arrow.png";
                }


            function backClick() 
                {
                    window.location.href = 'display.jsp';
                }
                
                
            //Save button functions

            function saveOver() 
                {
                    var save = document.getElementById("saveIcon");
                    save.src = "/WebNotes/View/Assets/Save 1.png";
                }

            function saveOut() 
                {
                    var save = document.getElementById("saveIcon");
                    save.src = "/WebNotes/View/Assets/Save.png";
                }

        </script>
        
    </body>
</html>
