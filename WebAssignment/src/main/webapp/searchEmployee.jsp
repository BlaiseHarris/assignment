<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search Employee</h2>
	<form action="search" method="post">
		ID to Search:<input type="text" name="id">
		<br> 
		<input type="submit" value="Search">
	</form>
	<%@ include file="chart.jsp"%>
</body>
</html>