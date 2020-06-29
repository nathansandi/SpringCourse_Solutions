<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>

	<form action="saveVen" method="post">
	<pre>
		Id: <input type="text" name="id"/>
		Code: <input type="text" name="code"/>
		Type :  <select name="type"> <option> Regular</option>
				<option> Contract </option></select> 
		Email: <input type="text" name="email"/>
		Phone: <input type="text" name="phone"/>
		Address:  <textarea name="address" width=200 height=200></textarea>
		<input type="submit" value="save"/>
	</pre>
	</form>
	${msg}
	
	<a href="displayLoc">View All</a>

</body>
</html>