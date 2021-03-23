<%@ page import="domain.model.commandHandelers.Commands" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="stijlen.css">
    <title>Zoek</title>
</head>
<body>
<jsp:include page="header.jsp">
    <jsp:param name="actual" value="zoek"/>
</jsp:include>
<main>
    <form action="StudentInfo?command=searchStudent" method="get">
        <label for="name">naam:</label>
        <input type="text" id="name" name="naam">
        <label for="firstName">voornaam:</label>
        <input type="text" id="firstName" name="voornaam">
        <input type="submit" value="Zoek"/>
    </form>
</main>

</body>
</html>
