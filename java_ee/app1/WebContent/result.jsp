<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oracle Inc Calculator</title>
</head>
<body>
<%
	Integer sum= (Integer)request.getAttribute("result");
	out.print(sum +"<br/>");
%>
<a href="cal.jsp">want to calculate again?</a>
</body>
</html>