<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="domain.model.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.db.StudentDB" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Info: Overzicht</title>
    <link rel="stylesheet" href="stijlen.css">
</head>
<body>
<jsp:include page="header.jsp">
    <jsp:param name="actual" value="overzicht"/>
</jsp:include>

<table>
    <thead>
    <tr>
        <th>Naam</th>
        <th>Voornaam</th>
        <th>Leeftijd</th>
        <th>Studierichting</th>
        <th>Verwijder</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${database.students}">
        <tr>
            <td>${student.naam}</td>
            <td>${student.voornaam}</td>
            <td>${student.leeftijd}</td>
            <td>${student.studierichting}</td>
            <td>
                <a href="StudentInfo?command=removeStudent&naam=${student.naam}&voornaam=${student.voornaam}">
                    verwijder
                </a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
