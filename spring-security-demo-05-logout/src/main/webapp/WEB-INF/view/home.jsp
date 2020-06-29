<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

	<head> 
		<title>
			Welcome
			
		</title>
	</head>
	<body>
		<h2>luv2code exercise home page</h2>
		<hr>
		<p>
		Welcome to the luc2code company web page!
		</p>
		
		<form:form action="${pageContext.request.contextPath}/logout" 
							   method="POST">
			<input type="submit" value="Logout" />		
		</form:form>
		
	</body>

</html>
