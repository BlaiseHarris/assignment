<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
<h2>Update Employee</h2>
	<form action="update" method="post">
		ID to update:<input type="text" name="id" style="margin: 2px">
		<br> 
		First Name:
		<input type="firstName" name="firstName" style="margin: 2px">
		<br> 
		last Name:
		<input type="lastName" name="lastName" style="margin: 2px">
		<br> 
		Age:
		<input type="age" name="age"><br> <input type="submit" value="Update" style="margin: 2px">
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>