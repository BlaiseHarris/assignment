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
		ID:<input type="text" name="id" style="margin: 2px">
		<br> 
		First Name:
		<input type="firstName" name="firstName" style="margin: 2px">
		<br> 
		last Name:
		<input type="lastName" name="lastName" style="margin: 2px">
		<br> 
		Age:
		<input type="age" name="age" style="margin: 2px"><br> 
		<input type="submit" value="Create" style="margin: 2px">
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>