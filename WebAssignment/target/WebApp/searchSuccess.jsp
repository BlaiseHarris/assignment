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
	<%@ include file="index.jsp"%>
	<%@ include file="chart.jsp"%>
	<h2 style="color: green">Employee Found!</h2>
	<% out.println(DatabaseConnect.getResult()); %>
</body>
</html>