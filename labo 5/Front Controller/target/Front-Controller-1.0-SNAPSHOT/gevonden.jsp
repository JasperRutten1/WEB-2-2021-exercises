<%@ page import="java.util.ArrayList" %>
<%@ page import="domain.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Object object = request.getAttribute("found");
    Student student;
    if(object instanceof Student) student = (Student) object;
    else student = null;
    assert student != null;
%>
<html>
<head>
    <title>Gevonden</title>
</head>
<body>
    <p>Je vroeg naar volgende gegevens: <%= student.getVoornaam() %> <%= student.getNaam() %>
        (<%= student.getLeeftijd() %>): <%= student.getStudierichting() %></p>
</body>
</html>
