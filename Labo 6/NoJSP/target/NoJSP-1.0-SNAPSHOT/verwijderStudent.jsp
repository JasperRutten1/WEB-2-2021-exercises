<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="stijlen.css">
    <title>Verwijder Student</title>
</head>
<body>
<p></p>
<form action="StudentInfo?command=confirmRemoveStudent" method="post">
    <input type="hidden" name="naam" value="${name}">
    <input type="hidden" name="voornaam" value="${firstName}">

    <input type="submit" value="Zeker">
</form>
<form action="StudentInfo?command=listStudents" method="post">
    <input type="submit" value="Toch Niet">
</form>
</body>
</html>
