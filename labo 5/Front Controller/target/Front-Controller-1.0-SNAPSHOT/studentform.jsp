<%@ page import="domain.model.commandHandelers.Commands" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
    boolean error = false;
    try{
        if(request != null){
            error = (Boolean) request.getAttribute("Error");
        }
    }
    catch(ClassCastException | NullPointerException ignored){

    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if(error){
%>
    <p>U vulde niet alle velden in</p>
<%
    }
%>
<form action="StudentInfo" method="post" novalidate>
    <label for="Naam">naam:</label>
    <input id="Naam" type="text" name="Naam">

    <label for="Voornaam">Voornaam:</label>
    <input id="Voornaam" type="text" name="Voornaam">

    <label for="Leeftijd">Leeftijd:</label>
    <input id="Leeftijd" type="number" name="Leeftijd">

    <label for="Studierichting">Studierichting:</label>
    <input id="Studierichting" type="text" name="Studierichting">

    <input type="submit" value="Student_toevoegen">
    <input type="hidden" name="command" value="<%=Commands.AddStudent.getCommandName()%>">
</form>
</body>
</html>
