<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" href="Style/display.css" />
        <title>Display Note</title>
    </head>
    <body>
        <div class="noteDivision">
            <div class="noteContentDivision">
                <div class="noteContentDateDivision">
                    <h4 class="noteContentDateText">15TH</h4>
                    <h4 class="noteContentDateText">June</h4>
                    <h4 class="noteContentDateText">2024</h4>
                </div>
                <div class="noteContentTextDivision">
                    <h2 class="noteContentTitle">lorem lorem</h2>
                    <p class="noteContentText">
                        lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem
                        lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem
                        lorem lorem lorem lorem lorem lorem lorem lorem
                    </p>
                </div>
            </div>
            <div class="noteDeleteDivision">
                <form action="noteDeleteController" method="POST">
                    <button class="noteDeleteButton" type="submit" name="noteId" value="">
                        Delete
                    </button>
                </form>
            </div>
        </div>
        <a class="addNewButton" href="">+</a>
    </body>
</html>
