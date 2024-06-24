<%-- 
    Document   : Register
    Created on : 17-Jun-2024, 19:57:26
    Author     : ashan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Style/register.css">
        <title>Register</title>
    </head>
    <body>
        <section>
        <div class="wrapper">

            <form action="/WebNotes/Registation" method="post">
                <h1>Register </h1>
                <div class="input-box">
                    <label for="">User Name</label>
                    <input type="text"  name="username">
                </div>
                
                <div class="input-box">
                    <label for="">Password</label>
                    <input type="password" name="password">
                </div>
                
                <div class="buttons">
                    <button type="submit">Sing Up</button>
                    <a href="/WebNotes/index.jsp"><button type="button">Sing In</button></a>
                </div>
            </form>
        </div>
        </section>
    </body>
</html>
