<%@ page import="domain.model.commandHandelers.Commands" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Zoek</title>
</head>
<body>
    <form action="StudentInfo" method="get">
        <label for="name">naam:</label>
        <input type="text" id="name" name="naam">
        <label for="firstName">voornaam:</label>
        <input type="text" id="firstName" name="voornaam">
        <input type="hidden" name="command" value="<%=Commands.SearchStudent.getCommandName()%>">
        <input type="submit" value="Zoek"/>
    </form>
</body>
</html>
