<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Employee</title>
</head>
<body>
<h2>Create Employee</h2>
	<form action="create" method="post">
		ID:<input type="text" name="id">
		<br> 
		First Name:
		<input type="firstName" name="firstName">
		<br> 
		last Name:
		<input type="lastName" name="lastName">
		<br> 
		Age:
		<input type="age" name="age"><br> <input type="submit" value="Create">
		
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>