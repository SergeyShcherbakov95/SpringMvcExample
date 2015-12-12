<%-- 
    Document   : formAndUsers
    Created on : 09.12.2015, 13:06:14
    Author     : sergey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <form action="springMvc/addUser" method="post">
            Login:<br>
                <input type="text" name="login" value=""><br>
            Sex<br>
                <input type="radio" name="sex" value="M">Man<br>
                <input type="radio" name="sex" value="W">Woman<br>
            <br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>