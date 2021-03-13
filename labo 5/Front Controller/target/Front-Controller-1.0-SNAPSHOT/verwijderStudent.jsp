<%@ page import="domain.model.commandHandelers.Commands" %>
<%@ page import="domain.db.StudentDB" %><%--
  Created by IntelliJ IDEA.
  User: jaspe
  Date: 3/13/2021
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = (String) request.getAttribute("name");
    String firstName = (String) request.getAttribute("firstName");
    if(name == null || firstName == null) throw new IllegalStateException("name or firstname is null");
%>
<html>
<head>
    <title>Verwijder Student</title>
</head>
<body>
<p></p>
<form action="StudentInfo" method="post">
    <input type="hidden" name="command" value="<%=Commands.ConfirmRemoveStudent.getCommandName()%>">
    <input type="hidden" name="naam" value="<%=name%>">
    <input type="hidden" name="voornaam" value="<%=firstName%>">

    <input type="submit" value="Zeker">
</form>
<form action="StudentInfo" method="post">
    <input type="hidden" name="command" value="<%=Commands.ListStudents.getCommandName()%>">

    <input type="submit" value="Toch Niet">
</form>
</body>
</html>
