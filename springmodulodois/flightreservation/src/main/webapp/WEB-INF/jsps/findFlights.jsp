<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flights</title>
</head>
<h2>Find Flights</h2>
<body>
<form action="findFlights" method="post">
	From: <input type="text" name="from"/> 
	To: <input type="text" name="to"/>
	Departure Date: <input type="text" name="date"/>
	<input type="submit" value="Search"/>
</form>
</body>
</html>