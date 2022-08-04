<%@page import="java.sql.Connection"%>
<%@page import="cam.saran.DB.DatabaseConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Current Employees</h1>
	<p style="margin-right: 75%">
		<%
		DatabaseConnect.initializeCon();
		out.println(DatabaseConnect.getData(DatabaseConnect.initializeCon()));
	%>
	</p>
</body>
</html>