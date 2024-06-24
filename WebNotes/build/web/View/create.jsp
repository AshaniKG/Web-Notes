<%-- 
    Document   : Create
    Created on : 17-Jun-2024, 19:58:41
    Author     : ashan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Style/create.css">
        <title>Create Note</title>
    </head>
    <body>
        <div class="backDiv" onmouseover="backOver()" onmouseout="backOut()" onclick="backClick()">
            <img class="icon" id="backIcon" src="../View/Assets/Arrow.png">
        </div>
        <div class="noteDiv">
            <div class="topicBarDiv">
                <div class="titleDiv">
                    <form action="" method="POST">
                        <input type="text" class="title" name="title" placeholder="TITLE..."> 
                    </form>
                </div>
                <div class="dateDiv">
                    <form action="" method="POST">
                        <input type="hidden" name="date"> 
                        <p class="date">19/06/2024</p>
                    </form>
                </div>
            </div>
            <div class="contentDiv">
                <form action="" method="POST">
                    <textarea class="content" name="content" placeholder="Note..."></textarea>
                </form>
            </div>
        </div>
        <div class="saveDiv" onmouseover="saveOver()" onmouseout="saveOut()" onclick="saveClick()">
            <img class="icon" id="saveIcon" src="../View/Assets/Save.png">
        </div>
        
        <script>
            //Back button functions

            function backOver() 
                {
                    var back = document.getElementById("backIcon");
                    back.src = "../View/Assets/Arrow 1.png";
                }

            function backOut() 
                {
                    var back = document.getElementById("backIcon");
                    back.src = "../View/Assets/Arrow.png";
                }


            function backClick() 
                {
                    window.location.href = 'display.jsp';
                }
                
                
            //Save button functions

            function saveOver() 
                {
                    var save = document.getElementById("saveIcon");
                    save.src = "../View/Assets/Save 1.png";
                }

            function saveOut() 
                {
                    var save = document.getElementById("saveIcon");
                    save.src = "../View/Assets/Save.png";
                }


            function saveClick() 
                {
                    window.location.href = 'display.jsp';
                }
        </script>
        
    </body>
</html>
