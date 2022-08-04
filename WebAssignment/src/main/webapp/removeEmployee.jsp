<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Remove Employee</h2>
	<form action="delete" method="post">
		ID to Remove:<input type="text" name="id" style="margin: 2px">
		<br> 
		<input type="submit" value="Remove" style="margin: 2px">
		
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>