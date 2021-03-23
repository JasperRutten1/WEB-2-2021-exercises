<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="stijlen.css">
    <title>Gevonden</title>
</head>
<body>
    <p>Je vroeg naar volgende gegevens: ${found.naam} ${found.voornaam}
        (${found.leeftijd}): ${found.studierichting}</p>
</body>
</html>
