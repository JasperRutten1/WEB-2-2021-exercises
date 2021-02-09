<%@ page import="java.util.Random" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: jaspe
  Date: 2/9/2021
  Time: 3:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    double random = new Random().nextDouble();
    String string = "dit is een getal: " + random;
%>

<p><%=  string %></p>

<%
    ArrayList<String> lijst = new ArrayList<>();
    lijst.add("een");
    lijst.add("twee");
    for(String s : lijst){
%>

<p>
    <%= s %>
</p>

<%
    }
%>


</body>
</html>
