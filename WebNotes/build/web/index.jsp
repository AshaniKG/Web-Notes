<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="View/Style/signIn.css">
        <title>Sign In</title>
    </head>
    <body>
        <section>
        <div class="wrapper">
            <form action="/WebNotes/Signin" method="post">

                <h1>Sign  IN </h1>
                <div class="input-box">
                    <label for="">User Name</label>
                    <input type="text"  name="username">
                </div>
                
                <div class="input-box">
                    <label for="">Password</label>
                    <input type="password" name="password">
                </div>
                
                <div class="buttons">
                    <button type="submit">Sing In</button>
                    <a href="View/register.jsp"><button type="button">Sing Up</button></a>
                </div>
            </form>
        </div>
        </section>
    </body>
</html>