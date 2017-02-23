<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LogIn</title>
</head>
<body>

    <p>${error}</p>
    <form method="post" action="/login">
        <input type="email" name="email"/>
        <input type="password" name="password"/>
        <input type="submit"/>
    </form>

</body>
</html>
