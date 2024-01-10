<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<div style="text-align: center">
    <h2>Ви піднялися на місток.</h2>
    <h1>Хто ви?</h1>
    <form action="who-are-you" method="post">
        <input type="radio" name="choice" value="accept"> Розповісти правду про себе <br>
        <input type="radio" name="choice" value="reject"> Збрехати про себе<br>
        <input type="submit" value="Відправити">
    </form>
</div>
</body>
</html>