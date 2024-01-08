<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<div style="text-align: center">
    <h2>Ви прийняли виклик.</h2>
    <h1>Піднятися на капітанський місток?</h1>
    <form action="capitan" method="post">
        <input type="radio" name="choice" value="accept"> Піднятися на місток <br>
        <input type="radio" name="choice" value="reject"> Відмовитися підніматися на місток<br>
        <input type="submit" value="Відправити">
    </form>
</div>
</body>
</html>