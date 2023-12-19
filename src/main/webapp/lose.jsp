<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<div style="text-align: center">
    <h1>Поразка.</h1>
    <form action="/lose" method="post">
        <input type="radio" name="choice" value="accept"> Почати знову<br>
        <input type="radio" name="choice" value="reject"> Закінчити<br>
        <input type="submit" value="Відправити">
    </form>
</div>
<div style="text-align: right">
    <form>
        <p>Кількість зіграних ігор: ${player}</p>
    </form>
</div>
</body>
</html>
