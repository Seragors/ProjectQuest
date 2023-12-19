<%@ page import="java.net.InetAddress" %>
<%@ page import="static java.net.InetAddress.getLocalHost" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<body>
<div style="text-align: center">
    <h1>Ви втрачаєте пам'ять. Прийняти виклик НЛО?</h1>
    <form action="/game" method="post">
        <input type="radio" name="choice" value="accept"> Прийняти виклик<br>
        <input type="radio" name="choice" value="reject"> Відхилити виклик<br>
        <input type="submit" value="Відправити">
    </form>
</div>
<div style="text-align: right">
    <form>
        <p>Кількість зіграних ігор: (<%
                ipAdress : session.setAttribute("ipAdress", request.getLocalAddr());


        %>>)</p>
    </form>
</div>
</body>
</html>