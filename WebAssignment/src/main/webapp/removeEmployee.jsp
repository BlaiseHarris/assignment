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
		ID to Remove:<input type="text" name="id">
		<br> 
		<input type="submit" value="Remove">
		
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>