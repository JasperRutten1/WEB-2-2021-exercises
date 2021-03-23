<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="domain.model.commandHandelers.Commands" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="stijlen.css">
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp">
    <jsp:param name="actual" value="voegtoe"/>
</jsp:include>
<main>
    <c:if test="${!(error == null)}">
        <p>U vulde niet alle velden in</p>
    </c:if>

    <form action="StudentInfo?command=addStudent" method="post" novalidate>
        <label for="Naam">naam:</label>
        <input id="Naam" type="text" name="Naam">

        <label for="Voornaam">Voornaam:</label>
        <input id="Voornaam" type="text" name="Voornaam">

        <label for="Leeftijd">Leeftijd:</label>
        <input id="Leeftijd" type="number" name="Leeftijd">

        <label for="Studierichting">Studierichting:</label>
        <input id="Studierichting" type="text" name="Studierichting">

        <input type="submit" value="Student_toevoegen">
    </form>
</main>

</body>
</html>
